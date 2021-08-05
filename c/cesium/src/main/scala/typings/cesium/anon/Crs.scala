package typings.cesium.anon

import typings.cesium.mod.GetFeatureInfoFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Crs extends StObject {
  
  var credit: js.UndefOr[typings.cesium.mod.Credit | String] = js.undefined
  
  var crs: js.UndefOr[String] = js.undefined
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var enablePickFeatures: js.UndefOr[Boolean] = js.undefined
  
  var getFeatureInfoFormats: js.UndefOr[js.Array[GetFeatureInfoFormat]] = js.undefined
  
  var getFeatureInfoParameters: js.UndefOr[js.Any] = js.undefined
  
  var layers: String
  
  var maximumLevel: js.UndefOr[Double] = js.undefined
  
  var minimumLevel: js.UndefOr[Double] = js.undefined
  
  var parameters: js.UndefOr[js.Any] = js.undefined
  
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.undefined
  
  var srs: js.UndefOr[String] = js.undefined
  
  var subdomains: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var tileHeight: js.UndefOr[Double] = js.undefined
  
  var tileWidth: js.UndefOr[Double] = js.undefined
  
  var tilingScheme: js.UndefOr[typings.cesium.mod.TilingScheme] = js.undefined
  
  var url: String
}
object Crs {
  
  inline def apply(layers: String, url: String): Crs = {
    val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crs]
  }
  
  extension [Self <: Crs](x: Self) {
    
    inline def setCredit(value: typings.cesium.mod.Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
    
    inline def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
    
    inline def setCrs(value: String): Self = StObject.set(x, "crs", value.asInstanceOf[js.Any])
    
    inline def setCrsUndefined: Self = StObject.set(x, "crs", js.undefined)
    
    inline def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setEnablePickFeatures(value: Boolean): Self = StObject.set(x, "enablePickFeatures", value.asInstanceOf[js.Any])
    
    inline def setEnablePickFeaturesUndefined: Self = StObject.set(x, "enablePickFeatures", js.undefined)
    
    inline def setGetFeatureInfoFormats(value: js.Array[GetFeatureInfoFormat]): Self = StObject.set(x, "getFeatureInfoFormats", value.asInstanceOf[js.Any])
    
    inline def setGetFeatureInfoFormatsUndefined: Self = StObject.set(x, "getFeatureInfoFormats", js.undefined)
    
    inline def setGetFeatureInfoFormatsVarargs(value: GetFeatureInfoFormat*): Self = StObject.set(x, "getFeatureInfoFormats", js.Array(value :_*))
    
    inline def setGetFeatureInfoParameters(value: js.Any): Self = StObject.set(x, "getFeatureInfoParameters", value.asInstanceOf[js.Any])
    
    inline def setGetFeatureInfoParametersUndefined: Self = StObject.set(x, "getFeatureInfoParameters", js.undefined)
    
    inline def setLayers(value: String): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setMaximumLevel(value: Double): Self = StObject.set(x, "maximumLevel", value.asInstanceOf[js.Any])
    
    inline def setMaximumLevelUndefined: Self = StObject.set(x, "maximumLevel", js.undefined)
    
    inline def setMinimumLevel(value: Double): Self = StObject.set(x, "minimumLevel", value.asInstanceOf[js.Any])
    
    inline def setMinimumLevelUndefined: Self = StObject.set(x, "minimumLevel", js.undefined)
    
    inline def setParameters(value: js.Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setRectangle(value: typings.cesium.mod.Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
    
    inline def setSrs(value: String): Self = StObject.set(x, "srs", value.asInstanceOf[js.Any])
    
    inline def setSrsUndefined: Self = StObject.set(x, "srs", js.undefined)
    
    inline def setSubdomains(value: String | js.Array[String]): Self = StObject.set(x, "subdomains", value.asInstanceOf[js.Any])
    
    inline def setSubdomainsUndefined: Self = StObject.set(x, "subdomains", js.undefined)
    
    inline def setSubdomainsVarargs(value: String*): Self = StObject.set(x, "subdomains", js.Array(value :_*))
    
    inline def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
    
    inline def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
    
    inline def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
    
    inline def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
    
    inline def setTilingScheme(value: typings.cesium.mod.TilingScheme): Self = StObject.set(x, "tilingScheme", value.asInstanceOf[js.Any])
    
    inline def setTilingSchemeUndefined: Self = StObject.set(x, "tilingScheme", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
