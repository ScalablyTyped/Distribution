package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerTlsCertificateDomainValidationRecord extends js.Object {
  
  /**
    * The domain name against which your SSL/TLS certificate was validated.
    */
  var domainName: js.UndefOr[DomainName] = js.native
  
  /**
    * A fully qualified domain name in the certificate. For example, example.com.
    */
  var name: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The type of validation record. For example, CNAME for domain validation.
    */
  var `type`: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The validation status. Valid values are listed below.
    */
  var validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus] = js.native
  
  /**
    * The value for that type.
    */
  var value: js.UndefOr[NonEmptyString] = js.native
}
object LoadBalancerTlsCertificateDomainValidationRecord {
  
  @scala.inline
  def apply(): LoadBalancerTlsCertificateDomainValidationRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerTlsCertificateDomainValidationRecord]
  }
  
  @scala.inline
  implicit class LoadBalancerTlsCertificateDomainValidationRecordOps[Self <: LoadBalancerTlsCertificateDomainValidationRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setType(value: NonEmptyString): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValidationStatus(value: LoadBalancerTlsCertificateDomainStatus): Self = this.set("validationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationStatus: Self = this.set("validationStatus", js.undefined)
    
    @scala.inline
    def setValue(value: NonEmptyString): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
