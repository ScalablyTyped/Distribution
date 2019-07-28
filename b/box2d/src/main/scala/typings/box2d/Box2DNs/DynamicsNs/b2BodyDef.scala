package typings.box2d.Box2DNs.DynamicsNs

import typings.box2d.Box2DNs.CommonNs.MathNs.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.b2BodyDef")
@js.native
class b2BodyDef () extends js.Object {
  /**
  		* Does this body start out active?
  		**/
  var active: Boolean = js.native
  /**
  		* Set this flag to false if this body should never fall asleep. Note that this increases CPU usage.
  		**/
  var allowSleep: Boolean = js.native
  /**
  		* The world angle of the body in radians.
  		**/
  var angle: Double = js.native
  /**
  		* Angular damping is use to reduce the angular velocity. The damping parameter can be larger than 1.0f but the damping effect becomes sensitive to the time step when the damping parameter is large.
  		**/
  var angularDamping: Double = js.native
  /**
  		* The angular velocity of the body.
  		**/
  var angularVelocity: Double = js.native
  /**
  		* Is this body initially awake or sleeping?
  		**/
  var awake: Boolean = js.native
  /**
  		* Is this a fast moving body that should be prevented from tunneling through other moving bodies? Note that all bodies are prevented from tunneling through static bodies.
  		* @warning You should use this flag sparingly since it increases processing time.
  		**/
  var bullet: Boolean = js.native
  /**
  		* Should this body be prevented from rotating? Useful for characters.
  		**/
  var fixedRotation: Boolean = js.native
  /**
  		* Scales the inertia tensor.
  		* @warning Experimental
  		**/
  var inertiaScale: Double = js.native
  /**
  		* Linear damping is use to reduce the linear velocity. The damping parameter can be larger than 1.0f but the damping effect becomes sensitive to the time step when the damping parameter is large.
  		**/
  var linearDamping: Double = js.native
  /**
  		* The linear velocity of the body's origin in world co-ordinates.
  		**/
  var linearVelocity: b2Vec2 = js.native
  /**
  		* The world position of the body. Avoid creating bodies at the origin since this can lead to many overlapping shapes.
  		**/
  var position: b2Vec2 = js.native
  /**
  		* The body type: static, kinematic, or dynamic. A member of the b2BodyType class .
  		* @note If a dynamic body would have zero mass, the mass is set to one.
  		**/
  var `type`: Double = js.native
  /**
  		* Use this to store application specific body data.
  		**/
  var userData: js.Any = js.native
}

