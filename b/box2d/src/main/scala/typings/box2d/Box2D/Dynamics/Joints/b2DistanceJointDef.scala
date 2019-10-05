package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2DistanceJointDef")
@js.native
/**
		* Constructor.
		**/
class b2DistanceJointDef () extends b2JointDef {
  /**
  		* The damping ratio. 0 = no damping, 1 = critical damping.
  		**/
  var dampingRatio: Double = js.native
  /**
  		* The mass-spring-damper frequency in Hertz.
  		**/
  var frequencyHz: Double = js.native
  /**
  		* The natural length between the anchor points.
  		**/
  var length: Double = js.native
  /**
  		* The local anchor point relative to body1's origin.
  		**/
  var localAnchorA: b2Vec2 = js.native
  /**
  		* The local anchor point relative to body2's origin.
  		**/
  var localAnchorB: b2Vec2 = js.native
  /**
  		* Initialize the bodies, anchors, and length using the world anchors.
  		* @param bA Body A.
  		* @param bB Body B.
  		* @param anchorA Anchor A.
  		* @param anchorB Anchor B.
  		**/
  def Initialize(bA: b2Body, bB: b2Body, anchorA: b2Vec2, anchorB: b2Vec2): Unit = js.native
}

