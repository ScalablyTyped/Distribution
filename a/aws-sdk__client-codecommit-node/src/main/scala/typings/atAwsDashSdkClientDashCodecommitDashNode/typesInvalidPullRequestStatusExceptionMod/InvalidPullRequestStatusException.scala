package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidPullRequestStatusExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesListPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdatePullRequestStatusExceptionsUnionMod.UpdatePullRequestStatusExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidPullRequestStatusException
  extends ServiceException[_InvalidPullRequestStatusExceptionDetails]
     with ListPullRequestsExceptionsUnion
     with UpdatePullRequestStatusExceptionsUnion {
  @JSName("name")
  var name_InvalidPullRequestStatusException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidPullRequestStatusException
}

object InvalidPullRequestStatusException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidPullRequestStatusExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidPullRequestStatusException,
    stack: String = null
  ): InvalidPullRequestStatusException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidPullRequestStatusException]
  }
}

