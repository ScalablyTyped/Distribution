package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPolygonOptions extends IPolylineOptions {
  /** CSS string or Color object as the polygon's filling color. */
  var fillColor: js.UndefOr[java.lang.String | Color] = js.undefined
}

object IPolygonOptions {
  @scala.inline
  def apply(
    cursor: java.lang.String = null,
    fillColor: java.lang.String | Color = null,
    generalizable: js.UndefOr[scala.Boolean] = js.undefined,
    strokeColor: java.lang.String | Color = null,
    strokeDashArray: js.Array[scala.Double] | java.lang.String = null,
    strokeThickness: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): IPolygonOptions = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(generalizable)) __obj.updateDynamic("generalizable")(generalizable)
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeDashArray != null) __obj.updateDynamic("strokeDashArray")(strokeDashArray.asInstanceOf[js.Any])
    if (strokeThickness != null) __obj.updateDynamic("strokeThickness")(strokeThickness.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IPolygonOptions]
  }
}

