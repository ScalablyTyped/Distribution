package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateJobStatusRequest extends js.Object {
  
  /**
    * 
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  
  /**
    * The ID of the job whose status you want to update.
    */
  var JobId: typings.awsSdk.s3controlMod.JobId = js.native
  
  /**
    * The status that you want to move the specified job to.
    */
  var RequestedJobStatus: typings.awsSdk.s3controlMod.RequestedJobStatus = js.native
  
  /**
    * A description of the reason why you want to change the specified job's status. This field can be any string up to the maximum length.
    */
  var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason] = js.native
}
object UpdateJobStatusRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, JobId: JobId, RequestedJobStatus: RequestedJobStatus): UpdateJobStatusRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any], RequestedJobStatus = RequestedJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobStatusRequest]
  }
  
  @scala.inline
  implicit class UpdateJobStatusRequestOps[Self <: UpdateJobStatusRequest] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedJobStatus(value: RequestedJobStatus): Self = this.set("RequestedJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUpdateReason(value: JobStatusUpdateReason): Self = this.set("StatusUpdateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusUpdateReason: Self = this.set("StatusUpdateReason", js.undefined)
  }
}
