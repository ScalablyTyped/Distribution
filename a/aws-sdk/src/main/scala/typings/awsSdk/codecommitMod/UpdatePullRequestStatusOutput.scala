package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePullRequestStatusOutput extends js.Object {
  /**
    * Information about the pull request.
    */
  var pullRequest: PullRequest = js.native
}

object UpdatePullRequestStatusOutput {
  @scala.inline
  def apply(pullRequest: PullRequest): UpdatePullRequestStatusOutput = {
    val __obj = js.Dynamic.literal(pullRequest = pullRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePullRequestStatusOutput]
  }
}

