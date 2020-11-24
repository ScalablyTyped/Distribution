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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation extends js.Object {
  
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
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAutomaticallyTrackDataSourceClocks(value: Boolean): Self = this.set("automaticallyTrackDataSourceClocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticallyTrackDataSourceClocks: Self = this.set("automaticallyTrackDataSourceClocks", js.undefined)
    
    @scala.inline
    def setBaseLayerPicker(value: Boolean): Self = this.set("baseLayerPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseLayerPicker: Self = this.set("baseLayerPicker", js.undefined)
    
    @scala.inline
    def setClockViewModel(value: ClockViewModel): Self = this.set("clockViewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClockViewModel: Self = this.set("clockViewModel", js.undefined)
    
    @scala.inline
    def setContextOptions(value: js.Any): Self = this.set("contextOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextOptions: Self = this.set("contextOptions", js.undefined)
    
    @scala.inline
    def setCreditContainer(value: Element | String): Self = this.set("creditContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreditContainer: Self = this.set("creditContainer", js.undefined)
    
    @scala.inline
    def setCreditViewport(value: Element | String): Self = this.set("creditViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreditViewport: Self = this.set("creditViewport", js.undefined)
    
    @scala.inline
    def setDataSources(value: typings.cesium.mod.DataSourceCollection): Self = this.set("dataSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSources: Self = this.set("dataSources", js.undefined)
    
    @scala.inline
    def setFullscreenButton(value: Boolean): Self = this.set("fullscreenButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreenButton: Self = this.set("fullscreenButton", js.undefined)
    
    @scala.inline
    def setFullscreenElement(value: Element | String): Self = this.set("fullscreenElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreenElement: Self = this.set("fullscreenElement", js.undefined)
    
    @scala.inline
    def setGeocoder(value: Boolean): Self = this.set("geocoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeocoder: Self = this.set("geocoder", js.undefined)
    
    @scala.inline
    def setGlobe(value: typings.cesium.mod.Globe | `false`): Self = this.set("globe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobe: Self = this.set("globe", js.undefined)
    
    @scala.inline
    def setHomeButton(value: Boolean): Self = this.set("homeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeButton: Self = this.set("homeButton", js.undefined)
    
    @scala.inline
    def setImageryProvider(value: ImageryProvider | `false`): Self = this.set("imageryProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageryProvider: Self = this.set("imageryProvider", js.undefined)
    
    @scala.inline
    def setImageryProviderViewModelsVarargs(value: ProviderViewModel*): Self = this.set("imageryProviderViewModels", js.Array(value :_*))
    
    @scala.inline
    def setImageryProviderViewModels(value: js.Array[ProviderViewModel]): Self = this.set("imageryProviderViewModels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageryProviderViewModels: Self = this.set("imageryProviderViewModels", js.undefined)
    
    @scala.inline
    def setInfoBox(value: Boolean): Self = this.set("infoBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoBox: Self = this.set("infoBox", js.undefined)
    
    @scala.inline
    def setMapMode2D(value: MapMode2D): Self = this.set("mapMode2D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapMode2D: Self = this.set("mapMode2D", js.undefined)
    
    @scala.inline
    def setMapProjection(value: MapProjection): Self = this.set("mapProjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapProjection: Self = this.set("mapProjection", js.undefined)
    
    @scala.inline
    def setMaximumRenderTimeChange(value: Double): Self = this.set("maximumRenderTimeChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumRenderTimeChange: Self = this.set("maximumRenderTimeChange", js.undefined)
    
    @scala.inline
    def setNavigationHelpButton(value: Boolean): Self = this.set("navigationHelpButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigationHelpButton: Self = this.set("navigationHelpButton", js.undefined)
    
    @scala.inline
    def setNavigationInstructionsInitiallyVisible(value: Boolean): Self = this.set("navigationInstructionsInitiallyVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigationInstructionsInitiallyVisible: Self = this.set("navigationInstructionsInitiallyVisible", js.undefined)
    
    @scala.inline
    def setOrderIndependentTranslucency(value: Boolean): Self = this.set("orderIndependentTranslucency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderIndependentTranslucency: Self = this.set("orderIndependentTranslucency", js.undefined)
    
    @scala.inline
    def setProjectionPicker(value: Boolean): Self = this.set("projectionPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectionPicker: Self = this.set("projectionPicker", js.undefined)
    
    @scala.inline
    def setRequestRenderMode(value: Boolean): Self = this.set("requestRenderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestRenderMode: Self = this.set("requestRenderMode", js.undefined)
    
    @scala.inline
    def setScene3DOnly(value: Boolean): Self = this.set("scene3DOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScene3DOnly: Self = this.set("scene3DOnly", js.undefined)
    
    @scala.inline
    def setSceneMode(value: SceneMode): Self = this.set("sceneMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSceneMode: Self = this.set("sceneMode", js.undefined)
    
    @scala.inline
    def setSceneModePicker(value: Boolean): Self = this.set("sceneModePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSceneModePicker: Self = this.set("sceneModePicker", js.undefined)
    
    @scala.inline
    def setSelectedImageryProviderViewModel(value: ProviderViewModel): Self = this.set("selectedImageryProviderViewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedImageryProviderViewModel: Self = this.set("selectedImageryProviderViewModel", js.undefined)
    
    @scala.inline
    def setSelectedTerrainProviderViewModel(value: ProviderViewModel): Self = this.set("selectedTerrainProviderViewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedTerrainProviderViewModel: Self = this.set("selectedTerrainProviderViewModel", js.undefined)
    
    @scala.inline
    def setSelectionIndicator(value: Boolean): Self = this.set("selectionIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionIndicator: Self = this.set("selectionIndicator", js.undefined)
    
    @scala.inline
    def setShadows(value: Boolean): Self = this.set("shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadows: Self = this.set("shadows", js.undefined)
    
    @scala.inline
    def setShouldAnimate(value: Boolean): Self = this.set("shouldAnimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldAnimate: Self = this.set("shouldAnimate", js.undefined)
    
    @scala.inline
    def setShowRenderLoopErrors(value: Boolean): Self = this.set("showRenderLoopErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRenderLoopErrors: Self = this.set("showRenderLoopErrors", js.undefined)
    
    @scala.inline
    def setSkyAtmosphere(value: SkyAtmosphere | `false`): Self = this.set("skyAtmosphere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkyAtmosphere: Self = this.set("skyAtmosphere", js.undefined)
    
    @scala.inline
    def setSkyBox(value: SkyBox | `false`): Self = this.set("skyBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkyBox: Self = this.set("skyBox", js.undefined)
    
    @scala.inline
    def setTargetFrameRate(value: Double): Self = this.set("targetFrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetFrameRate: Self = this.set("targetFrameRate", js.undefined)
    
    @scala.inline
    def setTerrainExaggeration(value: Double): Self = this.set("terrainExaggeration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerrainExaggeration: Self = this.set("terrainExaggeration", js.undefined)
    
    @scala.inline
    def setTerrainProvider(value: TerrainProvider): Self = this.set("terrainProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerrainProvider: Self = this.set("terrainProvider", js.undefined)
    
    @scala.inline
    def setTerrainProviderViewModelsVarargs(value: ProviderViewModel*): Self = this.set("terrainProviderViewModels", js.Array(value :_*))
    
    @scala.inline
    def setTerrainProviderViewModels(value: js.Array[ProviderViewModel]): Self = this.set("terrainProviderViewModels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerrainProviderViewModels: Self = this.set("terrainProviderViewModels", js.undefined)
    
    @scala.inline
    def setTerrainShadows(value: ShadowMode): Self = this.set("terrainShadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerrainShadows: Self = this.set("terrainShadows", js.undefined)
    
    @scala.inline
    def setTimeline(value: Boolean): Self = this.set("timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeline: Self = this.set("timeline", js.undefined)
    
    @scala.inline
    def setUseDefaultRenderLoop(value: Boolean): Self = this.set("useDefaultRenderLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDefaultRenderLoop: Self = this.set("useDefaultRenderLoop", js.undefined)
    
    @scala.inline
    def setVrButton(value: Boolean): Self = this.set("vrButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVrButton: Self = this.set("vrButton", js.undefined)
  }
}
