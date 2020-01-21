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
  def apply(pullRequest: PullRequest = null): MergePullRequestBySquashOutput = {
    val __obj = js.Dynamic.literal()
    if (pullRequest != null) __obj.updateDynamic("pullRequest")(pullRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergePullRequestBySquashOutput]
  }
}

