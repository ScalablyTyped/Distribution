package typings.azureDashArmDashResource.libManagementModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorDetails extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object ErrorDetails {
  @scala.inline
  def apply(code: String = null, message: String = null, target: String = null): ErrorDetails = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (message != null) __obj.updateDynamic("message")(message)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ErrorDetails]
  }
}

