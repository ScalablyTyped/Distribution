package typings
package box2dLib.Box2DNs.DynamicsNs.JointsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2PulleyJointDef")
@js.native
class b2PulleyJointDef () extends b2JointDef {
  /**
  		* The first ground anchor in world coordinates. This point never moves.
  		**/
  var groundAnchorA: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* The second ground anchor in world coordinates. This point never moves.
  		**/
  var groundAnchorB: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* The a reference length for the segment attached to bodyA.
  		**/
  var lengthA: scala.Double = js.native
  /**
  		* The a reference length for the segment attached to bodyB.
  		**/
  var lengthB: scala.Double = js.native
  /**
  		* The local anchor point relative to body1's origin.
  		**/
  var localAnchorA: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* The local anchor point relative to body2's origin.
  		**/
  var localAnchorB: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* The maximum length of the segment attached to bodyA.
  		**/
  var maxLengthA: scala.Double = js.native
  /**
  		* The maximum length of the segment attached to bodyB.
  		**/
  var maxLengthB: scala.Double = js.native
  /**
  		* The pulley ratio, used to simulate a block-and-tackle.
  		**/
  var ratio: scala.Double = js.native
  /**
  		* Initialize the bodies, anchors, and length using the world anchors.
  		* @param bA Body A.
  		* @param bB Body B.
  		* @param gaA Ground anchor A.
  		* @param gaB Ground anchor B.
  		* @param anchorA Anchor A.
  		* @param anchorB Anchor B.
  		**/
  def Initialize(
    bA: box2dLib.Box2DNs.DynamicsNs.b2Body,
    bB: box2dLib.Box2DNs.DynamicsNs.b2Body,
    gaA: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2,
    gaB: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2,
    anchorA: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2,
    anchorB: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2
  ): scala.Unit = js.native
}

