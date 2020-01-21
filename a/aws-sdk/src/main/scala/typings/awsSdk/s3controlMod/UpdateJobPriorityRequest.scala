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
}

