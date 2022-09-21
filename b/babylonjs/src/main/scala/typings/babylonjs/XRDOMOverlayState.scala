package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRDOMOverlayState extends StObject {
  
  /**
    * set if supported, or is null if the feature is not supported
    */
  var `type`: XRDOMOverlayType | Null
}
object XRDOMOverlayState {
  
  inline def apply(): XRDOMOverlayState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[XRDOMOverlayState]
  }
  
  extension [Self <: XRDOMOverlayState](x: Self) {
    
    inline def setType(value: XRDOMOverlayType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
  }
}
