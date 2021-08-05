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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
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
  
  inline def apply(): Animation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animation]
  }
  
  extension [Self <: Animation](x: Self) {
    
    inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAutomaticallyTrackDataSourceClocks(value: Boolean): Self = StObject.set(x, "automaticallyTrackDataSourceClocks", value.asInstanceOf[js.Any])
    
    inline def setAutomaticallyTrackDataSourceClocksUndefined: Self = StObject.set(x, "automaticallyTrackDataSourceClocks", js.undefined)
    
    inline def setBaseLayerPicker(value: Boolean): Self = StObject.set(x, "baseLayerPicker", value.asInstanceOf[js.Any])
    
    inline def setBaseLayerPickerUndefined: Self = StObject.set(x, "baseLayerPicker", js.undefined)
    
    inline def setClockViewModel(value: ClockViewModel): Self = StObject.set(x, "clockViewModel", value.asInstanceOf[js.Any])
    
    inline def setClockViewModelUndefined: Self = StObject.set(x, "clockViewModel", js.undefined)
    
    inline def setContextOptions(value: js.Any): Self = StObject.set(x, "contextOptions", value.asInstanceOf[js.Any])
    
    inline def setContextOptionsUndefined: Self = StObject.set(x, "contextOptions", js.undefined)
    
    inline def setCreditContainer(value: Element | String): Self = StObject.set(x, "creditContainer", value.asInstanceOf[js.Any])
    
    inline def setCreditContainerUndefined: Self = StObject.set(x, "creditContainer", js.undefined)
    
    inline def setCreditViewport(value: Element | String): Self = StObject.set(x, "creditViewport", value.asInstanceOf[js.Any])
    
    inline def setCreditViewportUndefined: Self = StObject.set(x, "creditViewport", js.undefined)
    
    inline def setDataSources(value: typings.cesium.mod.DataSourceCollection): Self = StObject.set(x, "dataSources", value.asInstanceOf[js.Any])
    
    inline def setDataSourcesUndefined: Self = StObject.set(x, "dataSources", js.undefined)
    
    inline def setFullscreenButton(value: Boolean): Self = StObject.set(x, "fullscreenButton", value.asInstanceOf[js.Any])
    
    inline def setFullscreenButtonUndefined: Self = StObject.set(x, "fullscreenButton", js.undefined)
    
    inline def setFullscreenElement(value: Element | String): Self = StObject.set(x, "fullscreenElement", value.asInstanceOf[js.Any])
    
    inline def setFullscreenElementUndefined: Self = StObject.set(x, "fullscreenElement", js.undefined)
    
    inline def setGeocoder(value: Boolean): Self = StObject.set(x, "geocoder", value.asInstanceOf[js.Any])
    
    inline def setGeocoderUndefined: Self = StObject.set(x, "geocoder", js.undefined)
    
    inline def setGlobe(value: typings.cesium.mod.Globe | `false`): Self = StObject.set(x, "globe", value.asInstanceOf[js.Any])
    
    inline def setGlobeUndefined: Self = StObject.set(x, "globe", js.undefined)
    
    inline def setHomeButton(value: Boolean): Self = StObject.set(x, "homeButton", value.asInstanceOf[js.Any])
    
    inline def setHomeButtonUndefined: Self = StObject.set(x, "homeButton", js.undefined)
    
    inline def setImageryProvider(value: ImageryProvider | `false`): Self = StObject.set(x, "imageryProvider", value.asInstanceOf[js.Any])
    
    inline def setImageryProviderUndefined: Self = StObject.set(x, "imageryProvider", js.undefined)
    
    inline def setImageryProviderViewModels(value: js.Array[ProviderViewModel]): Self = StObject.set(x, "imageryProviderViewModels", value.asInstanceOf[js.Any])
    
    inline def setImageryProviderViewModelsUndefined: Self = StObject.set(x, "imageryProviderViewModels", js.undefined)
    
    inline def setImageryProviderViewModelsVarargs(value: ProviderViewModel*): Self = StObject.set(x, "imageryProviderViewModels", js.Array(value :_*))
    
    inline def setInfoBox(value: Boolean): Self = StObject.set(x, "infoBox", value.asInstanceOf[js.Any])
    
    inline def setInfoBoxUndefined: Self = StObject.set(x, "infoBox", js.undefined)
    
    inline def setMapMode2D(value: MapMode2D): Self = StObject.set(x, "mapMode2D", value.asInstanceOf[js.Any])
    
    inline def setMapMode2DUndefined: Self = StObject.set(x, "mapMode2D", js.undefined)
    
    inline def setMapProjection(value: MapProjection): Self = StObject.set(x, "mapProjection", value.asInstanceOf[js.Any])
    
    inline def setMapProjectionUndefined: Self = StObject.set(x, "mapProjection", js.undefined)
    
    inline def setMaximumRenderTimeChange(value: Double): Self = StObject.set(x, "maximumRenderTimeChange", value.asInstanceOf[js.Any])
    
    inline def setMaximumRenderTimeChangeUndefined: Self = StObject.set(x, "maximumRenderTimeChange", js.undefined)
    
    inline def setNavigationHelpButton(value: Boolean): Self = StObject.set(x, "navigationHelpButton", value.asInstanceOf[js.Any])
    
    inline def setNavigationHelpButtonUndefined: Self = StObject.set(x, "navigationHelpButton", js.undefined)
    
    inline def setNavigationInstructionsInitiallyVisible(value: Boolean): Self = StObject.set(x, "navigationInstructionsInitiallyVisible", value.asInstanceOf[js.Any])
    
    inline def setNavigationInstructionsInitiallyVisibleUndefined: Self = StObject.set(x, "navigationInstructionsInitiallyVisible", js.undefined)
    
    inline def setOrderIndependentTranslucency(value: Boolean): Self = StObject.set(x, "orderIndependentTranslucency", value.asInstanceOf[js.Any])
    
    inline def setOrderIndependentTranslucencyUndefined: Self = StObject.set(x, "orderIndependentTranslucency", js.undefined)
    
    inline def setProjectionPicker(value: Boolean): Self = StObject.set(x, "projectionPicker", value.asInstanceOf[js.Any])
    
    inline def setProjectionPickerUndefined: Self = StObject.set(x, "projectionPicker", js.undefined)
    
    inline def setRequestRenderMode(value: Boolean): Self = StObject.set(x, "requestRenderMode", value.asInstanceOf[js.Any])
    
    inline def setRequestRenderModeUndefined: Self = StObject.set(x, "requestRenderMode", js.undefined)
    
    inline def setScene3DOnly(value: Boolean): Self = StObject.set(x, "scene3DOnly", value.asInstanceOf[js.Any])
    
    inline def setScene3DOnlyUndefined: Self = StObject.set(x, "scene3DOnly", js.undefined)
    
    inline def setSceneMode(value: SceneMode): Self = StObject.set(x, "sceneMode", value.asInstanceOf[js.Any])
    
    inline def setSceneModePicker(value: Boolean): Self = StObject.set(x, "sceneModePicker", value.asInstanceOf[js.Any])
    
    inline def setSceneModePickerUndefined: Self = StObject.set(x, "sceneModePicker", js.undefined)
    
    inline def setSceneModeUndefined: Self = StObject.set(x, "sceneMode", js.undefined)
    
    inline def setSelectedImageryProviderViewModel(value: ProviderViewModel): Self = StObject.set(x, "selectedImageryProviderViewModel", value.asInstanceOf[js.Any])
    
    inline def setSelectedImageryProviderViewModelUndefined: Self = StObject.set(x, "selectedImageryProviderViewModel", js.undefined)
    
    inline def setSelectedTerrainProviderViewModel(value: ProviderViewModel): Self = StObject.set(x, "selectedTerrainProviderViewModel", value.asInstanceOf[js.Any])
    
    inline def setSelectedTerrainProviderViewModelUndefined: Self = StObject.set(x, "selectedTerrainProviderViewModel", js.undefined)
    
    inline def setSelectionIndicator(value: Boolean): Self = StObject.set(x, "selectionIndicator", value.asInstanceOf[js.Any])
    
    inline def setSelectionIndicatorUndefined: Self = StObject.set(x, "selectionIndicator", js.undefined)
    
    inline def setShadows(value: Boolean): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    inline def setShouldAnimate(value: Boolean): Self = StObject.set(x, "shouldAnimate", value.asInstanceOf[js.Any])
    
    inline def setShouldAnimateUndefined: Self = StObject.set(x, "shouldAnimate", js.undefined)
    
    inline def setShowRenderLoopErrors(value: Boolean): Self = StObject.set(x, "showRenderLoopErrors", value.asInstanceOf[js.Any])
    
    inline def setShowRenderLoopErrorsUndefined: Self = StObject.set(x, "showRenderLoopErrors", js.undefined)
    
    inline def setSkyAtmosphere(value: SkyAtmosphere | `false`): Self = StObject.set(x, "skyAtmosphere", value.asInstanceOf[js.Any])
    
    inline def setSkyAtmosphereUndefined: Self = StObject.set(x, "skyAtmosphere", js.undefined)
    
    inline def setSkyBox(value: SkyBox | `false`): Self = StObject.set(x, "skyBox", value.asInstanceOf[js.Any])
    
    inline def setSkyBoxUndefined: Self = StObject.set(x, "skyBox", js.undefined)
    
    inline def setTargetFrameRate(value: Double): Self = StObject.set(x, "targetFrameRate", value.asInstanceOf[js.Any])
    
    inline def setTargetFrameRateUndefined: Self = StObject.set(x, "targetFrameRate", js.undefined)
    
    inline def setTerrainExaggeration(value: Double): Self = StObject.set(x, "terrainExaggeration", value.asInstanceOf[js.Any])
    
    inline def setTerrainExaggerationUndefined: Self = StObject.set(x, "terrainExaggeration", js.undefined)
    
    inline def setTerrainProvider(value: TerrainProvider): Self = StObject.set(x, "terrainProvider", value.asInstanceOf[js.Any])
    
    inline def setTerrainProviderUndefined: Self = StObject.set(x, "terrainProvider", js.undefined)
    
    inline def setTerrainProviderViewModels(value: js.Array[ProviderViewModel]): Self = StObject.set(x, "terrainProviderViewModels", value.asInstanceOf[js.Any])
    
    inline def setTerrainProviderViewModelsUndefined: Self = StObject.set(x, "terrainProviderViewModels", js.undefined)
    
    inline def setTerrainProviderViewModelsVarargs(value: ProviderViewModel*): Self = StObject.set(x, "terrainProviderViewModels", js.Array(value :_*))
    
    inline def setTerrainShadows(value: ShadowMode): Self = StObject.set(x, "terrainShadows", value.asInstanceOf[js.Any])
    
    inline def setTerrainShadowsUndefined: Self = StObject.set(x, "terrainShadows", js.undefined)
    
    inline def setTimeline(value: Boolean): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    
    inline def setTimelineUndefined: Self = StObject.set(x, "timeline", js.undefined)
    
    inline def setUseDefaultRenderLoop(value: Boolean): Self = StObject.set(x, "useDefaultRenderLoop", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultRenderLoopUndefined: Self = StObject.set(x, "useDefaultRenderLoop", js.undefined)
    
    inline def setVrButton(value: Boolean): Self = StObject.set(x, "vrButton", value.asInstanceOf[js.Any])
    
    inline def setVrButtonUndefined: Self = StObject.set(x, "vrButton", js.undefined)
  }
}
