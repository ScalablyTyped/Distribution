package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2PulleyJointDef")
@js.native
/**
		* Constructor.
		**/
class b2PulleyJointDef () extends b2JointDef {
  /**
  		* The first ground anchor in world coordinates. This point never moves.
  		**/
  var groundAnchorA: b2Vec2 = js.native
  /**
  		* The second ground anchor in world coordinates. This point never moves.
  		**/
  var groundAnchorB: b2Vec2 = js.native
  /**
  		* The a reference length for the segment attached to bodyA.
  		**/
  var lengthA: Double = js.native
  /**
  		* The a reference length for the segment attached to bodyB.
  		**/
  var lengthB: Double = js.native
  /**
  		* The local anchor point relative to body1's origin.
  		**/
  var localAnchorA: b2Vec2 = js.native
  /**
  		* The local anchor point relative to body2's origin.
  		**/
  var localAnchorB: b2Vec2 = js.native
  /**
  		* The maximum length of the segment attached to bodyA.
  		**/
  var maxLengthA: Double = js.native
  /**
  		* The maximum length of the segment attached to bodyB.
  		**/
  var maxLengthB: Double = js.native
  /**
  		* The pulley ratio, used to simulate a block-and-tackle.
  		**/
  var ratio: Double = js.native
  /**
  		* Initialize the bodies, anchors, and length using the world anchors.
  		* @param bA Body A.
  		* @param bB Body B.
  		* @param gaA Ground anchor A.
  		* @param gaB Ground anchor B.
  		* @param anchorA Anchor A.
  		* @param anchorB Anchor B.
  		**/
  def Initialize(bA: b2Body, bB: b2Body, gaA: b2Vec2, gaB: b2Vec2, anchorA: b2Vec2, anchorB: b2Vec2): Unit = js.native
}

