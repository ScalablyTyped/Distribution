package typings
package box2dLib.Box2DNs.DynamicsNs.JointsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2WeldJointDef")
@js.native
class b2WeldJointDef () extends b2JointDef {
  /**
  		* The local anchor point relative to body1's origin.
  		**/
  var localAnchorA: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* The local anchor point relative to body2's origin.
  		**/
  var localAnchorB: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* The body2 angle minus body1 angle in the reference state (radians).
  		**/
  var referenceAngle: scala.Double = js.native
  /**
  		* Initialize the bodies, anchors, axis, and reference angle using the world anchor and world axis.
  		* @param bA Body A.
  		* @param bB Body B.
  		* @param anchor Anchor.
  		**/
  def Initialize(
    bA: box2dLib.Box2DNs.DynamicsNs.b2Body,
    bB: box2dLib.Box2DNs.DynamicsNs.b2Body,
    anchor: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2
  ): scala.Unit = js.native
}

