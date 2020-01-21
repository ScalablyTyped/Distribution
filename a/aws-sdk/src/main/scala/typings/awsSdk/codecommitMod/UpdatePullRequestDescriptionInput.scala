package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePullRequestDescriptionInput extends js.Object {
  /**
    * The updated content of the description for the pull request. This content replaces the existing description.
    */
  var description: Description = js.native
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId = js.native
}

object UpdatePullRequestDescriptionInput {
  @scala.inline
  def apply(description: Description, pullRequestId: PullRequestId): UpdatePullRequestDescriptionInput = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdatePullRequestDescriptionInput]
  }
}

