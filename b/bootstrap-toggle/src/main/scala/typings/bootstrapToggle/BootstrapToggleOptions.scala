package typings.bootstrapToggle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapToggleOptions extends js.Object {
  var height: js.UndefOr[Double | String | Null] = js.undefined
  var off: js.UndefOr[String] = js.undefined
  var offstyle: js.UndefOr[String] = js.undefined
  var on: js.UndefOr[String] = js.undefined
  var onstyle: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String | Null] = js.undefined
}

object BootstrapToggleOptions {
  @scala.inline
  def apply(
    height: Double | String = null,
    off: String = null,
    offstyle: String = null,
    on: String = null,
    onstyle: String = null,
    size: String = null,
    style: String = null,
    width: Double | String = null
  ): BootstrapToggleOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (off != null) __obj.updateDynamic("off")(off.asInstanceOf[js.Any])
    if (offstyle != null) __obj.updateDynamic("offstyle")(offstyle.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (onstyle != null) __obj.updateDynamic("onstyle")(onstyle.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapToggleOptions]
  }
}

