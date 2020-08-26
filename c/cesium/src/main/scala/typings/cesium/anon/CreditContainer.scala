package typings.cesium.anon

import typings.cesium.cesiumBooleans.`false`
import typings.cesium.mod.ImageryProvider
import typings.cesium.mod.MapMode2D
import typings.cesium.mod.MapProjection
import typings.cesium.mod.SceneMode
import typings.cesium.mod.ShadowMode
import typings.cesium.mod.SkyAtmosphere
import typings.cesium.mod.SkyBox
import typings.cesium.mod.TerrainProvider
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreditContainer extends js.Object {
  var clock: js.UndefOr[typings.cesium.mod.Clock] = js.native
  var contextOptions: js.UndefOr[js.Any] = js.native
  var creditContainer: js.UndefOr[Element | String] = js.native
  var creditViewport: js.UndefOr[Element | String] = js.native
  var globe: js.UndefOr[typings.cesium.mod.Globe | `false`] = js.native
  var imageryProvider: js.UndefOr[ImageryProvider | `false`] = js.native
  var mapMode2D: js.UndefOr[MapMode2D] = js.native
  var mapProjection: js.UndefOr[MapProjection] = js.native
  var maximumRenderTimeChange: js.UndefOr[Double] = js.native
  var orderIndependentTranslucency: js.UndefOr[Boolean] = js.native
  var requestRenderMode: js.UndefOr[Boolean] = js.native
  var scene3DOnly: js.UndefOr[Boolean] = js.native
  var sceneMode: js.UndefOr[SceneMode] = js.native
  var shadows: js.UndefOr[Boolean] = js.native
  var showRenderLoopErrors: js.UndefOr[Boolean] = js.native
  var skyAtmosphere: js.UndefOr[SkyAtmosphere | `false`] = js.native
  var skyBox: js.UndefOr[SkyBox | `false`] = js.native
  var targetFrameRate: js.UndefOr[Double] = js.native
  var terrainExaggeration: js.UndefOr[Double] = js.native
  var terrainProvider: js.UndefOr[TerrainProvider] = js.native
  var terrainShadows: js.UndefOr[ShadowMode] = js.native
  var useDefaultRenderLoop: js.UndefOr[Boolean] = js.native
}

object CreditContainer {
  @scala.inline
  def apply(): CreditContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreditContainer]
  }
  @scala.inline
  implicit class CreditContainerOps[Self <: CreditContainer] (val x: Self) extends AnyVal {
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
    def setClock(value: typings.cesium.mod.Clock): Self = this.set("clock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClock: Self = this.set("clock", js.undefined)
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
    def setGlobe(value: typings.cesium.mod.Globe | `false`): Self = this.set("globe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobe: Self = this.set("globe", js.undefined)
    @scala.inline
    def setImageryProvider(value: ImageryProvider | `false`): Self = this.set("imageryProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageryProvider: Self = this.set("imageryProvider", js.undefined)
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
    def setOrderIndependentTranslucency(value: Boolean): Self = this.set("orderIndependentTranslucency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderIndependentTranslucency: Self = this.set("orderIndependentTranslucency", js.undefined)
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
    def setShadows(value: Boolean): Self = this.set("shadows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadows: Self = this.set("shadows", js.undefined)
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
    def setTerrainShadows(value: ShadowMode): Self = this.set("terrainShadows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerrainShadows: Self = this.set("terrainShadows", js.undefined)
    @scala.inline
    def setUseDefaultRenderLoop(value: Boolean): Self = this.set("useDefaultRenderLoop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseDefaultRenderLoop: Self = this.set("useDefaultRenderLoop", js.undefined)
  }
  
}

