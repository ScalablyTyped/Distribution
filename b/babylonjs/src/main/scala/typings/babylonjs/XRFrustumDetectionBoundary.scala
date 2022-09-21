package typings.babylonjs

import typings.babylonjs.babylonjsStrings.frustum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRFrustumDetectionBoundary
  extends StObject
     with XRDetectionBoundary {
  
  var frustum: XRFrustum
  
  var `type`: frustum
}
object XRFrustumDetectionBoundary {
  
  inline def apply(frustum: XRFrustum): XRFrustumDetectionBoundary = {
    val __obj = js.Dynamic.literal(frustum = frustum.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("frustum")
    __obj.asInstanceOf[XRFrustumDetectionBoundary]
  }
  
  extension [Self <: XRFrustumDetectionBoundary](x: Self) {
    
    inline def setFrustum(value: XRFrustum): Self = StObject.set(x, "frustum", value.asInstanceOf[js.Any])
    
    inline def setType(value: frustum): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
