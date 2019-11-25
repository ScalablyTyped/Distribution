package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapElementStyle extends js.Object {
  /**
    * Hex color used for filling polygons, the background of point icons, and for the center of lines if they have split.
    */
  var fillColor: js.UndefOr[String] = js.undefined
  /**
    * The hex color of a map label.
    */
  var labelColor: js.UndefOr[String] = js.undefined
  /**
    * The outline hex color of a map label.
    */
  var labelOutlineColor: js.UndefOr[String] = js.undefined
  /**
    * Species if a map label type is visible or not.
    */
  var labelVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * Hex color used for the outline around polygons, the outline around point icons, and the color of lines.
    */
  var strokeColor: js.UndefOr[String] = js.undefined
  /**
    * Specifies if the map element is visible or not.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object IMapElementStyle {
  @scala.inline
  def apply(
    fillColor: String = null,
    labelColor: String = null,
    labelOutlineColor: String = null,
    labelVisible: js.UndefOr[Boolean] = js.undefined,
    strokeColor: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): IMapElementStyle = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor.asInstanceOf[js.Any])
    if (labelOutlineColor != null) __obj.updateDynamic("labelOutlineColor")(labelOutlineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(labelVisible)) __obj.updateDynamic("labelVisible")(labelVisible.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapElementStyle]
  }
}

