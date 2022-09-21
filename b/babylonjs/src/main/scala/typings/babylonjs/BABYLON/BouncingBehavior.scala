package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BouncingBehavior
  extends StObject
     with Behavior[ArcRotateCamera] {
  
  /* private */ var _animatables: Any = js.native
  
  /**
    * Applies an animation to the radius of the camera, extending by the radiusDelta.
    * @param radiusDelta The delta by which to animate to. Can be negative.
    */
  /* private */ var _applyBoundRadiusAnimation: Any = js.native
  
  /* private */ var _attachedCamera: Any = js.native
  
  /* private */ var _autoTransitionRange: Any = js.native
  
  /* private */ var _cachedWheelPrecision: Any = js.native
  
  /**
    * Removes all animation locks. Allows new animations to be added to any of the camera properties.
    */
  /* protected */ def _clearAnimationLocks(): Unit = js.native
  
  /**
    * Checks if the camera radius is at the specified limit. Takes into account animation locks.
    * @param radiusLimit The limit to check against.
    * @returns Bool to indicate if at limit.
    */
  /* private */ var _isRadiusAtLimit: Any = js.native
  
  /* private */ var _onAfterCheckInputsObserver: Any = js.native
  
  /* private */ var _onMeshTargetChangedObserver: Any = js.native
  
  /* private */ var _radiusBounceTransition: Any = js.native
  
  /* private */ var _radiusIsAnimating: Any = js.native
  
  /**
    * Gets a value indicating if the lowerRadiusTransitionRange and upperRadiusTransitionRange are defined automatically
    */
  def autoTransitionRange: Boolean = js.native
  /**
    * Sets a value indicating if the lowerRadiusTransitionRange and upperRadiusTransitionRange are defined automatically
    * Transition ranges will be set to 5% of the bounding box diagonal in world space
    */
  def autoTransitionRange_=(value: Boolean): Unit = js.native
  
  /**
    * Length of the distance animated by the transition when lower radius is reached
    */
  var lowerRadiusTransitionRange: Double = js.native
  
  /**
    * Gets the name of the behavior.
    */
  @JSName("name")
  def name_MBouncingBehavior: String = js.native
  
  /**
    * Stops and removes all animations that have been applied to the camera
    */
  def stopAllAnimations(): Unit = js.native
  
  /**
    * The duration of the animation, in milliseconds
    */
  var transitionDuration: Double = js.native
  
  /**
    * Length of the distance animated by the transition when upper radius is reached
    */
  var upperRadiusTransitionRange: Double = js.native
}
