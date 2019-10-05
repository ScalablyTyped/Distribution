package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2JointDef")
@js.native
/**
		* Constructor.
		**/
class b2JointDef () extends js.Object {
  /**
  		* The first attached body.
  		**/
  var bodyA: b2Body = js.native
  /**
  		* The second attached body.
  		**/
  var bodyB: b2Body = js.native
  /**
  		* Set this flag to true if the attached bodies should collide.
  		**/
  var collideConnected: Boolean = js.native
  /**
  		* The joint type is set automatically for concrete joint types.
  		**/
  var `type`: Double = js.native
  /**
  		* Use this to attach application specific data to your joints.
  		**/
  var userData: js.Any = js.native
}

