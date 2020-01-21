package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePullRequestDescriptionOutput extends js.Object {
  /**
    * Information about the updated pull request.
    */
  var pullRequest: PullRequest = js.native
}

object UpdatePullRequestDescriptionOutput {
  @scala.inline
  def apply(pullRequest: PullRequest): UpdatePullRequestDescriptionOutput = {
    val __obj = js.Dynamic.literal(pullRequest = pullRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdatePullRequestDescriptionOutput]
  }
}

