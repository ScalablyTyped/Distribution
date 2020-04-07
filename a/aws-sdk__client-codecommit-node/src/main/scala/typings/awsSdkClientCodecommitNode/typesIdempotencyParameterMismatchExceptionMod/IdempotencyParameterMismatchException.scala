package typings.awsSdkClientCodecommitNode.typesIdempotencyParameterMismatchExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentReplyExceptionsUnionMod.PostCommentReplyExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdempotencyParameterMismatchException
  extends ServiceException[IdempotencyParameterMismatchExceptionDetails]
     with CreatePullRequestExceptionsUnion
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion
     with PostCommentReplyExceptionsUnion {
  @JSName("name")
  var name_IdempotencyParameterMismatchException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.IdempotencyParameterMismatchException
}

object IdempotencyParameterMismatchException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: IdempotencyParameterMismatchExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.IdempotencyParameterMismatchException,
    stack: String = null
  ): IdempotencyParameterMismatchException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdempotencyParameterMismatchException]
  }
}

