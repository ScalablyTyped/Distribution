package typings.box2d.Box2DNs.CollisionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2SimplexCache")
@js.native
class b2SimplexCache () extends js.Object {
  /**
  		* Number in cache.
  		**/
  var count: Double = js.native
  /**
  		* Vertices on shape a.
  		**/
  var indexA: js.Array[Double] = js.native
  /**
  		* Vertices on shape b.
  		**/
  var indexB: js.Array[Double] = js.native
  /**
  		* Length or area.
  		**/
  var metric: Double = js.native
}

