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
    val __obj = js.Dynamic.literal(leftProjectionMatrix = leftProjectionMatrix, leftViewMatrix = leftViewMatrix, pose = pose, rightProjectionMatrix = rightProjectionMatrix, rightViewMatrix = rightViewMatrix, timestamp = timestamp)
  
    __obj.asInstanceOf[VRFrameData]
  }
}

