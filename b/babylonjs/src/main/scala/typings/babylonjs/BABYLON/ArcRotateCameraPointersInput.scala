package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ArcRotateCameraPointersInput")
@js.native
class ArcRotateCameraPointersInput () extends BaseCameraPointersInput {
  var _isPanClick: js.Any = js.native
  var _isPinching: js.Any = js.native
  var _twoFingerActivityCount: js.Any = js.native
  /**
    * Defines the pointer angular sensibility  along the X axis or how fast is
    * the camera rotating.
    */
  var angularSensibilityX: Double = js.native
  /**
    * Defines the pointer angular sensibility along the Y axis or how fast is
    * the camera rotating.
    */
  var angularSensibilityY: Double = js.native
  /**
    * Defines the camera the input is attached to.
    */
  @JSName("camera")
  var camera_ArcRotateCameraPointersInput: ArcRotateCamera = js.native
  /**
    * Defines whether panning is enabled for both pan (2 fingers swipe) and
    * zoom (pinch) through multitouch.
    */
  var multiTouchPanAndZoom: Boolean = js.native
  /**
    * Defines whether panning (2 fingers swipe) is enabled through multitouch.
    */
  var multiTouchPanning: Boolean = js.native
  /**
    * Defines the pointer panning sensibility or how fast is the camera moving.
    */
  var panningSensibility: Double = js.native
  /**
    * pinchDeltaPercentage will be used instead of pinchPrecision if different
    * from 0.
    * It defines the percentage of current camera.radius to use as delta when
    * pinch zoom is used.
    */
  var pinchDeltaPercentage: Double = js.native
  /**
    * Revers pinch action direction.
    */
  var pinchInwards: Boolean = js.native
  /**
    * Defines the pointer pinch precision or how fast is the camera zooming.
    */
  var pinchPrecision: Double = js.native
  /**
    * When useNaturalPinchZoom is true, multi touch zoom will zoom in such
    * that any object in the plane at the camera's target point will scale
    * perfectly with finger motion.
    * Overrides pinchDeltaPercentage and pinchPrecision.
    */
  var useNaturalPinchZoom: Boolean = js.native
}

