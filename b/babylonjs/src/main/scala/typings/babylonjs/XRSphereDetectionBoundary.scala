package typings.babylonjs

import typings.babylonjs.babylonjsStrings.sphere
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRSphereDetectionBoundary
  extends StObject
     with XRDetectionBoundary {
  
  var radius: Double
  
  var `type`: sphere
}
object XRSphereDetectionBoundary {
  
  inline def apply(radius: Double): XRSphereDetectionBoundary = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sphere")
    __obj.asInstanceOf[XRSphereDetectionBoundary]
  }
  
  extension [Self <: XRSphereDetectionBoundary](x: Self) {
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setType(value: sphere): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
