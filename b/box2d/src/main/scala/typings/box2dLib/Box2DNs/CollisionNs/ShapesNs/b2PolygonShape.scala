package typings
package box2dLib.Box2DNs.CollisionNs.ShapesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.Shapes.b2PolygonShape")
@js.native
class b2PolygonShape () extends b2Shape {
  /**
  		* Get the edge normal vectors. There is one for each vertex.
  		* @return List of edge normal vectors for each vertex.
  		**/
  def GetNormals(): js.Array[box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2] = js.native
  /**
  		* Get the supporting vertex index in the given direction.
  		* @param d Direction to look.
  		* @return Vertex index supporting the direction.
  		**/
  def GetSupport(d: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): scala.Double = js.native
  /**
  		* Get the supporting vertex in the given direction.
  		* @param d Direciton to look.
  		* @return Vertex supporting the direction.
  		**/
  def GetSupportVertex(d: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Get the vertex count.
  		* @return Vertex count.
  		**/
  def GetVertexCount(): scala.Double = js.native
  /**
  		* Get the vertices in local coordinates.
  		* @return List of the vertices in local coordinates.
  		**/
  def GetVertices(): js.Array[box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2] = js.native
  /**
  		* Copy vertices. This assumes the vertices define a convex polygon.  It is assumed that the exterior is the the right of each edge.
  		* @param vertices List of vertices to create the polygon shape from.
  		* @param vertexCount Number of vertices in the shape, default value is 0 and in the box2dweb.js code it is ignored.
  		* @return Convex polygon shape.
  		**/
  def SetAsArray(vertices: js.Array[box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2]): scala.Unit = js.native
  /**
  		* Copy vertices. This assumes the vertices define a convex polygon.  It is assumed that the exterior is the the right of each edge.
  		* @param vertices List of vertices to create the polygon shape from.
  		* @param vertexCount Number of vertices in the shape, default value is 0 and in the box2dweb.js code it is ignored.
  		* @return Convex polygon shape.
  		**/
  def SetAsArray(vertices: js.Array[box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2], vertexCount: scala.Double): scala.Unit = js.native
  /**
  		* Build vertices to represent an axis-aligned box.
  		* @param hx The half-width.
  		* @param hy The half-height.
  		* @return Box polygon shape.
  		**/
  def SetAsBox(hx: scala.Double, hy: scala.Double): scala.Unit = js.native
  /**
  		* Creates a single edge from two vertices.
  		* @param v1 First vertex.
  		* @param v2 Second vertex.
  		* @return Edge polygon shape.
  		**/
  def SetAsEdge(v1: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2, b2: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): scala.Unit = js.native
  /**
  		* Build vertices to represent an oriented box.
  		* @param hx The half-width.
  		* @param hy The half-height.
  		* @param center The center of the box in local coordinates, default is null (no center?)
  		* @param angle The rotation of the box in local coordinates, default is 0.0.
  		* @return Oriented box shape.
  		**/
  def SetAsOrientedBox(hx: scala.Double, hy: scala.Double): scala.Unit = js.native
  /**
  		* Build vertices to represent an oriented box.
  		* @param hx The half-width.
  		* @param hy The half-height.
  		* @param center The center of the box in local coordinates, default is null (no center?)
  		* @param angle The rotation of the box in local coordinates, default is 0.0.
  		* @return Oriented box shape.
  		**/
  def SetAsOrientedBox(hx: scala.Double, hy: scala.Double, center: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): scala.Unit = js.native
  /**
  		* Build vertices to represent an oriented box.
  		* @param hx The half-width.
  		* @param hy The half-height.
  		* @param center The center of the box in local coordinates, default is null (no center?)
  		* @param angle The rotation of the box in local coordinates, default is 0.0.
  		* @return Oriented box shape.
  		**/
  def SetAsOrientedBox(
    hx: scala.Double,
    hy: scala.Double,
    center: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2,
    angle: scala.Double
  ): scala.Unit = js.native
  /**
  		* This assumes the vertices define a convex polygon.  It is assumed that the exterior is the the right of each edge.
  		* @param vertices List of vertices to create the polygon shape from.
  		* @param vertexCount The number of vertices, default is 0 and in the box2dweb.js code it is ignored.
  		* @return Convex polygon shape.
  		**/
  def SetAsVector(vertices: js.Array[_]): scala.Unit = js.native
  /**
  		* This assumes the vertices define a convex polygon.  It is assumed that the exterior is the the right of each edge.
  		* @param vertices List of vertices to create the polygon shape from.
  		* @param vertexCount The number of vertices, default is 0 and in the box2dweb.js code it is ignored.
  		* @return Convex polygon shape.
  		**/
  def SetAsVector(vertices: js.Array[_], vertexCount: scala.Double): scala.Unit = js.native
}

@JSGlobal("Box2D.Collision.Shapes.b2PolygonShape")
@js.native
object b2PolygonShape extends js.Object {
  /**
  		* Creates a b2PolygonShape from a vertices list. This assumes the vertices define a convex polygon.  It is assumed that the exterior is the the right of each edge.
  		* @param vertices List of vertices to create the polygon shape from.
  		* @param vertexCount Number of vertices in the shape, default value is 0 and in the box2dweb.js code it is ignored.
  		* @return Convex polygon shape.
  		**/
  def AsArray(vertices: js.Array[box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2]): box2dLib.Box2DNs.CollisionNs.ShapesNs.b2PolygonShape = js.native
  /**
  		* Creates a b2PolygonShape from a vertices list. This assumes the vertices define a convex polygon.  It is assumed that the exterior is the the right of each edge.
  		* @param vertices List of vertices to create the polygon shape from.
  		* @param vertexCount Number of vertices in the shape, default value is 0 and in the box2dweb.js code it is ignored.
  		* @return Convex polygon shape.
  		**/
  def AsArray(vertices: js.Array[box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2], vertexCount: scala.Double): box2dLib.Box2DNs.CollisionNs.ShapesNs.b2PolygonShape = js.native
  /**
  		* Build vertices to represent an axis-aligned box.
  		* @param hx The half-width.
  		* @param hy The half-height.
  		* @return Box polygon shape.
  		**/
  def AsBox(hx: scala.Double, hy: scala.Double): box2dLib.Box2DNs.CollisionNs.ShapesNs.b2PolygonShape = js.native
  /**
  		* Creates a single edge from two vertices.
  		* @param v1 First vertex.
  		* @param v2 Second vertex.
  		* @return Edge polygon shape.
  		**/
  def AsEdge(v1: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2, b2: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): box2dLib.Box2DNs.CollisionNs.ShapesNs.b2PolygonShape = js.native
  /**
  		* Build vertices to represent an oriented box.
  		* @param hx The half-width.
  		* @param hy The half-height.
  		* @param center The center of the box in local coordinates, default is null (no center?)
  		* @param angle The rotation of the box in local coordinates, default is 0.0.
  		* @return Oriented box shape.
  		**/
  def AsOrientedBox(hx: scala.Double, hy: scala.Double): box2dLib.Box2DNs.CollisionNs.ShapesNs.b2PolygonShape = js.native
  /**
  		* Build vertices to represent an oriented box.
  		* @param hx The half-width.
  		* @param hy The half-height.
  		* @param center The center of the box in local coordinates, default is null (no center?)
  		* @param angle The rotation of the box in local coordinates, default is 0.0.
  		* @return Oriented box shape.
  		**/
  def AsOrientedBox(hx: scala.Double, hy: scala.Double, center: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): box2dLib.Box2DNs.CollisionNs.ShapesNs.b2PolygonShape = js.native
  /**
  		* Build vertices to represent an oriented box.
  		* @param hx The half-width.
  		* @param hy The half-height.
  		* @param center The center of the box in local coordinates, default is null (no center?)
  		* @param angle The rotation of the box in local coordinates, default is 0.0.
  		* @return Oriented box shape.
  		**/
  def AsOrientedBox(
    hx: scala.Double,
    hy: scala.Double,
    center: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2,
    angle: scala.Double
  ): box2dLib.Box2DNs.CollisionNs.ShapesNs.b2PolygonShape = js.native
  /**
  		* This assumes the vertices define a convex polygon.  It is assumed that the exterior is the the right of each edge.
  		* @param vertices List of vertices to create the polygon shape from.
  		* @param vertexCount The number of vertices, default is 0 and in the box2dweb.js code it is ignored.
  		* @return Convex polygon shape.
  		**/
  def AsVector(vertices: js.Array[box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2]): box2dLib.Box2DNs.CollisionNs.ShapesNs.b2PolygonShape = js.native
  /**
  		* This assumes the vertices define a convex polygon.  It is assumed that the exterior is the the right of each edge.
  		* @param vertices List of vertices to create the polygon shape from.
  		* @param vertexCount The number of vertices, default is 0 and in the box2dweb.js code it is ignored.
  		* @return Convex polygon shape.
  		**/
  def AsVector(vertices: js.Array[box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2], vertexCount: scala.Double): box2dLib.Box2DNs.CollisionNs.ShapesNs.b2PolygonShape = js.native
}

