package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePullRequestTitleOutput extends js.Object {
  /**
    * Information about the updated pull request.
    */
  var pullRequest: PullRequest = js.native
}

object UpdatePullRequestTitleOutput {
  @scala.inline
  def apply(pullRequest: PullRequest): UpdatePullRequestTitleOutput = {
    val __obj = js.Dynamic.literal(pullRequest = pullRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePullRequestTitleOutput]
  }
}

