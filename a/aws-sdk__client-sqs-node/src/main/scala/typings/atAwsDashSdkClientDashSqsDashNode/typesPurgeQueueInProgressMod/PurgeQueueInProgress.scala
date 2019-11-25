package typings.atAwsDashSdkClientDashSqsDashNode.typesPurgeQueueInProgressMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesPurgeQueueExceptionsUnionMod.PurgeQueueExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurgeQueueInProgress
  extends ServiceException[_PurgeQueueInProgressDetails]
     with PurgeQueueExceptionsUnion {
  @JSName("name")
  var name_PurgeQueueInProgress: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.PurgeQueueInProgress
}

object PurgeQueueInProgress {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _PurgeQueueInProgressDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.PurgeQueueInProgress,
    stack: String = null
  ): PurgeQueueInProgress = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurgeQueueInProgress]
  }
}

