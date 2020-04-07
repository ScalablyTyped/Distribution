package typings.awsSdkClientCodecommitNode.typesUpdateCommentOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesCommentMod.UnmarshalledComment
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCommentOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Information about the updated comment.</p>
    */
  var comment: js.UndefOr[UnmarshalledComment] = js.undefined
}

object UpdateCommentOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, comment: UnmarshalledComment = null): UpdateCommentOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCommentOutput]
  }
}

