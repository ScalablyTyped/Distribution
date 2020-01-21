package typings.awsSdkClientCodecommitNode.typesPullRequestMod

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CLOSED
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.OPEN
import typings.awsSdkClientCodecommitNode.typesPullRequestTargetMod.UnmarshalledPullRequestTarget
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledPullRequest extends PullRequest {
  /**
    * <p>The date and time the pull request was originally created, in timestamp format.</p>
    */
  @JSName("creationDate")
  var creationDate_UnmarshalledPullRequest: js.UndefOr[Date] = js.undefined
  /**
    * <p>The day and time of the last user or system activity on the pull request, in timestamp format.</p>
    */
  @JSName("lastActivityDate")
  var lastActivityDate_UnmarshalledPullRequest: js.UndefOr[Date] = js.undefined
  /**
    * <p>The targets of the pull request, including the source branch and destination branch for the pull request.</p>
    */
  @JSName("pullRequestTargets")
  var pullRequestTargets_UnmarshalledPullRequest: js.UndefOr[js.Array[UnmarshalledPullRequestTarget]] = js.undefined
}

object UnmarshalledPullRequest {
  @scala.inline
  def apply(
    authorArn: String = null,
    clientRequestToken: String = null,
    creationDate: Date = null,
    description: String = null,
    lastActivityDate: Date = null,
    pullRequestId: String = null,
    pullRequestStatus: OPEN | CLOSED | String = null,
    pullRequestTargets: js.Array[UnmarshalledPullRequestTarget] = null,
    title: String = null
  ): UnmarshalledPullRequest = {
    val __obj = js.Dynamic.literal()
    if (authorArn != null) __obj.updateDynamic("authorArn")(authorArn.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (lastActivityDate != null) __obj.updateDynamic("lastActivityDate")(lastActivityDate.asInstanceOf[js.Any])
    if (pullRequestId != null) __obj.updateDynamic("pullRequestId")(pullRequestId.asInstanceOf[js.Any])
    if (pullRequestStatus != null) __obj.updateDynamic("pullRequestStatus")(pullRequestStatus.asInstanceOf[js.Any])
    if (pullRequestTargets != null) __obj.updateDynamic("pullRequestTargets")(pullRequestTargets.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledPullRequest]
  }
}

