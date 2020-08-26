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
  @scala.inline
  implicit class UpdatePullRequestTitleOutputOps[Self <: UpdatePullRequestTitleOutput] (val x: Self) extends AnyVal {
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
    def setPullRequest(value: PullRequest): Self = this.set("pullRequest", value.asInstanceOf[js.Any])
  }
  
}

