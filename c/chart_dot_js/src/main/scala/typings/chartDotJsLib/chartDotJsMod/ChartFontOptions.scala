package typings
package chartDotJsLib.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartFontOptions extends js.Object {
  var defaultFontColor: js.UndefOr[ChartColor] = js.undefined
  var defaultFontFamily: js.UndefOr[java.lang.String] = js.undefined
  var defaultFontSize: js.UndefOr[scala.Double] = js.undefined
  var defaultFontStyle: js.UndefOr[java.lang.String] = js.undefined
}

object ChartFontOptions {
  @scala.inline
  def apply(
    defaultFontColor: ChartColor = null,
    defaultFontFamily: java.lang.String = null,
    defaultFontSize: scala.Int | scala.Double = null,
    defaultFontStyle: java.lang.String = null
  ): ChartFontOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultFontColor != null) __obj.updateDynamic("defaultFontColor")(defaultFontColor.asInstanceOf[js.Any])
    if (defaultFontFamily != null) __obj.updateDynamic("defaultFontFamily")(defaultFontFamily)
    if (defaultFontSize != null) __obj.updateDynamic("defaultFontSize")(defaultFontSize.asInstanceOf[js.Any])
    if (defaultFontStyle != null) __obj.updateDynamic("defaultFontStyle")(defaultFontStyle)
    __obj.asInstanceOf[ChartFontOptions]
  }
}

