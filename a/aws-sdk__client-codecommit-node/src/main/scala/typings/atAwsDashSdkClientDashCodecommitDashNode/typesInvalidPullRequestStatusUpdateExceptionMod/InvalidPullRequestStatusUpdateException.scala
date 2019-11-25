package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidPullRequestStatusUpdateExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdatePullRequestStatusExceptionsUnionMod.UpdatePullRequestStatusExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidPullRequestStatusUpdateException
  extends ServiceException[_InvalidPullRequestStatusUpdateExceptionDetails]
     with UpdatePullRequestStatusExceptionsUnion {
  @JSName("name")
  var name_InvalidPullRequestStatusUpdateException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidPullRequestStatusUpdateException
}

object InvalidPullRequestStatusUpdateException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidPullRequestStatusUpdateExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidPullRequestStatusUpdateException,
    stack: String = null
  ): InvalidPullRequestStatusUpdateException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidPullRequestStatusUpdateException]
  }
}

