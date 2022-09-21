package typings.babylonjs.BABYLON

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRDomOverlayOptions extends StObject {
  
  /**
    * DOM Element or document query selector string for overlay.
    *
    * NOTE: UA may make this element background transparent in XR.
    */
  var element: Element | String
  
  /**
    * Supress XR Select events on container element (DOM blocks interaction to scene).
    */
  var supressXRSelectEvents: js.UndefOr[Boolean] = js.undefined
}
object IWebXRDomOverlayOptions {
  
  inline def apply(element: Element | String): IWebXRDomOverlayOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRDomOverlayOptions]
  }
  
  extension [Self <: IWebXRDomOverlayOptions](x: Self) {
    
    inline def setElement(value: Element | String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setSupressXRSelectEvents(value: Boolean): Self = StObject.set(x, "supressXRSelectEvents", value.asInstanceOf[js.Any])
    
    inline def setSupressXRSelectEventsUndefined: Self = StObject.set(x, "supressXRSelectEvents", js.undefined)
  }
}
