package typings
package box2dLib.Box2DNs.CollisionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2SimplexCache")
@js.native
class b2SimplexCache () extends js.Object {
  /**
  		* Number in cache.
  		**/
  var count: scala.Double = js.native
  /**
  		* Vertices on shape a.
  		**/
  var indexA: js.Array[scala.Double] = js.native
  /**
  		* Vertices on shape b.
  		**/
  var indexB: js.Array[scala.Double] = js.native
  /**
  		* Length or area.
  		**/
  var metric: scala.Double = js.native
}

