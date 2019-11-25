package typings.atAwsDashSdkClientDashCodecommitDashNode.typesManualMergeRequiredExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesMergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualMergeRequiredException
  extends ServiceException[_ManualMergeRequiredExceptionDetails]
     with MergePullRequestByFastForwardExceptionsUnion {
  @JSName("name")
  var name_ManualMergeRequiredException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.ManualMergeRequiredException
}

object ManualMergeRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _ManualMergeRequiredExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.ManualMergeRequiredException,
    stack: String = null
  ): ManualMergeRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualMergeRequiredException]
  }
}

