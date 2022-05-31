package typings.babylonjs

import typings.babylonjs.arcRotateCameraMod.ArcRotateCamera
import typings.babylonjs.behaviorMod.Behavior
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoRotationBehaviorMod {
  
  @JSImport("babylonjs/Behaviors/Cameras/autoRotationBehavior", "AutoRotationBehavior")
  @js.native
  class AutoRotationBehavior ()
    extends StObject
       with Behavior[ArcRotateCamera] {
    
    /**
      *  Applies any current user interaction to the camera. Takes into account maximum alpha rotation.
      */
    /* private */ var _applyUserInteraction: js.Any = js.native
    
    /* private */ var _attachedCamera: js.Any = js.native
    
    /* private */ var _cameraRotationSpeed: js.Any = js.native
    
    /* private */ var _idleRotationSpeed: js.Any = js.native
    
    /* private */ var _idleRotationSpinupTime: js.Any = js.native
    
    /* private */ var _idleRotationWaitTime: js.Any = js.native
    
    /* private */ var _isPointerDown: js.Any = js.native
    
    /* private */ var _lastFrameRadius: js.Any = js.native
    
    /* private */ var _lastFrameTime: js.Any = js.native
    
    /* private */ var _lastInteractionTime: js.Any = js.native
    
    /* private */ var _onAfterCheckInputsObserver: js.Any = js.native
    
    /* private */ var _onPrePointerObservableObserver: js.Any = js.native
    
    /* private */ var _shouldAnimationStopForInteraction: js.Any = js.native
    
    /* private */ var _userIsMoving: js.Any = js.native
    
    /**
      * Returns true if user is scrolling.
      * @return true if user is scrolling.
      */
    /* private */ var _userIsZooming: js.Any = js.native
    
    /* private */ var _zoomStopsAnimation: js.Any = js.native
    
    /**
      * Called when the behavior is attached to a target
      * @param target defines the target where the behavior is attached to
      */
    /* CompleteClass */
    override def attach(target: ArcRotateCamera): Unit = js.native
    
    /**
      * Called when the behavior is detached from its target
      */
    /* CompleteClass */
    override def detach(): Unit = js.native
    
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
      * Function called when the behavior needs to be initialized (after attaching it to a target)
      */
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /** gets or sets behavior's name */
    /* CompleteClass */
    var name: String = js.native
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
