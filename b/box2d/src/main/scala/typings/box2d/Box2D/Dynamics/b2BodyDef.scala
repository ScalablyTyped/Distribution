package typings.box2d.Box2D.Dynamics

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2BodyDef extends js.Object {
  /**
    * Does this body start out active?
    **/
  var active: Boolean
  /**
    * Set this flag to false if this body should never fall asleep. Note that this increases CPU usage.
    **/
  var allowSleep: Boolean
  /**
    * The world angle of the body in radians.
    **/
  var angle: Double
  /**
    * Angular damping is use to reduce the angular velocity. The damping parameter can be larger than 1.0f but the damping effect becomes sensitive to the time step when the damping parameter is large.
    **/
  var angularDamping: Double
  /**
    * The angular velocity of the body.
    **/
  var angularVelocity: Double
  /**
    * Is this body initially awake or sleeping?
    **/
  var awake: Boolean
  /**
    * Is this a fast moving body that should be prevented from tunneling through other moving bodies? Note that all bodies are prevented from tunneling through static bodies.
    * @warning You should use this flag sparingly since it increases processing time.
    **/
  var bullet: Boolean
  /**
    * Should this body be prevented from rotating? Useful for characters.
    **/
  var fixedRotation: Boolean
  /**
    * Scales the inertia tensor.
    * @warning Experimental
    **/
  var inertiaScale: Double
  /**
    * Linear damping is use to reduce the linear velocity. The damping parameter can be larger than 1.0f but the damping effect becomes sensitive to the time step when the damping parameter is large.
    **/
  var linearDamping: Double
  /**
    * The linear velocity of the body's origin in world co-ordinates.
    **/
  var linearVelocity: b2Vec2
  /**
    * The world position of the body. Avoid creating bodies at the origin since this can lead to many overlapping shapes.
    **/
  var position: b2Vec2
  /**
    * The body type: static, kinematic, or dynamic. A member of the b2BodyType class .
    * @note If a dynamic body would have zero mass, the mass is set to one.
    **/
  var `type`: Double
  /**
    * Use this to store application specific body data.
    **/
  var userData: js.Any
}

object b2BodyDef {
  @scala.inline
  def apply(
    active: Boolean,
    allowSleep: Boolean,
    angle: Double,
    angularDamping: Double,
    angularVelocity: Double,
    awake: Boolean,
    bullet: Boolean,
    fixedRotation: Boolean,
    inertiaScale: Double,
    linearDamping: Double,
    linearVelocity: b2Vec2,
    position: b2Vec2,
    `type`: Double,
    userData: js.Any
  ): b2BodyDef = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], allowSleep = allowSleep.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], angularDamping = angularDamping.asInstanceOf[js.Any], angularVelocity = angularVelocity.asInstanceOf[js.Any], awake = awake.asInstanceOf[js.Any], bullet = bullet.asInstanceOf[js.Any], fixedRotation = fixedRotation.asInstanceOf[js.Any], inertiaScale = inertiaScale.asInstanceOf[js.Any], linearDamping = linearDamping.asInstanceOf[js.Any], linearVelocity = linearVelocity.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2BodyDef]
  }
}

