package typings.box2d.Box2DNs.DynamicsNs.JointsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2MouseJointDef")
@js.native
/**
		* Constructor.
		**/
class b2MouseJointDef () extends b2JointDef {
  /**
  		* The damping ratio. 0 = no damping, 1 = critical damping.
  		**/
  var dampingRatio: Double = js.native
  /**
  		* The response speed.
  		**/
  var frequencyHz: Double = js.native
  /**
  		* The maximum constraint force that can be exerted to move the candidate body.
  		**/
  var maxForce: Double = js.native
}

