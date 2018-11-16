package typings
package box2dLib.Box2DNs.CollisionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2OBB")
@js.native
class b2OBB () extends js.Object {
  /**
  		* The rotation matrix.
  		**/
  var R: box2dLib.Box2DNs.CommonNs.MathNs.b2Mat22 = js.native
  /**
  		* The local centroid.
  		**/
  var center: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* The half-widths.
  		**/
  var extents: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
}

