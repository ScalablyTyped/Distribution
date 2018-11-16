package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Transform")
@js.native
class Transform () extends js.Object {
  var position: Vec3 = js.native
  var quaternion: Quaternion = js.native
  def vectorToLocalFrame(position: Vec3, quaternion: Quaternion, worldVector: Vec3): Vec3 = js.native
  def vectorToLocalFrame(position: Vec3, quaternion: Quaternion, worldVector: Vec3, result: Vec3): Vec3 = js.native
  def vectorToWorldFrame(localVector: Vec3): Vec3 = js.native
  def vectorToWorldFrame(localVector: Vec3, result: Vec3): Vec3 = js.native
}

@JSGlobal("CANNON.Transform")
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

