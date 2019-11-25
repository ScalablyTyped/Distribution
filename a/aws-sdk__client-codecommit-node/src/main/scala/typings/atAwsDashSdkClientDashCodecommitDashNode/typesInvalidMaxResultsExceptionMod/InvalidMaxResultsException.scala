package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidMaxResultsExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDescribePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetCommentsForComparedCommitExceptionsUnionMod.GetCommentsForComparedCommitExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetCommentsForPullRequestExceptionsUnionMod.GetCommentsForPullRequestExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesListPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidMaxResultsException
  extends ServiceException[_InvalidMaxResultsExceptionDetails]
     with DescribePullRequestEventsExceptionsUnion
     with GetCommentsForComparedCommitExceptionsUnion
     with GetCommentsForPullRequestExceptionsUnion
     with GetDifferencesExceptionsUnion
     with ListPullRequestsExceptionsUnion {
  @JSName("name")
  var name_InvalidMaxResultsException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidMaxResultsException
}

object InvalidMaxResultsException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidMaxResultsExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidMaxResultsException,
    stack: String = null
  ): InvalidMaxResultsException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidMaxResultsException]
  }
}

