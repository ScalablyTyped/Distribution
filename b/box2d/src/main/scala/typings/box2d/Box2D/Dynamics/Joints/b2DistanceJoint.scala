package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2DistanceJoint extends b2Joint {
  
  /**
    * Gets the damping ratio.
    * @return Damping ratio.
    **/
  def GetDampingRatio(): Double = js.native
  
  /**
    * Gets the frequency.
    * @return Frequency.
    **/
  def GetFrequency(): Double = js.native
  
  /**
    * Gets the length of distance between the two bodies.
    * @return Length.
    **/
  def GetLength(): Double = js.native
  
  /**
    * Sets the damping ratio.
    * @param ratio New damping ratio.
    **/
  def SetDampingRatio(ratio: Double): Unit = js.native
  
  /**
    * Sets the frequency.
    * @param hz New frequency (hertz).
    **/
  def SetFrequency(hz: Double): Unit = js.native
  
  /**
    * Sets the length of distance between the two bodies.
    * @param length New length.
    **/
  def SetLength(length: Double): Unit = js.native
}
object b2DistanceJoint {
  
  @scala.inline
  def apply(
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
    GetUserData: () => js.Any,
    IsActive: () => Boolean,
    SetDampingRatio: Double => Unit,
    SetFrequency: Double => Unit,
    SetLength: Double => Unit,
    SetUserData: js.Any => Unit
  ): b2DistanceJoint = {
    val __obj = js.Dynamic.literal(GetAnchorA = js.Any.fromFunction0(GetAnchorA), GetAnchorB = js.Any.fromFunction0(GetAnchorB), GetBodyA = js.Any.fromFunction0(GetBodyA), GetBodyB = js.Any.fromFunction0(GetBodyB), GetDampingRatio = js.Any.fromFunction0(GetDampingRatio), GetFrequency = js.Any.fromFunction0(GetFrequency), GetLength = js.Any.fromFunction0(GetLength), GetNext = js.Any.fromFunction0(GetNext), GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetType = js.Any.fromFunction0(GetType), GetUserData = js.Any.fromFunction0(GetUserData), IsActive = js.Any.fromFunction0(IsActive), SetDampingRatio = js.Any.fromFunction1(SetDampingRatio), SetFrequency = js.Any.fromFunction1(SetFrequency), SetLength = js.Any.fromFunction1(SetLength), SetUserData = js.Any.fromFunction1(SetUserData))
    __obj.asInstanceOf[b2DistanceJoint]
  }
  
  @scala.inline
  implicit class b2DistanceJointOps[Self <: b2DistanceJoint] (val x: Self) extends AnyVal {
    
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
    def setGetDampingRatio(value: () => Double): Self = this.set("GetDampingRatio", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFrequency(value: () => Double): Self = this.set("GetFrequency", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("GetLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDampingRatio(value: Double => Unit): Self = this.set("SetDampingRatio", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFrequency(value: Double => Unit): Self = this.set("SetFrequency", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLength(value: Double => Unit): Self = this.set("SetLength", js.Any.fromFunction1(value))
  }
}
