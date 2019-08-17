package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreCommentsForPullRequestMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreCommentMod._UnmarshalledComment
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreLocationMod._UnmarshalledLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledCommentsForPullRequest extends _CommentsForPullRequest {
  /**
    * <p>An array of comment objects. Each comment object contains information about a comment on the pull request.</p>
    */
  @JSName("comments")
  var comments__UnmarshalledCommentsForPullRequest: js.UndefOr[js.Array[_UnmarshalledComment]] = js.undefined
  /**
    * <p>Location information about the comment on the pull request, including the file name, line number, and whether the version of the file where the comment was made is 'BEFORE' (destination branch) or 'AFTER' (source branch).</p>
    */
  @JSName("location")
  var location__UnmarshalledCommentsForPullRequest: js.UndefOr[_UnmarshalledLocation] = js.undefined
}

object _UnmarshalledCommentsForPullRequest {
  @scala.inline
  def apply(
    afterBlobId: String = null,
    afterCommitId: String = null,
    beforeBlobId: String = null,
    beforeCommitId: String = null,
    comments: js.Array[_UnmarshalledComment] = null,
    location: _UnmarshalledLocation = null,
    pullRequestId: String = null,
    repositoryName: String = null
  ): _UnmarshalledCommentsForPullRequest = {
    val __obj = js.Dynamic.literal()
    if (afterBlobId != null) __obj.updateDynamic("afterBlobId")(afterBlobId)
    if (afterCommitId != null) __obj.updateDynamic("afterCommitId")(afterCommitId)
    if (beforeBlobId != null) __obj.updateDynamic("beforeBlobId")(beforeBlobId)
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (location != null) __obj.updateDynamic("location")(location)
    if (pullRequestId != null) __obj.updateDynamic("pullRequestId")(pullRequestId)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[_UnmarshalledCommentsForPullRequest]
  }
}

