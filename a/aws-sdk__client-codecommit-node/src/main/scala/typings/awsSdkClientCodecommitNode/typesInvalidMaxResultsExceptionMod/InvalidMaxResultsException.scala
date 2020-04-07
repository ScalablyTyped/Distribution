package typings.awsSdkClientCodecommitNode.typesInvalidMaxResultsExceptionMod

import typings.awsSdkClientCodecommitNode.describePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import typings.awsSdkClientCodecommitNode.getCommentsForComparedCommitExceptionsUnionMod.GetCommentsForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.getCommentsForPullRequestExceptionsUnionMod.GetCommentsForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.getDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typings.awsSdkClientCodecommitNode.listPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidMaxResultsException
  extends ServiceException[InvalidMaxResultsExceptionDetails]
     with DescribePullRequestEventsExceptionsUnion
     with GetCommentsForComparedCommitExceptionsUnion
     with GetCommentsForPullRequestExceptionsUnion
     with GetDifferencesExceptionsUnion
     with ListPullRequestsExceptionsUnion {
  @JSName("name")
  var name_InvalidMaxResultsException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidMaxResultsException
}

object InvalidMaxResultsException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidMaxResultsExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidMaxResultsException,
    stack: String = null
  ): InvalidMaxResultsException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidMaxResultsException]
  }
}

