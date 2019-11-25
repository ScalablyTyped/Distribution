package typings.atAwsDashSdkClientDashSqsDashNode.typesQueueDoesNotExistMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesPurgeQueueExceptionsUnionMod.PurgeQueueExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueDoesNotExist
  extends ServiceException[_QueueDoesNotExistDetails]
     with PurgeQueueExceptionsUnion {
  @JSName("name")
  var name_QueueDoesNotExist: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.QueueDoesNotExist
}

object QueueDoesNotExist {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _QueueDoesNotExistDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.QueueDoesNotExist,
    stack: String = null
  ): QueueDoesNotExist = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueDoesNotExist]
  }
}

