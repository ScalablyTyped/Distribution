package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to modify the vr experience helper's behavior.
  */
trait VRExperienceHelperOptions extends WebVROptions {
  /**
    * Create a DeviceOrientationCamera to be used as your out of vr camera. (default: true)
    */
  var createDeviceOrientationCamera: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Create a VRDeviceOrientationFreeCamera to be used for VR when no external HMD is found. (default: true)
    */
  var createFallbackVRDeviceOrientationFreeCamera: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A list of meshes to be used as the teleportation floor. If specified, teleportation will be enabled (default: undefined)
    */
  var floorMeshes: js.UndefOr[js.Array[Mesh]] = js.undefined
  /**
    * Uses the main button on the controller to toggle the laser casted. (default: true)
    */
  var laserToggle: js.UndefOr[scala.Boolean] = js.undefined
}

