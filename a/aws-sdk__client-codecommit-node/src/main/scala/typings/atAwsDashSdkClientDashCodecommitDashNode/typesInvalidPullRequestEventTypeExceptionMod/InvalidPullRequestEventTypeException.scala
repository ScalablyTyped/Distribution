package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidPullRequestEventTypeExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDescribePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidPullRequestEventTypeException
  extends ServiceException[_InvalidPullRequestEventTypeExceptionDetails]
     with DescribePullRequestEventsExceptionsUnion {
  @JSName("name")
  var name_InvalidPullRequestEventTypeException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidPullRequestEventTypeException
}

object InvalidPullRequestEventTypeException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidPullRequestEventTypeExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidPullRequestEventTypeException,
    stack: String = null
  ): InvalidPullRequestEventTypeException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidPullRequestEventTypeException]
  }
}

