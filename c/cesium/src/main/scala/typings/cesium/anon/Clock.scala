package typings.cesium.anon

import typings.cesium.mod.TimeIntervalCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clock extends StObject {
  
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
  implicit class ClockMutableBuilder[Self <: Clock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClock(value: typings.cesium.mod.Clock): Self = StObject.set(x, "clock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockUndefined: Self = StObject.set(x, "clock", js.undefined)
    
    @scala.inline
    def setCredit(value: typings.cesium.mod.Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
    
    @scala.inline
    def setDimensions(value: js.Any): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumLevel(value: Double): Self = StObject.set(x, "maximumLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumLevelUndefined: Self = StObject.set(x, "maximumLevel", js.undefined)
    
    @scala.inline
    def setMinimumLevel(value: Double): Self = StObject.set(x, "minimumLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumLevelUndefined: Self = StObject.set(x, "minimumLevel", js.undefined)
    
    @scala.inline
    def setRectangle(value: typings.cesium.mod.Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdomains(value: String | js.Array[String]): Self = StObject.set(x, "subdomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdomainsUndefined: Self = StObject.set(x, "subdomains", js.undefined)
    
    @scala.inline
    def setSubdomainsVarargs(value: String*): Self = StObject.set(x, "subdomains", js.Array(value :_*))
    
    @scala.inline
    def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
    
    @scala.inline
    def setTileMatrixLabels(value: js.Array[_]): Self = StObject.set(x, "tileMatrixLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileMatrixLabelsUndefined: Self = StObject.set(x, "tileMatrixLabels", js.undefined)
    
    @scala.inline
    def setTileMatrixLabelsVarargs(value: js.Any*): Self = StObject.set(x, "tileMatrixLabels", js.Array(value :_*))
    
    @scala.inline
    def setTileMatrixSetID(value: String): Self = StObject.set(x, "tileMatrixSetID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
    
    @scala.inline
    def setTilingScheme(value: typings.cesium.mod.TilingScheme): Self = StObject.set(x, "tilingScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilingSchemeUndefined: Self = StObject.set(x, "tilingScheme", js.undefined)
    
    @scala.inline
    def setTimes(value: TimeIntervalCollection): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
