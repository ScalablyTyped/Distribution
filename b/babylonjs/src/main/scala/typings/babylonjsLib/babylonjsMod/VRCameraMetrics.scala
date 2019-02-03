package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents all the required metrics to create a VR camera.
  * @see http://doc.babylonjs.com/babylon101/cameras#device-orientation-camera
  */
@JSImport("babylonjs", "VRCameraMetrics")
@js.native
class VRCameraMetrics ()
  extends babylonjsLib.BABYLONNs.VRCameraMetrics

/* static members */
@JSImport("babylonjs", "VRCameraMetrics")
@js.native
object VRCameraMetrics extends js.Object {
  /**
    * Get the default VRMetrics based on the most generic setup.
    * @returns the default vr metrics
    */
  def GetDefault(): babylonjsLib.BABYLONNs.VRCameraMetrics = js.native
}

