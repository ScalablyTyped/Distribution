package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRWalkingLocomotionOptions extends StObject {
  
  /**
    * The target to be moved by walking locomotion. This should be the transform node
    * which is the root of the XR space (i.e., the WebXRCamera's parent node). However,
    * for simple cases and legacy purposes, articulating the WebXRCamera itself is also
    * supported as a deprecated feature.
    */
  var locomotionTarget: WebXRCamera | TransformNode
}
object IWebXRWalkingLocomotionOptions {
  
  inline def apply(locomotionTarget: WebXRCamera | TransformNode): IWebXRWalkingLocomotionOptions = {
    val __obj = js.Dynamic.literal(locomotionTarget = locomotionTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRWalkingLocomotionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebXRWalkingLocomotionOptions] (val x: Self) extends AnyVal {
    
    inline def setLocomotionTarget(value: WebXRCamera | TransformNode): Self = StObject.set(x, "locomotionTarget", value.asInstanceOf[js.Any])
  }
}
