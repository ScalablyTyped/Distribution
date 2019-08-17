package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdateCommentOutputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreCommentMod._UnmarshalledComment
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var comment: js.UndefOr[_UnmarshalledComment] = js.undefined
}

object UpdateCommentOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, comment: _UnmarshalledComment = null): UpdateCommentOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    __obj.asInstanceOf[UpdateCommentOutput]
  }
}

