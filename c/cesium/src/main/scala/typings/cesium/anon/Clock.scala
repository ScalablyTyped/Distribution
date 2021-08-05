package typings.cesium.anon

import typings.cesium.mod.TimeIntervalCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clock extends StObject {
  
  var clock: js.UndefOr[typings.cesium.mod.Clock] = js.undefined
  
  var credit: js.UndefOr[typings.cesium.mod.Credit | String] = js.undefined
  
  var dimensions: js.UndefOr[js.Any] = js.undefined
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var layer: String
  
  var maximumLevel: js.UndefOr[Double] = js.undefined
  
  var minimumLevel: js.UndefOr[Double] = js.undefined
  
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.undefined
  
  var style: String
  
  var subdomains: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var tileHeight: js.UndefOr[Double] = js.undefined
  
  var tileMatrixLabels: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var tileMatrixSetID: String
  
  var tileWidth: js.UndefOr[Double] = js.undefined
  
  var tilingScheme: js.UndefOr[typings.cesium.mod.TilingScheme] = js.undefined
  
  var times: js.UndefOr[TimeIntervalCollection] = js.undefined
  
  var url: String
}
object Clock {
  
  inline def apply(layer: String, style: String, tileMatrixSetID: String, url: String): Clock = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tileMatrixSetID = tileMatrixSetID.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clock]
  }
  
  extension [Self <: Clock](x: Self) {
    
    inline def setClock(value: typings.cesium.mod.Clock): Self = StObject.set(x, "clock", value.asInstanceOf[js.Any])
    
    inline def setClockUndefined: Self = StObject.set(x, "clock", js.undefined)
    
    inline def setCredit(value: typings.cesium.mod.Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
    
    inline def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
    
    inline def setDimensions(value: js.Any): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setMaximumLevel(value: Double): Self = StObject.set(x, "maximumLevel", value.asInstanceOf[js.Any])
    
    inline def setMaximumLevelUndefined: Self = StObject.set(x, "maximumLevel", js.undefined)
    
    inline def setMinimumLevel(value: Double): Self = StObject.set(x, "minimumLevel", value.asInstanceOf[js.Any])
    
    inline def setMinimumLevelUndefined: Self = StObject.set(x, "minimumLevel", js.undefined)
    
    inline def setRectangle(value: typings.cesium.mod.Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setSubdomains(value: String | js.Array[String]): Self = StObject.set(x, "subdomains", value.asInstanceOf[js.Any])
    
    inline def setSubdomainsUndefined: Self = StObject.set(x, "subdomains", js.undefined)
    
    inline def setSubdomainsVarargs(value: String*): Self = StObject.set(x, "subdomains", js.Array(value :_*))
    
    inline def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
    
    inline def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
    
    inline def setTileMatrixLabels(value: js.Array[js.Any]): Self = StObject.set(x, "tileMatrixLabels", value.asInstanceOf[js.Any])
    
    inline def setTileMatrixLabelsUndefined: Self = StObject.set(x, "tileMatrixLabels", js.undefined)
    
    inline def setTileMatrixLabelsVarargs(value: js.Any*): Self = StObject.set(x, "tileMatrixLabels", js.Array(value :_*))
    
    inline def setTileMatrixSetID(value: String): Self = StObject.set(x, "tileMatrixSetID", value.asInstanceOf[js.Any])
    
    inline def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
    
    inline def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
    
    inline def setTilingScheme(value: typings.cesium.mod.TilingScheme): Self = StObject.set(x, "tilingScheme", value.asInstanceOf[js.Any])
    
    inline def setTilingSchemeUndefined: Self = StObject.set(x, "tilingScheme", js.undefined)
    
    inline def setTimes(value: TimeIntervalCollection): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
