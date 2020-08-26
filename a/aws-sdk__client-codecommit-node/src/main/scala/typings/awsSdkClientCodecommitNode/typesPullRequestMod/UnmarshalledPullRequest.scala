package typings.awsSdkClientCodecommitNode.typesPullRequestMod

import typings.awsSdkClientCodecommitNode.typesPullRequestTargetMod.UnmarshalledPullRequestTarget
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledPullRequest extends PullRequest {
  /**
    * <p>The date and time the pull request was originally created, in timestamp format.</p>
    */
  @JSName("creationDate")
  var creationDate_UnmarshalledPullRequest: js.UndefOr[Date] = js.native
  /**
    * <p>The day and time of the last user or system activity on the pull request, in timestamp format.</p>
    */
  @JSName("lastActivityDate")
  var lastActivityDate_UnmarshalledPullRequest: js.UndefOr[Date] = js.native
  /**
    * <p>The targets of the pull request, including the source branch and destination branch for the pull request.</p>
    */
  @JSName("pullRequestTargets")
  var pullRequestTargets_UnmarshalledPullRequest: js.UndefOr[js.Array[UnmarshalledPullRequestTarget]] = js.native
}

object UnmarshalledPullRequest {
  @scala.inline
  def apply(): UnmarshalledPullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledPullRequest]
  }
  @scala.inline
  implicit class UnmarshalledPullRequestOps[Self <: UnmarshalledPullRequest] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: Date): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setLastActivityDate(value: Date): Self = this.set("lastActivityDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastActivityDate: Self = this.set("lastActivityDate", js.undefined)
    @scala.inline
    def setPullRequestTargetsVarargs(value: UnmarshalledPullRequestTarget*): Self = this.set("pullRequestTargets", js.Array(value :_*))
    @scala.inline
    def setPullRequestTargets(value: js.Array[UnmarshalledPullRequestTarget]): Self = this.set("pullRequestTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRequestTargets: Self = this.set("pullRequestTargets", js.undefined)
  }
  
}

