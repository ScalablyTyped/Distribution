package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UI Functions
  * Floating Button
  * chayns
  * interfaces
  */
// chayns.showFloatingButton()
trait FloatingConfig extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var colorText: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object FloatingConfig {
  @scala.inline
  def apply(color: String = null, colorText: String = null, icon: String = null, text: String = null): FloatingConfig = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (colorText != null) __obj.updateDynamic("colorText")(colorText)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[FloatingConfig]
  }
}

