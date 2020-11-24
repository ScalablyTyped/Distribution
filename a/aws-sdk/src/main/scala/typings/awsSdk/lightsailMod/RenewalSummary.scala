package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenewalSummary extends js.Object {
  
  /**
    * An array of objects that describe the domain validation records of the certificate.
    */
  var domainValidationRecords: js.UndefOr[DomainValidationRecordList] = js.native
  
  /**
    * The renewal status of the certificate. The following renewal status are possible:     PendingAutoRenewal  - Lightsail is attempting to automatically validate the domain names of the certificate. No further action is required.      PendingValidation  - Lightsail couldn't automatically validate one or more domain names of the certificate. You must take action to validate these domain names or the certificate won't be renewed. Check to make sure your certificate's domain validation records exist in your domain's DNS, and that your certificate remains in use.     Success  - All domain names in the certificate are validated, and Lightsail renewed the certificate. No further action is required.      Failed  - One or more domain names were not validated before the certificate expired, and Lightsail did not renew the certificate. You can request a new certificate using the CreateCertificate action.  
    */
  var renewalStatus: js.UndefOr[RenewalStatus] = js.native
  
  /**
    * The reason for the renewal status of the certificate.
    */
  var renewalStatusReason: js.UndefOr[RenewalStatusReason] = js.native
  
  /**
    * The timestamp when the certificate was last updated.
    */
  var updatedAt: js.UndefOr[IsoDate] = js.native
}
object RenewalSummary {
  
  @scala.inline
  def apply(): RenewalSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenewalSummary]
  }
  
  @scala.inline
  implicit class RenewalSummaryOps[Self <: RenewalSummary] (val x: Self) extends AnyVal {
    
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
    def setDomainValidationRecordsVarargs(value: DomainValidationRecord*): Self = this.set("domainValidationRecords", js.Array(value :_*))
    
    @scala.inline
    def setDomainValidationRecords(value: DomainValidationRecordList): Self = this.set("domainValidationRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainValidationRecords: Self = this.set("domainValidationRecords", js.undefined)
    
    @scala.inline
    def setRenewalStatus(value: RenewalStatus): Self = this.set("renewalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenewalStatus: Self = this.set("renewalStatus", js.undefined)
    
    @scala.inline
    def setRenewalStatusReason(value: RenewalStatusReason): Self = this.set("renewalStatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenewalStatusReason: Self = this.set("renewalStatusReason", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: IsoDate): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedAt: Self = this.set("updatedAt", js.undefined)
  }
}
