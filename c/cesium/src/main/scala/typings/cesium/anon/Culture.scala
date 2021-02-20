package typings.cesium.anon

import typings.cesium.mod.TileDiscardPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Culture extends StObject {
  
  var culture: js.UndefOr[String] = js.native
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var mapStyle: js.UndefOr[String] = js.native
  
  var proxy: js.UndefOr[typings.cesium.mod.Proxy] = js.native
  
  var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.native
  
  var tileProtocol: js.UndefOr[String] = js.native
  
  var url: String = js.native
}
object Culture {
  
  @scala.inline
  def apply(url: String): Culture = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Culture]
  }
  
  @scala.inline
  implicit class CultureMutableBuilder[Self <: Culture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMapStyle(value: String): Self = StObject.set(x, "mapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapStyleUndefined: Self = StObject.set(x, "mapStyle", js.undefined)
    
    @scala.inline
    def setProxy(value: typings.cesium.mod.Proxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setTileDiscardPolicy(value: TileDiscardPolicy): Self = StObject.set(x, "tileDiscardPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileDiscardPolicyUndefined: Self = StObject.set(x, "tileDiscardPolicy", js.undefined)
    
    @scala.inline
    def setTileProtocol(value: String): Self = StObject.set(x, "tileProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileProtocolUndefined: Self = StObject.set(x, "tileProtocol", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
