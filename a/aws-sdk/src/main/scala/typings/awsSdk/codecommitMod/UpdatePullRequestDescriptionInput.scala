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
  @scala.inline
  implicit class UpdatePullRequestDescriptionInputOps[Self <: UpdatePullRequestDescriptionInput] (val x: Self) extends AnyVal {
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
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setPullRequestId(value: PullRequestId): Self = this.set("pullRequestId", value.asInstanceOf[js.Any])
  }
  
}

