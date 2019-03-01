package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBorderedMapElementStyle extends IMapElementStyle {
  /**
    * Secondary/casing line hex color of the border of a filled polygon.
    */
  var borderOutlineColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Primary line hex color of the border of a filled polygon.
    */
  var borderStrokeColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies if a border is visible or not.
    */
  var borderVisible: js.UndefOr[scala.Boolean] = js.undefined
}

object IBorderedMapElementStyle {
  @scala.inline
  def apply(
    borderOutlineColor: java.lang.String = null,
    borderStrokeColor: java.lang.String = null,
    borderVisible: js.UndefOr[scala.Boolean] = js.undefined,
    fillColor: java.lang.String = null,
    labelColor: java.lang.String = null,
    labelOutlineColor: java.lang.String = null,
    labelVisible: js.UndefOr[scala.Boolean] = js.undefined,
    strokeColor: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): IBorderedMapElementStyle = {
    val __obj = js.Dynamic.literal()
    if (borderOutlineColor != null) __obj.updateDynamic("borderOutlineColor")(borderOutlineColor)
    if (borderStrokeColor != null) __obj.updateDynamic("borderStrokeColor")(borderStrokeColor)
    if (!js.isUndefined(borderVisible)) __obj.updateDynamic("borderVisible")(borderVisible)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor)
    if (labelOutlineColor != null) __obj.updateDynamic("labelOutlineColor")(labelOutlineColor)
    if (!js.isUndefined(labelVisible)) __obj.updateDynamic("labelVisible")(labelVisible)
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IBorderedMapElementStyle]
  }
}

