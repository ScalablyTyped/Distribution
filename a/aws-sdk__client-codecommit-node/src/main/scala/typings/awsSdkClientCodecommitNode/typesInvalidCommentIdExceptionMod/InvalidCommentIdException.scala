package typings.awsSdkClientCodecommitNode.typesInvalidCommentIdExceptionMod

import typings.awsSdkClientCodecommitNode.deleteCommentContentExceptionsUnionMod.DeleteCommentContentExceptionsUnion
import typings.awsSdkClientCodecommitNode.getCommentExceptionsUnionMod.GetCommentExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentReplyExceptionsUnionMod.PostCommentReplyExceptionsUnion
import typings.awsSdkClientCodecommitNode.updateCommentExceptionsUnionMod.UpdateCommentExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidCommentIdException
  extends ServiceException[InvalidCommentIdExceptionDetails]
     with DeleteCommentContentExceptionsUnion
     with GetCommentExceptionsUnion
     with PostCommentReplyExceptionsUnion
     with UpdateCommentExceptionsUnion {
  @JSName("name")
  var name_InvalidCommentIdException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidCommentIdException
}

object InvalidCommentIdException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidCommentIdExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidCommentIdException,
    stack: String = null
  ): InvalidCommentIdException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidCommentIdException]
  }
}

