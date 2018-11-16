package typings
package box2dLib.Box2DNs.CollisionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2RayCastOutput")
@js.native
class b2RayCastOutput () extends js.Object {
  /**
  		* The fraction between p1 and p2 that the collision occurs at.
  		**/
  var fraction: scala.Double = js.native
  /**
  		* The normal at the point of collision.
  		**/
  var normal: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
}

