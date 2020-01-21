package typings.awsSdkClientCodecommitNode.typesCommentsForPullRequestMod

import typings.awsSdkClientCodecommitNode.typesCommentMod.UnmarshalledComment
import typings.awsSdkClientCodecommitNode.typesLocationMod.UnmarshalledLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledCommentsForPullRequest extends CommentsForPullRequest {
  /**
    * <p>An array of comment objects. Each comment object contains information about a comment on the pull request.</p>
    */
  @JSName("comments")
  var comments_UnmarshalledCommentsForPullRequest: js.UndefOr[js.Array[UnmarshalledComment]] = js.undefined
  /**
    * <p>Location information about the comment on the pull request, including the file name, line number, and whether the version of the file where the comment was made is 'BEFORE' (destination branch) or 'AFTER' (source branch).</p>
    */
  @JSName("location")
  var location_UnmarshalledCommentsForPullRequest: js.UndefOr[UnmarshalledLocation] = js.undefined
}

object UnmarshalledCommentsForPullRequest {
  @scala.inline
  def apply(
    afterBlobId: String = null,
    afterCommitId: String = null,
    beforeBlobId: String = null,
    beforeCommitId: String = null,
    comments: js.Array[UnmarshalledComment] = null,
    location: UnmarshalledLocation = null,
    pullRequestId: String = null,
    repositoryName: String = null
  ): UnmarshalledCommentsForPullRequest = {
    val __obj = js.Dynamic.literal()
    if (afterBlobId != null) __obj.updateDynamic("afterBlobId")(afterBlobId.asInstanceOf[js.Any])
    if (afterCommitId != null) __obj.updateDynamic("afterCommitId")(afterCommitId.asInstanceOf[js.Any])
    if (beforeBlobId != null) __obj.updateDynamic("beforeBlobId")(beforeBlobId.asInstanceOf[js.Any])
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (pullRequestId != null) __obj.updateDynamic("pullRequestId")(pullRequestId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledCommentsForPullRequest]
  }
}

