package typings.cannon.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.RotationalEquation")
@js.native
class RotationalEquation protected () extends Equation {
  def this(bodyA: Body, bodyB: Body) = this()
  var invIi: Mat3 = js.native
  var invIj: Mat3 = js.native
  var ni: Vec3 = js.native
  var nixnj: Vec3 = js.native
  var nj: Vec3 = js.native
  var njxni: Vec3 = js.native
  var relForce: Vec3 = js.native
  var relVel: Vec3 = js.native
}

