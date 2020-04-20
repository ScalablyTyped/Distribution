package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverridePullRequestApprovalRulesInput extends js.Object {
  /**
    * Whether you want to set aside approval rule requirements for the pull request (OVERRIDE) or revoke a previous override and apply approval rule requirements (REVOKE). REVOKE status is not stored.
    */
  var overrideStatus: OverrideStatus = js.native
  /**
    * The system-generated ID of the pull request for which you want to override all approval rule requirements. To get this information, use GetPullRequest.
    */
  var pullRequestId: PullRequestId = js.native
  /**
    * The system-generated ID of the most recent revision of the pull request. You cannot override approval rules for anything but the most recent revision of a pull request. To get the revision ID, use GetPullRequest.
    */
  var revisionId: RevisionId = js.native
}

object OverridePullRequestApprovalRulesInput {
  @scala.inline
  def apply(overrideStatus: OverrideStatus, pullRequestId: PullRequestId, revisionId: RevisionId): OverridePullRequestApprovalRulesInput = {
    val __obj = js.Dynamic.literal(overrideStatus = overrideStatus.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverridePullRequestApprovalRulesInput]
  }
}

