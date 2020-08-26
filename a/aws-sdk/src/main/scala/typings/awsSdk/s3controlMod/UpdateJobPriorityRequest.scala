package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobPriorityRequest extends js.Object {
  /**
    * 
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  /**
    * The ID for the job whose priority you want to update.
    */
  var JobId: typings.awsSdk.s3controlMod.JobId = js.native
  /**
    * The priority you want to assign to this job.
    */
  var Priority: JobPriority = js.native
}

object UpdateJobPriorityRequest {
  @scala.inline
  def apply(AccountId: AccountId, JobId: JobId, Priority: JobPriority): UpdateJobPriorityRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobPriorityRequest]
  }
  @scala.inline
  implicit class UpdateJobPriorityRequestOps[Self <: UpdateJobPriorityRequest] (val x: Self) extends AnyVal {
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
    def setPriority(value: JobPriority): Self = this.set("Priority", value.asInstanceOf[js.Any])
  }
  
}

