package typings.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesCommentMod.UnmarshalledComment
import typings.awsSdkClientCodecommitNode.typesLocationMod.UnmarshalledLocation
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostCommentForComparedCommitOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>In the directionality you established, the blob ID of the 'after' blob.</p>
    */
  var afterBlobId: js.UndefOr[String] = js.undefined
  /**
    * <p>In the directionality you established, the full commit ID of the 'after' commit.</p>
    */
  var afterCommitId: js.UndefOr[String] = js.undefined
  /**
    * <p>In the directionality you established, the blob ID of the 'before' blob.</p>
    */
  var beforeBlobId: js.UndefOr[String] = js.undefined
  /**
    * <p>In the directionality you established, the full commit ID of the 'before' commit.</p>
    */
  var beforeCommitId: js.UndefOr[String] = js.undefined
  /**
    * <p>The content of the comment you posted.</p>
    */
  var comment: js.UndefOr[UnmarshalledComment] = js.undefined
  /**
    * <p>The location of the comment in the comparison between the two commits.</p>
    */
  var location: js.UndefOr[UnmarshalledLocation] = js.undefined
  /**
    * <p>The name of the repository where you posted a comment on the comparison between commits.</p>
    */
  var repositoryName: js.UndefOr[String] = js.undefined
}

object PostCommentForComparedCommitOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    afterBlobId: String = null,
    afterCommitId: String = null,
    beforeBlobId: String = null,
    beforeCommitId: String = null,
    comment: UnmarshalledComment = null,
    location: UnmarshalledLocation = null,
    repositoryName: String = null
  ): PostCommentForComparedCommitOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (afterBlobId != null) __obj.updateDynamic("afterBlobId")(afterBlobId.asInstanceOf[js.Any])
    if (afterCommitId != null) __obj.updateDynamic("afterCommitId")(afterCommitId.asInstanceOf[js.Any])
    if (beforeBlobId != null) __obj.updateDynamic("beforeBlobId")(beforeBlobId.asInstanceOf[js.Any])
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCommentForComparedCommitOutput]
  }
}

