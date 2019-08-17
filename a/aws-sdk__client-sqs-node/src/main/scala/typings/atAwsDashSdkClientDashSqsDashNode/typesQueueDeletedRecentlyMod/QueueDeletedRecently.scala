package typings.atAwsDashSdkClientDashSqsDashNode.typesQueueDeletedRecentlyMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesCreateQueueExceptionsUnionMod.CreateQueueExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
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
    details: _QueueDeletedRecentlyDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.QueueDeletedRecently,
    stack: String = null
  ): QueueDeletedRecently = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[QueueDeletedRecently]
  }
}

