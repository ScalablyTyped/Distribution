package typings.atAwsDashSdkClientDashSqsDashNode.typesInvalidIdFormatMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesDeleteMessageExceptionsUnionMod.DeleteMessageExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidIdFormat
  extends ServiceException[_InvalidIdFormatDetails]
     with DeleteMessageExceptionsUnion {
  @JSName("name")
  var name_InvalidIdFormat: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.InvalidIdFormat
}

object InvalidIdFormat {
  @scala.inline
  def apply(
    details: _InvalidIdFormatDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.InvalidIdFormat,
    stack: String = null
  ): InvalidIdFormat = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InvalidIdFormat]
  }
}

