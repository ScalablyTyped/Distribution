package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelJobRequest extends js.Object {
  
  /**
    * An optional comment string describing why the job was canceled.
    */
  var comment: js.UndefOr[Comment] = js.native
  
  /**
    * (Optional) If true job executions with status "IN_PROGRESS" and "QUEUED" are canceled, otherwise only job executions with status "QUEUED" are canceled. The default is false. Canceling a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to update the job execution status. Use caution and ensure that each device executing a job which is canceled is able to recover to a valid state.
    */
  var force: js.UndefOr[ForceFlag] = js.native
  
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: JobId = js.native
  
  /**
    * (Optional)A reason code string that explains why the job was canceled.
    */
  var reasonCode: js.UndefOr[ReasonCode] = js.native
}
object CancelJobRequest {
  
  @scala.inline
  def apply(jobId: JobId): CancelJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJobRequest]
  }
  
  @scala.inline
  implicit class CancelJobRequestOps[Self <: CancelJobRequest] (val x: Self) extends AnyVal {
    
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
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: Comment): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setForce(value: ForceFlag): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setReasonCode(value: ReasonCode): Self = this.set("reasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonCode: Self = this.set("reasonCode", js.undefined)
  }
}
