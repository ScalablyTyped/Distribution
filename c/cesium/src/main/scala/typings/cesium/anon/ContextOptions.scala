package typings.cesium.anon

import typings.cesium.mod.MapMode2D
import typings.cesium.mod.MapProjection
import typings.std.Element
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextOptions extends js.Object {
  var canvas: HTMLCanvasElement = js.native
  var contextOptions: js.UndefOr[js.Any] = js.native
  var creditContainer: js.UndefOr[Element] = js.native
  var creditViewport: js.UndefOr[Element] = js.native
  var mapMode2D: js.UndefOr[MapMode2D] = js.native
  var mapProjection: js.UndefOr[MapProjection] = js.native
  var maximumRenderTimeChange: js.UndefOr[Double] = js.native
  var orderIndependentTranslucency: js.UndefOr[Boolean] = js.native
  var requestRenderMode: js.UndefOr[Boolean] = js.native
  var scene3DOnly: js.UndefOr[Boolean] = js.native
  var shadows: js.UndefOr[Boolean] = js.native
  var terrainExaggeration: js.UndefOr[Double] = js.native
}

object ContextOptions {
  @scala.inline
  def apply(canvas: HTMLCanvasElement): ContextOptions = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextOptions]
  }
  @scala.inline
  implicit class ContextOptionsOps[Self <: ContextOptions] (val x: Self) extends AnyVal {
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
    def setCanvas(value: HTMLCanvasElement): Self = this.set("canvas", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextOptions(value: js.Any): Self = this.set("contextOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextOptions: Self = this.set("contextOptions", js.undefined)
    @scala.inline
    def setCreditContainer(value: Element): Self = this.set("creditContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreditContainer: Self = this.set("creditContainer", js.undefined)
    @scala.inline
    def setCreditViewport(value: Element): Self = this.set("creditViewport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreditViewport: Self = this.set("creditViewport", js.undefined)
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
    def setShadows(value: Boolean): Self = this.set("shadows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadows: Self = this.set("shadows", js.undefined)
    @scala.inline
    def setTerrainExaggeration(value: Double): Self = this.set("terrainExaggeration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerrainExaggeration: Self = this.set("terrainExaggeration", js.undefined)
  }
  
}

