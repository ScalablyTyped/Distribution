package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2FrictionJointDef extends b2JointDef {
  /**
    * The local anchor point relative to body1's origin.
    **/
  var localAnchorA: b2Vec2
  /**
    * The local anchor point relative to body2's origin.
    **/
  var localAnchorB: b2Vec2
  /**
    * The maximum force in N.
    **/
  var maxForce: Double
  /**
    * The maximum friction torque in N-m.
    **/
  var maxTorque: Double
  /**
    * Initialize the bodies, anchors, axis, and reference angle using the world anchor and world axis.
    * @param bA Body A.
    * @param bB Body B.
    * @param anchor World anchor.
    **/
  def Initialize(bA: b2Body, bB: b2Body, anchor: b2Vec2): Unit
}

object b2FrictionJointDef {
  @scala.inline
  def apply(
    Initialize: (b2Body, b2Body, b2Vec2) => Unit,
    bodyA: b2Body,
    bodyB: b2Body,
    collideConnected: Boolean,
    localAnchorA: b2Vec2,
    localAnchorB: b2Vec2,
    maxForce: Double,
    maxTorque: Double,
    `type`: Double,
    userData: js.Any
  ): b2FrictionJointDef = {
    val __obj = js.Dynamic.literal(Initialize = js.Any.fromFunction3(Initialize), bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], localAnchorA = localAnchorA.asInstanceOf[js.Any], localAnchorB = localAnchorB.asInstanceOf[js.Any], maxForce = maxForce.asInstanceOf[js.Any], maxTorque = maxTorque.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2FrictionJointDef]
  }
}

