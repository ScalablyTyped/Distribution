package typings.atAwsDashSdkClientDashCodecommitDashNode.typesCommentNotCreatedByCallerExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdateCommentExceptionsUnionMod.UpdateCommentExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentNotCreatedByCallerException
  extends ServiceException[_CommentNotCreatedByCallerExceptionDetails]
     with UpdateCommentExceptionsUnion {
  @JSName("name")
  var name_CommentNotCreatedByCallerException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.CommentNotCreatedByCallerException
}

object CommentNotCreatedByCallerException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _CommentNotCreatedByCallerExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.CommentNotCreatedByCallerException,
    stack: String = null
  ): CommentNotCreatedByCallerException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentNotCreatedByCallerException]
  }
}

