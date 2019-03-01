package typings
package bootstrapDashToggleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapToggleOptions extends js.Object {
  var height: js.UndefOr[scala.Double | java.lang.String | scala.Null] = js.undefined
  var off: js.UndefOr[java.lang.String] = js.undefined
  var offstyle: js.UndefOr[java.lang.String] = js.undefined
  var on: js.UndefOr[java.lang.String] = js.undefined
  var onstyle: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String | scala.Null] = js.undefined
}

object BootstrapToggleOptions {
  @scala.inline
  def apply(
    height: scala.Double | java.lang.String = null,
    off: java.lang.String = null,
    offstyle: java.lang.String = null,
    on: java.lang.String = null,
    onstyle: java.lang.String = null,
    size: java.lang.String = null,
    style: java.lang.String = null,
    width: scala.Double | java.lang.String = null
  ): BootstrapToggleOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (off != null) __obj.updateDynamic("off")(off)
    if (offstyle != null) __obj.updateDynamic("offstyle")(offstyle)
    if (on != null) __obj.updateDynamic("on")(on)
    if (onstyle != null) __obj.updateDynamic("onstyle")(onstyle)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapToggleOptions]
  }
}

