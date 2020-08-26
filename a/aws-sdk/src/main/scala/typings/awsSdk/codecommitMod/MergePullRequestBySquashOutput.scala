package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergePullRequestBySquashOutput extends js.Object {
  var pullRequest: js.UndefOr[PullRequest] = js.native
}

object MergePullRequestBySquashOutput {
  @scala.inline
  def apply(): MergePullRequestBySquashOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergePullRequestBySquashOutput]
  }
  @scala.inline
  implicit class MergePullRequestBySquashOutputOps[Self <: MergePullRequestBySquashOutput] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deletePullRequest: Self = this.set("pullRequest", js.undefined)
  }
  
}

