package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClockContextOptions extends js.Object {
  var clock: js.UndefOr[cesiumLib.cesiumMod.Clock] = js.undefined
  var contextOptions: js.UndefOr[js.Any] = js.undefined
  var creditContainer: js.UndefOr[stdLib.Element | java.lang.String] = js.undefined
  var creditViewport: js.UndefOr[stdLib.Element | java.lang.String] = js.undefined
  var globe: js.UndefOr[cesiumLib.cesiumMod.Globe] = js.undefined
  var imageryProvider: js.UndefOr[cesiumLib.cesiumMod.ImageryProvider] = js.undefined
  var mapMode2D: js.UndefOr[cesiumLib.cesiumMod.MapMode2D] = js.undefined
  var mapProjection: js.UndefOr[cesiumLib.cesiumMod.MapProjection] = js.undefined
  var maximumRenderTimeChange: js.UndefOr[scala.Double] = js.undefined
  var orderIndependentTranslucency: js.UndefOr[scala.Boolean] = js.undefined
  var requestRenderMode: js.UndefOr[scala.Boolean] = js.undefined
  var scene3DOnly: js.UndefOr[scala.Boolean] = js.undefined
  var sceneMode: js.UndefOr[cesiumLib.cesiumMod.SceneMode] = js.undefined
  var shadows: js.UndefOr[scala.Boolean] = js.undefined
  var showRenderLoopErrors: js.UndefOr[scala.Boolean] = js.undefined
  var skyAtmosphere: js.UndefOr[cesiumLib.cesiumMod.SkyAtmosphere] = js.undefined
  var skyBox: js.UndefOr[cesiumLib.cesiumMod.SkyBox] = js.undefined
  var targetFrameRate: js.UndefOr[scala.Double] = js.undefined
  var terrainExaggeration: js.UndefOr[scala.Double] = js.undefined
  var terrainProvider: js.UndefOr[cesiumLib.cesiumMod.TerrainProvider] = js.undefined
  var terrainShadows: js.UndefOr[cesiumLib.cesiumMod.ShadowMode] = js.undefined
  var useDefaultRenderLoop: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ClockContextOptions {
  @scala.inline
  def apply(
    clock: cesiumLib.cesiumMod.Clock = null,
    contextOptions: js.Any = null,
    creditContainer: stdLib.Element | java.lang.String = null,
    creditViewport: stdLib.Element | java.lang.String = null,
    globe: cesiumLib.cesiumMod.Globe = null,
    imageryProvider: cesiumLib.cesiumMod.ImageryProvider = null,
    mapMode2D: cesiumLib.cesiumMod.MapMode2D = null,
    mapProjection: cesiumLib.cesiumMod.MapProjection = null,
    maximumRenderTimeChange: scala.Int | scala.Double = null,
    orderIndependentTranslucency: js.UndefOr[scala.Boolean] = js.undefined,
    requestRenderMode: js.UndefOr[scala.Boolean] = js.undefined,
    scene3DOnly: js.UndefOr[scala.Boolean] = js.undefined,
    sceneMode: cesiumLib.cesiumMod.SceneMode = null,
    shadows: js.UndefOr[scala.Boolean] = js.undefined,
    showRenderLoopErrors: js.UndefOr[scala.Boolean] = js.undefined,
    skyAtmosphere: cesiumLib.cesiumMod.SkyAtmosphere = null,
    skyBox: cesiumLib.cesiumMod.SkyBox = null,
    targetFrameRate: scala.Int | scala.Double = null,
    terrainExaggeration: scala.Int | scala.Double = null,
    terrainProvider: cesiumLib.cesiumMod.TerrainProvider = null,
    terrainShadows: cesiumLib.cesiumMod.ShadowMode = null,
    useDefaultRenderLoop: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ClockContextOptions = {
    val __obj = js.Dynamic.literal()
    if (clock != null) __obj.updateDynamic("clock")(clock)
    if (contextOptions != null) __obj.updateDynamic("contextOptions")(contextOptions)
    if (creditContainer != null) __obj.updateDynamic("creditContainer")(creditContainer.asInstanceOf[js.Any])
    if (creditViewport != null) __obj.updateDynamic("creditViewport")(creditViewport.asInstanceOf[js.Any])
    if (globe != null) __obj.updateDynamic("globe")(globe)
    if (imageryProvider != null) __obj.updateDynamic("imageryProvider")(imageryProvider)
    if (mapMode2D != null) __obj.updateDynamic("mapMode2D")(mapMode2D)
    if (mapProjection != null) __obj.updateDynamic("mapProjection")(mapProjection)
    if (maximumRenderTimeChange != null) __obj.updateDynamic("maximumRenderTimeChange")(maximumRenderTimeChange.asInstanceOf[js.Any])
    if (!js.isUndefined(orderIndependentTranslucency)) __obj.updateDynamic("orderIndependentTranslucency")(orderIndependentTranslucency)
    if (!js.isUndefined(requestRenderMode)) __obj.updateDynamic("requestRenderMode")(requestRenderMode)
    if (!js.isUndefined(scene3DOnly)) __obj.updateDynamic("scene3DOnly")(scene3DOnly)
    if (sceneMode != null) __obj.updateDynamic("sceneMode")(sceneMode)
    if (!js.isUndefined(shadows)) __obj.updateDynamic("shadows")(shadows)
    if (!js.isUndefined(showRenderLoopErrors)) __obj.updateDynamic("showRenderLoopErrors")(showRenderLoopErrors)
    if (skyAtmosphere != null) __obj.updateDynamic("skyAtmosphere")(skyAtmosphere)
    if (skyBox != null) __obj.updateDynamic("skyBox")(skyBox)
    if (targetFrameRate != null) __obj.updateDynamic("targetFrameRate")(targetFrameRate.asInstanceOf[js.Any])
    if (terrainExaggeration != null) __obj.updateDynamic("terrainExaggeration")(terrainExaggeration.asInstanceOf[js.Any])
    if (terrainProvider != null) __obj.updateDynamic("terrainProvider")(terrainProvider)
    if (terrainShadows != null) __obj.updateDynamic("terrainShadows")(terrainShadows)
    if (!js.isUndefined(useDefaultRenderLoop)) __obj.updateDynamic("useDefaultRenderLoop")(useDefaultRenderLoop)
    __obj.asInstanceOf[Anon_ClockContextOptions]
  }
}

