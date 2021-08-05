package typings.cesium.anon

import typings.cesium.mod.TileDiscardPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Culture extends StObject {
  
  var culture: js.UndefOr[String] = js.undefined
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var mapStyle: js.UndefOr[String] = js.undefined
  
  var proxy: js.UndefOr[typings.cesium.mod.Proxy] = js.undefined
  
  var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.undefined
  
  var tileProtocol: js.UndefOr[String] = js.undefined
  
  var url: String
}
object Culture {
  
  inline def apply(url: String): Culture = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Culture]
  }
  
  extension [Self <: Culture](x: Self) {
    
    inline def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    inline def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    inline def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMapStyle(value: String): Self = StObject.set(x, "mapStyle", value.asInstanceOf[js.Any])
    
    inline def setMapStyleUndefined: Self = StObject.set(x, "mapStyle", js.undefined)
    
    inline def setProxy(value: typings.cesium.mod.Proxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setTileDiscardPolicy(value: TileDiscardPolicy): Self = StObject.set(x, "tileDiscardPolicy", value.asInstanceOf[js.Any])
    
    inline def setTileDiscardPolicyUndefined: Self = StObject.set(x, "tileDiscardPolicy", js.undefined)
    
    inline def setTileProtocol(value: String): Self = StObject.set(x, "tileProtocol", value.asInstanceOf[js.Any])
    
    inline def setTileProtocolUndefined: Self = StObject.set(x, "tileProtocol", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
