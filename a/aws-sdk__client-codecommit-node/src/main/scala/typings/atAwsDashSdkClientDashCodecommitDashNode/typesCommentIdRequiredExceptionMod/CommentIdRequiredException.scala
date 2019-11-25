package typings.atAwsDashSdkClientDashCodecommitDashNode.typesCommentIdRequiredExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteCommentContentExceptionsUnionMod.DeleteCommentContentExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetCommentExceptionsUnionMod.GetCommentExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentReplyExceptionsUnionMod.PostCommentReplyExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdateCommentExceptionsUnionMod.UpdateCommentExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentIdRequiredException
  extends ServiceException[_CommentIdRequiredExceptionDetails]
     with DeleteCommentContentExceptionsUnion
     with GetCommentExceptionsUnion
     with PostCommentReplyExceptionsUnion
     with UpdateCommentExceptionsUnion {
  @JSName("name")
  var name_CommentIdRequiredException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.CommentIdRequiredException
}

object CommentIdRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _CommentIdRequiredExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.CommentIdRequiredException,
    stack: String = null
  ): CommentIdRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentIdRequiredException]
  }
}

