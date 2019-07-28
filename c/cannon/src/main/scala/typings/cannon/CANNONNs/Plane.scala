package typings.cannon.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Plane")
@js.native
class Plane () extends Shape {
  var worldNormal: Vec3 = js.native
  var worldNormalNeedsUpdate: Boolean = js.native
  def calculateWorldAABB(pos: Vec3, quat: Quaternion, min: Double, max: Double): Unit = js.native
  def computeWorldNormal(quat: Quaternion): Unit = js.native
}

