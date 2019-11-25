package typings.atAwsDashSdkClientDashCodecommitDashNode.typesPullRequestAlreadyClosedExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesMergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdatePullRequestDescriptionExceptionsUnionMod.UpdatePullRequestDescriptionExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdatePullRequestTitleExceptionsUnionMod.UpdatePullRequestTitleExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequestAlreadyClosedException
  extends ServiceException[_PullRequestAlreadyClosedExceptionDetails]
     with MergePullRequestByFastForwardExceptionsUnion
     with UpdatePullRequestDescriptionExceptionsUnion
     with UpdatePullRequestTitleExceptionsUnion {
  @JSName("name")
  var name_PullRequestAlreadyClosedException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.PullRequestAlreadyClosedException
}

object PullRequestAlreadyClosedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _PullRequestAlreadyClosedExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.PullRequestAlreadyClosedException,
    stack: String = null
  ): PullRequestAlreadyClosedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestAlreadyClosedException]
  }
}

