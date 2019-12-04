package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoFocus extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
}

object Anon_AutoFocus {
  @scala.inline
  def apply(autoFocus: js.UndefOr[Boolean] = js.undefined): Anon_AutoFocus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoFocus]
  }
}

