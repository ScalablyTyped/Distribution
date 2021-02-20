package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerTlsCertificateDomainValidationRecord extends StObject {
  
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
  implicit class LoadBalancerTlsCertificateDomainValidationRecordMutableBuilder[Self <: LoadBalancerTlsCertificateDomainValidationRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: NonEmptyString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValidationStatus(value: LoadBalancerTlsCertificateDomainStatus): Self = StObject.set(x, "validationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationStatusUndefined: Self = StObject.set(x, "validationStatus", js.undefined)
    
    @scala.inline
    def setValue(value: NonEmptyString): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
