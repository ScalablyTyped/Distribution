package typings.cesium.anon

import typings.cesium.mod.GetFeatureInfoFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crs extends js.Object {
  var credit: js.UndefOr[typings.cesium.mod.Credit | String] = js.native
  var crs: js.UndefOr[String] = js.native
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  var enablePickFeatures: js.UndefOr[Boolean] = js.native
  var getFeatureInfoFormats: js.UndefOr[js.Array[GetFeatureInfoFormat]] = js.native
  var getFeatureInfoParameters: js.UndefOr[js.Any] = js.native
  var layers: String = js.native
  var maximumLevel: js.UndefOr[Double] = js.native
  var minimumLevel: js.UndefOr[Double] = js.native
  var parameters: js.UndefOr[js.Any] = js.native
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.native
  var srs: js.UndefOr[String] = js.native
  var subdomains: js.UndefOr[String | js.Array[String]] = js.native
  var tileHeight: js.UndefOr[Double] = js.native
  var tileWidth: js.UndefOr[Double] = js.native
  var tilingScheme: js.UndefOr[typings.cesium.mod.TilingScheme] = js.native
  var url: String = js.native
}

object Crs {
  @scala.inline
  def apply(layers: String, url: String): Crs = {
    val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crs]
  }
  @scala.inline
  implicit class CrsOps[Self <: Crs] (val x: Self) extends AnyVal {
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
    def setLayers(value: String): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredit(value: typings.cesium.mod.Credit | String): Self = this.set("credit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredit: Self = this.set("credit", js.undefined)
    @scala.inline
    def setCrs(value: String): Self = this.set("crs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrs: Self = this.set("crs", js.undefined)
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = this.set("ellipsoid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsoid: Self = this.set("ellipsoid", js.undefined)
    @scala.inline
    def setEnablePickFeatures(value: Boolean): Self = this.set("enablePickFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePickFeatures: Self = this.set("enablePickFeatures", js.undefined)
    @scala.inline
    def setGetFeatureInfoFormatsVarargs(value: GetFeatureInfoFormat*): Self = this.set("getFeatureInfoFormats", js.Array(value :_*))
    @scala.inline
    def setGetFeatureInfoFormats(value: js.Array[GetFeatureInfoFormat]): Self = this.set("getFeatureInfoFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetFeatureInfoFormats: Self = this.set("getFeatureInfoFormats", js.undefined)
    @scala.inline
    def setGetFeatureInfoParameters(value: js.Any): Self = this.set("getFeatureInfoParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetFeatureInfoParameters: Self = this.set("getFeatureInfoParameters", js.undefined)
    @scala.inline
    def setMaximumLevel(value: Double): Self = this.set("maximumLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumLevel: Self = this.set("maximumLevel", js.undefined)
    @scala.inline
    def setMinimumLevel(value: Double): Self = this.set("minimumLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumLevel: Self = this.set("minimumLevel", js.undefined)
    @scala.inline
    def setParameters(value: js.Any): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setRectangle(value: typings.cesium.mod.Rectangle): Self = this.set("rectangle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRectangle: Self = this.set("rectangle", js.undefined)
    @scala.inline
    def setSrs(value: String): Self = this.set("srs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrs: Self = this.set("srs", js.undefined)
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
    def setTileWidth(value: Double): Self = this.set("tileWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileWidth: Self = this.set("tileWidth", js.undefined)
    @scala.inline
    def setTilingScheme(value: typings.cesium.mod.TilingScheme): Self = this.set("tilingScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTilingScheme: Self = this.set("tilingScheme", js.undefined)
  }
  
}

