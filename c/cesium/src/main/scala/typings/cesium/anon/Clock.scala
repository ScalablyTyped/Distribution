package typings.cesium.anon

import typings.cesium.mod.TimeIntervalCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clock extends js.Object {
  var clock: js.UndefOr[typings.cesium.mod.Clock] = js.native
  var credit: js.UndefOr[typings.cesium.mod.Credit | String] = js.native
  var dimensions: js.UndefOr[js.Any] = js.native
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  var format: js.UndefOr[String] = js.native
  var layer: String = js.native
  var maximumLevel: js.UndefOr[Double] = js.native
  var minimumLevel: js.UndefOr[Double] = js.native
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.native
  var style: String = js.native
  var subdomains: js.UndefOr[String | js.Array[String]] = js.native
  var tileHeight: js.UndefOr[Double] = js.native
  var tileMatrixLabels: js.UndefOr[js.Array[_]] = js.native
  var tileMatrixSetID: String = js.native
  var tileWidth: js.UndefOr[Double] = js.native
  var tilingScheme: js.UndefOr[typings.cesium.mod.TilingScheme] = js.native
  var times: js.UndefOr[TimeIntervalCollection] = js.native
  var url: String = js.native
}

object Clock {
  @scala.inline
  def apply(layer: String, style: String, tileMatrixSetID: String, url: String): Clock = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tileMatrixSetID = tileMatrixSetID.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clock]
  }
  @scala.inline
  implicit class ClockOps[Self <: Clock] (val x: Self) extends AnyVal {
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
    def setLayer(value: String): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileMatrixSetID(value: String): Self = this.set("tileMatrixSetID", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setClock(value: typings.cesium.mod.Clock): Self = this.set("clock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClock: Self = this.set("clock", js.undefined)
    @scala.inline
    def setCredit(value: typings.cesium.mod.Credit | String): Self = this.set("credit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredit: Self = this.set("credit", js.undefined)
    @scala.inline
    def setDimensions(value: js.Any): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = this.set("ellipsoid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsoid: Self = this.set("ellipsoid", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setMaximumLevel(value: Double): Self = this.set("maximumLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumLevel: Self = this.set("maximumLevel", js.undefined)
    @scala.inline
    def setMinimumLevel(value: Double): Self = this.set("minimumLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumLevel: Self = this.set("minimumLevel", js.undefined)
    @scala.inline
    def setRectangle(value: typings.cesium.mod.Rectangle): Self = this.set("rectangle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRectangle: Self = this.set("rectangle", js.undefined)
    @scala.inline
    def setSubdomainsVarargs(value: String*): Self = this.set("subdomains", js.Array(value :_*))
    @scala.inline
    def setSubdomains(value: String | js.Array[String]): Self = this.set("subdomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubdomains: Self = this.set("subdomains", js.undefined)
    @scala.inline
    def setTileHeight(value: Double): Self = this.set("tileHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileHeight: Self = this.set("tileHeight", js.undefined)
    @scala.inline
    def setTileMatrixLabelsVarargs(value: js.Any*): Self = this.set("tileMatrixLabels", js.Array(value :_*))
    @scala.inline
    def setTileMatrixLabels(value: js.Array[_]): Self = this.set("tileMatrixLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileMatrixLabels: Self = this.set("tileMatrixLabels", js.undefined)
    @scala.inline
    def setTileWidth(value: Double): Self = this.set("tileWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileWidth: Self = this.set("tileWidth", js.undefined)
    @scala.inline
    def setTilingScheme(value: typings.cesium.mod.TilingScheme): Self = this.set("tilingScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTilingScheme: Self = this.set("tilingScheme", js.undefined)
    @scala.inline
    def setTimes(value: TimeIntervalCollection): Self = this.set("times", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimes: Self = this.set("times", js.undefined)
  }
  
}

