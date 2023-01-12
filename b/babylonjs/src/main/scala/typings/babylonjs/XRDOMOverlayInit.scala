package typings.babylonjs

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRDOMOverlayInit extends StObject {
  
  var root: Element
}
object XRDOMOverlayInit {
  
  inline def apply(root: Element): XRDOMOverlayInit = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRDOMOverlayInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRDOMOverlayInit] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: Element): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
