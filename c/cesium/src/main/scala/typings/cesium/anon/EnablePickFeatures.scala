package typings.cesium.anon

import typings.cesium.mod.TileDiscardPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnablePickFeatures extends js.Object {
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  var enablePickFeatures: js.UndefOr[Boolean] = js.native
  var maximumLevel: js.UndefOr[Double] = js.native
  var proxy: js.UndefOr[typings.cesium.mod.Proxy] = js.native
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.native
  var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.native
  var tileHeight: js.UndefOr[Double] = js.native
  var tileWidth: js.UndefOr[Double] = js.native
  var tilingScheme: js.UndefOr[typings.cesium.mod.TilingScheme] = js.native
  var url: String = js.native
  var usePreCachedTilesIfAvailable: js.UndefOr[Boolean] = js.native
}

object EnablePickFeatures {
  @scala.inline
  def apply(url: String): EnablePickFeatures = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnablePickFeatures]
  }
  @scala.inline
  implicit class EnablePickFeaturesOps[Self <: EnablePickFeatures] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = this.set("ellipsoid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsoid: Self = this.set("ellipsoid", js.undefined)
    @scala.inline
    def setEnablePickFeatures(value: Boolean): Self = this.set("enablePickFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePickFeatures: Self = this.set("enablePickFeatures", js.undefined)
    @scala.inline
    def setMaximumLevel(value: Double): Self = this.set("maximumLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumLevel: Self = this.set("maximumLevel", js.undefined)
    @scala.inline
    def setProxy(value: typings.cesium.mod.Proxy): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setRectangle(value: typings.cesium.mod.Rectangle): Self = this.set("rectangle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRectangle: Self = this.set("rectangle", js.undefined)
    @scala.inline
    def setTileDiscardPolicy(value: TileDiscardPolicy): Self = this.set("tileDiscardPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileDiscardPolicy: Self = this.set("tileDiscardPolicy", js.undefined)
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
    @scala.inline
    def setUsePreCachedTilesIfAvailable(value: Boolean): Self = this.set("usePreCachedTilesIfAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePreCachedTilesIfAvailable: Self = this.set("usePreCachedTilesIfAvailable", js.undefined)
  }
  
}

