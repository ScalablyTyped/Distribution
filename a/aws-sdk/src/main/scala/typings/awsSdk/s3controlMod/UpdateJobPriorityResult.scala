package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

