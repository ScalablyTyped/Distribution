package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePullRequestTitleInput extends js.Object {
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId = js.native
  /**
    * The updated title of the pull request. This replaces the existing title.
    */
  var title: Title = js.native
}

object UpdatePullRequestTitleInput {
  @scala.inline
  def apply(pullRequestId: PullRequestId, title: Title): UpdatePullRequestTitleInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePullRequestTitleInput]
  }
}

