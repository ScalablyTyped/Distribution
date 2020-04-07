package typings.awsSdkClientCodecommitNode.typesClientRequestTokenRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentReplyExceptionsUnionMod.PostCommentReplyExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRequestTokenRequiredException
  extends ServiceException[ClientRequestTokenRequiredExceptionDetails]
     with CreatePullRequestExceptionsUnion
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion
     with PostCommentReplyExceptionsUnion {
  @JSName("name")
  var name_ClientRequestTokenRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ClientRequestTokenRequiredException
}

object ClientRequestTokenRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ClientRequestTokenRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ClientRequestTokenRequiredException,
    stack: String = null
  ): ClientRequestTokenRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRequestTokenRequiredException]
  }
}

