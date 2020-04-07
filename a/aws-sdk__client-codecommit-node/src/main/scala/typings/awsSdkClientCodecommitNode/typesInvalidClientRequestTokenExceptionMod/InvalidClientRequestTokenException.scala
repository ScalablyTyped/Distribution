package typings.awsSdkClientCodecommitNode.typesInvalidClientRequestTokenExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentReplyExceptionsUnionMod.PostCommentReplyExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidClientRequestTokenException
  extends ServiceException[InvalidClientRequestTokenExceptionDetails]
     with CreatePullRequestExceptionsUnion
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion
     with PostCommentReplyExceptionsUnion {
  @JSName("name")
  var name_InvalidClientRequestTokenException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidClientRequestTokenException
}

object InvalidClientRequestTokenException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidClientRequestTokenExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidClientRequestTokenException,
    stack: String = null
  ): InvalidClientRequestTokenException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidClientRequestTokenException]
  }
}

