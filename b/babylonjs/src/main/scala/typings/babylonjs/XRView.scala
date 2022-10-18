package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a single view into an XR scene for a given frame.
  *
  * ref: https://immersive-web.github.io/webxr/#xrview-interface
  */
trait XRView extends StObject {
  
  val eye: XREye
  
  val projectionMatrix: js.typedarray.Float32Array
  
  val recommendedViewportScale: js.UndefOr[Double] = js.undefined
  
  def requestViewportScale(scale: Double): Unit
  
  val transform: XRRigidTransform
}
object XRView {
  
  inline def apply(
    eye: XREye,
    projectionMatrix: js.typedarray.Float32Array,
    requestViewportScale: Double => Unit,
    transform: XRRigidTransform
  ): XRView = {
    val __obj = js.Dynamic.literal(eye = eye.asInstanceOf[js.Any], projectionMatrix = projectionMatrix.asInstanceOf[js.Any], requestViewportScale = js.Any.fromFunction1(requestViewportScale), transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRView]
  }
  
  extension [Self <: XRView](x: Self) {
    
    inline def setEye(value: XREye): Self = StObject.set(x, "eye", value.asInstanceOf[js.Any])
    
    inline def setProjectionMatrix(value: js.typedarray.Float32Array): Self = StObject.set(x, "projectionMatrix", value.asInstanceOf[js.Any])
    
    inline def setRecommendedViewportScale(value: Double): Self = StObject.set(x, "recommendedViewportScale", value.asInstanceOf[js.Any])
    
    inline def setRecommendedViewportScaleUndefined: Self = StObject.set(x, "recommendedViewportScale", js.undefined)
    
    inline def setRequestViewportScale(value: Double => Unit): Self = StObject.set(x, "requestViewportScale", js.Any.fromFunction1(value))
    
    inline def setTransform(value: XRRigidTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
