package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.CLOSED
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.OPEN
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestTargetMod._UnmarshalledPullRequestTarget
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledPullRequest extends _PullRequest {
  /**
    * <p>The date and time the pull request was originally created, in timestamp format.</p>
    */
  @JSName("creationDate")
  var creationDate__UnmarshalledPullRequest: js.UndefOr[Date] = js.undefined
  /**
    * <p>The day and time of the last user or system activity on the pull request, in timestamp format.</p>
    */
  @JSName("lastActivityDate")
  var lastActivityDate__UnmarshalledPullRequest: js.UndefOr[Date] = js.undefined
  /**
    * <p>The targets of the pull request, including the source branch and destination branch for the pull request.</p>
    */
  @JSName("pullRequestTargets")
  var pullRequestTargets__UnmarshalledPullRequest: js.UndefOr[js.Array[_UnmarshalledPullRequestTarget]] = js.undefined
}

object _UnmarshalledPullRequest {
  @scala.inline
  def apply(
    authorArn: String = null,
    clientRequestToken: String = null,
    creationDate: Date = null,
    description: String = null,
    lastActivityDate: Date = null,
    pullRequestId: String = null,
    pullRequestStatus: OPEN | CLOSED | String = null,
    pullRequestTargets: js.Array[_UnmarshalledPullRequestTarget] = null,
    title: String = null
  ): _UnmarshalledPullRequest = {
    val __obj = js.Dynamic.literal()
    if (authorArn != null) __obj.updateDynamic("authorArn")(authorArn)
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (description != null) __obj.updateDynamic("description")(description)
    if (lastActivityDate != null) __obj.updateDynamic("lastActivityDate")(lastActivityDate)
    if (pullRequestId != null) __obj.updateDynamic("pullRequestId")(pullRequestId)
    if (pullRequestStatus != null) __obj.updateDynamic("pullRequestStatus")(pullRequestStatus.asInstanceOf[js.Any])
    if (pullRequestTargets != null) __obj.updateDynamic("pullRequestTargets")(pullRequestTargets)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[_UnmarshalledPullRequest]
  }
}

