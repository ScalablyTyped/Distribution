package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Equation extends js.Object {
  
  var a: Double = js.native
  
  def addToWlamda(deltalambda: Double): Double = js.native
  
  var b: Double = js.native
  
  var bi: Body = js.native
  
  var bj: Body = js.native
  
  def computeB(a: Double, b: Double, h: Double): Double = js.native
  
  def computeC(): Double = js.native
  
  def computeGW(): Double = js.native
  
  def computeGWlamda(): Double = js.native
  
  def computeGiMGt(): Double = js.native
  
  def computeGiMf(): Double = js.native
  
  def computeGq(): Double = js.native
  
  var enabled: Boolean = js.native
  
  var eps: Double = js.native
  
  var id: Double = js.native
  
  var jacobianElementA: JacobianElement = js.native
  
  var jacobianElementB: JacobianElement = js.native
  
  var maxForce: Double = js.native
  
  var minForce: Double = js.native
  
  def setSpookParams(stiffness: Double, relaxation: Double, timeStep: Double): Unit = js.native
}
object Equation {
  
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
    jacobianElementA: JacobianElement,
    jacobianElementB: JacobianElement,
    maxForce: Double,
    minForce: Double,
    setSpookParams: (Double, Double, Double) => Unit
  ): Equation = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], addToWlamda = js.Any.fromFunction1(addToWlamda), b = b.asInstanceOf[js.Any], bi = bi.asInstanceOf[js.Any], bj = bj.asInstanceOf[js.Any], computeB = js.Any.fromFunction3(computeB), computeC = js.Any.fromFunction0(computeC), computeGW = js.Any.fromFunction0(computeGW), computeGWlamda = js.Any.fromFunction0(computeGWlamda), computeGiMGt = js.Any.fromFunction0(computeGiMGt), computeGiMf = js.Any.fromFunction0(computeGiMf), computeGq = js.Any.fromFunction0(computeGq), enabled = enabled.asInstanceOf[js.Any], eps = eps.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jacobianElementA = jacobianElementA.asInstanceOf[js.Any], jacobianElementB = jacobianElementB.asInstanceOf[js.Any], maxForce = maxForce.asInstanceOf[js.Any], minForce = minForce.asInstanceOf[js.Any], setSpookParams = js.Any.fromFunction3(setSpookParams))
    __obj.asInstanceOf[Equation]
  }
  
  @scala.inline
  implicit class EquationOps[Self <: Equation] (val x: Self) extends AnyVal {
    
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
    def setA(value: Double): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddToWlamda(value: Double => Double): Self = this.set("addToWlamda", js.Any.fromFunction1(value))
    
    @scala.inline
    def setB(value: Double): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBi(value: Body): Self = this.set("bi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBj(value: Body): Self = this.set("bj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeB(value: (Double, Double, Double) => Double): Self = this.set("computeB", js.Any.fromFunction3(value))
    
    @scala.inline
    def setComputeC(value: () => Double): Self = this.set("computeC", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComputeGW(value: () => Double): Self = this.set("computeGW", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComputeGWlamda(value: () => Double): Self = this.set("computeGWlamda", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComputeGiMGt(value: () => Double): Self = this.set("computeGiMGt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComputeGiMf(value: () => Double): Self = this.set("computeGiMf", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComputeGq(value: () => Double): Self = this.set("computeGq", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEps(value: Double): Self = this.set("eps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJacobianElementA(value: JacobianElement): Self = this.set("jacobianElementA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJacobianElementB(value: JacobianElement): Self = this.set("jacobianElementB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxForce(value: Double): Self = this.set("maxForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinForce(value: Double): Self = this.set("minForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetSpookParams(value: (Double, Double, Double) => Unit): Self = this.set("setSpookParams", js.Any.fromFunction3(value))
  }
}
