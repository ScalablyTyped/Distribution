package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a camera specifically designed to react to device orientation events such as a modern mobile device
  * being tilted forward or back and left or right.
  */
@JSGlobal("BABYLON.DeviceOrientationCamera")
@js.native
class DeviceOrientationCamera protected () extends FreeCamera {
  /**
    * Creates a new device orientation camera
    * @param name The name of the camera
    * @param position The start position camera
    * @param scene The scene the camera belongs to
    */
  def this(name: java.lang.String, position: Vector3, scene: Scene) = this()
  var _initialQuaternion: js.Any = js.native
  var _quaternionCache: js.Any = js.native
  /**
    * Reset the camera to its default orientation on the specified axis only.
    * @param axis The axis to reset
    */
  def resetToCurrentRotation(): scala.Unit = js.native
  def resetToCurrentRotation(axis: Axis): scala.Unit = js.native
}

