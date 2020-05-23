package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2DistanceJointDef extends b2JointDef {
  /**
    * The damping ratio. 0 = no damping, 1 = critical damping.
    **/
  var dampingRatio: Double
  /**
    * The mass-spring-damper frequency in Hertz.
    **/
  var frequencyHz: Double
  /**
    * The natural length between the anchor points.
    **/
  var length: Double
  /**
    * The local anchor point relative to body1's origin.
    **/
  var localAnchorA: b2Vec2
  /**
    * The local anchor point relative to body2's origin.
    **/
  var localAnchorB: b2Vec2
  /**
    * Initialize the bodies, anchors, and length using the world anchors.
    * @param bA Body A.
    * @param bB Body B.
    * @param anchorA Anchor A.
    * @param anchorB Anchor B.
    **/
  def Initialize(bA: b2Body, bB: b2Body, anchorA: b2Vec2, anchorB: b2Vec2): Unit
}

object b2DistanceJointDef {
  @scala.inline
  def apply(
    Initialize: (b2Body, b2Body, b2Vec2, b2Vec2) => Unit,
    bodyA: b2Body,
    bodyB: b2Body,
    collideConnected: Boolean,
    dampingRatio: Double,
    frequencyHz: Double,
    length: Double,
    localAnchorA: b2Vec2,
    localAnchorB: b2Vec2,
    `type`: Double,
    userData: js.Any
  ): b2DistanceJointDef = {
    val __obj = js.Dynamic.literal(Initialize = js.Any.fromFunction4(Initialize), bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], dampingRatio = dampingRatio.asInstanceOf[js.Any], frequencyHz = frequencyHz.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], localAnchorA = localAnchorA.asInstanceOf[js.Any], localAnchorB = localAnchorB.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2DistanceJointDef]
  }
}

