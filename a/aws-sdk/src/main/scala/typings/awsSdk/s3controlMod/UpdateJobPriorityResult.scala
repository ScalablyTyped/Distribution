package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateJobPriorityResult extends js.Object {
  
  /**
    * The ID for the job whose priority Amazon S3 updated.
    */
  var JobId: typings.awsSdk.s3controlMod.JobId = js.native
  
  /**
    * The new priority assigned to the specified job.
    */
  var Priority: JobPriority = js.native
}
object UpdateJobPriorityResult {
  
  @scala.inline
  def apply(JobId: JobId, Priority: JobPriority): UpdateJobPriorityResult = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobPriorityResult]
  }
  
  @scala.inline
  implicit class UpdateJobPriorityResultOps[Self <: UpdateJobPriorityResult] (val x: Self) extends AnyVal {
    
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
    def setPriority(value: JobPriority): Self = this.set("Priority", value.asInstanceOf[js.Any])
  }
}
