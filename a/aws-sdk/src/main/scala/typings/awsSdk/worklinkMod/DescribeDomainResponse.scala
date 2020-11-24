package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDomainResponse extends js.Object {
  
  /**
    * The ARN of an issued ACM certificate that is valid for the domain being associated.
    */
  var AcmCertificateArn: js.UndefOr[typings.awsSdk.worklinkMod.AcmCertificateArn] = js.native
  
  /**
    * The time that the domain was added.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.worklinkMod.DisplayName] = js.native
  
  /**
    * The name of the domain.
    */
  var DomainName: js.UndefOr[typings.awsSdk.worklinkMod.DomainName] = js.native
  
  /**
    * The current state for the domain.
    */
  var DomainStatus: js.UndefOr[typings.awsSdk.worklinkMod.DomainStatus] = js.native
}
object DescribeDomainResponse {
  
  @scala.inline
  def apply(): DescribeDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainResponse]
  }
  
  @scala.inline
  implicit class DescribeDomainResponseOps[Self <: DescribeDomainResponse] (val x: Self) extends AnyVal {
    
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
    def setAcmCertificateArn(value: AcmCertificateArn): Self = this.set("AcmCertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcmCertificateArn: Self = this.set("AcmCertificateArn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: DateTime): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
    
    @scala.inline
    def setDomainStatus(value: DomainStatus): Self = this.set("DomainStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainStatus: Self = this.set("DomainStatus", js.undefined)
  }
}
