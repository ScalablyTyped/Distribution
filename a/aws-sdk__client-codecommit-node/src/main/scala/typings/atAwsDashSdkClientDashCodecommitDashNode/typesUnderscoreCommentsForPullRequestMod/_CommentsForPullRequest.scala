package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreCommentsForPullRequestMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreCommentMod._Comment
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreLocationMod._Location
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CommentsForPullRequest extends js.Object {
  /**
    * <p>The full blob ID of the file on which you want to comment on the source commit.</p>
    */
  var afterBlobId: js.UndefOr[String] = js.undefined
  /**
    * <p>he full commit ID of the commit that was the tip of the source branch at the time the comment was made. </p>
    */
  var afterCommitId: js.UndefOr[String] = js.undefined
  /**
    * <p>The full blob ID of the file on which you want to comment on the destination commit.</p>
    */
  var beforeBlobId: js.UndefOr[String] = js.undefined
  /**
    * <p>The full commit ID of the commit that was the tip of the destination branch when the pull request was created. This commit will be superceded by the after commit in the source branch when and if you merge the source branch into the destination branch.</p>
    */
  var beforeCommitId: js.UndefOr[String] = js.undefined
  /**
    * <p>An array of comment objects. Each comment object contains information about a comment on the pull request.</p>
    */
  var comments: js.UndefOr[js.Array[_Comment] | Iterable[_Comment]] = js.undefined
  /**
    * <p>Location information about the comment on the pull request, including the file name, line number, and whether the version of the file where the comment was made is 'BEFORE' (destination branch) or 'AFTER' (source branch).</p>
    */
  var location: js.UndefOr[_Location] = js.undefined
  /**
    * <p>The system-generated ID of the pull request.</p>
    */
  var pullRequestId: js.UndefOr[String] = js.undefined
  /**
    * <p>The name of the repository that contains the pull request.</p>
    */
  var repositoryName: js.UndefOr[String] = js.undefined
}

object _CommentsForPullRequest {
  @scala.inline
  def apply(
    afterBlobId: String = null,
    afterCommitId: String = null,
    beforeBlobId: String = null,
    beforeCommitId: String = null,
    comments: js.Array[_Comment] | Iterable[_Comment] = null,
    location: _Location = null,
    pullRequestId: String = null,
    repositoryName: String = null
  ): _CommentsForPullRequest = {
    val __obj = js.Dynamic.literal()
    if (afterBlobId != null) __obj.updateDynamic("afterBlobId")(afterBlobId.asInstanceOf[js.Any])
    if (afterCommitId != null) __obj.updateDynamic("afterCommitId")(afterCommitId.asInstanceOf[js.Any])
    if (beforeBlobId != null) __obj.updateDynamic("beforeBlobId")(beforeBlobId.asInstanceOf[js.Any])
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (pullRequestId != null) __obj.updateDynamic("pullRequestId")(pullRequestId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CommentsForPullRequest]
  }
}

