package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotationalMotorEquation extends Equation {
  var axisA: Vec3
  var axisB: Vec3
  var invIj: Mat3
  var invLi: Mat3
  var targetVelocity: Double
}

object RotationalMotorEquation {
  @scala.inline
  def apply(
    a: Double,
    addToWlamda: Double => Double,
    axisA: Vec3,
    axisB: Vec3,
    b: Double,
    bi: Body,
    bj: Body,
    computeB: (Double, Double, Double) => Double,
    computeC: () => Double,
    computeGW: () => Double,
    computeGWlamda: () => Double,
    computeGiMGt: () => Double,
    computeGiMf: () => Double,
    computeGq: () => Double,
    enabled: Boolean,
    eps: Double,
    id: Double,
    invIj: Mat3,
    invLi: Mat3,
    jacobianElementA: JacobianElement,
    jacobianElementB: JacobianElement,
    maxForce: Double,
    minForce: Double,
    setSpookParams: (Double, Double, Double) => Unit,
    targetVelocity: Double
  ): RotationalMotorEquation = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], addToWlamda = js.Any.fromFunction1(addToWlamda), axisA = axisA.asInstanceOf[js.Any], axisB = axisB.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], bi = bi.asInstanceOf[js.Any], bj = bj.asInstanceOf[js.Any], computeB = js.Any.fromFunction3(computeB), computeC = js.Any.fromFunction0(computeC), computeGW = js.Any.fromFunction0(computeGW), computeGWlamda = js.Any.fromFunction0(computeGWlamda), computeGiMGt = js.Any.fromFunction0(computeGiMGt), computeGiMf = js.Any.fromFunction0(computeGiMf), computeGq = js.Any.fromFunction0(computeGq), enabled = enabled.asInstanceOf[js.Any], eps = eps.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invIj = invIj.asInstanceOf[js.Any], invLi = invLi.asInstanceOf[js.Any], jacobianElementA = jacobianElementA.asInstanceOf[js.Any], jacobianElementB = jacobianElementB.asInstanceOf[js.Any], maxForce = maxForce.asInstanceOf[js.Any], minForce = minForce.asInstanceOf[js.Any], setSpookParams = js.Any.fromFunction3(setSpookParams), targetVelocity = targetVelocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationalMotorEquation]
  }
}

