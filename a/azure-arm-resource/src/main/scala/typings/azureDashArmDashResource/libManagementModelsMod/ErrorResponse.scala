package typings.azureDashArmDashResource.libManagementModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorResponse extends js.Object {
  var error: js.UndefOr[ErrorDetails] = js.undefined
}

object ErrorResponse {
  @scala.inline
  def apply(error: ErrorDetails = null): ErrorResponse = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorResponse]
  }
}

