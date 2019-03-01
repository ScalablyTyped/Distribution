package typings
package bootboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootboxButton extends js.Object {
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
}

object BootboxButton {
  @scala.inline
  def apply(
    callback: js.Function0[_] = null,
    className: java.lang.String = null,
    label: java.lang.String = null
  ): BootboxButton = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (className != null) __obj.updateDynamic("className")(className)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[BootboxButton]
  }
}

