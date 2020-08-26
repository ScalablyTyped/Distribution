package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePullRequestStatusInput extends js.Object {
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId = js.native
  /**
    * The status of the pull request. The only valid operations are to update the status from OPEN to OPEN, OPEN to CLOSED or from CLOSED to CLOSED.
    */
  var pullRequestStatus: PullRequestStatusEnum = js.native
}

object UpdatePullRequestStatusInput {
  @scala.inline
  def apply(pullRequestId: PullRequestId, pullRequestStatus: PullRequestStatusEnum): UpdatePullRequestStatusInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], pullRequestStatus = pullRequestStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePullRequestStatusInput]
  }
  @scala.inline
  implicit class UpdatePullRequestStatusInputOps[Self <: UpdatePullRequestStatusInput] (val x: Self) extends AnyVal {
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
    def setPullRequestId(value: PullRequestId): Self = this.set("pullRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPullRequestStatus(value: PullRequestStatusEnum): Self = this.set("pullRequestStatus", value.asInstanceOf[js.Any])
  }
  
}

