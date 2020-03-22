package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassName extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var theme: js.UndefOr[AnonColorsSpacing] = js.undefined
}

object AnonClassName {
  @scala.inline
  def apply(className: String = null, style: js.Object = null, theme: AnonColorsSpacing = null): AnonClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassName]
  }
}

