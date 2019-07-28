package typings.box2d.Box2DNs.DynamicsNs.JointsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2GearJointDef")
@js.native
/**
		* Constructor.
		**/
class b2GearJointDef () extends b2JointDef {
  /**
  		* The first revolute/prismatic joint attached to the gear joint.
  		**/
  var joint1: b2Joint = js.native
  /**
  		* The second revolute/prismatic joint attached to the gear joint.
  		**/
  var joint2: b2Joint = js.native
  /**
  		* The gear ratio.
  		**/
  var ratio: Double = js.native
}

