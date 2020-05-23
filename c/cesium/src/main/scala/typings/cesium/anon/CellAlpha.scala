package typings.cesium.anon

import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellAlpha extends js.Object {
  var cellAlpha: js.UndefOr[Property] = js.undefined
  var color: js.UndefOr[Property] = js.undefined
  var lineCount: js.UndefOr[Property] = js.undefined
  var lineOffset: js.UndefOr[Property] = js.undefined
  var lineThickness: js.UndefOr[Property] = js.undefined
}

object CellAlpha {
  @scala.inline
  def apply(
    cellAlpha: Property = null,
    color: Property = null,
    lineCount: Property = null,
    lineOffset: Property = null,
    lineThickness: Property = null
  ): CellAlpha = {
    val __obj = js.Dynamic.literal()
    if (cellAlpha != null) __obj.updateDynamic("cellAlpha")(cellAlpha.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (lineCount != null) __obj.updateDynamic("lineCount")(lineCount.asInstanceOf[js.Any])
    if (lineOffset != null) __obj.updateDynamic("lineOffset")(lineOffset.asInstanceOf[js.Any])
    if (lineThickness != null) __obj.updateDynamic("lineThickness")(lineThickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellAlpha]
  }
}

