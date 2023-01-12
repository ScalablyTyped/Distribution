package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactEquation
  extends StObject
     with Equation {
  
  var biInvInertiaTimesRixn: Vec3
  
  var bjInvInertiaTimesRjxn: Vec3
  
  var invIi: Mat3
  
  var invIj: Mat3
  
  var ni: Vec3
  
  var penetrationVec: Vec3
  
  var restitution: Double
  
  var ri: Vec3
  
  var rixn: Vec3
  
  var rj: Vec3
  
  var rjxn: Vec3
}
object ContactEquation {
  
  inline def apply(
    a: Double,
    addToWlamda: Double => Double,
    b: Double,
    bi: Body,
    biInvInertiaTimesRixn: Vec3,
    bj: Body,
    bjInvInertiaTimesRjxn: Vec3,
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
    penetrationVec: Vec3,
    restitution: Double,
    ri: Vec3,
    rixn: Vec3,
    rj: Vec3,
    rjxn: Vec3,
    setSpookParams: (Double, Double, Double) => Unit
  ): ContactEquation = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], addToWlamda = js.Any.fromFunction1(addToWlamda), b = b.asInstanceOf[js.Any], bi = bi.asInstanceOf[js.Any], biInvInertiaTimesRixn = biInvInertiaTimesRixn.asInstanceOf[js.Any], bj = bj.asInstanceOf[js.Any], bjInvInertiaTimesRjxn = bjInvInertiaTimesRjxn.asInstanceOf[js.Any], computeB = js.Any.fromFunction3(computeB), computeC = js.Any.fromFunction0(computeC), computeGW = js.Any.fromFunction0(computeGW), computeGWlamda = js.Any.fromFunction0(computeGWlamda), computeGiMGt = js.Any.fromFunction0(computeGiMGt), computeGiMf = js.Any.fromFunction0(computeGiMf), computeGq = js.Any.fromFunction0(computeGq), enabled = enabled.asInstanceOf[js.Any], eps = eps.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invIi = invIi.asInstanceOf[js.Any], invIj = invIj.asInstanceOf[js.Any], jacobianElementA = jacobianElementA.asInstanceOf[js.Any], jacobianElementB = jacobianElementB.asInstanceOf[js.Any], maxForce = maxForce.asInstanceOf[js.Any], minForce = minForce.asInstanceOf[js.Any], ni = ni.asInstanceOf[js.Any], penetrationVec = penetrationVec.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], ri = ri.asInstanceOf[js.Any], rixn = rixn.asInstanceOf[js.Any], rj = rj.asInstanceOf[js.Any], rjxn = rjxn.asInstanceOf[js.Any], setSpookParams = js.Any.fromFunction3(setSpookParams))
    __obj.asInstanceOf[ContactEquation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContactEquation] (val x: Self) extends AnyVal {
    
    inline def setBiInvInertiaTimesRixn(value: Vec3): Self = StObject.set(x, "biInvInertiaTimesRixn", value.asInstanceOf[js.Any])
    
    inline def setBjInvInertiaTimesRjxn(value: Vec3): Self = StObject.set(x, "bjInvInertiaTimesRjxn", value.asInstanceOf[js.Any])
    
    inline def setInvIi(value: Mat3): Self = StObject.set(x, "invIi", value.asInstanceOf[js.Any])
    
    inline def setInvIj(value: Mat3): Self = StObject.set(x, "invIj", value.asInstanceOf[js.Any])
    
    inline def setNi(value: Vec3): Self = StObject.set(x, "ni", value.asInstanceOf[js.Any])
    
    inline def setPenetrationVec(value: Vec3): Self = StObject.set(x, "penetrationVec", value.asInstanceOf[js.Any])
    
    inline def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
    
    inline def setRi(value: Vec3): Self = StObject.set(x, "ri", value.asInstanceOf[js.Any])
    
    inline def setRixn(value: Vec3): Self = StObject.set(x, "rixn", value.asInstanceOf[js.Any])
    
    inline def setRj(value: Vec3): Self = StObject.set(x, "rj", value.asInstanceOf[js.Any])
    
    inline def setRjxn(value: Vec3): Self = StObject.set(x, "rjxn", value.asInstanceOf[js.Any])
  }
}
