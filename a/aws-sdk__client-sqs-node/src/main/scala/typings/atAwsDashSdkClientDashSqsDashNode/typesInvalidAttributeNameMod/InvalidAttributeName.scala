package typings.atAwsDashSdkClientDashSqsDashNode.typesInvalidAttributeNameMod

import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidAttributeName extends ServiceException[_InvalidAttributeNameDetails] {
  @JSName("name")
  var name_InvalidAttributeName: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.InvalidAttributeName
}

object InvalidAttributeName {
  @scala.inline
  def apply(
    details: _InvalidAttributeNameDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.InvalidAttributeName,
    stack: String = null
  ): InvalidAttributeName = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InvalidAttributeName]
  }
}

