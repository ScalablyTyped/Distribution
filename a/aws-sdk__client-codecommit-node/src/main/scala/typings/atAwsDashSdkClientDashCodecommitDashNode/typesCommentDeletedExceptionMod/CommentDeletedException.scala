package typings.atAwsDashSdkClientDashCodecommitDashNode.typesCommentDeletedExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteCommentContentExceptionsUnionMod.DeleteCommentContentExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetCommentExceptionsUnionMod.GetCommentExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdateCommentExceptionsUnionMod.UpdateCommentExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentDeletedException
  extends ServiceException[_CommentDeletedExceptionDetails]
     with DeleteCommentContentExceptionsUnion
     with GetCommentExceptionsUnion
     with UpdateCommentExceptionsUnion {
  @JSName("name")
  var name_CommentDeletedException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.CommentDeletedException
}

object CommentDeletedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _CommentDeletedExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.CommentDeletedException,
    stack: String = null
  ): CommentDeletedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentDeletedException]
  }
}

