package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2FrictionJointDef")
@js.native
/**
		* Constructor.
		**/
class b2FrictionJointDef () extends b2JointDef {
  /**
  		* The local anchor point relative to body1's origin.
  		**/
  var localAnchorA: b2Vec2 = js.native
  /**
  		* The local anchor point relative to body2's origin.
  		**/
  var localAnchorB: b2Vec2 = js.native
  /**
  		* The maximum force in N.
  		**/
  var maxForce: Double = js.native
  /**
  		* The maximum friction torque in N-m.
  		**/
  var maxTorque: Double = js.native
  /**
  		* Initialize the bodies, anchors, axis, and reference angle using the world anchor and world axis.
  		* @param bA Body A.
  		* @param bB Body B.
  		* @param anchor World anchor.
  		**/
  def Initialize(bA: b2Body, bB: b2Body, anchor: b2Vec2): Unit = js.native
}

