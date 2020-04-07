package typings.awsSdkClientCodecommitNode.typesInvalidRelativeFileVersionEnumExceptionMod

import typings.awsSdkClientCodecommitNode.postCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidRelativeFileVersionEnumException
  extends ServiceException[InvalidRelativeFileVersionEnumExceptionDetails]
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion {
  @JSName("name")
  var name_InvalidRelativeFileVersionEnumException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRelativeFileVersionEnumException
}

object InvalidRelativeFileVersionEnumException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidRelativeFileVersionEnumExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRelativeFileVersionEnumException,
    stack: String = null
  ): InvalidRelativeFileVersionEnumException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRelativeFileVersionEnumException]
  }
}

