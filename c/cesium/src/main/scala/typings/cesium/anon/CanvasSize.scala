package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasSize extends js.Object {
  var canvasSize: js.UndefOr[Double] = js.native
  var cells: js.UndefOr[Double] = js.native
  var color: js.UndefOr[typings.cesium.mod.Color] = js.native
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  var glowColor: js.UndefOr[typings.cesium.mod.Color] = js.native
  var glowWidth: js.UndefOr[Double] = js.native
  var tileHeight: js.UndefOr[Double] = js.native
  var tileWidth: js.UndefOr[Double] = js.native
  var tilingScheme: js.UndefOr[typings.cesium.mod.TilingScheme] = js.native
}

object CanvasSize {
  @scala.inline
  def apply(): CanvasSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasSize]
  }
  @scala.inline
  implicit class CanvasSizeOps[Self <: CanvasSize] (val x: Self) extends AnyVal {
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
    def setCanvasSize(value: Double): Self = this.set("canvasSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanvasSize: Self = this.set("canvasSize", js.undefined)
    @scala.inline
    def setCells(value: Double): Self = this.set("cells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCells: Self = this.set("cells", js.undefined)
    @scala.inline
    def setColor(value: typings.cesium.mod.Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = this.set("ellipsoid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsoid: Self = this.set("ellipsoid", js.undefined)
    @scala.inline
    def setGlowColor(value: typings.cesium.mod.Color): Self = this.set("glowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlowColor: Self = this.set("glowColor", js.undefined)
    @scala.inline
    def setGlowWidth(value: Double): Self = this.set("glowWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlowWidth: Self = this.set("glowWidth", js.undefined)
    @scala.inline
    def setTileHeight(value: Double): Self = this.set("tileHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileHeight: Self = this.set("tileHeight", js.undefined)
    @scala.inline
    def setTileWidth(value: Double): Self = this.set("tileWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileWidth: Self = this.set("tileWidth", js.undefined)
    @scala.inline
    def setTilingScheme(value: typings.cesium.mod.TilingScheme): Self = this.set("tilingScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTilingScheme: Self = this.set("tilingScheme", js.undefined)
  }
  
}

