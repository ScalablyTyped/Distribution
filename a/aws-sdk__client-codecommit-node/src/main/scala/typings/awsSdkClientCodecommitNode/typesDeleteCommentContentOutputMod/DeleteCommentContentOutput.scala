package typings.awsSdkClientCodecommitNode.typesDeleteCommentContentOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesCommentMod.UnmarshalledComment
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCommentContentOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Information about the comment you just deleted.</p>
    */
  var comment: js.UndefOr[UnmarshalledComment] = js.undefined
}

object DeleteCommentContentOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, comment: UnmarshalledComment = null): DeleteCommentContentOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCommentContentOutput]
  }
}

