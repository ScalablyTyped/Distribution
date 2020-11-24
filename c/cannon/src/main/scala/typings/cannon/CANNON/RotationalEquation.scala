package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotationalEquation extends Equation {
  
  var invIi: Mat3 = js.native
  
  var invIj: Mat3 = js.native
  
  var ni: Vec3 = js.native
  
  var nixnj: Vec3 = js.native
  
  var nj: Vec3 = js.native
  
  var njxni: Vec3 = js.native
  
  var relForce: Vec3 = js.native
  
  var relVel: Vec3 = js.native
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
  
  @scala.inline
  implicit class RotationalEquationOps[Self <: RotationalEquation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInvIi(value: Mat3): Self = this.set("invIi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvIj(value: Mat3): Self = this.set("invIj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNi(value: Vec3): Self = this.set("ni", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNixnj(value: Vec3): Self = this.set("nixnj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNj(value: Vec3): Self = this.set("nj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNjxni(value: Vec3): Self = this.set("njxni", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelForce(value: Vec3): Self = this.set("relForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelVel(value: Vec3): Self = this.set("relVel", value.asInstanceOf[js.Any])
  }
}
