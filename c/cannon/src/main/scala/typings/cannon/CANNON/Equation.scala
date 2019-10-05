package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Equation")
@js.native
class Equation protected () extends js.Object {
  def this(bi: Body, bj: Body) = this()
  def this(bi: Body, bj: Body, minForce: Double) = this()
  def this(bi: Body, bj: Body, minForce: Double, maxForce: Double) = this()
  var a: Double = js.native
  var b: Double = js.native
  var bi: Body = js.native
  var bj: Body = js.native
  var enabled: Boolean = js.native
  var eps: Double = js.native
  var id: Double = js.native
  var jacobianElementA: JacobianElement = js.native
  var jacobianElementB: JacobianElement = js.native
  var maxForce: Double = js.native
  var minForce: Double = js.native
  def addToWlamda(deltalambda: Double): Double = js.native
  def computeB(a: Double, b: Double, h: Double): Double = js.native
  def computeC(): Double = js.native
  def computeGW(): Double = js.native
  def computeGWlamda(): Double = js.native
  def computeGiMGt(): Double = js.native
  def computeGiMf(): Double = js.native
  def computeGq(): Double = js.native
  def setSpookParams(stiffness: Double, relaxation: Double, timeStep: Double): Unit = js.native
}

