package typings
package box2dLib.Box2DNs.CollisionNs.ShapesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.Shapes.b2MassData")
@js.native
class b2MassData () extends js.Object {
  /**
  		* The rotational inertia of the shape. This may be about the center or local origin, depending on usage.
  		**/
  var I: scala.Double = js.native
  /**
  		* The position of the shape's centroid relative to the shape's origin.
  		**/
  var center: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* The mass of the shape, usually in kilograms.
  		**/
  var mass: scala.Double = js.native
}

