package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Manage the pointers inputs to control an arc rotate camera.
     * @see http://doc.babylonjs.com/how_to/customizing_camera_inputs
     */
@JSGlobal("BABYLON.ArcRotateCameraPointersInput")
@js.native
class ArcRotateCameraPointersInput () extends ICameraInput[ArcRotateCamera] {
  var _MSGestureHandler: js.Any = js.native
  var _isPanClick: js.Any = js.native
  var _observer: js.Any = js.native
  var _onContextMenu: js.Any = js.native
  var _onGesture: js.Any = js.native
  var _onGestureStart: js.Any = js.native
  var _onLostFocus: js.Any = js.native
  var _onMouseMove: js.Any = js.native
  var _pointerInput: js.Any = js.native
  /**
           * Defines the pointer angular sensibility  along the X axis or how fast is the camera rotating.
           */
  var angularSensibilityX: scala.Double = js.native
  /**
           * Defines the pointer angular sensibility along the Y axis or how fast is the camera rotating.
           */
  var angularSensibilityY: scala.Double = js.native
  /**
           * Defines the buttons associated with the input to handle camera move.
           */
  var buttons: js.Array[scala.Double] = js.native
  /**
           * Defines the camera the input is attached to.
           */
  @JSName("camera")
  var camera_ArcRotateCameraPointersInput: ArcRotateCamera = js.native
  /**
           * Defines whether panning is enabled for both pan (2 fingers swipe) and zoom (pinch) through multitouch.
           */
  var multiTouchPanAndZoom: scala.Boolean = js.native
  /**
           * Defines whether panning (2 fingers swipe) is enabled through multitouch.
           */
  var multiTouchPanning: scala.Boolean = js.native
  /**
           * Defines the pointer panning sensibility or how fast is the camera moving.
           */
  var panningSensibility: scala.Double = js.native
  /**
           * pinchDeltaPercentage will be used instead of pinchPrecision if different from 0.
           * It defines the percentage of current camera.radius to use as delta when pinch zoom is used.
           */
  var pinchDeltaPercentage: scala.Double = js.native
  /**
           * Revers pinch action direction.
           */
  var pinchInwards: scala.Boolean = js.native
  /**
           * Defines the pointer pinch precision or how fast is the camera zooming.
           */
  var pinchPrecision: scala.Double = js.native
}

