package typings
package box2dLib.Box2DNs.DynamicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.b2FixtureDef")
@js.native
/**
		* The constructor sets the default fixture definition values.
		**/
class b2FixtureDef () extends js.Object {
  /**
  		* The density, usually in kg/m^2.
  		**/
  var density: scala.Double = js.native
  /**
  		* Contact filtering data.
  		**/
  var filter: b2FilterData = js.native
  /**
  		* The friction coefficient, usually in the range [0,1].
  		**/
  var friction: scala.Double = js.native
  /**
  		* A sensor shape collects contact information but never generates a collision response.
  		**/
  var isSensor: scala.Boolean = js.native
  /**
  		* The restitution (elasticity) usually in the range [0,1].
  		**/
  var restitution: scala.Double = js.native
  /**
  		* The shape, this must be set. The shape will be cloned, so you can create the shape on the stack.
  		**/
  var shape: box2dLib.Box2DNs.CollisionNs.ShapesNs.b2Shape = js.native
  /**
  		* Use this to store application specific fixture data.
  		**/
  var userData: js.Any = js.native
}

