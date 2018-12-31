package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a camera specifically designed to react to device orientation events such as a modern mobile device
  * being tilted forward or back and left or right.
  */
@JSImport("babylonjs", "DeviceOrientationCamera")
@js.native
class DeviceOrientationCamera protected ()
  extends babylonjsLib.BABYLONNs.DeviceOrientationCamera {
  /**
    * Creates a new device orientation camera
    * @param name The name of the camera
    * @param position The start position camera
    * @param scene The scene the camera belongs to
    */
  def this(name: java.lang.String, position: babylonjsLib.BABYLONNs.Vector3, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

