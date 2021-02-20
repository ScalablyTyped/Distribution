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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation extends StObject {
  
  var animation: js.UndefOr[Boolean] = js.native
  
  var automaticallyTrackDataSourceClocks: js.UndefOr[Boolean] = js.native
  
  var baseLayerPicker: js.UndefOr[Boolean] = js.native
  
  var clockViewModel: js.UndefOr[ClockViewModel] = js.native
  
  var contextOptions: js.UndefOr[js.Any] = js.native
  
  var creditContainer: js.UndefOr[Element | String] = js.native
  
  var creditViewport: js.UndefOr[Element | String] = js.native
  
  var dataSources: js.UndefOr[typings.cesium.mod.DataSourceCollection] = js.native
  
  var fullscreenButton: js.UndefOr[Boolean] = js.native
  
  var fullscreenElement: js.UndefOr[Element | String] = js.native
  
  var geocoder: js.UndefOr[Boolean] = js.native
  
  var globe: js.UndefOr[typings.cesium.mod.Globe | `false`] = js.native
  
  var homeButton: js.UndefOr[Boolean] = js.native
  
  var imageryProvider: js.UndefOr[ImageryProvider | `false`] = js.native
  
  var imageryProviderViewModels: js.UndefOr[js.Array[ProviderViewModel]] = js.native
  
  var infoBox: js.UndefOr[Boolean] = js.native
  
  var mapMode2D: js.UndefOr[MapMode2D] = js.native
  
  var mapProjection: js.UndefOr[MapProjection] = js.native
  
  var maximumRenderTimeChange: js.UndefOr[Double] = js.native
  
  var navigationHelpButton: js.UndefOr[Boolean] = js.native
  
  var navigationInstructionsInitiallyVisible: js.UndefOr[Boolean] = js.native
  
  var orderIndependentTranslucency: js.UndefOr[Boolean] = js.native
  
  var projectionPicker: js.UndefOr[Boolean] = js.native
  
  var requestRenderMode: js.UndefOr[Boolean] = js.native
  
  var scene3DOnly: js.UndefOr[Boolean] = js.native
  
  var sceneMode: js.UndefOr[SceneMode] = js.native
  
  var sceneModePicker: js.UndefOr[Boolean] = js.native
  
  var selectedImageryProviderViewModel: js.UndefOr[ProviderViewModel] = js.native
  
  var selectedTerrainProviderViewModel: js.UndefOr[ProviderViewModel] = js.native
  
  var selectionIndicator: js.UndefOr[Boolean] = js.native
  
  var shadows: js.UndefOr[Boolean] = js.native
  
  var shouldAnimate: js.UndefOr[Boolean] = js.native
  
  var showRenderLoopErrors: js.UndefOr[Boolean] = js.native
  
  var skyAtmosphere: js.UndefOr[SkyAtmosphere | `false`] = js.native
  
  var skyBox: js.UndefOr[SkyBox | `false`] = js.native
  
  var targetFrameRate: js.UndefOr[Double] = js.native
  
  var terrainExaggeration: js.UndefOr[Double] = js.native
  
  var terrainProvider: js.UndefOr[TerrainProvider] = js.native
  
  var terrainProviderViewModels: js.UndefOr[js.Array[ProviderViewModel]] = js.native
  
  var terrainShadows: js.UndefOr[ShadowMode] = js.native
  
  var timeline: js.UndefOr[Boolean] = js.native
  
  var useDefaultRenderLoop: js.UndefOr[Boolean] = js.native
  
  var vrButton: js.UndefOr[Boolean] = js.native
}
object Animation {
  
