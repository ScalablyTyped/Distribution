package typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentForPullRequestOutputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreCommentMod._UnmarshalledComment
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreLocationMod._UnmarshalledLocation
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostCommentForPullRequestOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>In the directionality of the pull request, the blob ID of the 'after' blob.</p>
    */
  var afterBlobId: js.UndefOr[String] = js.undefined
  /**
    * <p>The full commit ID of the commit in the destination branch where the pull request will be merged.</p>
    */
  var afterCommitId: js.UndefOr[String] = js.undefined
  /**
    * <p>In the directionality of the pull request, the blob ID of the 'before' blob.</p>
    */
  var beforeBlobId: js.UndefOr[String] = js.undefined
  /**
    * <p>The full commit ID of the commit in the source branch used to create the pull request, or in the case of an updated pull request, the full commit ID of the commit used to update the pull request.</p>
    */
  var beforeCommitId: js.UndefOr[String] = js.undefined
  /**
    * <p>The content of the comment you posted.</p>
    */
  var comment: js.UndefOr[_UnmarshalledComment] = js.undefined
  /**
    * <p>The location of the change where you posted your comment.</p>
    */
  var location: js.UndefOr[_UnmarshalledLocation] = js.undefined
  /**
    * <p>The system-generated ID of the pull request. </p>
    */
  var pullRequestId: js.UndefOr[String] = js.undefined
  /**
    * <p>The name of the repository where you posted a comment on a pull request.</p>
    */
  var repositoryName: js.UndefOr[String] = js.undefined
}

object PostCommentForPullRequestOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    afterBlobId: String = null,
    afterCommitId: String = null,
    beforeBlobId: String = null,
    beforeCommitId: String = null,
    comment: _UnmarshalledComment = null,
    location: _UnmarshalledLocation = null,
    pullRequestId: String = null,
    repositoryName: String = null
  ): PostCommentForPullRequestOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (afterBlobId != null) __obj.updateDynamic("afterBlobId")(afterBlobId.asInstanceOf[js.Any])
    if (afterCommitId != null) __obj.updateDynamic("afterCommitId")(afterCommitId.asInstanceOf[js.Any])
    if (beforeBlobId != null) __obj.updateDynamic("beforeBlobId")(beforeBlobId.asInstanceOf[js.Any])
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (pullRequestId != null) __obj.updateDynamic("pullRequestId")(pullRequestId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCommentForPullRequestOutput]
  }
}

