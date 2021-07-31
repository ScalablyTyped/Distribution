package typings.cesium.anon

import typings.cesium.mod.TileDiscardPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnablePickFeatures extends StObject {
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var enablePickFeatures: js.UndefOr[Boolean] = js.undefined
  
  var maximumLevel: js.UndefOr[Double] = js.undefined
  
  var proxy: js.UndefOr[typings.cesium.mod.Proxy] = js.undefined
  
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.undefined
  
  var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.undefined
  
  var tileHeight: js.UndefOr[Double] = js.undefined
  
  var tileWidth: js.UndefOr[Double] = js.undefined
  
  var tilingScheme: js.UndefOr[typings.cesium.mod.TilingScheme] = js.undefined
  
  var url: String
  
  var usePreCachedTilesIfAvailable: js.UndefOr[Boolean] = js.undefined
}
object EnablePickFeatures {
  
  @scala.inline
  def apply(url: String): EnablePickFeatures = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnablePickFeatures]
  }
  
  @scala.inline
  implicit class EnablePickFeaturesMutableBuilder[Self <: EnablePickFeatures] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setEnablePickFeatures(value: Boolean): Self = StObject.set(x, "enablePickFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePickFeaturesUndefined: Self = StObject.set(x, "enablePickFeatures", js.undefined)
    
    @scala.inline
    def setMaximumLevel(value: Double): Self = StObject.set(x, "maximumLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumLevelUndefined: Self = StObject.set(x, "maximumLevel", js.undefined)
    
    @scala.inline
    def setProxy(value: typings.cesium.mod.Proxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setRectangle(value: typings.cesium.mod.Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
    
    @scala.inline
    def setTileDiscardPolicy(value: TileDiscardPolicy): Self = StObject.set(x, "tileDiscardPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileDiscardPolicyUndefined: Self = StObject.set(x, "tileDiscardPolicy", js.undefined)
    
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
    def setUsePreCachedTilesIfAvailable(value: Boolean): Self = StObject.set(x, "usePreCachedTilesIfAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePreCachedTilesIfAvailableUndefined: Self = StObject.set(x, "usePreCachedTilesIfAvailable", js.undefined)
  }
}
