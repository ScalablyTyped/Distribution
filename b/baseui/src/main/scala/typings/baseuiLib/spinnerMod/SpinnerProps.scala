package typings
package baseuiLib.spinnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerProps extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var overrides: js.UndefOr[baseuiLib.Anon_ActivePath] = js.undefined
  var size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object SpinnerProps {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    overrides: baseuiLib.Anon_ActivePath = null,
    size: scala.Double | java.lang.String = null,
    title: java.lang.String = null
  ): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SpinnerProps]
  }
}

