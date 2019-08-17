package typings.atAwsDashSdkClientDashSqsDashNode.typesInvalidMessageContentsMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesSendMessageExceptionsUnionMod.SendMessageExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidMessageContents
  extends ServiceException[_InvalidMessageContentsDetails]
     with SendMessageExceptionsUnion {
  @JSName("name")
  var name_InvalidMessageContents: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.InvalidMessageContents
}

object InvalidMessageContents {
  @scala.inline
  def apply(
    details: _InvalidMessageContentsDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.InvalidMessageContents,
    stack: String = null
  ): InvalidMessageContents = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InvalidMessageContents]
  }
}

