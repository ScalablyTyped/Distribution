package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2GearJoint
  extends StObject
     with b2Joint {
  
  /**
    * Get the gear ratio.
    * @return Gear ratio.
    **/
  def GetRatio(): Double
  
  /**
    * Set the gear ratio.
    * @param force New gear ratio.
    **/
  def SetRatio(ratio: Double): Unit
}
object b2GearJoint {
  
  inline def apply(
    GetAnchorA: () => b2Vec2,
    GetAnchorB: () => b2Vec2,
    GetBodyA: () => b2Body,
    GetBodyB: () => b2Body,
    GetNext: () => b2Joint,
    GetRatio: () => Double,
    GetReactionForce: Double => b2Vec2,
    GetReactionTorque: Double => Double,
    GetType: () => Double,
    GetUserData: () => Any,
    IsActive: () => Boolean,
    SetRatio: Double => Unit,
    SetUserData: Any => Unit
  ): b2GearJoint = {
    val __obj = js.Dynamic.literal(GetAnchorA = js.Any.fromFunction0(GetAnchorA), GetAnchorB = js.Any.fromFunction0(GetAnchorB), GetBodyA = js.Any.fromFunction0(GetBodyA), GetBodyB = js.Any.fromFunction0(GetBodyB), GetNext = js.Any.fromFunction0(GetNext), GetRatio = js.Any.fromFunction0(GetRatio), GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetType = js.Any.fromFunction0(GetType), GetUserData = js.Any.fromFunction0(GetUserData), IsActive = js.Any.fromFunction0(IsActive), SetRatio = js.Any.fromFunction1(SetRatio), SetUserData = js.Any.fromFunction1(SetUserData))
    __obj.asInstanceOf[b2GearJoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: b2GearJoint] (val x: Self) extends AnyVal {
    
    inline def setGetRatio(value: () => Double): Self = StObject.set(x, "GetRatio", js.Any.fromFunction0(value))
    
    inline def setSetRatio(value: Double => Unit): Self = StObject.set(x, "SetRatio", js.Any.fromFunction1(value))
  }
}
