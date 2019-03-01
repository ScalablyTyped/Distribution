package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRFrameData extends js.Object {
  val leftProjectionMatrix: stdLib.Float32Array
  val leftViewMatrix: stdLib.Float32Array
  val pose: VRPose
  val rightProjectionMatrix: stdLib.Float32Array
  val rightViewMatrix: stdLib.Float32Array
  val timestamp: scala.Double
}

object VRFrameData {
  @scala.inline
  def apply(
    leftProjectionMatrix: stdLib.Float32Array,
    leftViewMatrix: stdLib.Float32Array,
    pose: VRPose,
    rightProjectionMatrix: stdLib.Float32Array,
    rightViewMatrix: stdLib.Float32Array,
    timestamp: scala.Double
  ): VRFrameData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("leftProjectionMatrix")(leftProjectionMatrix)
    __obj.updateDynamic("leftViewMatrix")(leftViewMatrix)
    __obj.updateDynamic("pose")(pose)
    __obj.updateDynamic("rightProjectionMatrix")(rightProjectionMatrix)
    __obj.updateDynamic("rightViewMatrix")(rightViewMatrix)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[VRFrameData]
  }
}

