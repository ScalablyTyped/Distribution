package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2PulleyJoint extends b2Joint {
  /**
    * Get the first ground anchor.
    **/
  def GetGroundAnchorA(): b2Vec2
  /**
    * Get the second ground anchor.
    **/
  def GetGroundAnchorB(): b2Vec2
  /**
    * Get the current length of the segment attached to body1.
    **/
  def GetLength1(): Double
  /**
    * Get the current length of the segment attached to body2.
    **/
  def GetLength2(): Double
  /**
    * Get the pulley ratio.
    **/
  def GetRatio(): Double
}

object b2PulleyJoint {
  @scala.inline
  def apply(
    GetAnchorA: () => b2Vec2,
    GetAnchorB: () => b2Vec2,
    GetBodyA: () => b2Body,
    GetBodyB: () => b2Body,
    GetGroundAnchorA: () => b2Vec2,
    GetGroundAnchorB: () => b2Vec2,
    GetLength1: () => Double,
    GetLength2: () => Double,
    GetNext: () => b2Joint,
    GetRatio: () => Double,
    GetReactionForce: Double => b2Vec2,
    GetReactionTorque: Double => Double,
    GetType: () => Double,
    GetUserData: () => js.Any,
    IsActive: () => Boolean,
    SetUserData: js.Any => Unit
  ): b2PulleyJoint = {
    val __obj = js.Dynamic.literal(GetAnchorA = js.Any.fromFunction0(GetAnchorA), GetAnchorB = js.Any.fromFunction0(GetAnchorB), GetBodyA = js.Any.fromFunction0(GetBodyA), GetBodyB = js.Any.fromFunction0(GetBodyB), GetGroundAnchorA = js.Any.fromFunction0(GetGroundAnchorA), GetGroundAnchorB = js.Any.fromFunction0(GetGroundAnchorB), GetLength1 = js.Any.fromFunction0(GetLength1), GetLength2 = js.Any.fromFunction0(GetLength2), GetNext = js.Any.fromFunction0(GetNext), GetRatio = js.Any.fromFunction0(GetRatio), GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetType = js.Any.fromFunction0(GetType), GetUserData = js.Any.fromFunction0(GetUserData), IsActive = js.Any.fromFunction0(IsActive), SetUserData = js.Any.fromFunction1(SetUserData))
    __obj.asInstanceOf[b2PulleyJoint]
  }
}

