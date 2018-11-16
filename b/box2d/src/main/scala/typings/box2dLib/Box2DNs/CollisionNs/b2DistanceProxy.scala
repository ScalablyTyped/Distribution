package typings
package box2dLib.Box2DNs.CollisionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2DistanceProxy")
@js.native
class b2DistanceProxy () extends js.Object {
  /**
  		* Count
  		**/
  var m_count: scala.Double = js.native
  /**
  		* Radius
  		**/
  var m_radius: scala.Double = js.native
  /**
  		* Verticies
  		**/
  var m_vertices: js.Array[box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2] = js.native
  /**
  		* Get the supporting vertex index in the given direction.
  		* @param d Direction to look for the supporting vertex.
  		* @return Supporting vertex index.
  		**/
  def GetSupport(d: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): scala.Double = js.native
  /**
  		* Get the supporting vertex in the given direction.
  		* @param d Direction to look for the supporting vertex.
  		* @return Supporting vertex.
  		**/
  def GetSupportVertex(d: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Get a vertex by index.  Used by b2Distance.
  		* @param index Vetex's index.
  		* @return Vertex at the given index.
  		**/
  def GetVertex(index: scala.Double): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Get the vertex count.
  		* @return The number of vertices. (m_vertices.length)
  		**/
  def GetVertexCount(): scala.Double = js.native
  /**
  		* Initialize the proxy using the given shape. The shape must remain in scope while the proxy is in use.
  		* @param shape Shape to initialize the distance proxy.
  		**/
  def Set(shape: box2dLib.Box2DNs.CollisionNs.ShapesNs.b2Shape): scala.Unit = js.native
}

