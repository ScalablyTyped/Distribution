package typings.box2d.Box2D.Dynamics

import typings.box2d.Box2D.Collision.Shapes.b2Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2FixtureDef extends js.Object {
  /**
    * The density, usually in kg/m^2.
    **/
  var density: Double
  /**
    * Contact filtering data.
    **/
  var filter: b2FilterData
  /**
    * The friction coefficient, usually in the range [0,1].
    **/
  var friction: Double
  /**
    * A sensor shape collects contact information but never generates a collision response.
    **/
  var isSensor: Boolean
  /**
    * The restitution (elasticity) usually in the range [0,1].
    **/
  var restitution: Double
  /**
    * The shape, this must be set. The shape will be cloned, so you can create the shape on the stack.
    **/
  var shape: b2Shape
  /**
    * Use this to store application specific fixture data.
    **/
  var userData: js.Any
}

object b2FixtureDef {
  @scala.inline
  def apply(
    density: Double,
    filter: b2FilterData,
    friction: Double,
    isSensor: Boolean,
    restitution: Double,
    shape: b2Shape,
    userData: js.Any
  ): b2FixtureDef = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], isSensor = isSensor.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2FixtureDef]
  }
}

