package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoRotationBehavior
  extends StObject
     with Behavior[ArcRotateCamera] {
  
  /**
    *  Applies any current user interaction to the camera. Takes into account maximum alpha rotation.
    */
  /* private */ var _applyUserInteraction: Any = js.native
  
  /* private */ var _attachedCamera: Any = js.native
  
  /* private */ var _cameraRotationSpeed: Any = js.native
  
  /* private */ var _idleRotationSpeed: Any = js.native
  
  /* private */ var _idleRotationSpinupTime: Any = js.native
  
  /* private */ var _idleRotationWaitTime: Any = js.native
  
  /* private */ var _isPointerDown: Any = js.native
  
  /* private */ var _lastFrameRadius: Any = js.native
  
  /* private */ var _lastFrameTime: Any = js.native
  
  /* private */ var _lastInteractionTime: Any = js.native
  
  /* private */ var _onAfterCheckInputsObserver: Any = js.native
  
  /* private */ var _onPrePointerObservableObserver: Any = js.native
  
  /**
    * Returns true if camera alpha reaches the target alpha
    * @returns true if camera alpha reaches the target alpha
    */
  /* private */ var _reachTargetAlpha: Any = js.native
  
  /* private */ var _shouldAnimationStopForInteraction: Any = js.native
  
  /* private */ var _userIsMoving: Any = js.native
  
  /**
    * Returns true if user is scrolling.
    * @returns true if user is scrolling.
    */
  /* private */ var _userIsZooming: Any = js.native
  
  /* private */ var _zoomStopsAnimation: Any = js.native
  
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
    * Force-reset the last interaction time
    * @param customTime an optional time that will be used instead of the current last interaction time. For example `Date.now()`
    */
  def resetLastInteractionTime(): Unit = js.native
  def resetLastInteractionTime(customTime: Double): Unit = js.native
  
  /**
    * Gets a value indicating if the camera is currently rotating because of this behavior
    */
  def rotationInProgress: Boolean = js.native
  
  var targetAlpha: Nullable[Double] = js.native
  
  /**
    * Gets the flag that indicates if user zooming should stop animation.
    */
  def zoomStopsAnimation: Boolean = js.native
  /**
    * Sets the flag that indicates if user zooming should stop animation.
    */
  def zoomStopsAnimation_=(flag: Boolean): Unit = js.native
}
