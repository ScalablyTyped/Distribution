package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoFocus extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
}

object AnonAutoFocus {
  @scala.inline
  def apply(autoFocus: js.UndefOr[Boolean] = js.undefined): AnonAutoFocus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoFocus]
  }
}

