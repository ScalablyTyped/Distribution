package typings.babylonjs

import typings.babylonjs.babylonjsStrings.Horizontal
import typings.babylonjs.babylonjsStrings.Vertical
import typings.std.DOMPointReadOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRPlane extends StObject {
  
  var lastChangedTime: Double
  
  var orientation: Horizontal | Vertical
  
  var planeSpace: XRSpace
  
  var polygon: js.Array[DOMPointReadOnly]
}
object XRPlane {
  
  inline def apply(
    lastChangedTime: Double,
    orientation: Horizontal | Vertical,
    planeSpace: XRSpace,
    polygon: js.Array[DOMPointReadOnly]
  ): XRPlane = {
    val __obj = js.Dynamic.literal(lastChangedTime = lastChangedTime.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], planeSpace = planeSpace.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRPlane]
  }
  
  extension [Self <: XRPlane](x: Self) {
    
    inline def setLastChangedTime(value: Double): Self = StObject.set(x, "lastChangedTime", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: Horizontal | Vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setPlaneSpace(value: XRSpace): Self = StObject.set(x, "planeSpace", value.asInstanceOf[js.Any])
    
    inline def setPolygon(value: js.Array[DOMPointReadOnly]): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
    
    inline def setPolygonVarargs(value: DOMPointReadOnly*): Self = StObject.set(x, "polygon", js.Array(value :_*))
  }
}
