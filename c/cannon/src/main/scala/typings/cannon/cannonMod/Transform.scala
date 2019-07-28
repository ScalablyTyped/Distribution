package typings.cannon.cannonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Transform")
@js.native
class Transform ()
  extends typings.cannon.CANNONNs.Transform

/* static members */
@JSImport("cannon", "Transform")
@js.native
object Transform extends js.Object {
  def pointToLocalFrame(
    position: typings.cannon.CANNONNs.Vec3,
    quaternion: typings.cannon.CANNONNs.Quaternion,
    worldPoint: typings.cannon.CANNONNs.Vec3
  ): typings.cannon.CANNONNs.Vec3 = js.native
  def pointToLocalFrame(
    position: typings.cannon.CANNONNs.Vec3,
    quaternion: typings.cannon.CANNONNs.Quaternion,
    worldPoint: typings.cannon.CANNONNs.Vec3,
    result: typings.cannon.CANNONNs.Vec3
  ): typings.cannon.CANNONNs.Vec3 = js.native
  def pointToWorldFrame(
    position: typings.cannon.CANNONNs.Vec3,
    quaternion: typings.cannon.CANNONNs.Quaternion,
    localPoint: typings.cannon.CANNONNs.Vec3
  ): typings.cannon.CANNONNs.Vec3 = js.native
  def pointToWorldFrame(
    position: typings.cannon.CANNONNs.Vec3,
    quaternion: typings.cannon.CANNONNs.Quaternion,
    localPoint: typings.cannon.CANNONNs.Vec3,
    result: typings.cannon.CANNONNs.Vec3
  ): typings.cannon.CANNONNs.Vec3 = js.native
}

