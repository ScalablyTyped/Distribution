package typings.cannon.CANNONNs

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

/* static members */
@JSGlobal("CANNON.Transform")
@js.native
object Transform extends js.Object {
  def pointToLocalFrame(position: Vec3, quaternion: Quaternion, worldPoint: Vec3): Vec3 = js.native
  def pointToLocalFrame(position: Vec3, quaternion: Quaternion, worldPoint: Vec3, result: Vec3): Vec3 = js.native
  def pointToWorldFrame(position: Vec3, quaternion: Quaternion, localPoint: Vec3): Vec3 = js.native
  def pointToWorldFrame(position: Vec3, quaternion: Quaternion, localPoint: Vec3, result: Vec3): Vec3 = js.native
}

