package typings.cesium

import typings.cesium.cesiumMod.ClockViewModel
import typings.cesium.cesiumMod.DataSourceCollection
import typings.cesium.cesiumMod.Globe
import typings.cesium.cesiumMod.ImageryProvider
import typings.cesium.cesiumMod.MapMode2D
import typings.cesium.cesiumMod.MapProjection
import typings.cesium.cesiumMod.ProviderViewModel
import typings.cesium.cesiumMod.SceneMode
import typings.cesium.cesiumMod.ShadowMode
import typings.cesium.cesiumMod.SkyAtmosphere
import typings.cesium.cesiumMod.SkyBox
import typings.cesium.cesiumMod.TerrainProvider
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animation extends js.Object {
  var animation: js.UndefOr[Boolean] = js.undefined
  var automaticallyTrackDataSourceClocks: js.UndefOr[Boolean] = js.undefined
  var baseLayerPicker: js.UndefOr[Boolean] = js.undefined
  var clockViewModel: js.UndefOr[ClockViewModel] = js.undefined
  var contextOptions: js.UndefOr[js.Any] = js.undefined
  var creditContainer: js.UndefOr[Element | String] = js.undefined
  var creditViewport: js.UndefOr[Element | String] = js.undefined
  var dataSources: js.UndefOr[DataSourceCollection] = js.undefined
  var fullscreenButton: js.UndefOr[Boolean] = js.undefined
  var fullscreenElement: js.UndefOr[Element | String] = js.undefined
  var geocoder: js.UndefOr[Boolean] = js.undefined
  var globe: js.UndefOr[Globe] = js.undefined
  var homeButton: js.UndefOr[Boolean] = js.undefined
  var imageryProvider: js.UndefOr[ImageryProvider] = js.undefined
  var imageryProviderViewModels: js.UndefOr[js.Array[ProviderViewModel]] = js.undefined
  var infoBox: js.UndefOr[Boolean] = js.undefined
  var mapMode2D: js.UndefOr[MapMode2D] = js.undefined
  var mapProjection: js.UndefOr[MapProjection] = js.undefined
  var maximumRenderTimeChange: js.UndefOr[Double] = js.undefined
  var navigationHelpButton: js.UndefOr[Boolean] = js.undefined
  var navigationInstructionsInitiallyVisible: js.UndefOr[Boolean] = js.undefined
  var orderIndependentTranslucency: js.UndefOr[Boolean] = js.undefined
  var projectionPicker: js.UndefOr[Boolean] = js.undefined
  var requestRenderMode: js.UndefOr[Boolean] = js.undefined
  var scene3DOnly: js.UndefOr[Boolean] = js.undefined
  var sceneMode: js.UndefOr[SceneMode] = js.undefined
  var sceneModePicker: js.UndefOr[Boolean] = js.undefined
  var selectedImageryProviderViewModel: js.UndefOr[ProviderViewModel] = js.undefined
  var selectedTerrainProviderViewModel: js.UndefOr[ProviderViewModel] = js.undefined
  var selectionIndicator: js.UndefOr[Boolean] = js.undefined
  var shadows: js.UndefOr[Boolean] = js.undefined
  var shouldAnimate: js.UndefOr[Boolean] = js.undefined
  var showRenderLoopErrors: js.UndefOr[Boolean] = js.undefined
  var skyAtmosphere: js.UndefOr[SkyAtmosphere] = js.undefined
  var skyBox: js.UndefOr[SkyBox] = js.undefined
  var targetFrameRate: js.UndefOr[Double] = js.undefined
  var terrainExaggeration: js.UndefOr[Double] = js.undefined
  var terrainProvider: js.UndefOr[TerrainProvider] = js.undefined
  var terrainProviderViewModels: js.UndefOr[js.Array[ProviderViewModel]] = js.undefined
  var terrainShadows: js.UndefOr[ShadowMode] = js.undefined
  var timeline: js.UndefOr[Boolean] = js.undefined
  var useDefaultRenderLoop: js.UndefOr[Boolean] = js.undefined
  var vrButton: js.UndefOr[Boolean] = js.undefined
}

