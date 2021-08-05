package typings.cesium.anon

import typings.cesium.mod.DefaultProxy
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearOnDrop extends StObject {
  
  var clampToGround: js.UndefOr[Boolean] = js.undefined
  
  var clearOnDrop: js.UndefOr[Boolean] = js.undefined
  
  var dropTarget: js.UndefOr[Element | String] = js.undefined
  
  var flyToOnDrop: js.UndefOr[Boolean] = js.undefined
  
  var proxy: js.UndefOr[DefaultProxy] = js.undefined
}
object ClearOnDrop {
  
  inline def apply(): ClearOnDrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearOnDrop]
  }
  
  extension [Self <: ClearOnDrop](x: Self) {
    
    inline def setClampToGround(value: Boolean): Self = StObject.set(x, "clampToGround", value.asInstanceOf[js.Any])
    
    inline def setClampToGroundUndefined: Self = StObject.set(x, "clampToGround", js.undefined)
    
    inline def setClearOnDrop(value: Boolean): Self = StObject.set(x, "clearOnDrop", value.asInstanceOf[js.Any])
    
    inline def setClearOnDropUndefined: Self = StObject.set(x, "clearOnDrop", js.undefined)
    
    inline def setDropTarget(value: Element | String): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
    
    inline def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
    
    inline def setFlyToOnDrop(value: Boolean): Self = StObject.set(x, "flyToOnDrop", value.asInstanceOf[js.Any])
    
    inline def setFlyToOnDropUndefined: Self = StObject.set(x, "flyToOnDrop", js.undefined)
    
    inline def setProxy(value: DefaultProxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
  }
}
