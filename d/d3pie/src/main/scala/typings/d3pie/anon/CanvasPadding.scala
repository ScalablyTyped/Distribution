package typings.d3pie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasPadding extends js.Object {
  var canvasPadding: js.UndefOr[Bottom] = js.undefined
  var colors: js.UndefOr[Background] = js.undefined
  var cssPrefix: js.UndefOr[String] = js.undefined
  var gradient: js.UndefOr[ColorEnabled] = js.undefined
  var pieCenterOffset: js.UndefOr[X] = js.undefined
}

object CanvasPadding {
  @scala.inline
  def apply(
    canvasPadding: Bottom = null,
    colors: Background = null,
    cssPrefix: String = null,
    gradient: ColorEnabled = null,
    pieCenterOffset: X = null
  ): CanvasPadding = {
    val __obj = js.Dynamic.literal()
    if (canvasPadding != null) __obj.updateDynamic("canvasPadding")(canvasPadding.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (cssPrefix != null) __obj.updateDynamic("cssPrefix")(cssPrefix.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (pieCenterOffset != null) __obj.updateDynamic("pieCenterOffset")(pieCenterOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasPadding]
  }
}

