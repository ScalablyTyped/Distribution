package typings
package d3pieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanvasPadding extends js.Object {
  var canvasPadding: js.UndefOr[Anon_Bottom] = js.undefined
  var colors: js.UndefOr[Anon_Background] = js.undefined
  var cssPrefix: js.UndefOr[java.lang.String] = js.undefined
  var gradient: js.UndefOr[Anon_ColorEnabled] = js.undefined
  var pieCenterOffset: js.UndefOr[Anon_X] = js.undefined
}

object Anon_CanvasPadding {
  @scala.inline
  def apply(
    canvasPadding: Anon_Bottom = null,
    colors: Anon_Background = null,
    cssPrefix: java.lang.String = null,
    gradient: Anon_ColorEnabled = null,
    pieCenterOffset: Anon_X = null
  ): Anon_CanvasPadding = {
    val __obj = js.Dynamic.literal()
    if (canvasPadding != null) __obj.updateDynamic("canvasPadding")(canvasPadding)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (cssPrefix != null) __obj.updateDynamic("cssPrefix")(cssPrefix)
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    if (pieCenterOffset != null) __obj.updateDynamic("pieCenterOffset")(pieCenterOffset)
    __obj.asInstanceOf[Anon_CanvasPadding]
  }
}

