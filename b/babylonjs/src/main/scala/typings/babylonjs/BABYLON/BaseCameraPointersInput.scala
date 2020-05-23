package typings.babylonjs.BABYLON

import typings.std.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseCameraPointersInput extends ICameraInput[Camera] {
  /**
    * Whether keyboard modifier keys are pressed at time of last mouse event.
    */
  var _altKey: Boolean = js.native
  /**
    * Which mouse buttons were pressed at time of last mouse event.
    * https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent/buttons
    */
  var _buttonsPressed: Double = js.native
  var _ctrlKey: Boolean = js.native
  var _metaKey: Boolean = js.native
  var _observer: js.Any = js.native
  var _onLostFocus: js.Any = js.native
  var _pointerInput: js.Any = js.native
  var _shiftKey: Boolean = js.native
  /**
    * Defines the buttons associated with the input to handle camera move.
    */
  var buttons: js.Array[Double] = js.native
  /**
    * Defines the camera the input is attached to.
    */
  @JSName("camera")
  var camera_BaseCameraPointersInput: Camera = js.native
  var pointA: js.Any = js.native
  var pointB: js.Any = js.native
  /**
    * Called each time a new POINTERDOWN event occurs. Ie, for each button
    * press.
    * Override this method to provide functionality.
    */
  /* protected */ def onButtonDown(evt: PointerEvent): Unit = js.native
  /**
    * Called each time a new POINTERUP event occurs. Ie, for each button
    * release.
    * Override this method to provide functionality.
    */
  /* protected */ def onButtonUp(evt: PointerEvent): Unit = js.native
  /**
    * Called on JS contextmenu event.
    * Override this method to provide functionality.
    */
  /* protected */ def onContextMenu(evt: PointerEvent): Unit = js.native
  /**
    * Called on pointer POINTERDOUBLETAP event.
    * Override this method to provide functionality on POINTERDOUBLETAP event.
    */
  /* protected */ def onDoubleTap(`type`: String): Unit = js.native
  /**
    * Called when window becomes inactive.
    * Override this method to provide functionality.
    */
  /* protected */ def onLostFocus(): Unit = js.native
  /**
    * Called on pointer POINTERMOVE event if multiple touches are active.
    * Override this method to provide functionality.
    */
  /* protected */ def onMultiTouch(
    pointA: Nullable[PointerTouch],
    pointB: Nullable[PointerTouch],
    previousPinchSquaredDistance: Double,
    pinchSquaredDistance: Double,
    previousMultiTouchPanPosition: Nullable[PointerTouch],
    multiTouchPanPosition: Nullable[PointerTouch]
  ): Unit = js.native
  /**
    * Called on pointer POINTERMOVE event if only a single touch is active.
    * Override this method to provide functionality.
    */
  /* protected */ def onTouch(point: Nullable[PointerTouch], offsetX: Double, offsetY: Double): Unit = js.native
}

