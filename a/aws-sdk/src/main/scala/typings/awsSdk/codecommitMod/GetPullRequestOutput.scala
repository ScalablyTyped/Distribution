package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPullRequestOutput extends js.Object {
  /**
    * Information about the specified pull request.
    */
  var pullRequest: PullRequest = js.native
}

object GetPullRequestOutput {
  @scala.inline
  def apply(pullRequest: PullRequest): GetPullRequestOutput = {
    val __obj = js.Dynamic.literal(pullRequest = pullRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPullRequestOutput]
  }
}

