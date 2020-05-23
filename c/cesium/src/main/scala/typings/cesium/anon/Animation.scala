package typings.cesium.anon

import typings.cesium.cesiumBooleans.`false`
import typings.cesium.mod.ClockViewModel
import typings.cesium.mod.ImageryProvider
import typings.cesium.mod.MapMode2D
import typings.cesium.mod.MapProjection
import typings.cesium.mod.ProviderViewModel
import typings.cesium.mod.SceneMode
import typings.cesium.mod.ShadowMode
import typings.cesium.mod.SkyAtmosphere
import typings.cesium.mod.SkyBox
import typings.cesium.mod.TerrainProvider
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  var animation: js.UndefOr[Boolean] = js.undefined
  var automaticallyTrackDataSourceClocks: js.UndefOr[Boolean] = js.undefined
  var baseLayerPicker: js.UndefOr[Boolean] = js.undefined
  var clockViewModel: js.UndefOr[ClockViewModel] = js.undefined
  var contextOptions: js.UndefOr[js.Any] = js.undefined
  var creditContainer: js.UndefOr[Element | String] = js.undefined
  var creditViewport: js.UndefOr[Element | String] = js.undefined
  var dataSources: js.UndefOr[typings.cesium.mod.DataSourceCollection] = js.undefined
  var fullscreenButton: js.UndefOr[Boolean] = js.undefined
  var fullscreenElement: js.UndefOr[Element | String] = js.undefined
  var geocoder: js.UndefOr[Boolean] = js.undefined
  var globe: js.UndefOr[typings.cesium.mod.Globe | `false`] = js.undefined
  var homeButton: js.UndefOr[Boolean] = js.undefined
  var imageryProvider: js.UndefOr[ImageryProvider | `false`] = js.undefined
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
  var skyAtmosphere: js.UndefOr[SkyAtmosphere | `false`] = js.undefined
  var skyBox: js.UndefOr[SkyBox | `false`] = js.undefined
  var targetFrameRate: js.UndefOr[Double] = js.undefined
  var terrainExaggeration: js.UndefOr[Double] = js.undefined
  var terrainProvider: js.UndefOr[TerrainProvider] = js.undefined
  var terrainProviderViewModels: js.UndefOr[js.Array[ProviderViewModel]] = js.undefined
  var terrainShadows: js.UndefOr[ShadowMode] = js.undefined
  var timeline: js.UndefOr[Boolean] = js.undefined
  var useDefaultRenderLoop: js.UndefOr[Boolean] = js.undefined
  var vrButton: js.UndefOr[Boolean] = js.undefined
}

