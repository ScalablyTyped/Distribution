package typings.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "ContactEquation")
@js.native
class ContactEquation protected ()
  extends typings.cannon.CANNON.ContactEquation {
  def this(bi: typings.cannon.CANNON.Body, bj: typings.cannon.CANNON.Body) = this()
  /* CompleteClass */
  override var a: Double = js.native
  /* CompleteClass */
  override var b: Double = js.native
  /* CompleteClass */
  override var bi: typings.cannon.CANNON.Body = js.native
  /* CompleteClass */
  override var biInvInertiaTimesRixn: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var bj: typings.cannon.CANNON.Body = js.native
  /* CompleteClass */
  override var bjInvInertiaTimesRjxn: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var enabled: Boolean = js.native
  /* CompleteClass */
  override var eps: Double = js.native
  /* CompleteClass */
  override var id: Double = js.native
  /* CompleteClass */
  override var invIi: typings.cannon.CANNON.Mat3 = js.native
  /* CompleteClass */
  override var invIj: typings.cannon.CANNON.Mat3 = js.native
  /* CompleteClass */
  override var jacobianElementA: typings.cannon.CANNON.JacobianElement = js.native
  /* CompleteClass */
  override var jacobianElementB: typings.cannon.CANNON.JacobianElement = js.native
  /* CompleteClass */
  override var maxForce: Double = js.native
  /* CompleteClass */
  override var minForce: Double = js.native
  /* CompleteClass */
  override var ni: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var penetrationVec: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var restitution: Double = js.native
  /* CompleteClass */
  override var ri: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var rixn: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var rj: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var rjxn: typings.cannon.CANNON.Vec3 = js.native
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

