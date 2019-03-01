package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Color] = js.undefined
  var disableDepthTestDistance: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var distanceDisplayCondition: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var heightReference: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.HeightReference] = js.undefined
  var outlineColor: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Color] = js.undefined
  var outlineWidth: js.UndefOr[scala.Double] = js.undefined
  var pixelSize: js.UndefOr[scala.Double] = js.undefined
  var scaleByDistance: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var translucencyByDistance: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(
    color: cesiumLib.cesiumMod.CesiumNs.Color = null,
    disableDepthTestDistance: cesiumLib.cesiumMod.CesiumNs.Property = null,
    distanceDisplayCondition: cesiumLib.cesiumMod.CesiumNs.Property = null,
    heightReference: cesiumLib.cesiumMod.CesiumNs.HeightReference = null,
    outlineColor: cesiumLib.cesiumMod.CesiumNs.Color = null,
    outlineWidth: scala.Int | scala.Double = null,
    pixelSize: scala.Int | scala.Double = null,
    scaleByDistance: cesiumLib.cesiumMod.CesiumNs.Property = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    translucencyByDistance: cesiumLib.cesiumMod.CesiumNs.Property = null
  ): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (disableDepthTestDistance != null) __obj.updateDynamic("disableDepthTestDistance")(disableDepthTestDistance)
    if (distanceDisplayCondition != null) __obj.updateDynamic("distanceDisplayCondition")(distanceDisplayCondition)
    if (heightReference != null) __obj.updateDynamic("heightReference")(heightReference)
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth.asInstanceOf[js.Any])
    if (pixelSize != null) __obj.updateDynamic("pixelSize")(pixelSize.asInstanceOf[js.Any])
    if (scaleByDistance != null) __obj.updateDynamic("scaleByDistance")(scaleByDistance)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (translucencyByDistance != null) __obj.updateDynamic("translucencyByDistance")(translucencyByDistance)
    __obj.asInstanceOf[Anon_Color]
  }
}

