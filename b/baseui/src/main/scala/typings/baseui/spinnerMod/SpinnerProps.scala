package typings.baseui.spinnerMod

import typings.baseui.AnonActivePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerProps extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var overrides: js.UndefOr[AnonActivePath] = js.undefined
  var size: js.UndefOr[Double | String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object SpinnerProps {
  @scala.inline
  def apply(
    color: String = null,
    overrides: AnonActivePath = null,
    size: Double | String = null,
    title: String = null
  ): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerProps]
  }
}