  @scala.inline
  def apply(): Animation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit class AnimationMutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setAutomaticallyTrackDataSourceClocks(value: Boolean): Self = StObject.set(x, "automaticallyTrackDataSourceClocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticallyTrackDataSourceClocksUndefined: Self = StObject.set(x, "automaticallyTrackDataSourceClocks", js.undefined)
    
    @scala.inline
    def setBaseLayerPicker(value: Boolean): Self = StObject.set(x, "baseLayerPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseLayerPickerUndefined: Self = StObject.set(x, "baseLayerPicker", js.undefined)
    
    @scala.inline
    def setClockViewModel(value: ClockViewModel): Self = StObject.set(x, "clockViewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockViewModelUndefined: Self = StObject.set(x, "clockViewModel", js.undefined)
    
    @scala.inline
    def setContextOptions(value: js.Any): Self = StObject.set(x, "contextOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextOptionsUndefined: Self = StObject.set(x, "contextOptions", js.undefined)
    
    @scala.inline
    def setCreditContainer(value: Element | String): Self = StObject.set(x, "creditContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditContainerUndefined: Self = StObject.set(x, "creditContainer", js.undefined)
    
    @scala.inline
    def setCreditViewport(value: Element | String): Self = StObject.set(x, "creditViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditViewportUndefined: Self = StObject.set(x, "creditViewport", js.undefined)
    
    @scala.inline
    def setDataSources(value: typings.cesium.mod.DataSourceCollection): Self = StObject.set(x, "dataSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourcesUndefined: Self = StObject.set(x, "dataSources", js.undefined)
    
    @scala.inline
    def setFullscreenButton(value: Boolean): Self = StObject.set(x, "fullscreenButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenButtonUndefined: Self = StObject.set(x, "fullscreenButton", js.undefined)
    
    @scala.inline
    def setFullscreenElement(value: Element | String): Self = StObject.set(x, "fullscreenElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenElementUndefined: Self = StObject.set(x, "fullscreenElement", js.undefined)
    
    @scala.inline
    def setGeocoder(value: Boolean): Self = StObject.set(x, "geocoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeocoderUndefined: Self = StObject.set(x, "geocoder", js.undefined)
    
    @scala.inline
    def setGlobe(value: typings.cesium.mod.Globe | `false`): Self = StObject.set(x, "globe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobeUndefined: Self = StObject.set(x, "globe", js.undefined)
    
    @scala.inline
    def setHomeButton(value: Boolean): Self = StObject.set(x, "homeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeButtonUndefined: Self = StObject.set(x, "homeButton", js.undefined)
    
    @scala.inline
    def setImageryProvider(value: ImageryProvider | `false`): Self = StObject.set(x, "imageryProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageryProviderUndefined: Self = StObject.set(x, "imageryProvider", js.undefined)
    
    @scala.inline
    def setImageryProviderViewModels(value: js.Array[ProviderViewModel]): Self = StObject.set(x, "imageryProviderViewModels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageryProviderViewModelsUndefined: Self = StObject.set(x, "imageryProviderViewModels", js.undefined)
    
    @scala.inline
    def setImageryProviderViewModelsVarargs(value: ProviderViewModel*): Self = StObject.set(x, "imageryProviderViewModels", js.Array(value :_*))
    
    @scala.inline
    def setInfoBox(value: Boolean): Self = StObject.set(x, "infoBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoBoxUndefined: Self = StObject.set(x, "infoBox", js.undefined)
    
    @scala.inline
    def setMapMode2D(value: MapMode2D): Self = StObject.set(x, "mapMode2D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapMode2DUndefined: Self = StObject.set(x, "mapMode2D", js.undefined)
    
    @scala.inline
    def setMapProjection(value: MapProjection): Self = StObject.set(x, "mapProjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapProjectionUndefined: Self = StObject.set(x, "mapProjection", js.undefined)
    
    @scala.inline
    def setMaximumRenderTimeChange(value: Double): Self = StObject.set(x, "maximumRenderTimeChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumRenderTimeChangeUndefined: Self = StObject.set(x, "maximumRenderTimeChange", js.undefined)
    
    @scala.inline
    def setNavigationHelpButton(value: Boolean): Self = StObject.set(x, "navigationHelpButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationHelpButtonUndefined: Self = StObject.set(x, "navigationHelpButton", js.undefined)
    
    @scala.inline
    def setNavigationInstructionsInitiallyVisible(value: Boolean): Self = StObject.set(x, "navigationInstructionsInitiallyVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationInstructionsInitiallyVisibleUndefined: Self = StObject.set(x, "navigationInstructionsInitiallyVisible", js.undefined)
    
    @scala.inline
    def setOrderIndependentTranslucency(value: Boolean): Self = StObject.set(x, "orderIndependentTranslucency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderIndependentTranslucencyUndefined: Self = StObject.set(x, "orderIndependentTranslucency", js.undefined)
    
    @scala.inline
    def setProjectionPicker(value: Boolean): Self = StObject.set(x, "projectionPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionPickerUndefined: Self = StObject.set(x, "projectionPicker", js.undefined)
    
    @scala.inline
    def setRequestRenderMode(value: Boolean): Self = StObject.set(x, "requestRenderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestRenderModeUndefined: Self = StObject.set(x, "requestRenderMode", js.undefined)
    
    @scala.inline
    def setScene3DOnly(value: Boolean): Self = StObject.set(x, "scene3DOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScene3DOnlyUndefined: Self = StObject.set(x, "scene3DOnly", js.undefined)
    
    @scala.inline
    def setSceneMode(value: SceneMode): Self = StObject.set(x, "sceneMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSceneModePicker(value: Boolean): Self = StObject.set(x, "sceneModePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSceneModePickerUndefined: Self = StObject.set(x, "sceneModePicker", js.undefined)
    
    @scala.inline
    def setSceneModeUndefined: Self = StObject.set(x, "sceneMode", js.undefined)
    
    @scala.inline
    def setSelectedImageryProviderViewModel(value: ProviderViewModel): Self = StObject.set(x, "selectedImageryProviderViewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedImageryProviderViewModelUndefined: Self = StObject.set(x, "selectedImageryProviderViewModel", js.undefined)
    
    @scala.inline
    def setSelectedTerrainProviderViewModel(value: ProviderViewModel): Self = StObject.set(x, "selectedTerrainProviderViewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedTerrainProviderViewModelUndefined: Self = StObject.set(x, "selectedTerrainProviderViewModel", js.undefined)
    
    @scala.inline
    def setSelectionIndicator(value: Boolean): Self = StObject.set(x, "selectionIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionIndicatorUndefined: Self = StObject.set(x, "selectionIndicator", js.undefined)
    
    @scala.inline
    def setShadows(value: Boolean): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    @scala.inline
    def setShouldAnimate(value: Boolean): Self = StObject.set(x, "shouldAnimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldAnimateUndefined: Self = StObject.set(x, "shouldAnimate", js.undefined)
    
    @scala.inline
    def setShowRenderLoopErrors(value: Boolean): Self = StObject.set(x, "showRenderLoopErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRenderLoopErrorsUndefined: Self = StObject.set(x, "showRenderLoopErrors", js.undefined)
    
    @scala.inline
    def setSkyAtmosphere(value: SkyAtmosphere | `false`): Self = StObject.set(x, "skyAtmosphere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkyAtmosphereUndefined: Self = StObject.set(x, "skyAtmosphere", js.undefined)
    
    @scala.inline
    def setSkyBox(value: SkyBox | `false`): Self = StObject.set(x, "skyBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkyBoxUndefined: Self = StObject.set(x, "skyBox", js.undefined)
    
    @scala.inline
    def setTargetFrameRate(value: Double): Self = StObject.set(x, "targetFrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFrameRateUndefined: Self = StObject.set(x, "targetFrameRate", js.undefined)
    
    @scala.inline
    def setTerrainExaggeration(value: Double): Self = StObject.set(x, "terrainExaggeration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerrainExaggerationUndefined: Self = StObject.set(x, "terrainExaggeration", js.undefined)
    
    @scala.inline
    def setTerrainProvider(value: TerrainProvider): Self = StObject.set(x, "terrainProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerrainProviderUndefined: Self = StObject.set(x, "terrainProvider", js.undefined)
    
    @scala.inline
    def setTerrainProviderViewModels(value: js.Array[ProviderViewModel]): Self = StObject.set(x, "terrainProviderViewModels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerrainProviderViewModelsUndefined: Self = StObject.set(x, "terrainProviderViewModels", js.undefined)
    
    @scala.inline
    def setTerrainProviderViewModelsVarargs(value: ProviderViewModel*): Self = StObject.set(x, "terrainProviderViewModels", js.Array(value :_*))
    
    @scala.inline
    def setTerrainShadows(value: ShadowMode): Self = StObject.set(x, "terrainShadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerrainShadowsUndefined: Self = StObject.set(x, "terrainShadows", js.undefined)
    
    @scala.inline
    def setTimeline(value: Boolean): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineUndefined: Self = StObject.set(x, "timeline", js.undefined)
    
    @scala.inline
    def setUseDefaultRenderLoop(value: Boolean): Self = StObject.set(x, "useDefaultRenderLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDefaultRenderLoopUndefined: Self = StObject.set(x, "useDefaultRenderLoop", js.undefined)
    
    @scala.inline
    def setVrButton(value: Boolean): Self = StObject.set(x, "vrButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVrButtonUndefined: Self = StObject.set(x, "vrButton", js.undefined)
  }
}
