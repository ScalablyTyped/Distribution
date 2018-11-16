package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Plane")
@js.native
class Plane () extends Shape {
  var worldNormal: Vec3 = js.native
  var worldNormalNeedsUpdate: scala.Boolean = js.native
  def calculateWorldAABB(pos: Vec3, quat: Quaternion, min: scala.Double, max: scala.Double): scala.Unit = js.native
  def computeWorldNormal(quat: Quaternion): scala.Unit = js.native
}

