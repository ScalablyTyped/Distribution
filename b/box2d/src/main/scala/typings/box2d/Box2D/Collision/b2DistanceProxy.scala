package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Collision.Shapes.b2Shape
import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2DistanceProxy")
@js.native
class b2DistanceProxy () extends js.Object {
  /**
  		* Count
  		**/
  var m_count: Double = js.native
  /**
  		* Radius
  		**/
  var m_radius: Double = js.native
  /**
  		* Verticies
  		**/
  var m_vertices: js.Array[b2Vec2] = js.native
  /**
  		* Get the supporting vertex index in the given direction.
  		* @param d Direction to look for the supporting vertex.
  		* @return Supporting vertex index.
  		**/
  def GetSupport(d: b2Vec2): Double = js.native
  /**
  		* Get the supporting vertex in the given direction.
  		* @param d Direction to look for the supporting vertex.
  		* @return Supporting vertex.
  		**/
  def GetSupportVertex(d: b2Vec2): b2Vec2 = js.native
  /**
  		* Get a vertex by index.  Used by b2Distance.
  		* @param index Vetex's index.
  		* @return Vertex at the given index.
  		**/
  def GetVertex(index: Double): b2Vec2 = js.native
  /**
  		* Get the vertex count.
  		* @return The number of vertices. (m_vertices.length)
  		**/
  def GetVertexCount(): Double = js.native
  /**
  		* Initialize the proxy using the given shape. The shape must remain in scope while the proxy is in use.
  		* @param shape Shape to initialize the distance proxy.
  		**/
  def Set(shape: b2Shape): Unit = js.native
}

