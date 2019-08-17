package typings.atAwsDashSdkClientDashSqsDashNode.typesOverLimitMod

import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverLimit extends ServiceException[_OverLimitDetails] {
  @JSName("name")
  var name_OverLimit: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.OverLimit
}

object OverLimit {
  @scala.inline
  def apply(
    details: _OverLimitDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.OverLimit,
    stack: String = null
  ): OverLimit = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[OverLimit]
  }
}

