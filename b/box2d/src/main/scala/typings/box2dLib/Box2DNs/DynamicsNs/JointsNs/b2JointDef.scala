package typings
package box2dLib.Box2DNs.DynamicsNs.JointsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2JointDef")
@js.native
class b2JointDef () extends js.Object {
  /**
  		* The first attached body.
  		**/
  var bodyA: box2dLib.Box2DNs.DynamicsNs.b2Body = js.native
  /**
  		* The second attached body.
  		**/
  var bodyB: box2dLib.Box2DNs.DynamicsNs.b2Body = js.native
  /**
  		* Set this flag to true if the attached bodies should collide.
  		**/
  var collideConnected: scala.Boolean = js.native
  /**
  		* The joint type is set automatically for concrete joint types.
  		**/
  var `type`: scala.Double = js.native
  /**
  		* Use this to attach application specific data to your joints.
  		**/
  var userData: js.Any = js.native
}

