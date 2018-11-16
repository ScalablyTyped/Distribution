package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Equation")
@js.native
class Equation protected () extends js.Object {
  def this(bi: Body, bj: Body) = this()
  def this(bi: Body, bj: Body, minForce: scala.Double) = this()
  def this(bi: Body, bj: Body, minForce: scala.Double, maxForce: scala.Double) = this()
  var a: scala.Double = js.native
  var b: scala.Double = js.native
  var bi: Body = js.native
  var bj: Body = js.native
  var enabled: scala.Boolean = js.native
  var eps: scala.Double = js.native
  var id: scala.Double = js.native
  var jacobianElementA: JacobianElement = js.native
  var jacobianElementB: JacobianElement = js.native
  var maxForce: scala.Double = js.native
  var minForce: scala.Double = js.native
  def addToWlamda(deltalambda: scala.Double): scala.Double = js.native
  def computeB(a: scala.Double, b: scala.Double, h: scala.Double): scala.Double = js.native
  def computeC(): scala.Double = js.native
  def computeGW(): scala.Double = js.native
  def computeGWlamda(): scala.Double = js.native
  def computeGiMGt(): scala.Double = js.native
  def computeGiMf(): scala.Double = js.native
  def computeGq(): scala.Double = js.native
  def setSpookParams(stiffness: scala.Double, relaxation: scala.Double, timeStep: scala.Double): scala.Unit = js.native
}

