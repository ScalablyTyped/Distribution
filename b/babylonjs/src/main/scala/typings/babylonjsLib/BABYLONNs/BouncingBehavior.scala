package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Add a bouncing effect to an ArcRotateCamera when reaching a specified minimum and maximum radius
  * @see http://doc.babylonjs.com/how_to/camera_behaviors#bouncing-behavior
  */
@JSGlobal("BABYLON.BouncingBehavior")
@js.native
class BouncingBehavior () extends Behavior[ArcRotateCamera] {
  var _animatables: js.Any = js.native
  /**
    * Applies an animation to the radius of the camera, extending by the radiusDelta.
    * @param radiusDelta The delta by which to animate to. Can be negative.
    */
  var _applyBoundRadiusAnimation: js.Any = js.native
  var _attachedCamera: js.Any = js.native
  var _autoTransitionRange: js.Any = js.native
  var _cachedWheelPrecision: js.Any = js.native
  /**
    * Checks if the camera radius is at the specified limit. Takes into account animation locks.
    * @param radiusLimit The limit to check against.
    * @return Bool to indicate if at limit.
    */
  var _isRadiusAtLimit: js.Any = js.native
  var _onAfterCheckInputsObserver: js.Any = js.native
  var _onMeshTargetChangedObserver: js.Any = js.native
  var _radiusBounceTransition: js.Any = js.native
  var _radiusIsAnimating: js.Any = js.native
  /**
    * Gets a value indicating if the lowerRadiusTransitionRange and upperRadiusTransitionRange are defined automatically
    */
  /**
    * Sets a value indicating if the lowerRadiusTransitionRange and upperRadiusTransitionRange are defined automatically
    * Transition ranges will be set to 5% of the bounding box diagonal in world space
    */
  var autoTransitionRange: scala.Boolean = js.native
  /**
    * Length of the distance animated by the transition when lower radius is reached
    */
  var lowerRadiusTransitionRange: scala.Double = js.native
  /** gets or sets behavior's name */
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
    * The duration of the animation, in milliseconds
    */
  var transitionDuration: scala.Double = js.native
  /**
    * Length of the distance animated by the transition when upper radius is reached
    */
  var upperRadiusTransitionRange: scala.Double = js.native
  /**
    * Removes all animation locks. Allows new animations to be added to any of the camera properties.
    */
  /* protected */ def _clearAnimationLocks(): scala.Unit = js.native
  /**
    * Called when the behavior is attached to a target
    * @param target defines the target where the behavior is attached to
    */
  /* CompleteClass */
  override def attach(target: ArcRotateCamera): scala.Unit = js.native
  /**
    * Called when the behavior is detached from its target
    */
  /* CompleteClass */
  override def detach(): scala.Unit = js.native
  /**
    * Function called when the behavior needs to be initialized (after attaching it to a target)
    */
  /* CompleteClass */
  override def init(): scala.Unit = js.native
  /**
    * Stops and removes all animations that have been applied to the camera
    */
  def stopAllAnimations(): scala.Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.BouncingBehavior")
@js.native
object BouncingBehavior extends js.Object {
  /**
    * The easing function used by animations
    */
  var EasingFunction: babylonjsLib.BABYLONNs.BackEase = js.native
  /**
    * The easing mode used by animations
    */
  var EasingMode: scala.Double = js.native
}

