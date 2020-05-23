package typings.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.RotationalMotorEquation")
@js.native
class RotationalMotorEquation protected ()
  extends typings.cannon.CANNON.RotationalMotorEquation {
  def this(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body) = this()
  def this(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body, maxForce: Double) = this()
  /* CompleteClass */
  override var a: Double = js.native
  /* CompleteClass */
  override var axisA: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var axisB: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var b: Double = js.native
  /* CompleteClass */
  override var bi: typings.cannon.CANNON.Body = js.native
  /* CompleteClass */
  override var bj: typings.cannon.CANNON.Body = js.native
  /* CompleteClass */
  override var enabled: Boolean = js.native
  /* CompleteClass */
  override var eps: Double = js.native
  /* CompleteClass */
  override var id: Double = js.native
  /* CompleteClass */
  override var invIj: typings.cannon.CANNON.Mat3 = js.native
  /* CompleteClass */
  override var invLi: typings.cannon.CANNON.Mat3 = js.native
  /* CompleteClass */
  override var jacobianElementA: typings.cannon.CANNON.JacobianElement = js.native
  /* CompleteClass */
  override var jacobianElementB: typings.cannon.CANNON.JacobianElement = js.native
  /* CompleteClass */
  override var maxForce: Double = js.native
  /* CompleteClass */
  override var minForce: Double = js.native
  /* CompleteClass */
  override var targetVelocity: Double = js.native
  /* CompleteClass */
  override def addToWlamda(deltalambda: Double): Double = js.native
  /* CompleteClass */
  override def computeB(a: Double, b: Double, h: Double): Double = js.native
  /* CompleteClass */
  override def computeC(): Double = js.native
  /* CompleteClass */
  override def computeGW(): Double = js.native
  /* CompleteClass */
  override def computeGWlamda(): Double = js.native
  /* CompleteClass */
  override def computeGiMGt(): Double = js.native
  /* CompleteClass */
  override def computeGiMf(): Double = js.native
  /* CompleteClass */
  override def computeGq(): Double = js.native
  /* CompleteClass */
  override def setSpookParams(stiffness: Double, relaxation: Double, timeStep: Double): Unit = js.native
}

