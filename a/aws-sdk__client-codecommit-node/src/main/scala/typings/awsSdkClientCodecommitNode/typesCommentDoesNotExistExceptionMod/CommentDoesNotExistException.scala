package typings.awsSdkClientCodecommitNode.typesCommentDoesNotExistExceptionMod

import typings.awsSdkClientCodecommitNode.deleteCommentContentExceptionsUnionMod.DeleteCommentContentExceptionsUnion
import typings.awsSdkClientCodecommitNode.getCommentExceptionsUnionMod.GetCommentExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentReplyExceptionsUnionMod.PostCommentReplyExceptionsUnion
import typings.awsSdkClientCodecommitNode.updateCommentExceptionsUnionMod.UpdateCommentExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentDoesNotExistException
  extends ServiceException[CommentDoesNotExistExceptionDetails]
     with DeleteCommentContentExceptionsUnion
     with GetCommentExceptionsUnion
     with PostCommentReplyExceptionsUnion
     with UpdateCommentExceptionsUnion {
  @JSName("name")
  var name_CommentDoesNotExistException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentDoesNotExistException
}

object CommentDoesNotExistException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: CommentDoesNotExistExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentDoesNotExistException,
    stack: String = null
  ): CommentDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentDoesNotExistException]
  }
}

