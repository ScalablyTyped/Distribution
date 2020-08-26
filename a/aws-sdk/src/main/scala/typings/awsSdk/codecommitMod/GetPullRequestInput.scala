package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPullRequestInput extends js.Object {
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId = js.native
}

object GetPullRequestInput {
  @scala.inline
  def apply(pullRequestId: PullRequestId): GetPullRequestInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPullRequestInput]
  }
  @scala.inline
  implicit class GetPullRequestInputOps[Self <: GetPullRequestInput] (val x: Self) extends AnyVal {
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
    def setPullRequestId(value: PullRequestId): Self = this.set("pullRequestId", value.asInstanceOf[js.Any])
  }
  
}

