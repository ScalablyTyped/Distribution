package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorDashLength extends js.Object {
  var color: js.UndefOr[cesiumLib.cesiumMod.Color] = js.undefined
  var dashLength: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var dashPattern: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var gapColor: js.UndefOr[cesiumLib.cesiumMod.Color] = js.undefined
}

object Anon_ColorDashLength {
  @scala.inline
  def apply(
    color: cesiumLib.cesiumMod.Color = null,
    dashLength: cesiumLib.cesiumMod.Property = null,
    dashPattern: cesiumLib.cesiumMod.Property = null,
    gapColor: cesiumLib.cesiumMod.Color = null
  ): Anon_ColorDashLength = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashLength != null) __obj.updateDynamic("dashLength")(dashLength)
    if (dashPattern != null) __obj.updateDynamic("dashPattern")(dashPattern)
    if (gapColor != null) __obj.updateDynamic("gapColor")(gapColor)
    __obj.asInstanceOf[Anon_ColorDashLength]
  }
}

