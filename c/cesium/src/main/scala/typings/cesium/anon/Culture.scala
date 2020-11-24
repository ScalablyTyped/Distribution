package typings.cesium.anon

import typings.cesium.mod.TileDiscardPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Culture extends js.Object {
  
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
  implicit class CultureOps[Self <: Culture] (val x: Self) extends AnyVal {
    
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
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = this.set("ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllipsoid: Self = this.set("ellipsoid", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMapStyle(value: String): Self = this.set("mapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapStyle: Self = this.set("mapStyle", js.undefined)
    
    @scala.inline
    def setProxy(value: typings.cesium.mod.Proxy): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setTileDiscardPolicy(value: TileDiscardPolicy): Self = this.set("tileDiscardPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileDiscardPolicy: Self = this.set("tileDiscardPolicy", js.undefined)
    
    @scala.inline
    def setTileProtocol(value: String): Self = this.set("tileProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileProtocol: Self = this.set("tileProtocol", js.undefined)
  }
}
