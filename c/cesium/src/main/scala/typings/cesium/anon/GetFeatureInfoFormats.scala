package typings.cesium.anon

import typings.cesium.mod.GetFeatureInfoFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFeatureInfoFormats extends StObject {
  
  var credit: js.UndefOr[typings.cesium.mod.Credit | String] = js.undefined
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var enablePickFeatures: js.UndefOr[Boolean] = js.undefined
  
  var getFeatureInfoFormats: js.UndefOr[js.Array[GetFeatureInfoFormat]] = js.undefined
  
  var hasAlphaChannel: js.UndefOr[Boolean] = js.undefined
  
  var maximumLevel: js.UndefOr[Double] = js.undefined
  
  var minimumLevel: js.UndefOr[Double] = js.undefined
  
  var pickFeaturesUrl: js.UndefOr[String] = js.undefined
  
  var proxy: js.UndefOr[js.Object] = js.undefined
  
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.undefined
  
  var subdomains: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var tileHeight: js.UndefOr[Double] = js.undefined
  
  var tileWidth: js.UndefOr[Double] = js.undefined
  
  var tilingScheme: js.UndefOr[typings.cesium.mod.TilingScheme] = js.undefined
  
  var url: String
  
  var urlSchemeZeroPadding: js.UndefOr[js.Object] = js.undefined
}
object GetFeatureInfoFormats {
  
  inline def apply(url: String): GetFeatureInfoFormats = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFeatureInfoFormats]
  }
  
  extension [Self <: GetFeatureInfoFormats](x: Self) {
    
    inline def setCredit(value: typings.cesium.mod.Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
    
    inline def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
    
    inline def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setEnablePickFeatures(value: Boolean): Self = StObject.set(x, "enablePickFeatures", value.asInstanceOf[js.Any])
    
    inline def setEnablePickFeaturesUndefined: Self = StObject.set(x, "enablePickFeatures", js.undefined)
    
    inline def setGetFeatureInfoFormats(value: js.Array[GetFeatureInfoFormat]): Self = StObject.set(x, "getFeatureInfoFormats", value.asInstanceOf[js.Any])
    
    inline def setGetFeatureInfoFormatsUndefined: Self = StObject.set(x, "getFeatureInfoFormats", js.undefined)
    
    inline def setGetFeatureInfoFormatsVarargs(value: GetFeatureInfoFormat*): Self = StObject.set(x, "getFeatureInfoFormats", js.Array(value :_*))
    
    inline def setHasAlphaChannel(value: Boolean): Self = StObject.set(x, "hasAlphaChannel", value.asInstanceOf[js.Any])
    
    inline def setHasAlphaChannelUndefined: Self = StObject.set(x, "hasAlphaChannel", js.undefined)
    
    inline def setMaximumLevel(value: Double): Self = StObject.set(x, "maximumLevel", value.asInstanceOf[js.Any])
    
    inline def setMaximumLevelUndefined: Self = StObject.set(x, "maximumLevel", js.undefined)
    
    inline def setMinimumLevel(value: Double): Self = StObject.set(x, "minimumLevel", value.asInstanceOf[js.Any])
    
    inline def setMinimumLevelUndefined: Self = StObject.set(x, "minimumLevel", js.undefined)
    
    inline def setPickFeaturesUrl(value: String): Self = StObject.set(x, "pickFeaturesUrl", value.asInstanceOf[js.Any])
    
    inline def setPickFeaturesUrlUndefined: Self = StObject.set(x, "pickFeaturesUrl", js.undefined)
    
    inline def setProxy(value: js.Object): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setRectangle(value: typings.cesium.mod.Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
    
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
    
    inline def setUrlSchemeZeroPadding(value: js.Object): Self = StObject.set(x, "urlSchemeZeroPadding", value.asInstanceOf[js.Any])
    
    inline def setUrlSchemeZeroPaddingUndefined: Self = StObject.set(x, "urlSchemeZeroPadding", js.undefined)
  }
}
