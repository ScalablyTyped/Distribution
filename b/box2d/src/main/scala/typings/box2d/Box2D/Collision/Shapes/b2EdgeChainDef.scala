package typings.box2d.Box2D.Collision.Shapes

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2EdgeChainDef extends js.Object {
  /**
    * Whether to create an extra edge between the first and last vertices.
    **/
  var isALoop: Boolean
  /**
    * The number of vertices in the chain.
    **/
  var vertexCount: Double
  /**
    * The vertices in local coordinates.
    **/
  var vertices: b2Vec2
}

object b2EdgeChainDef {
  @scala.inline
  def apply(isALoop: Boolean, vertexCount: Double, vertices: b2Vec2): b2EdgeChainDef = {
    val __obj = js.Dynamic.literal(isALoop = isALoop.asInstanceOf[js.Any], vertexCount = vertexCount.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2EdgeChainDef]
  }
}

