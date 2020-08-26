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
  @scala.inline
  implicit class GetPullRequestOutputOps[Self <: GetPullRequestOutput] (val x: Self) extends AnyVal {
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

