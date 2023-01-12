package typings.babylonjs

import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.xRFeaturesWebXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.xRWebXRCameraMod.WebXRCamera
import typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRFeaturesWebXRWalkingLocomotionMod {
  
  @JSImport("babylonjs/XR/features/WebXRWalkingLocomotion", "WebXRWalkingLocomotion")
  @js.native
  open class WebXRWalkingLocomotion protected () extends WebXRAbstractFeature {
    /**
      * Construct a new Walking Locomotion feature.
      * @param sessionManager manager for the current XR session
      * @param options creation options, prominently including the vector target for locomotion
      */
    def this(sessionManager: WebXRSessionManager, options: IWebXRWalkingLocomotionOptions) = this()
    
    /* private */ var _forward: Any = js.native
    
    /* private */ var _isLocomotionTargetWebXRCamera: Any = js.native
    
    /* private */ var _locomotionTarget: Any = js.native
    
    /* private */ var _movement: Any = js.native
    
    /* private */ var _position: Any = js.native
    
    /* private */ var _sessionManager: Any = js.native
    
    /* private */ var _up: Any = js.native
    
    /* private */ var _walker: Any = js.native
    
    /**
      * The target to be articulated by walking locomotion.
      * When the walking locomotion feature detects walking in place, this element's
      * X and Z coordinates will be modified to reflect locomotion. This target should
      * be either the XR space's origin (i.e., the parent node of the WebXRCamera) or
      * the WebXRCamera itself. Note that the WebXRCamera path will modify the position
      * of the WebXRCamera directly and is thus discouraged.
      */
    def locomotionTarget: WebXRCamera | TransformNode = js.native
    /**
      * The target to be articulated by walking locomotion.
      * When the walking locomotion feature detects walking in place, this element's
      * X and Z coordinates will be modified to reflect locomotion. This target should
      * be either the XR space's origin (i.e., the parent node of the WebXRCamera) or
      * the WebXRCamera itself. Note that the WebXRCamera path will modify the position
      * of the WebXRCamera directly and is thus discouraged.
      */
    def locomotionTarget_=(locomotionTarget: WebXRCamera | TransformNode): Unit = js.native
  }
  
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
}
