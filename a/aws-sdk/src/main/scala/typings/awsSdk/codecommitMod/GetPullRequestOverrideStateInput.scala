package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPullRequestOverrideStateInput extends js.Object {
  /**
    * The ID of the pull request for which you want to get information about whether approval rules have been set aside (overridden).
    */
  var pullRequestId: PullRequestId = js.native
  /**
    * The system-generated ID of the revision for the pull request. To retrieve the most recent revision ID, use GetPullRequest.
    */
  var revisionId: RevisionId = js.native
}

object GetPullRequestOverrideStateInput {
  @scala.inline
  def apply(pullRequestId: PullRequestId, revisionId: RevisionId): GetPullRequestOverrideStateInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetPullRequestOverrideStateInput]
  }
}

