package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2DistanceJoint
  extends StObject
     with b2Joint {
  
  /**
    * Gets the damping ratio.
    * @return Damping ratio.
    **/
  def GetDampingRatio(): Double
  
  /**
    * Gets the frequency.
    * @return Frequency.
    **/
  def GetFrequency(): Double
  
  /**
    * Gets the length of distance between the two bodies.
    * @return Length.
    **/
  def GetLength(): Double
  
  /**
    * Sets the damping ratio.
    * @param ratio New damping ratio.
    **/
  def SetDampingRatio(ratio: Double): Unit
  
  /**
    * Sets the frequency.
    * @param hz New frequency (hertz).
    **/
  def SetFrequency(hz: Double): Unit
  
  /**
    * Sets the length of distance between the two bodies.
    * @param length New length.
    **/
  def SetLength(length: Double): Unit
}
object b2DistanceJoint {
  
  inline def apply(
    GetAnchorA: () => b2Vec2,
    GetAnchorB: () => b2Vec2,
    GetBodyA: () => b2Body,
    GetBodyB: () => b2Body,
    GetDampingRatio: () => Double,
    GetFrequency: () => Double,
    GetLength: () => Double,
    GetNext: () => b2Joint,
    GetReactionForce: Double => b2Vec2,
    GetReactionTorque: Double => Double,
    GetType: () => Double,
    GetUserData: () => Any,
    IsActive: () => Boolean,
    SetDampingRatio: Double => Unit,
    SetFrequency: Double => Unit,
    SetLength: Double => Unit,
    SetUserData: Any => Unit
  ): b2DistanceJoint = {
    val __obj = js.Dynamic.literal(GetAnchorA = js.Any.fromFunction0(GetAnchorA), GetAnchorB = js.Any.fromFunction0(GetAnchorB), GetBodyA = js.Any.fromFunction0(GetBodyA), GetBodyB = js.Any.fromFunction0(GetBodyB), GetDampingRatio = js.Any.fromFunction0(GetDampingRatio), GetFrequency = js.Any.fromFunction0(GetFrequency), GetLength = js.Any.fromFunction0(GetLength), GetNext = js.Any.fromFunction0(GetNext), GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetType = js.Any.fromFunction0(GetType), GetUserData = js.Any.fromFunction0(GetUserData), IsActive = js.Any.fromFunction0(IsActive), SetDampingRatio = js.Any.fromFunction1(SetDampingRatio), SetFrequency = js.Any.fromFunction1(SetFrequency), SetLength = js.Any.fromFunction1(SetLength), SetUserData = js.Any.fromFunction1(SetUserData))
    __obj.asInstanceOf[b2DistanceJoint]
  }
  
  extension [Self <: b2DistanceJoint](x: Self) {
    
    inline def setGetDampingRatio(value: () => Double): Self = StObject.set(x, "GetDampingRatio", js.Any.fromFunction0(value))
    
    inline def setGetFrequency(value: () => Double): Self = StObject.set(x, "GetFrequency", js.Any.fromFunction0(value))
    
    inline def setGetLength(value: () => Double): Self = StObject.set(x, "GetLength", js.Any.fromFunction0(value))
    
    inline def setSetDampingRatio(value: Double => Unit): Self = StObject.set(x, "SetDampingRatio", js.Any.fromFunction1(value))
    
    inline def setSetFrequency(value: Double => Unit): Self = StObject.set(x, "SetFrequency", js.Any.fromFunction1(value))
    
    inline def setSetLength(value: Double => Unit): Self = StObject.set(x, "SetLength", js.Any.fromFunction1(value))
  }
}
