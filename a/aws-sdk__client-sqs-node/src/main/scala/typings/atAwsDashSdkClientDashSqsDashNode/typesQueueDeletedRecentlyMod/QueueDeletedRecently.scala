package typings.atAwsDashSdkClientDashSqsDashNode.typesQueueDeletedRecentlyMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesCreateQueueExceptionsUnionMod.CreateQueueExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueDeletedRecently
  extends ServiceException[_QueueDeletedRecentlyDetails]
     with CreateQueueExceptionsUnion {
  @JSName("name")
  var name_QueueDeletedRecently: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.QueueDeletedRecently
}

object QueueDeletedRecently {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _QueueDeletedRecentlyDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.QueueDeletedRecently,
    stack: String = null
  ): QueueDeletedRecently = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueDeletedRecently]
  }
}

