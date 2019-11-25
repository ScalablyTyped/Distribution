package typings.atAwsDashSdkClientDashCodecommitDashNode.typesPullRequestStatusRequiredExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdatePullRequestStatusExceptionsUnionMod.UpdatePullRequestStatusExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequestStatusRequiredException
  extends ServiceException[_PullRequestStatusRequiredExceptionDetails]
     with UpdatePullRequestStatusExceptionsUnion {
  @JSName("name")
  var name_PullRequestStatusRequiredException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.PullRequestStatusRequiredException
}

object PullRequestStatusRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _PullRequestStatusRequiredExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.PullRequestStatusRequiredException,
    stack: String = null
  ): PullRequestStatusRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestStatusRequiredException]
  }
}

