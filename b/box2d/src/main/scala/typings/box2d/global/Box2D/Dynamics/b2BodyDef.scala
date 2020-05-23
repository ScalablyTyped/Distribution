package typings.box2d.global.Box2D.Dynamics

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.b2BodyDef")
@js.native
class b2BodyDef ()
  extends typings.box2d.Box2D.Dynamics.b2BodyDef {
  /**
    * Does this body start out active?
    **/
  /* CompleteClass */
  override var active: Boolean = js.native
  /**
    * Set this flag to false if this body should never fall asleep. Note that this increases CPU usage.
    **/
  /* CompleteClass */
  override var allowSleep: Boolean = js.native
  /**
    * The world angle of the body in radians.
    **/
  /* CompleteClass */
  override var angle: Double = js.native
  /**
    * Angular damping is use to reduce the angular velocity. The damping parameter can be larger than 1.0f but the damping effect becomes sensitive to the time step when the damping parameter is large.
    **/
  /* CompleteClass */
  override var angularDamping: Double = js.native
  /**
    * The angular velocity of the body.
    **/
  /* CompleteClass */
  override var angularVelocity: Double = js.native
  /**
    * Is this body initially awake or sleeping?
    **/
  /* CompleteClass */
  override var awake: Boolean = js.native
  /**
    * Is this a fast moving body that should be prevented from tunneling through other moving bodies? Note that all bodies are prevented from tunneling through static bodies.
    * @warning You should use this flag sparingly since it increases processing time.
    **/
  /* CompleteClass */
  override var bullet: Boolean = js.native
  /**
    * Should this body be prevented from rotating? Useful for characters.
    **/
  /* CompleteClass */
  override var fixedRotation: Boolean = js.native
  /**
    * Scales the inertia tensor.
    * @warning Experimental
    **/
  /* CompleteClass */
  override var inertiaScale: Double = js.native
  /**
    * Linear damping is use to reduce the linear velocity. The damping parameter can be larger than 1.0f but the damping effect becomes sensitive to the time step when the damping parameter is large.
    **/
  /* CompleteClass */
  override var linearDamping: Double = js.native
  /**
    * The linear velocity of the body's origin in world co-ordinates.
    **/
  /* CompleteClass */
  override var linearVelocity: b2Vec2 = js.native
  /**
    * The world position of the body. Avoid creating bodies at the origin since this can lead to many overlapping shapes.
    **/
  /* CompleteClass */
  override var position: b2Vec2 = js.native
  /**
    * The body type: static, kinematic, or dynamic. A member of the b2BodyType class .
    * @note If a dynamic body would have zero mass, the mass is set to one.
    **/
  /* CompleteClass */
  override var `type`: Double = js.native
  /**
    * Use this to store application specific body data.
    **/
  /* CompleteClass */
  override var userData: js.Any = js.native
}