object Anon_Animation {
  @scala.inline
  def apply(
    animation: js.UndefOr[Boolean] = js.undefined,
    automaticallyTrackDataSourceClocks: js.UndefOr[Boolean] = js.undefined,
    baseLayerPicker: js.UndefOr[Boolean] = js.undefined,
    clockViewModel: ClockViewModel = null,
    contextOptions: js.Any = null,
    creditContainer: Element | String = null,
    creditViewport: Element | String = null,
    dataSources: DataSourceCollection = null,
    fullscreenButton: js.UndefOr[Boolean] = js.undefined,
    fullscreenElement: Element | String = null,
    geocoder: js.UndefOr[Boolean] = js.undefined,
    globe: Globe = null,
    homeButton: js.UndefOr[Boolean] = js.undefined,
    imageryProvider: ImageryProvider = null,
    imageryProviderViewModels: js.Array[ProviderViewModel] = null,
    infoBox: js.UndefOr[Boolean] = js.undefined,
    mapMode2D: MapMode2D = null,
    mapProjection: MapProjection = null,
    maximumRenderTimeChange: Int | Double = null,
    navigationHelpButton: js.UndefOr[Boolean] = js.undefined,
    navigationInstructionsInitiallyVisible: js.UndefOr[Boolean] = js.undefined,
    orderIndependentTranslucency: js.UndefOr[Boolean] = js.undefined,
    projectionPicker: js.UndefOr[Boolean] = js.undefined,
    requestRenderMode: js.UndefOr[Boolean] = js.undefined,
    scene3DOnly: js.UndefOr[Boolean] = js.undefined,
    sceneMode: SceneMode = null,
    sceneModePicker: js.UndefOr[Boolean] = js.undefined,
    selectedImageryProviderViewModel: ProviderViewModel = null,
    selectedTerrainProviderViewModel: ProviderViewModel = null,
    selectionIndicator: js.UndefOr[Boolean] = js.undefined,
    shadows: js.UndefOr[Boolean] = js.undefined,
    shouldAnimate: js.UndefOr[Boolean] = js.undefined,
    showRenderLoopErrors: js.UndefOr[Boolean] = js.undefined,
    skyAtmosphere: SkyAtmosphere = null,
    skyBox: SkyBox = null,
    targetFrameRate: Int | Double = null,
    terrainExaggeration: Int | Double = null,
    terrainProvider: TerrainProvider = null,
    terrainProviderViewModels: js.Array[ProviderViewModel] = null,
    terrainShadows: ShadowMode = null,
    timeline: js.UndefOr[Boolean] = js.undefined,
    useDefaultRenderLoop: js.UndefOr[Boolean] = js.undefined,
    vrButton: js.UndefOr[Boolean] = js.undefined
  ): Anon_Animation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(automaticallyTrackDataSourceClocks)) __obj.updateDynamic("automaticallyTrackDataSourceClocks")(automaticallyTrackDataSourceClocks)
    if (!js.isUndefined(baseLayerPicker)) __obj.updateDynamic("baseLayerPicker")(baseLayerPicker)
    if (clockViewModel != null) __obj.updateDynamic("clockViewModel")(clockViewModel)
    if (contextOptions != null) __obj.updateDynamic("contextOptions")(contextOptions)
    if (creditContainer != null) __obj.updateDynamic("creditContainer")(creditContainer.asInstanceOf[js.Any])
    if (creditViewport != null) __obj.updateDynamic("creditViewport")(creditViewport.asInstanceOf[js.Any])
    if (dataSources != null) __obj.updateDynamic("dataSources")(dataSources)
    if (!js.isUndefined(fullscreenButton)) __obj.updateDynamic("fullscreenButton")(fullscreenButton)
    if (fullscreenElement != null) __obj.updateDynamic("fullscreenElement")(fullscreenElement.asInstanceOf[js.Any])
    if (!js.isUndefined(geocoder)) __obj.updateDynamic("geocoder")(geocoder)
    if (globe != null) __obj.updateDynamic("globe")(globe)
    if (!js.isUndefined(homeButton)) __obj.updateDynamic("homeButton")(homeButton)
    if (imageryProvider != null) __obj.updateDynamic("imageryProvider")(imageryProvider)
    if (imageryProviderViewModels != null) __obj.updateDynamic("imageryProviderViewModels")(imageryProviderViewModels)
    if (!js.isUndefined(infoBox)) __obj.updateDynamic("infoBox")(infoBox)
    if (mapMode2D != null) __obj.updateDynamic("mapMode2D")(mapMode2D)
    if (mapProjection != null) __obj.updateDynamic("mapProjection")(mapProjection)
    if (maximumRenderTimeChange != null) __obj.updateDynamic("maximumRenderTimeChange")(maximumRenderTimeChange.asInstanceOf[js.Any])
    if (!js.isUndefined(navigationHelpButton)) __obj.updateDynamic("navigationHelpButton")(navigationHelpButton)
    if (!js.isUndefined(navigationInstructionsInitiallyVisible)) __obj.updateDynamic("navigationInstructionsInitiallyVisible")(navigationInstructionsInitiallyVisible)
    if (!js.isUndefined(orderIndependentTranslucency)) __obj.updateDynamic("orderIndependentTranslucency")(orderIndependentTranslucency)
    if (!js.isUndefined(projectionPicker)) __obj.updateDynamic("projectionPicker")(projectionPicker)
    if (!js.isUndefined(requestRenderMode)) __obj.updateDynamic("requestRenderMode")(requestRenderMode)
    if (!js.isUndefined(scene3DOnly)) __obj.updateDynamic("scene3DOnly")(scene3DOnly)
    if (sceneMode != null) __obj.updateDynamic("sceneMode")(sceneMode)
    if (!js.isUndefined(sceneModePicker)) __obj.updateDynamic("sceneModePicker")(sceneModePicker)
    if (selectedImageryProviderViewModel != null) __obj.updateDynamic("selectedImageryProviderViewModel")(selectedImageryProviderViewModel)
    if (selectedTerrainProviderViewModel != null) __obj.updateDynamic("selectedTerrainProviderViewModel")(selectedTerrainProviderViewModel)
    if (!js.isUndefined(selectionIndicator)) __obj.updateDynamic("selectionIndicator")(selectionIndicator)
    if (!js.isUndefined(shadows)) __obj.updateDynamic("shadows")(shadows)
    if (!js.isUndefined(shouldAnimate)) __obj.updateDynamic("shouldAnimate")(shouldAnimate)
    if (!js.isUndefined(showRenderLoopErrors)) __obj.updateDynamic("showRenderLoopErrors")(showRenderLoopErrors)
    if (skyAtmosphere != null) __obj.updateDynamic("skyAtmosphere")(skyAtmosphere)
    if (skyBox != null) __obj.updateDynamic("skyBox")(skyBox)
    if (targetFrameRate != null) __obj.updateDynamic("targetFrameRate")(targetFrameRate.asInstanceOf[js.Any])
    if (terrainExaggeration != null) __obj.updateDynamic("terrainExaggeration")(terrainExaggeration.asInstanceOf[js.Any])
    if (terrainProvider != null) __obj.updateDynamic("terrainProvider")(terrainProvider)
    if (terrainProviderViewModels != null) __obj.updateDynamic("terrainProviderViewModels")(terrainProviderViewModels)
    if (terrainShadows != null) __obj.updateDynamic("terrainShadows")(terrainShadows)
    if (!js.isUndefined(timeline)) __obj.updateDynamic("timeline")(timeline)
    if (!js.isUndefined(useDefaultRenderLoop)) __obj.updateDynamic("useDefaultRenderLoop")(useDefaultRenderLoop)
    if (!js.isUndefined(vrButton)) __obj.updateDynamic("vrButton")(vrButton)
    __obj.asInstanceOf[Anon_Animation]
  }
}

