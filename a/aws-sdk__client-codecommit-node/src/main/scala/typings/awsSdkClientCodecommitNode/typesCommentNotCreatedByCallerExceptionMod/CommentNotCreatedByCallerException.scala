package typings.awsSdkClientCodecommitNode.typesCommentNotCreatedByCallerExceptionMod

import typings.awsSdkClientCodecommitNode.updateCommentExceptionsUnionMod.UpdateCommentExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentNotCreatedByCallerException
  extends ServiceException[CommentNotCreatedByCallerExceptionDetails]
     with UpdateCommentExceptionsUnion {
  @JSName("name")
  var name_CommentNotCreatedByCallerException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentNotCreatedByCallerException
}

object CommentNotCreatedByCallerException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: CommentNotCreatedByCallerExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentNotCreatedByCallerException,
    stack: String = null
  ): CommentNotCreatedByCallerException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentNotCreatedByCallerException]
  }
}

