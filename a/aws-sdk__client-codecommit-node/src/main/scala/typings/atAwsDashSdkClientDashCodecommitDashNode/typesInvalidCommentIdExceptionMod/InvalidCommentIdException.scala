package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidCommentIdExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteCommentContentExceptionsUnionMod.DeleteCommentContentExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetCommentExceptionsUnionMod.GetCommentExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentReplyExceptionsUnionMod.PostCommentReplyExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdateCommentExceptionsUnionMod.UpdateCommentExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidCommentIdException
  extends ServiceException[_InvalidCommentIdExceptionDetails]
     with DeleteCommentContentExceptionsUnion
     with GetCommentExceptionsUnion
     with PostCommentReplyExceptionsUnion
     with UpdateCommentExceptionsUnion {
  @JSName("name")
  var name_InvalidCommentIdException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidCommentIdException
}

object InvalidCommentIdException {
  @scala.inline
  def apply(
    details: _InvalidCommentIdExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidCommentIdException,
    stack: String = null
  ): InvalidCommentIdException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InvalidCommentIdException]
  }
}

