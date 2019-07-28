package typings.cesium

import typings.cesium.cesiumMod.Clock
import typings.cesium.cesiumMod.Globe
import typings.cesium.cesiumMod.ImageryProvider
import typings.cesium.cesiumMod.MapMode2D
import typings.cesium.cesiumMod.MapProjection
import typings.cesium.cesiumMod.SceneMode
import typings.cesium.cesiumMod.ShadowMode
import typings.cesium.cesiumMod.SkyAtmosphere
import typings.cesium.cesiumMod.SkyBox
import typings.cesium.cesiumMod.TerrainProvider
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClockContextOptions extends js.Object {
  var clock: js.UndefOr[Clock] = js.undefined
  var contextOptions: js.UndefOr[js.Any] = js.undefined
  var creditContainer: js.UndefOr[Element | String] = js.undefined
  var creditViewport: js.UndefOr[Element | String] = js.undefined
  var globe: js.UndefOr[Globe] = js.undefined
  var imageryProvider: js.UndefOr[ImageryProvider] = js.undefined
  var mapMode2D: js.UndefOr[MapMode2D] = js.undefined
  var mapProjection: js.UndefOr[MapProjection] = js.undefined
  var maximumRenderTimeChange: js.UndefOr[Double] = js.undefined
  var orderIndependentTranslucency: js.UndefOr[Boolean] = js.undefined
  var requestRenderMode: js.UndefOr[Boolean] = js.undefined
  var scene3DOnly: js.UndefOr[Boolean] = js.undefined
  var sceneMode: js.UndefOr[SceneMode] = js.undefined
  var shadows: js.UndefOr[Boolean] = js.undefined
  var showRenderLoopErrors: js.UndefOr[Boolean] = js.undefined
  var skyAtmosphere: js.UndefOr[SkyAtmosphere] = js.undefined
  var skyBox: js.UndefOr[SkyBox] = js.undefined
  var targetFrameRate: js.UndefOr[Double] = js.undefined
  var terrainExaggeration: js.UndefOr[Double] = js.undefined
  var terrainProvider: js.UndefOr[TerrainProvider] = js.undefined
  var terrainShadows: js.UndefOr[ShadowMode] = js.undefined
  var useDefaultRenderLoop: js.UndefOr[Boolean] = js.undefined
}

object Anon_ClockContextOptions {
  @scala.inline
  def apply(
    clock: Clock = null,
    contextOptions: js.Any = null,
    creditContainer: Element | String = null,
    creditViewport: Element | String = null,
    globe: Globe = null,
    imageryProvider: ImageryProvider = null,
    mapMode2D: MapMode2D = null,
    mapProjection: MapProjection = null,
    maximumRenderTimeChange: Int | Double = null,
    orderIndependentTranslucency: js.UndefOr[Boolean] = js.undefined,
    requestRenderMode: js.UndefOr[Boolean] = js.undefined,
    scene3DOnly: js.UndefOr[Boolean] = js.undefined,
    sceneMode: SceneMode = null,
    shadows: js.UndefOr[Boolean] = js.undefined,
    showRenderLoopErrors: js.UndefOr[Boolean] = js.undefined,
    skyAtmosphere: SkyAtmosphere = null,
    skyBox: SkyBox = null,
    targetFrameRate: Int | Double = null,
    terrainExaggeration: Int | Double = null,
    terrainProvider: TerrainProvider = null,
    terrainShadows: ShadowMode = null,
    useDefaultRenderLoop: js.UndefOr[Boolean] = js.undefined
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

