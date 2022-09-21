package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRWalkingLocomotion
  extends StObject
     with WebXRAbstractFeature {
  
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
