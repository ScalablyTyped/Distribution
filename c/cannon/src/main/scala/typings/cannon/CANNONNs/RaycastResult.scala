package typings.cannon.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.RaycastResult")
@js.native
class RaycastResult () extends js.Object {
  var body: Body = js.native
  var distance: Double = js.native
  var hasHit: Boolean = js.native
  var hitNormalWorld: Vec3 = js.native
  var hitPointWorld: Vec3 = js.native
  var rayFromWorld: Vec3 = js.native
  var rayToWorld: Vec3 = js.native
  var shape: Shape = js.native
  def reset(): Unit = js.native
  def set(
    rayFromWorld: Vec3,
    rayToWorld: Vec3,
    hitNormalWorld: Vec3,
    hitPointWorld: Vec3,
    shape: Shape,
    body: Body,
    distance: Double
  ): Unit = js.native
}

