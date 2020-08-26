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

@js.native
trait IdempotencyParameterMismatchException
  extends ServiceException[IdempotencyParameterMismatchExceptionDetails]
     with CreatePullRequestExceptionsUnion
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion
     with PostCommentReplyExceptionsUnion {
  @JSName("name")
  var name_IdempotencyParameterMismatchException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.IdempotencyParameterMismatchException = js.native
}

object IdempotencyParameterMismatchException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: IdempotencyParameterMismatchExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.IdempotencyParameterMismatchException
  ): IdempotencyParameterMismatchException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdempotencyParameterMismatchException]
  }
  @scala.inline
  implicit class IdempotencyParameterMismatchExceptionOps[Self <: IdempotencyParameterMismatchException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.IdempotencyParameterMismatchException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

