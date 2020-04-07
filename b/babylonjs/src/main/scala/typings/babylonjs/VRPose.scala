package typings.babylonjs

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRPose extends js.Object {
  val angularAcceleration: Float32Array | Null
  val angularVelocity: Float32Array | Null
  val linearAcceleration: Float32Array | Null
  val linearVelocity: Float32Array | Null
  val orientation: Float32Array | Null
  val position: Float32Array | Null
  val timestamp: Double
}

object VRPose {
  @scala.inline
  def apply(
    timestamp: Double,
    angularAcceleration: Float32Array = null,
    angularVelocity: Float32Array = null,
    linearAcceleration: Float32Array = null,
    linearVelocity: Float32Array = null,
    orientation: Float32Array = null,
    position: Float32Array = null
  ): VRPose = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    if (angularAcceleration != null) __obj.updateDynamic("angularAcceleration")(angularAcceleration.asInstanceOf[js.Any])
    if (angularVelocity != null) __obj.updateDynamic("angularVelocity")(angularVelocity.asInstanceOf[js.Any])
    if (linearAcceleration != null) __obj.updateDynamic("linearAcceleration")(linearAcceleration.asInstanceOf[js.Any])
    if (linearVelocity != null) __obj.updateDynamic("linearVelocity")(linearVelocity.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRPose]
  }
}

