package typings.babylonjs

import typings.std.DOMPointReadOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babylonjs.XRFrustumDetectionBoundary
  - typings.babylonjs.XRSphereDetectionBoundary
  - typings.babylonjs.XRBoxDetectionBoundary
*/
trait XRDetectionBoundary extends StObject
object XRDetectionBoundary {
  
  inline def XRBoxDetectionBoundary(extent: DOMPointReadOnly): typings.babylonjs.XRBoxDetectionBoundary = {
    val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("box")
    __obj.asInstanceOf[typings.babylonjs.XRBoxDetectionBoundary]
  }
  
  inline def XRFrustumDetectionBoundary(frustum: XRFrustum): typings.babylonjs.XRFrustumDetectionBoundary = {
    val __obj = js.Dynamic.literal(frustum = frustum.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("frustum")
    __obj.asInstanceOf[typings.babylonjs.XRFrustumDetectionBoundary]
  }
  
  inline def XRSphereDetectionBoundary(radius: Double): typings.babylonjs.XRSphereDetectionBoundary = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sphere")
    __obj.asInstanceOf[typings.babylonjs.XRSphereDetectionBoundary]
  }
}
