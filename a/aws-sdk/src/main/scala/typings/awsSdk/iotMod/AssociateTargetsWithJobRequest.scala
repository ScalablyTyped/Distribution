package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateTargetsWithJobRequest extends js.Object {
  /**
    * An optional comment string describing why the job was associated with the targets.
    */
  var comment: js.UndefOr[Comment] = js.native
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: JobId = js.native
  /**
    * A list of thing group ARNs that define the targets of the job.
    */
  var targets: JobTargets = js.native
}

object AssociateTargetsWithJobRequest {
  @scala.inline
  def apply(jobId: JobId, targets: JobTargets, comment: Comment = null): AssociateTargetsWithJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateTargetsWithJobRequest]
  }
}

