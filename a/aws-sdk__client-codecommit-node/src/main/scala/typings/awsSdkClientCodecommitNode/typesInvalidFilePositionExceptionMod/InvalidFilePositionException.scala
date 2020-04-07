package typings.awsSdkClientCodecommitNode.typesInvalidFilePositionExceptionMod

import typings.awsSdkClientCodecommitNode.postCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidFilePositionException
  extends ServiceException[InvalidFilePositionExceptionDetails]
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion {
  @JSName("name")
  var name_InvalidFilePositionException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidFilePositionException
}

object InvalidFilePositionException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidFilePositionExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidFilePositionException,
    stack: String = null
  ): InvalidFilePositionException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidFilePositionException]
  }
}