object Animation {
  @scala.inline
  def apply(
    animation: js.UndefOr[Boolean] = js.undefined,
    automaticallyTrackDataSourceClocks: js.UndefOr[Boolean] = js.undefined,
    baseLayerPicker: js.UndefOr[Boolean] = js.undefined,
    clockViewModel: ClockViewModel = null,
    contextOptions: js.Any = null,
    creditContainer: Element | String = null,
    creditViewport: Element | String = null,
    dataSources: typings.cesium.mod.DataSourceCollection = null,
    fullscreenButton: js.UndefOr[Boolean] = js.undefined,
    fullscreenElement: Element | String = null,
    geocoder: js.UndefOr[Boolean] = js.undefined,
    globe: typings.cesium.mod.Globe | `false` = null,
    homeButton: js.UndefOr[Boolean] = js.undefined,
    imageryProvider: ImageryProvider | `false` = null,
    imageryProviderViewModels: js.Array[ProviderViewModel] = null,
    infoBox: js.UndefOr[Boolean] = js.undefined,
    mapMode2D: MapMode2D = null,
    mapProjection: MapProjection = null,
    maximumRenderTimeChange: js.UndefOr[Double] = js.undefined,
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
    skyAtmosphere: SkyAtmosphere | `false` = null,
    skyBox: SkyBox | `false` = null,
    targetFrameRate: js.UndefOr[Double] = js.undefined,
    terrainExaggeration: js.UndefOr[Double] = js.undefined,
    terrainProvider: TerrainProvider = null,
    terrainProviderViewModels: js.Array[ProviderViewModel] = null,
    terrainShadows: ShadowMode = null,
    timeline: js.UndefOr[Boolean] = js.undefined,
    useDefaultRenderLoop: js.UndefOr[Boolean] = js.undefined,
    vrButton: js.UndefOr[Boolean] = js.undefined
  ): Animation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(automaticallyTrackDataSourceClocks)) __obj.updateDynamic("automaticallyTrackDataSourceClocks")(automaticallyTrackDataSourceClocks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(baseLayerPicker)) __obj.updateDynamic("baseLayerPicker")(baseLayerPicker.get.asInstanceOf[js.Any])
    if (clockViewModel != null) __obj.updateDynamic("clockViewModel")(clockViewModel.asInstanceOf[js.Any])
    if (contextOptions != null) __obj.updateDynamic("contextOptions")(contextOptions.asInstanceOf[js.Any])
    if (creditContainer != null) __obj.updateDynamic("creditContainer")(creditContainer.asInstanceOf[js.Any])
    if (creditViewport != null) __obj.updateDynamic("creditViewport")(creditViewport.asInstanceOf[js.Any])
    if (dataSources != null) __obj.updateDynamic("dataSources")(dataSources.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreenButton)) __obj.updateDynamic("fullscreenButton")(fullscreenButton.get.asInstanceOf[js.Any])
    if (fullscreenElement != null) __obj.updateDynamic("fullscreenElement")(fullscreenElement.asInstanceOf[js.Any])
    if (!js.isUndefined(geocoder)) __obj.updateDynamic("geocoder")(geocoder.get.asInstanceOf[js.Any])
    if (globe != null) __obj.updateDynamic("globe")(globe.asInstanceOf[js.Any])
    if (!js.isUndefined(homeButton)) __obj.updateDynamic("homeButton")(homeButton.get.asInstanceOf[js.Any])
    if (imageryProvider != null) __obj.updateDynamic("imageryProvider")(imageryProvider.asInstanceOf[js.Any])
    if (imageryProviderViewModels != null) __obj.updateDynamic("imageryProviderViewModels")(imageryProviderViewModels.asInstanceOf[js.Any])
    if (!js.isUndefined(infoBox)) __obj.updateDynamic("infoBox")(infoBox.get.asInstanceOf[js.Any])
    if (mapMode2D != null) __obj.updateDynamic("mapMode2D")(mapMode2D.asInstanceOf[js.Any])
    if (mapProjection != null) __obj.updateDynamic("mapProjection")(mapProjection.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumRenderTimeChange)) __obj.updateDynamic("maximumRenderTimeChange")(maximumRenderTimeChange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(navigationHelpButton)) __obj.updateDynamic("navigationHelpButton")(navigationHelpButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(navigationInstructionsInitiallyVisible)) __obj.updateDynamic("navigationInstructionsInitiallyVisible")(navigationInstructionsInitiallyVisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(orderIndependentTranslucency)) __obj.updateDynamic("orderIndependentTranslucency")(orderIndependentTranslucency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(projectionPicker)) __obj.updateDynamic("projectionPicker")(projectionPicker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestRenderMode)) __obj.updateDynamic("requestRenderMode")(requestRenderMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scene3DOnly)) __obj.updateDynamic("scene3DOnly")(scene3DOnly.get.asInstanceOf[js.Any])
    if (sceneMode != null) __obj.updateDynamic("sceneMode")(sceneMode.asInstanceOf[js.Any])
    if (!js.isUndefined(sceneModePicker)) __obj.updateDynamic("sceneModePicker")(sceneModePicker.get.asInstanceOf[js.Any])
    if (selectedImageryProviderViewModel != null) __obj.updateDynamic("selectedImageryProviderViewModel")(selectedImageryProviderViewModel.asInstanceOf[js.Any])
    if (selectedTerrainProviderViewModel != null) __obj.updateDynamic("selectedTerrainProviderViewModel")(selectedTerrainProviderViewModel.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionIndicator)) __obj.updateDynamic("selectionIndicator")(selectionIndicator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadows)) __obj.updateDynamic("shadows")(shadows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldAnimate)) __obj.updateDynamic("shouldAnimate")(shouldAnimate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRenderLoopErrors)) __obj.updateDynamic("showRenderLoopErrors")(showRenderLoopErrors.get.asInstanceOf[js.Any])
    if (skyAtmosphere != null) __obj.updateDynamic("skyAtmosphere")(skyAtmosphere.asInstanceOf[js.Any])
    if (skyBox != null) __obj.updateDynamic("skyBox")(skyBox.asInstanceOf[js.Any])
    if (!js.isUndefined(targetFrameRate)) __obj.updateDynamic("targetFrameRate")(targetFrameRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(terrainExaggeration)) __obj.updateDynamic("terrainExaggeration")(terrainExaggeration.get.asInstanceOf[js.Any])
    if (terrainProvider != null) __obj.updateDynamic("terrainProvider")(terrainProvider.asInstanceOf[js.Any])
    if (terrainProviderViewModels != null) __obj.updateDynamic("terrainProviderViewModels")(terrainProviderViewModels.asInstanceOf[js.Any])
    if (terrainShadows != null) __obj.updateDynamic("terrainShadows")(terrainShadows.asInstanceOf[js.Any])
    if (!js.isUndefined(timeline)) __obj.updateDynamic("timeline")(timeline.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useDefaultRenderLoop)) __obj.updateDynamic("useDefaultRenderLoop")(useDefaultRenderLoop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vrButton)) __obj.updateDynamic("vrButton")(vrButton.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
}

