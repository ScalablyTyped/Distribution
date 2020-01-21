package typings.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanvasPadding extends js.Object {
  var canvasPadding: js.UndefOr[AnonBottom] = js.undefined
  var colors: js.UndefOr[AnonBackground] = js.undefined
  var cssPrefix: js.UndefOr[String] = js.undefined
  var gradient: js.UndefOr[AnonColorEnabled] = js.undefined
  var pieCenterOffset: js.UndefOr[AnonX] = js.undefined
}

object AnonCanvasPadding {
  @scala.inline
  def apply(
    canvasPadding: AnonBottom = null,
    colors: AnonBackground = null,
    cssPrefix: String = null,
    gradient: AnonColorEnabled = null,
    pieCenterOffset: AnonX = null
  ): AnonCanvasPadding = {
    val __obj = js.Dynamic.literal()
    if (canvasPadding != null) __obj.updateDynamic("canvasPadding")(canvasPadding.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (cssPrefix != null) __obj.updateDynamic("cssPrefix")(cssPrefix.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (pieCenterOffset != null) __obj.updateDynamic("pieCenterOffset")(pieCenterOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCanvasPadding]
  }
}

