package typings.awsSdkClientCodecommitNode.typesCommentDeletedExceptionMod

import typings.awsSdkClientCodecommitNode.deleteCommentContentExceptionsUnionMod.DeleteCommentContentExceptionsUnion
import typings.awsSdkClientCodecommitNode.getCommentExceptionsUnionMod.GetCommentExceptionsUnion
import typings.awsSdkClientCodecommitNode.updateCommentExceptionsUnionMod.UpdateCommentExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentDeletedException
  extends ServiceException[CommentDeletedExceptionDetails]
     with DeleteCommentContentExceptionsUnion
     with GetCommentExceptionsUnion
     with UpdateCommentExceptionsUnion {
  @JSName("name")
  var name_CommentDeletedException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentDeletedException
}

object CommentDeletedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: CommentDeletedExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentDeletedException,
    stack: String = null
  ): CommentDeletedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentDeletedException]
  }
}

