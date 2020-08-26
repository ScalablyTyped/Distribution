package typings.box2d.Box2D.Collision.Shapes

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2PolygonShape extends b2Shape {
  /**
    * Get the edge normal vectors. There is one for each vertex.
    * @return List of edge normal vectors for each vertex.
    **/
  def GetNormals(): js.Array[b2Vec2] = js.native
  /**
    * Get the supporting vertex index in the given direction.
    * @param d Direction to look.
    * @return Vertex index supporting the direction.
    **/
  def GetSupport(d: b2Vec2): Double = js.native
  /**
    * Get the supporting vertex in the given direction.
    * @param d Direciton to look.
    * @return Vertex supporting the direction.
    **/
  def GetSupportVertex(d: b2Vec2): b2Vec2 = js.native
  /**
    * Get the vertex count.
    * @return Vertex count.
    **/
  def GetVertexCount(): Double = js.native
  /**
    * Get the vertices in local coordinates.
    * @return List of the vertices in local coordinates.
    **/
  def GetVertices(): js.Array[b2Vec2] = js.native
  /**
    * Copy vertices. This assumes the vertices define a convex polygon.  It is assumed that the exterior is the the right of each edge.
    * @param vertices List of vertices to create the polygon shape from.
    * @param vertexCount Number of vertices in the shape, default value is 0 and in the box2dweb.js code it is ignored.
    * @return Convex polygon shape.
    **/
  def SetAsArray(vertices: js.Array[b2Vec2]): Unit = js.native
  def SetAsArray(vertices: js.Array[b2Vec2], vertexCount: Double): Unit = js.native
  /**
    * Build vertices to represent an axis-aligned box.
    * @param hx The half-width.
    * @param hy The half-height.
    * @return Box polygon shape.
    **/
  def SetAsBox(hx: Double, hy: Double): Unit = js.native
  /**
    * Creates a single edge from two vertices.
    * @param v1 First vertex.
    * @param v2 Second vertex.
    * @return Edge polygon shape.
    **/
  def SetAsEdge(v1: b2Vec2, b2: b2Vec2): Unit = js.native
  /**
    * Build vertices to represent an oriented box.
    * @param hx The half-width.
    * @param hy The half-height.
    * @param center The center of the box in local coordinates, default is null (no center?)
    * @param angle The rotation of the box in local coordinates, default is 0.0.
    * @return Oriented box shape.
    **/
  def SetAsOrientedBox(hx: Double, hy: Double): Unit = js.native
  def SetAsOrientedBox(hx: Double, hy: Double, center: js.UndefOr[scala.Nothing], angle: Double): Unit = js.native
  def SetAsOrientedBox(hx: Double, hy: Double, center: b2Vec2): Unit = js.native
  def SetAsOrientedBox(hx: Double, hy: Double, center: b2Vec2, angle: Double): Unit = js.native
  /**
    * This assumes the vertices define a convex polygon.  It is assumed that the exterior is the the right of each edge.
    * @param vertices List of vertices to create the polygon shape from.
    * @param vertexCount The number of vertices, default is 0 and in the box2dweb.js code it is ignored.
    * @return Convex polygon shape.
    **/
  def SetAsVector(vertices: js.Array[_]): Unit = js.native
  def SetAsVector(vertices: js.Array[_], vertexCount: Double): Unit = js.native
}

