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

@js.native
trait CommentDoesNotExistException
  extends ServiceException[CommentDoesNotExistExceptionDetails]
     with DeleteCommentContentExceptionsUnion
     with GetCommentExceptionsUnion
     with PostCommentReplyExceptionsUnion
     with UpdateCommentExceptionsUnion {
  @JSName("name")
  var name_CommentDoesNotExistException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentDoesNotExistException = js.native
}

object CommentDoesNotExistException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: CommentDoesNotExistExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentDoesNotExistException
  ): CommentDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentDoesNotExistException]
  }
  @scala.inline
  implicit class CommentDoesNotExistExceptionOps[Self <: CommentDoesNotExistException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentDoesNotExistException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

