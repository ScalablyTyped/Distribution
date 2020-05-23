package typings.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "FrictionEquation")
@js.native
class FrictionEquation protected ()
  extends typings.cannon.CANNON.Equation {
  def this(bi: typings.cannon.CANNON.Body, bj: typings.cannon.CANNON.Body, slipForce: Double) = this()
  /* CompleteClass */
  override var a: Double = js.native
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
  override var jacobianElementA: typings.cannon.CANNON.JacobianElement = js.native
  /* CompleteClass */
  override var jacobianElementB: typings.cannon.CANNON.JacobianElement = js.native
  /* CompleteClass */
  override var maxForce: Double = js.native
  /* CompleteClass */
  override var minForce: Double = js.native
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

