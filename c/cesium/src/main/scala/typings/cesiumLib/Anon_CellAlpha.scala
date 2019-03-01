package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellAlpha extends js.Object {
  var cellAlpha: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var color: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var lineCount: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var lineOffset: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var lineThickness: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
}

object Anon_CellAlpha {
  @scala.inline
  def apply(
    cellAlpha: cesiumLib.cesiumMod.CesiumNs.Property = null,
    color: cesiumLib.cesiumMod.CesiumNs.Property = null,
    lineCount: cesiumLib.cesiumMod.CesiumNs.Property = null,
    lineOffset: cesiumLib.cesiumMod.CesiumNs.Property = null,
    lineThickness: cesiumLib.cesiumMod.CesiumNs.Property = null
  ): Anon_CellAlpha = {
    val __obj = js.Dynamic.literal()
    if (cellAlpha != null) __obj.updateDynamic("cellAlpha")(cellAlpha)
    if (color != null) __obj.updateDynamic("color")(color)
    if (lineCount != null) __obj.updateDynamic("lineCount")(lineCount)
    if (lineOffset != null) __obj.updateDynamic("lineOffset")(lineOffset)
    if (lineThickness != null) __obj.updateDynamic("lineThickness")(lineThickness)
    __obj.asInstanceOf[Anon_CellAlpha]
  }
}

