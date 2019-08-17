package typings.atAwsDashSdkClientDashCodecommitDashNode.typesCommentNotCreatedByCallerExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdateCommentExceptionsUnionMod.UpdateCommentExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
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
    details: _CommentNotCreatedByCallerExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.CommentNotCreatedByCallerException,
    stack: String = null
  ): CommentNotCreatedByCallerException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[CommentNotCreatedByCallerException]
  }
}

