package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateJobStatusResult extends js.Object {
  
  /**
    * The ID for the job whose status was updated.
    */
  var JobId: js.UndefOr[typings.awsSdk.s3controlMod.JobId] = js.native
  
  /**
    * The current status for the specified job.
    */
  var Status: js.UndefOr[JobStatus] = js.native
  
  /**
    * The reason that the specified job's status was updated.
    */
  var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason] = js.native
}
object UpdateJobStatusResult {
  
  @scala.inline
  def apply(): UpdateJobStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateJobStatusResult]
  }
  
  @scala.inline
  implicit class UpdateJobStatusResultOps[Self <: UpdateJobStatusResult] (val x: Self) extends AnyVal {
    
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
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
    
    @scala.inline
    def setStatus(value: JobStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusUpdateReason(value: JobStatusUpdateReason): Self = this.set("StatusUpdateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusUpdateReason: Self = this.set("StatusUpdateReason", js.undefined)
  }
}
