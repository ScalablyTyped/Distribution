package typings
package cannonLib.cannonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Transform")
@js.native
class Transform ()
  extends cannonLib.CANNONNs.Transform

@JSImport("cannon", "Transform")
@js.native
object Transform extends js.Object {
  def pointToLocalFrame(
    position: cannonLib.CANNONNs.Vec3,
    quaternion: cannonLib.CANNONNs.Quaternion,
    worldPoint: cannonLib.CANNONNs.Vec3
  ): cannonLib.CANNONNs.Vec3 = js.native
  def pointToLocalFrame(
    position: cannonLib.CANNONNs.Vec3,
    quaternion: cannonLib.CANNONNs.Quaternion,
    worldPoint: cannonLib.CANNONNs.Vec3,
    result: cannonLib.CANNONNs.Vec3
  ): cannonLib.CANNONNs.Vec3 = js.native
  def pointToWorldFrame(
    position: cannonLib.CANNONNs.Vec3,
    quaternion: cannonLib.CANNONNs.Quaternion,
    localPoint: cannonLib.CANNONNs.Vec3
  ): cannonLib.CANNONNs.Vec3 = js.native
  def pointToWorldFrame(
    position: cannonLib.CANNONNs.Vec3,
    quaternion: cannonLib.CANNONNs.Quaternion,
    localPoint: cannonLib.CANNONNs.Vec3,
    result: cannonLib.CANNONNs.Vec3
  ): cannonLib.CANNONNs.Vec3 = js.native
}

