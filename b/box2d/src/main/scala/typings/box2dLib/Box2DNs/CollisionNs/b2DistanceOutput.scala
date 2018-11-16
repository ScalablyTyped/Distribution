package typings
package box2dLib.Box2DNs.CollisionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2DistanceOutput")
@js.native
class b2DistanceOutput () extends js.Object {
  /**
  		*  Calculated distance.
  		**/
  var distance: scala.Double = js.native
  /**
  		* Number of gjk iterations used in calculation.
  		**/
  var iterations: scala.Double = js.native
  /**
  		* Closest point on shape A.
  		**/
  var pointA: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Closest point on shape B.
  		**/
  var pointB: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
}

