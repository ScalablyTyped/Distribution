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
  def apply(jobId: JobId, targets: JobTargets): AssociateTargetsWithJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateTargetsWithJobRequest]
  }
  @scala.inline
  implicit class AssociateTargetsWithJobRequestOps[Self <: AssociateTargetsWithJobRequest] (val x: Self) extends AnyVal {
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
    def setTargetsVarargs(value: TargetArn*): Self = this.set("targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: JobTargets): Self = this.set("targets", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: Comment): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
  }
  
}

