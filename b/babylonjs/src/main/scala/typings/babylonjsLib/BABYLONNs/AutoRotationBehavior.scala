package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The autoRotation behavior (BABYLON.AutoRotationBehavior) is designed to create a smooth rotation of an ArcRotateCamera when there is no user interaction.
     * @see http://doc.babylonjs.com/how_to/camera_behaviors#autorotation-behavior
     */
@JSGlobal("BABYLON.AutoRotationBehavior")
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
          * Sets the default speed at which the camera rotates around the model.
          */
  /**
          * Gets the default speed at which the camera rotates around the model.
          */
  var idleRotationSpeed: scala.Double = js.native
  /**
          * Sets the time (milliseconds) to take to spin up to the full idle rotation speed.
          */
  /**
          * Gets the time (milliseconds) to take to spin up to the full idle rotation speed.
          */
  var idleRotationSpinupTime: scala.Double = js.native
  /**
          * Sets the time (in milliseconds) to wait after user interaction before the camera starts rotating.
          */
  /**
          * Gets the time (milliseconds) to wait after user interaction before the camera starts rotating.
          */
  var idleRotationWaitTime: scala.Double = js.native
  /** gets or sets behavior's name */
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
           * Gets a value indicating if the camera is currently rotating because of this behavior
           */
  val rotationInProgress: scala.Boolean = js.native
  /**
          * Sets the flag that indicates if user zooming should stop animation.
          */
  /**
          * Gets the flag that indicates if user zooming should stop animation.
          */
  var zoomStopsAnimation: scala.Boolean = js.native
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
}

