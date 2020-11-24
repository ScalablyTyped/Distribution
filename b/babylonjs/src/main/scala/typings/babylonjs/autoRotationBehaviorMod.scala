package typings.babylonjs

import typings.babylonjs.arcRotateCameraMod.ArcRotateCamera
import typings.babylonjs.behaviorMod.Behavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Behaviors/Cameras/autoRotationBehavior", JSImport.Namespace)
@js.native
object autoRotationBehaviorMod extends js.Object {
  
  @js.native
  class AutoRotationBehavior () extends Behavior[ArcRotateCamera] {
    
    /**
      *  Applies any current user interaction to the camera. Takes into account maximum alpha rotation.
      */
    var _applyUserInteraction: js.Any = js.native
    
    var _attachedCamera: js.Any = js.native
    
    var _cameraRotationSpeed: js.Any = js.native
    
    var _idleRotationSpeed: js.Any = js.native
    
    var _idleRotationSpinupTime: js.Any = js.native
    
    var _idleRotationWaitTime: js.Any = js.native
    
    var _isPointerDown: js.Any = js.native
    
    var _lastFrameRadius: js.Any = js.native
    
    var _lastFrameTime: js.Any = js.native
    
    var _lastInteractionTime: js.Any = js.native
    
    var _onAfterCheckInputsObserver: js.Any = js.native
    
    var _onPrePointerObservableObserver: js.Any = js.native
    
    var _shouldAnimationStopForInteraction: js.Any = js.native
    
    var _userIsMoving: js.Any = js.native
    
    /**
      * Returns true if user is scrolling.
      * @return true if user is scrolling.
      */
    var _userIsZooming: js.Any = js.native
    
    var _zoomStopsAnimation: js.Any = js.native
    
    /**
      * Gets the default speed at which the camera rotates around the model.
      */
    def idleRotationSpeed: Double = js.native
    /**
      * Sets the default speed at which the camera rotates around the model.
      */
    def idleRotationSpeed_=(speed: Double): Unit = js.native
    
    /**
      * Gets the time (milliseconds) to take to spin up to the full idle rotation speed.
      */
    def idleRotationSpinupTime: Double = js.native
    /**
      * Sets the time (milliseconds) to take to spin up to the full idle rotation speed.
      */
    def idleRotationSpinupTime_=(time: Double): Unit = js.native
    
    /**
      * Gets the time (milliseconds) to wait after user interaction before the camera starts rotating.
      */
    def idleRotationWaitTime: Double = js.native
    /**
      * Sets the time (in milliseconds) to wait after user interaction before the camera starts rotating.
      */
    def idleRotationWaitTime_=(time: Double): Unit = js.native
    
    /**
      * Gets the name of the behavior.
      */
    @JSName("name")
    def name_MAutoRotationBehavior: String = js.native
    
    /**
      * Gets a value indicating if the camera is currently rotating because of this behavior
      */
    def rotationInProgress: Boolean = js.native
    
    /**
      * Gets the flag that indicates if user zooming should stop animation.
      */
    def zoomStopsAnimation: Boolean = js.native
    /**
      * Sets the flag that indicates if user zooming should stop animation.
      */
    def zoomStopsAnimation_=(flag: Boolean): Unit = js.native
  }
}
