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
}

