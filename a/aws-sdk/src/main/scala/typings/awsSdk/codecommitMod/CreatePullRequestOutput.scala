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
  @scala.inline
  implicit class CreatePullRequestOutputOps[Self <: CreatePullRequestOutput] (val x: Self) extends AnyVal {
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

