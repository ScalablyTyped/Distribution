package typings.awsSdkClientCodecommitNode.typesInvalidContinuationTokenExceptionMod

import typings.awsSdkClientCodecommitNode.describePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import typings.awsSdkClientCodecommitNode.getCommentsForComparedCommitExceptionsUnionMod.GetCommentsForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.getCommentsForPullRequestExceptionsUnionMod.GetCommentsForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.getDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typings.awsSdkClientCodecommitNode.listBranchesExceptionsUnionMod.ListBranchesExceptionsUnion
import typings.awsSdkClientCodecommitNode.listPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import typings.awsSdkClientCodecommitNode.listRepositoriesExceptionsUnionMod.ListRepositoriesExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidContinuationTokenException
  extends ServiceException[InvalidContinuationTokenExceptionDetails]
     with DescribePullRequestEventsExceptionsUnion
     with GetCommentsForComparedCommitExceptionsUnion
     with GetCommentsForPullRequestExceptionsUnion
     with GetDifferencesExceptionsUnion
     with ListBranchesExceptionsUnion
     with ListPullRequestsExceptionsUnion
     with ListRepositoriesExceptionsUnion {
  @JSName("name")
  var name_InvalidContinuationTokenException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidContinuationTokenException
}

object InvalidContinuationTokenException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidContinuationTokenExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidContinuationTokenException,
    stack: String = null
  ): InvalidContinuationTokenException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidContinuationTokenException]
  }
}

