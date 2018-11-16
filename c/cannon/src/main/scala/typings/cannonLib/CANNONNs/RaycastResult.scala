package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.RaycastResult")
@js.native
class RaycastResult () extends js.Object {
  var body: Body = js.native
  var distance: scala.Double = js.native
  var hasHit: scala.Boolean = js.native
  var hitNormalWorld: Vec3 = js.native
  var hitPointWorld: Vec3 = js.native
  var rayFromWorld: Vec3 = js.native
  var rayToWorld: Vec3 = js.native
  var shape: Shape = js.native
  def reset(): scala.Unit = js.native
  def set(
    rayFromWorld: Vec3,
    rayToWorld: Vec3,
    hitNormalWorld: Vec3,
    hitPointWorld: Vec3,
    shape: Shape,
    body: Body,
    distance: scala.Double
  ): scala.Unit = js.native
}

