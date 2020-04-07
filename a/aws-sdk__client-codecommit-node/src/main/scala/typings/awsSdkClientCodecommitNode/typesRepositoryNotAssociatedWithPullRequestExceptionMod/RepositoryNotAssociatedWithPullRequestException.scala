package typings.awsSdkClientCodecommitNode.typesRepositoryNotAssociatedWithPullRequestExceptionMod

import typings.awsSdkClientCodecommitNode.getCommentsForPullRequestExceptionsUnionMod.GetCommentsForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryNotAssociatedWithPullRequestException
  extends ServiceException[RepositoryNotAssociatedWithPullRequestExceptionDetails]
     with GetCommentsForPullRequestExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion {
  @JSName("name")
  var name_RepositoryNotAssociatedWithPullRequestException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNotAssociatedWithPullRequestException
}

object RepositoryNotAssociatedWithPullRequestException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: RepositoryNotAssociatedWithPullRequestExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNotAssociatedWithPullRequestException,
    stack: String = null
  ): RepositoryNotAssociatedWithPullRequestException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryNotAssociatedWithPullRequestException]
  }
}

