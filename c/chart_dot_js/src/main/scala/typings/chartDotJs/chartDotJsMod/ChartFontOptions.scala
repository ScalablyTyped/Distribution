package typings.chartDotJs.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartFontOptions extends js.Object {
  var defaultFontColor: js.UndefOr[ChartColor] = js.undefined
  var defaultFontFamily: js.UndefOr[String] = js.undefined
  var defaultFontSize: js.UndefOr[Double] = js.undefined
  var defaultFontStyle: js.UndefOr[String] = js.undefined
}

object ChartFontOptions {
  @scala.inline
  def apply(
    defaultFontColor: ChartColor = null,
    defaultFontFamily: String = null,
    defaultFontSize: Int | Double = null,
    defaultFontStyle: String = null
  ): ChartFontOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultFontColor != null) __obj.updateDynamic("defaultFontColor")(defaultFontColor.asInstanceOf[js.Any])
    if (defaultFontFamily != null) __obj.updateDynamic("defaultFontFamily")(defaultFontFamily.asInstanceOf[js.Any])
    if (defaultFontSize != null) __obj.updateDynamic("defaultFontSize")(defaultFontSize.asInstanceOf[js.Any])
    if (defaultFontStyle != null) __obj.updateDynamic("defaultFontStyle")(defaultFontStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartFontOptions]
  }
}

