package typings.awsSdkClientCodecommitNode.typesPathDoesNotExistExceptionMod

import typings.awsSdkClientCodecommitNode.getDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathDoesNotExistException
  extends ServiceException[PathDoesNotExistExceptionDetails]
     with GetDifferencesExceptionsUnion
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion {
  @JSName("name")
  var name_PathDoesNotExistException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PathDoesNotExistException
}

object PathDoesNotExistException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: PathDoesNotExistExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PathDoesNotExistException,
    stack: String = null
  ): PathDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDoesNotExistException]
  }
}

