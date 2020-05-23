package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2Joint extends js.Object {
  /**
    * Get the anchor point on bodyA in world coordinates.
    * @return Anchor A point.
    **/
  def GetAnchorA(): b2Vec2
  /**
    * Get the anchor point on bodyB in world coordinates.
    * @return Anchor B point.
    **/
  def GetAnchorB(): b2Vec2
  /**
    * Get the first body attached to this joint.
    * @return Body A.
    **/
  def GetBodyA(): b2Body
  /**
    * Get the second body attached to this joint.
    * @return Body B.
    **/
  def GetBodyB(): b2Body
  /**
    * Get the next joint the world joint list.
    * @return Next joint.
    **/
  def GetNext(): b2Joint
  /**
    * Get the reaction force on body2 at the joint anchor in Newtons.
    * @param inv_dt
    * @return Reaction force (N)
    **/
  def GetReactionForce(inv_dt: Double): b2Vec2
  /**
    * Get the reaction torque on body2 in N.
    * @param inv_dt
    * @return Reaction torque (N).
    **/
  def GetReactionTorque(inv_dt: Double): Double
  /**
    * Get the type of the concrete joint.
    * @return Joint type.
    **/
  def GetType(): Double
  /**
    * Get the user data pointer.
    * @return User data.  Cast to your data type.
    **/
  def GetUserData(): js.Any
  /**
    * Short-cut function to determine if either body is inactive.
    * @return True if active, otherwise false.
    **/
  def IsActive(): Boolean
  /**
    * Set the user data pointer.
    * @param data Your custom data.
    **/
  def SetUserData(data: js.Any): Unit
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
}

