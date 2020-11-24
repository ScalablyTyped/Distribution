package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2Joint extends js.Object {
  
  /**
    * Get the anchor point on bodyA in world coordinates.
    * @return Anchor A point.
    **/
  def GetAnchorA(): b2Vec2 = js.native
  
  /**
    * Get the anchor point on bodyB in world coordinates.
    * @return Anchor B point.
    **/
  def GetAnchorB(): b2Vec2 = js.native
  
  /**
    * Get the first body attached to this joint.
    * @return Body A.
    **/
  def GetBodyA(): b2Body = js.native
  
  /**
    * Get the second body attached to this joint.
    * @return Body B.
    **/
  def GetBodyB(): b2Body = js.native
  
  /**
    * Get the next joint the world joint list.
    * @return Next joint.
    **/
  def GetNext(): b2Joint = js.native
  
  /**
    * Get the reaction force on body2 at the joint anchor in Newtons.
    * @param inv_dt
    * @return Reaction force (N)
    **/
  def GetReactionForce(inv_dt: Double): b2Vec2 = js.native
  
  /**
    * Get the reaction torque on body2 in N.
    * @param inv_dt
    * @return Reaction torque (N).
    **/
  def GetReactionTorque(inv_dt: Double): Double = js.native
  
  /**
    * Get the type of the concrete joint.
    * @return Joint type.
    **/
  def GetType(): Double = js.native
  
  /**
    * Get the user data pointer.
    * @return User data.  Cast to your data type.
    **/
  def GetUserData(): js.Any = js.native
  
  /**
    * Short-cut function to determine if either body is inactive.
    * @return True if active, otherwise false.
    **/
  def IsActive(): Boolean = js.native
  
  /**
    * Set the user data pointer.
    * @param data Your custom data.
    **/
  def SetUserData(data: js.Any): Unit = js.native
}
object b2Joint {
  
  @scala.inline
  def apply(
    GetAnchorA: () => b2Vec2,
    GetAnchorB: () => b2Vec2,
    GetBodyA: () => b2Body,
    GetBodyB: () => b2Body,
    GetNext: () => b2Joint,
    GetReactionForce: Double => b2Vec2,
    GetReactionTorque: Double => Double,
    GetType: () => Double,
    GetUserData: () => js.Any,
    IsActive: () => Boolean,
    SetUserData: js.Any => Unit
  ): b2Joint = {
    val __obj = js.Dynamic.literal(GetAnchorA = js.Any.fromFunction0(GetAnchorA), GetAnchorB = js.Any.fromFunction0(GetAnchorB), GetBodyA = js.Any.fromFunction0(GetBodyA), GetBodyB = js.Any.fromFunction0(GetBodyB), GetNext = js.Any.fromFunction0(GetNext), GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetType = js.Any.fromFunction0(GetType), GetUserData = js.Any.fromFunction0(GetUserData), IsActive = js.Any.fromFunction0(IsActive), SetUserData = js.Any.fromFunction1(SetUserData))
    __obj.asInstanceOf[b2Joint]
  }
  
  @scala.inline
  implicit class b2JointOps[Self <: b2Joint] (val x: Self) extends AnyVal {
    
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
    def setGetAnchorA(value: () => b2Vec2): Self = this.set("GetAnchorA", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAnchorB(value: () => b2Vec2): Self = this.set("GetAnchorB", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBodyA(value: () => b2Body): Self = this.set("GetBodyA", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBodyB(value: () => b2Body): Self = this.set("GetBodyB", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNext(value: () => b2Joint): Self = this.set("GetNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetReactionForce(value: Double => b2Vec2): Self = this.set("GetReactionForce", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetReactionTorque(value: Double => Double): Self = this.set("GetReactionTorque", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetType(value: () => Double): Self = this.set("GetType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUserData(value: () => js.Any): Self = this.set("GetUserData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsActive(value: () => Boolean): Self = this.set("IsActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetUserData(value: js.Any => Unit): Self = this.set("SetUserData", js.Any.fromFunction1(value))
  }
}
