package typings
package box2dLib.Box2DNs.CollisionNs.ShapesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.Shapes.b2EdgeChainDef")
@js.native
class b2EdgeChainDef () extends js.Object {
  /**
  		* Whether to create an extra edge between the first and last vertices.
  		**/
  var isALoop: scala.Boolean = js.native
  /**
  		* The number of vertices in the chain.
  		**/
  var vertexCount: scala.Double = js.native
  /**
  		* The vertices in local coordinates.
  		**/
  var vertices: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
}

