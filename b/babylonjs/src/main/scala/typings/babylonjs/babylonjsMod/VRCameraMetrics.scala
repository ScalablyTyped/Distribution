package typings.babylonjs.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Cameras/index", "VRCameraMetrics")
@js.native
class VRCameraMetrics ()
  extends typings.babylonjs.vRIndexMod.VRCameraMetrics

/* static members */
@JSImport("babylonjs/Cameras/index", "VRCameraMetrics")
@js.native
object VRCameraMetrics extends js.Object {
  /**
    * Get the default VRMetrics based on the most generic setup.
    * @returns the default vr metrics
    */
  def GetDefault(): typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics = js.native
}

