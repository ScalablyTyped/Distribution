package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapElementStyle extends js.Object {
  /**
    * Hex color used for filling polygons, the background of point icons, and for the center of lines if they have split.
    */
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The hex color of a map label.
    */
  var labelColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The outline hex color of a map label.
    */
  var labelOutlineColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Species if a map label type is visible or not.
    */
  var labelVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Hex color used for the outline around polygons, the outline around point icons, and the color of lines.
    */
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies if the map element is visible or not.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object IMapElementStyle {
  @scala.inline
  def apply(
    fillColor: java.lang.String = null,
    labelColor: java.lang.String = null,
    labelOutlineColor: java.lang.String = null,
    labelVisible: js.UndefOr[scala.Boolean] = js.undefined,
    strokeColor: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): IMapElementStyle = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor)
    if (labelOutlineColor != null) __obj.updateDynamic("labelOutlineColor")(labelOutlineColor)
    if (!js.isUndefined(labelVisible)) __obj.updateDynamic("labelVisible")(labelVisible)
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IMapElementStyle]
  }
}

