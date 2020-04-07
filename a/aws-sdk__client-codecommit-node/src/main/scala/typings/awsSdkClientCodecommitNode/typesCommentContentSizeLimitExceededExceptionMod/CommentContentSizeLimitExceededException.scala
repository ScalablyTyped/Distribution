package typings.awsSdkClientCodecommitNode.typesCommentContentSizeLimitExceededExceptionMod

import typings.awsSdkClientCodecommitNode.postCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentReplyExceptionsUnionMod.PostCommentReplyExceptionsUnion
import typings.awsSdkClientCodecommitNode.updateCommentExceptionsUnionMod.UpdateCommentExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentContentSizeLimitExceededException
  extends ServiceException[CommentContentSizeLimitExceededExceptionDetails]
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion
     with PostCommentReplyExceptionsUnion
     with UpdateCommentExceptionsUnion {
  @JSName("name")
  var name_CommentContentSizeLimitExceededException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentContentSizeLimitExceededException
}

object CommentContentSizeLimitExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: CommentContentSizeLimitExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentContentSizeLimitExceededException,
    stack: String = null
  ): CommentContentSizeLimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentContentSizeLimitExceededException]
  }
}

