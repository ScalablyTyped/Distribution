package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2GearJoint extends b2Joint {
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
  @scala.inline
  def apply(
    GetAnchorA: () => b2Vec2,
    GetAnchorB: () => b2Vec2,
    GetBodyA: () => b2Body,
    GetBodyB: () => b2Body,
    GetNext: () => b2Joint,
    GetRatio: () => Double,
    GetReactionForce: Double => b2Vec2,
    GetReactionTorque: Double => Double,
    GetType: () => Double,
    GetUserData: () => js.Any,
    IsActive: () => Boolean,
    SetRatio: Double => Unit,
    SetUserData: js.Any => Unit
  ): b2GearJoint = {
    val __obj = js.Dynamic.literal(GetAnchorA = js.Any.fromFunction0(GetAnchorA), GetAnchorB = js.Any.fromFunction0(GetAnchorB), GetBodyA = js.Any.fromFunction0(GetBodyA), GetBodyB = js.Any.fromFunction0(GetBodyB), GetNext = js.Any.fromFunction0(GetNext), GetRatio = js.Any.fromFunction0(GetRatio), GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetType = js.Any.fromFunction0(GetType), GetUserData = js.Any.fromFunction0(GetUserData), IsActive = js.Any.fromFunction0(IsActive), SetRatio = js.Any.fromFunction1(SetRatio), SetUserData = js.Any.fromFunction1(SetUserData))
    __obj.asInstanceOf[b2GearJoint]
  }
}

