package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Equation extends StObject {
  
  var a: Double
  
  def addToWlamda(deltalambda: Double): Double
  
  var b: Double
  
  var bi: Body
  
  var bj: Body
  
  def computeB(a: Double, b: Double, h: Double): Double
  
  def computeC(): Double
  
  def computeGW(): Double
  
  def computeGWlamda(): Double
  
  def computeGiMGt(): Double
  
  def computeGiMf(): Double
  
  def computeGq(): Double
  
  var enabled: Boolean
  
  var eps: Double
  
  var id: Double
  
  var jacobianElementA: JacobianElement
  
  var jacobianElementB: JacobianElement
  
  var maxForce: Double
  
  var minForce: Double
  
  def setSpookParams(stiffness: Double, relaxation: Double, timeStep: Double): Unit
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
  implicit class EquationMutableBuilder[Self <: Equation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddToWlamda(value: Double => Double): Self = StObject.set(x, "addToWlamda", js.Any.fromFunction1(value))
    
    @scala.inline
    def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBi(value: Body): Self = StObject.set(x, "bi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBj(value: Body): Self = StObject.set(x, "bj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeB(value: (Double, Double, Double) => Double): Self = StObject.set(x, "computeB", js.Any.fromFunction3(value))
    
    @scala.inline
    def setComputeC(value: () => Double): Self = StObject.set(x, "computeC", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComputeGW(value: () => Double): Self = StObject.set(x, "computeGW", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComputeGWlamda(value: () => Double): Self = StObject.set(x, "computeGWlamda", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComputeGiMGt(value: () => Double): Self = StObject.set(x, "computeGiMGt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComputeGiMf(value: () => Double): Self = StObject.set(x, "computeGiMf", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComputeGq(value: () => Double): Self = StObject.set(x, "computeGq", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEps(value: Double): Self = StObject.set(x, "eps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJacobianElementA(value: JacobianElement): Self = StObject.set(x, "jacobianElementA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJacobianElementB(value: JacobianElement): Self = StObject.set(x, "jacobianElementB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxForce(value: Double): Self = StObject.set(x, "maxForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinForce(value: Double): Self = StObject.set(x, "minForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetSpookParams(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setSpookParams", js.Any.fromFunction3(value))
  }
}
