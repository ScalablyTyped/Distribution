package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotationalEquation extends Equation {
  var invIi: Mat3
  var invIj: Mat3
  var ni: Vec3
  var nixnj: Vec3
  var nj: Vec3
  var njxni: Vec3
  var relForce: Vec3
  var relVel: Vec3
}

object RotationalEquation {
  @scala.inline
  def apply(
    a: Double,
    addToWlamda: Double => Double,
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
    invIi: Mat3,
    invIj: Mat3,
    jacobianElementA: JacobianElement,
    jacobianElementB: JacobianElement,
    maxForce: Double,
    minForce: Double,
    ni: Vec3,
    nixnj: Vec3,
    nj: Vec3,
    njxni: Vec3,
    relForce: Vec3,
    relVel: Vec3,
    setSpookParams: (Double, Double, Double) => Unit
  ): RotationalEquation = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], addToWlamda = js.Any.fromFunction1(addToWlamda), b = b.asInstanceOf[js.Any], bi = bi.asInstanceOf[js.Any], bj = bj.asInstanceOf[js.Any], computeB = js.Any.fromFunction3(computeB), computeC = js.Any.fromFunction0(computeC), computeGW = js.Any.fromFunction0(computeGW), computeGWlamda = js.Any.fromFunction0(computeGWlamda), computeGiMGt = js.Any.fromFunction0(computeGiMGt), computeGiMf = js.Any.fromFunction0(computeGiMf), computeGq = js.Any.fromFunction0(computeGq), enabled = enabled.asInstanceOf[js.Any], eps = eps.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invIi = invIi.asInstanceOf[js.Any], invIj = invIj.asInstanceOf[js.Any], jacobianElementA = jacobianElementA.asInstanceOf[js.Any], jacobianElementB = jacobianElementB.asInstanceOf[js.Any], maxForce = maxForce.asInstanceOf[js.Any], minForce = minForce.asInstanceOf[js.Any], ni = ni.asInstanceOf[js.Any], nixnj = nixnj.asInstanceOf[js.Any], nj = nj.asInstanceOf[js.Any], njxni = njxni.asInstanceOf[js.Any], relForce = relForce.asInstanceOf[js.Any], relVel = relVel.asInstanceOf[js.Any], setSpookParams = js.Any.fromFunction3(setSpookParams))
    __obj.asInstanceOf[RotationalEquation]
  }
}

