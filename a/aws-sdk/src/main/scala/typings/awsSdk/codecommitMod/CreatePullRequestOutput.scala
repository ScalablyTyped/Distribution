package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePullRequestOutput extends js.Object {
  /**
    * Information about the newly created pull request.
    */
  var pullRequest: PullRequest = js.native
}

object CreatePullRequestOutput {
  @scala.inline
  def apply(pullRequest: PullRequest): CreatePullRequestOutput = {
    val __obj = js.Dynamic.literal(pullRequest = pullRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreatePullRequestOutput]
  }
}

