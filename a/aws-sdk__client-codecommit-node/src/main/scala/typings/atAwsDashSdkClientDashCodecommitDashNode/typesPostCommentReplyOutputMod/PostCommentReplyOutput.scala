package typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentReplyOutputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreCommentMod._UnmarshalledComment
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostCommentReplyOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Information about the reply to a comment.</p>
    */
  var comment: js.UndefOr[_UnmarshalledComment] = js.undefined
}

object PostCommentReplyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, comment: _UnmarshalledComment = null): PostCommentReplyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    __obj.asInstanceOf[PostCommentReplyOutput]
  }
}

