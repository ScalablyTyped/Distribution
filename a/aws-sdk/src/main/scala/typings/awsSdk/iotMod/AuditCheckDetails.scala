package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuditCheckDetails extends js.Object {
  
  /**
    * True if the check is complete and found all resources compliant.
    */
  var checkCompliant: js.UndefOr[CheckCompliant] = js.native
  
  /**
    * The completion status of this check. One of "IN_PROGRESS", "WAITING_FOR_DATA_COLLECTION", "CANCELED", "COMPLETED_COMPLIANT", "COMPLETED_NON_COMPLIANT", or "FAILED".
    */
  var checkRunStatus: js.UndefOr[AuditCheckRunStatus] = js.native
  
  /**
    * The code of any error encountered when this check is performed during this audit. One of "INSUFFICIENT_PERMISSIONS" or "AUDIT_CHECK_DISABLED".
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  
  /**
    * The message associated with any error encountered when this check is performed during this audit.
    */
  var message: js.UndefOr[ErrorMessage] = js.native
  
  /**
    * The number of resources that were found noncompliant during the check.
    */
  var nonCompliantResourcesCount: js.UndefOr[NonCompliantResourcesCount] = js.native
  
  /**
    *  Describes how many of the non-compliant resources created during the evaluation of an audit check were marked as suppressed. 
    */
  var suppressedNonCompliantResourcesCount: js.UndefOr[SuppressedNonCompliantResourcesCount] = js.native
  
  /**
    * The number of resources on which the check was performed.
    */
  var totalResourcesCount: js.UndefOr[TotalResourcesCount] = js.native
}
object AuditCheckDetails {
  
  @scala.inline
  def apply(): AuditCheckDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditCheckDetails]
  }
  
  @scala.inline
  implicit class AuditCheckDetailsOps[Self <: AuditCheckDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCheckCompliant(value: CheckCompliant): Self = this.set("checkCompliant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckCompliant: Self = this.set("checkCompliant", js.undefined)
    
    @scala.inline
    def setCheckRunStatus(value: AuditCheckRunStatus): Self = this.set("checkRunStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckRunStatus: Self = this.set("checkRunStatus", js.undefined)
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    
    @scala.inline
    def setMessage(value: ErrorMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setNonCompliantResourcesCount(value: NonCompliantResourcesCount): Self = this.set("nonCompliantResourcesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonCompliantResourcesCount: Self = this.set("nonCompliantResourcesCount", js.undefined)
    
    @scala.inline
    def setSuppressedNonCompliantResourcesCount(value: SuppressedNonCompliantResourcesCount): Self = this.set("suppressedNonCompliantResourcesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressedNonCompliantResourcesCount: Self = this.set("suppressedNonCompliantResourcesCount", js.undefined)
    
    @scala.inline
    def setTotalResourcesCount(value: TotalResourcesCount): Self = this.set("totalResourcesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalResourcesCount: Self = this.set("totalResourcesCount", js.undefined)
  }
}
