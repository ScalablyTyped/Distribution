package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Spring extends StObject {
  
  def applyForce(): Unit
  
  var bodyA: Body
  
  var bodyB: Body
  
  var damping: Double
  
  def getWorldAnchorA(result: Vec3): Unit
  
  def getWorldAnchorB(result: Vec3): Unit
  
  var localAnchorA: Vec3
  
  var localAnchorB: Vec3
  
  var restLength: Double
  
  def setWorldAnchorA(worldAnchorA: Vec3): Unit
  
  def setWorldAnchorB(worldAnchorB: Vec3): Unit
  
  var stffness: Double
}
object Spring {
  
  inline def apply(
    applyForce: () => Unit,
    bodyA: Body,
    bodyB: Body,
    damping: Double,
    getWorldAnchorA: Vec3 => Unit,
    getWorldAnchorB: Vec3 => Unit,
    localAnchorA: Vec3,
    localAnchorB: Vec3,
    restLength: Double,
    setWorldAnchorA: Vec3 => Unit,
    setWorldAnchorB: Vec3 => Unit,
    stffness: Double
  ): Spring = {
    val __obj = js.Dynamic.literal(applyForce = js.Any.fromFunction0(applyForce), bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], damping = damping.asInstanceOf[js.Any], getWorldAnchorA = js.Any.fromFunction1(getWorldAnchorA), getWorldAnchorB = js.Any.fromFunction1(getWorldAnchorB), localAnchorA = localAnchorA.asInstanceOf[js.Any], localAnchorB = localAnchorB.asInstanceOf[js.Any], restLength = restLength.asInstanceOf[js.Any], setWorldAnchorA = js.Any.fromFunction1(setWorldAnchorA), setWorldAnchorB = js.Any.fromFunction1(setWorldAnchorB), stffness = stffness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spring]
  }
  
  extension [Self <: Spring](x: Self) {
    
    inline def setApplyForce(value: () => Unit): Self = StObject.set(x, "applyForce", js.Any.fromFunction0(value))
    
    inline def setBodyA(value: Body): Self = StObject.set(x, "bodyA", value.asInstanceOf[js.Any])
    
    inline def setBodyB(value: Body): Self = StObject.set(x, "bodyB", value.asInstanceOf[js.Any])
    
    inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    inline def setGetWorldAnchorA(value: Vec3 => Unit): Self = StObject.set(x, "getWorldAnchorA", js.Any.fromFunction1(value))
    
    inline def setGetWorldAnchorB(value: Vec3 => Unit): Self = StObject.set(x, "getWorldAnchorB", js.Any.fromFunction1(value))
    
    inline def setLocalAnchorA(value: Vec3): Self = StObject.set(x, "localAnchorA", value.asInstanceOf[js.Any])
    
    inline def setLocalAnchorB(value: Vec3): Self = StObject.set(x, "localAnchorB", value.asInstanceOf[js.Any])
    
    inline def setRestLength(value: Double): Self = StObject.set(x, "restLength", value.asInstanceOf[js.Any])
    
    inline def setSetWorldAnchorA(value: Vec3 => Unit): Self = StObject.set(x, "setWorldAnchorA", js.Any.fromFunction1(value))
    
    inline def setSetWorldAnchorB(value: Vec3 => Unit): Self = StObject.set(x, "setWorldAnchorB", js.Any.fromFunction1(value))
    
    inline def setStffness(value: Double): Self = StObject.set(x, "stffness", value.asInstanceOf[js.Any])
  }
}
