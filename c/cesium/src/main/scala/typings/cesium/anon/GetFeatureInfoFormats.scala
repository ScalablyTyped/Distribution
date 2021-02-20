package typings.cesium.anon

import typings.cesium.mod.GetFeatureInfoFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFeatureInfoFormats extends StObject {
  
  var credit: js.UndefOr[typings.cesium.mod.Credit | String] = js.native
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  
  var enablePickFeatures: js.UndefOr[Boolean] = js.native
  
  var getFeatureInfoFormats: js.UndefOr[js.Array[GetFeatureInfoFormat]] = js.native
  
  var hasAlphaChannel: js.UndefOr[Boolean] = js.native
  
  var maximumLevel: js.UndefOr[Double] = js.native
  
  var minimumLevel: js.UndefOr[Double] = js.native
  
  var pickFeaturesUrl: js.UndefOr[String] = js.native
  
  var proxy: js.UndefOr[js.Object] = js.native
  
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.native
  
  var subdomains: js.UndefOr[String | js.Array[String]] = js.native
  
  var tileHeight: js.UndefOr[Double] = js.native
  
  var tileWidth: js.UndefOr[Double] = js.native
  
  var tilingScheme: js.UndefOr[typings.cesium.mod.TilingScheme] = js.native
  
  var url: String = js.native
  
  var urlSchemeZeroPadding: js.UndefOr[js.Object] = js.native
}
object GetFeatureInfoFormats {
  
  @scala.inline
  def apply(url: String): GetFeatureInfoFormats = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFeatureInfoFormats]
  }
  
  @scala.inline
  implicit class GetFeatureInfoFormatsMutableBuilder[Self <: GetFeatureInfoFormats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredit(value: typings.cesium.mod.Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setEnablePickFeatures(value: Boolean): Self = StObject.set(x, "enablePickFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePickFeaturesUndefined: Self = StObject.set(x, "enablePickFeatures", js.undefined)
    
    @scala.inline
    def setGetFeatureInfoFormats(value: js.Array[GetFeatureInfoFormat]): Self = StObject.set(x, "getFeatureInfoFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFeatureInfoFormatsUndefined: Self = StObject.set(x, "getFeatureInfoFormats", js.undefined)
    
    @scala.inline
    def setGetFeatureInfoFormatsVarargs(value: GetFeatureInfoFormat*): Self = StObject.set(x, "getFeatureInfoFormats", js.Array(value :_*))
    
    @scala.inline
    def setHasAlphaChannel(value: Boolean): Self = StObject.set(x, "hasAlphaChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAlphaChannelUndefined: Self = StObject.set(x, "hasAlphaChannel", js.undefined)
    
    @scala.inline
    def setMaximumLevel(value: Double): Self = StObject.set(x, "maximumLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumLevelUndefined: Self = StObject.set(x, "maximumLevel", js.undefined)
    
    @scala.inline
    def setMinimumLevel(value: Double): Self = StObject.set(x, "minimumLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumLevelUndefined: Self = StObject.set(x, "minimumLevel", js.undefined)
    
    @scala.inline
    def setPickFeaturesUrl(value: String): Self = StObject.set(x, "pickFeaturesUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickFeaturesUrlUndefined: Self = StObject.set(x, "pickFeaturesUrl", js.undefined)
    
    @scala.inline
    def setProxy(value: js.Object): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setRectangle(value: typings.cesium.mod.Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
    
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
    def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
    
    @scala.inline
    def setTilingScheme(value: typings.cesium.mod.TilingScheme): Self = StObject.set(x, "tilingScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilingSchemeUndefined: Self = StObject.set(x, "tilingScheme", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlSchemeZeroPadding(value: js.Object): Self = StObject.set(x, "urlSchemeZeroPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlSchemeZeroPaddingUndefined: Self = StObject.set(x, "urlSchemeZeroPadding", js.undefined)
  }
}
