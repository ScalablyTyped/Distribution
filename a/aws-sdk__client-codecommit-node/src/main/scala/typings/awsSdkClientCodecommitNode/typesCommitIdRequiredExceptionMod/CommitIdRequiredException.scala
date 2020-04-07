package typings.awsSdkClientCodecommitNode.typesCommitIdRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.createBranchExceptionsUnionMod.CreateBranchExceptionsUnion
import typings.awsSdkClientCodecommitNode.getCommentsForComparedCommitExceptionsUnionMod.GetCommentsForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.getCommentsForPullRequestExceptionsUnionMod.GetCommentsForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.getCommitExceptionsUnionMod.GetCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitIdRequiredException
  extends ServiceException[CommitIdRequiredExceptionDetails]
     with CreateBranchExceptionsUnion
     with GetCommentsForComparedCommitExceptionsUnion
     with GetCommentsForPullRequestExceptionsUnion
     with GetCommitExceptionsUnion
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion {
  @JSName("name")
  var name_CommitIdRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitIdRequiredException
}

object CommitIdRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: CommitIdRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitIdRequiredException,
    stack: String = null
  ): CommitIdRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitIdRequiredException]
  }
}

