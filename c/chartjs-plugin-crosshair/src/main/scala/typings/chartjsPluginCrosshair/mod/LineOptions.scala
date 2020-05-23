package typings.chartjsPluginCrosshair.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineOptions extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var dashPattern: js.UndefOr[js.Array[Double]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object LineOptions {
  @scala.inline
  def apply(
    color: String = null,
    dashPattern: js.Array[Double] = null,
    width: js.UndefOr[Double] = js.undefined
  ): LineOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashPattern != null) __obj.updateDynamic("dashPattern")(dashPattern.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineOptions]
  }
}

