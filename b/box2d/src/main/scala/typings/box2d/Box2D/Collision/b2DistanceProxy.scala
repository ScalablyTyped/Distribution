package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Collision.Shapes.b2Shape
import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2DistanceProxy extends js.Object {
  /**
    * Count
    **/
  var m_count: Double
  /**
    * Radius
    **/
  var m_radius: Double
  /**
    * Verticies
    **/
  var m_vertices: js.Array[b2Vec2]
  /**
    * Get the supporting vertex index in the given direction.
    * @param d Direction to look for the supporting vertex.
    * @return Supporting vertex index.
    **/
  def GetSupport(d: b2Vec2): Double
  /**
    * Get the supporting vertex in the given direction.
    * @param d Direction to look for the supporting vertex.
    * @return Supporting vertex.
    **/
  def GetSupportVertex(d: b2Vec2): b2Vec2
  /**
    * Get a vertex by index.  Used by b2Distance.
    * @param index Vetex's index.
    * @return Vertex at the given index.
    **/
  def GetVertex(index: Double): b2Vec2
  /**
    * Get the vertex count.
    * @return The number of vertices. (m_vertices.length)
    **/
  def GetVertexCount(): Double
  /**
    * Initialize the proxy using the given shape. The shape must remain in scope while the proxy is in use.
    * @param shape Shape to initialize the distance proxy.
    **/
  def Set(shape: b2Shape): Unit
}

object b2DistanceProxy {
  @scala.inline
  def apply(
    GetSupport: b2Vec2 => Double,
    GetSupportVertex: b2Vec2 => b2Vec2,
    GetVertex: Double => b2Vec2,
    GetVertexCount: () => Double,
    Set: b2Shape => Unit,
    m_count: Double,
    m_radius: Double,
    m_vertices: js.Array[b2Vec2]
  ): b2DistanceProxy = {
    val __obj = js.Dynamic.literal(GetSupport = js.Any.fromFunction1(GetSupport), GetSupportVertex = js.Any.fromFunction1(GetSupportVertex), GetVertex = js.Any.fromFunction1(GetVertex), GetVertexCount = js.Any.fromFunction0(GetVertexCount), Set = js.Any.fromFunction1(Set), m_count = m_count.asInstanceOf[js.Any], m_radius = m_radius.asInstanceOf[js.Any], m_vertices = m_vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2DistanceProxy]
  }
}

