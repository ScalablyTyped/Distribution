package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRPose extends js.Object {
  val angularAcceleration: stdLib.Float32Array | scala.Null
  val angularVelocity: stdLib.Float32Array | scala.Null
  val linearAcceleration: stdLib.Float32Array | scala.Null
  val linearVelocity: stdLib.Float32Array | scala.Null
  val orientation: stdLib.Float32Array | scala.Null
  val position: stdLib.Float32Array | scala.Null
  val timestamp: scala.Double
}

object VRPose {
  @scala.inline
  def apply(
    timestamp: scala.Double,
    angularAcceleration: stdLib.Float32Array = null,
    angularVelocity: stdLib.Float32Array = null,
    linearAcceleration: stdLib.Float32Array = null,
    linearVelocity: stdLib.Float32Array = null,
    orientation: stdLib.Float32Array = null,
    position: stdLib.Float32Array = null
  ): VRPose = {
    val __obj = js.Dynamic.literal(timestamp = timestamp)
    if (angularAcceleration != null) __obj.updateDynamic("angularAcceleration")(angularAcceleration)
    if (angularVelocity != null) __obj.updateDynamic("angularVelocity")(angularVelocity)
    if (linearAcceleration != null) __obj.updateDynamic("linearAcceleration")(linearAcceleration)
    if (linearVelocity != null) __obj.updateDynamic("linearVelocity")(linearVelocity)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[VRPose]
  }
}

