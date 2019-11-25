package typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetCommentOutputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreCommentMod._UnmarshalledComment
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCommentOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The contents of the comment.</p>
    */
  var comment: js.UndefOr[_UnmarshalledComment] = js.undefined
}

object GetCommentOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, comment: _UnmarshalledComment = null): GetCommentOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentOutput]
  }
}

