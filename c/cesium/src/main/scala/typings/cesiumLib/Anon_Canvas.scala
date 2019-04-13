package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Canvas extends js.Object {
  var canvas: stdLib.HTMLCanvasElement
  var contextOptions: js.UndefOr[js.Any] = js.undefined
  var creditContainer: js.UndefOr[stdLib.Element] = js.undefined
  var creditViewport: js.UndefOr[stdLib.Element] = js.undefined
  var mapMode2D: js.UndefOr[cesiumLib.cesiumMod.MapMode2D] = js.undefined
  var mapProjection: js.UndefOr[cesiumLib.cesiumMod.MapProjection] = js.undefined
  var maximumRenderTimeChange: js.UndefOr[scala.Double] = js.undefined
  var orderIndependentTranslucency: js.UndefOr[scala.Boolean] = js.undefined
  var requestRenderMode: js.UndefOr[scala.Boolean] = js.undefined
  var scene3DOnly: js.UndefOr[scala.Boolean] = js.undefined
  var shadows: js.UndefOr[scala.Boolean] = js.undefined
  var terrainExaggeration: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Canvas {
  @scala.inline
  def apply(
    canvas: stdLib.HTMLCanvasElement,
    contextOptions: js.Any = null,
    creditContainer: stdLib.Element = null,
    creditViewport: stdLib.Element = null,
    mapMode2D: cesiumLib.cesiumMod.MapMode2D = null,
    mapProjection: cesiumLib.cesiumMod.MapProjection = null,
    maximumRenderTimeChange: scala.Int | scala.Double = null,
    orderIndependentTranslucency: js.UndefOr[scala.Boolean] = js.undefined,
    requestRenderMode: js.UndefOr[scala.Boolean] = js.undefined,
    scene3DOnly: js.UndefOr[scala.Boolean] = js.undefined,
    shadows: js.UndefOr[scala.Boolean] = js.undefined,
    terrainExaggeration: scala.Int | scala.Double = null
  ): Anon_Canvas = {
    val __obj = js.Dynamic.literal(canvas = canvas)
    if (contextOptions != null) __obj.updateDynamic("contextOptions")(contextOptions)
    if (creditContainer != null) __obj.updateDynamic("creditContainer")(creditContainer)
    if (creditViewport != null) __obj.updateDynamic("creditViewport")(creditViewport)
    if (mapMode2D != null) __obj.updateDynamic("mapMode2D")(mapMode2D)
    if (mapProjection != null) __obj.updateDynamic("mapProjection")(mapProjection)
    if (maximumRenderTimeChange != null) __obj.updateDynamic("maximumRenderTimeChange")(maximumRenderTimeChange.asInstanceOf[js.Any])
    if (!js.isUndefined(orderIndependentTranslucency)) __obj.updateDynamic("orderIndependentTranslucency")(orderIndependentTranslucency)
    if (!js.isUndefined(requestRenderMode)) __obj.updateDynamic("requestRenderMode")(requestRenderMode)
    if (!js.isUndefined(scene3DOnly)) __obj.updateDynamic("scene3DOnly")(scene3DOnly)
    if (!js.isUndefined(shadows)) __obj.updateDynamic("shadows")(shadows)
    if (terrainExaggeration != null) __obj.updateDynamic("terrainExaggeration")(terrainExaggeration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Canvas]
  }
}

