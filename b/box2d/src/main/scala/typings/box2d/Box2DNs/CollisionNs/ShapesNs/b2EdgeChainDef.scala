package typings.box2d.Box2DNs.CollisionNs.ShapesNs

import typings.box2d.Box2DNs.CommonNs.MathNs.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.Shapes.b2EdgeChainDef")
@js.native
/**
		* Creates a new edge chain def.
		**/
class b2EdgeChainDef () extends js.Object {
  /**
  		* Whether to create an extra edge between the first and last vertices.
  		**/
  var isALoop: Boolean = js.native
  /**
  		* The number of vertices in the chain.
  		**/
  var vertexCount: Double = js.native
  /**
  		* The vertices in local coordinates.
  		**/
  var vertices: b2Vec2 = js.native
}

