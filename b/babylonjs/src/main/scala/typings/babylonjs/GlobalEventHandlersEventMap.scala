package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BEGIN: WebXR DOM Overlays Module
  * https://immersive-web.github.io/dom-overlays/
  */
trait GlobalEventHandlersEventMap extends StObject {
  
  var beforexrselect: XRSessionEvent
}
object GlobalEventHandlersEventMap {
  
  inline def apply(beforexrselect: XRSessionEvent): GlobalEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(beforexrselect = beforexrselect.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalEventHandlersEventMap]
  }
  
  extension [Self <: GlobalEventHandlersEventMap](x: Self) {
    
    inline def setBeforexrselect(value: XRSessionEvent): Self = StObject.set(x, "beforexrselect", value.asInstanceOf[js.Any])
  }
}
