package typings
package chaynsLib

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
  var color: js.UndefOr[java.lang.String] = js.undefined
  var colorText: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object FloatingConfig {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    colorText: java.lang.String = null,
    icon: java.lang.String = null,
    text: java.lang.String = null
  ): FloatingConfig = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (colorText != null) __obj.updateDynamic("colorText")(colorText)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[FloatingConfig]
  }
}

