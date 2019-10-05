package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.RotationalMotorEquation")
@js.native
class RotationalMotorEquation protected () extends Equation {
  def this(bodyA: Body, bodyB: Body) = this()
  def this(bodyA: Body, bodyB: Body, maxForce: Double) = this()
  var axisA: Vec3 = js.native
  var axisB: Vec3 = js.native
  var invIj: Mat3 = js.native
  var invLi: Mat3 = js.native
  var targetVelocity: Double = js.native
}

