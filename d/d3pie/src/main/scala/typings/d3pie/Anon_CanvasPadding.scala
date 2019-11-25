package typings.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanvasPadding extends js.Object {
  var canvasPadding: js.UndefOr[Anon_Bottom] = js.undefined
  var colors: js.UndefOr[Anon_Background] = js.undefined
  var cssPrefix: js.UndefOr[String] = js.undefined
  var gradient: js.UndefOr[Anon_ColorEnabled] = js.undefined
  var pieCenterOffset: js.UndefOr[Anon_X] = js.undefined
}

object Anon_CanvasPadding {
  @scala.inline
  def apply(
    canvasPadding: Anon_Bottom = null,
    colors: Anon_Background = null,
    cssPrefix: String = null,
    gradient: Anon_ColorEnabled = null,
    pieCenterOffset: Anon_X = null
  ): Anon_CanvasPadding = {
    val __obj = js.Dynamic.literal()
    if (canvasPadding != null) __obj.updateDynamic("canvasPadding")(canvasPadding.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (cssPrefix != null) __obj.updateDynamic("cssPrefix")(cssPrefix.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (pieCenterOffset != null) __obj.updateDynamic("pieCenterOffset")(pieCenterOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CanvasPadding]
  }
}

