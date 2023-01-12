package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRReferenceSpaceEventMap extends StObject {
  
  var reset: XRReferenceSpaceEvent
}
object XRReferenceSpaceEventMap {
  
  inline def apply(reset: XRReferenceSpaceEvent): XRReferenceSpaceEventMap = {
    val __obj = js.Dynamic.literal(reset = reset.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRReferenceSpaceEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRReferenceSpaceEventMap] (val x: Self) extends AnyVal {
    
    inline def setReset(value: XRReferenceSpaceEvent): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
  }
}
