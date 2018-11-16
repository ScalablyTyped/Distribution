package typings
package box2dLib.Box2DNs.CollisionNs.ShapesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.Shapes.b2EdgeShape")
@js.native
class b2EdgeShape protected () extends b2Shape {
  /**
  		* Creates a new edge shape.
  		* @param v1 First vertex
  		* @param v2 Second vertex
  		**/
  def this(v1: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2, v2: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2) = this()
  /**
  		* Determines if the first corner of this edge bends towards the solid side.
  		* @return True if convex, otherwise false.
  		**/
  def Corner1IsConvex(): scala.Boolean = js.native
  /**
  		* Determines if the second corner of this edge bends towards the solid side.
  		* @return True if convex, otherwise false.
  		**/
  def Corner2IsConvex(): scala.Boolean = js.native
  /**
  		* Get a core vertex 1 in local coordinates.  These vertices represent a smaller edge that is used for time of impact.
  		* @return core vertex 1 in local coordinates.
  		**/
  def GetCoreVertex1(): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Get a core vertex 2 in local coordinates.  These vertices represent a smaller edge that is used for time of impact.
  		* @return core vertex 2 in local coordinates.
  		**/
  def GetCoreVertex2(): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Returns a unit vector halfway between direction and previous direction.
  		* @return Halfway unit vector between direction and previous direction.
  		**/
  def GetCorner1Vector(): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Returns a unit vector halfway between direction and previous direction.
  		* @return Halfway unit vector between direction and previous direction.
  		**/
  def GetCorner2Vector(): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Get a parallel unit vector, pointing from vertex 1 to vertex 2.
  		* @return Vertex 1 to vertex 2 directional vector.
  		**/
  def GetDirectionVector(): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Get the first vertex and apply the supplied transform.
  		* @param xf Transform to apply.
  		* @return First vertex with xf transform applied.
  		**/
  def GetFirstVertex(xf: box2dLib.Box2DNs.CommonNs.MathNs.b2Transform): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Get the distance from vertex1 to vertex2.
  		* @return Distance from vertex1 to vertex2.
  		**/
  def GetLength(): scala.Double = js.native
  /**
  		* Get the next edge in the chain.
  		* @return Next edge shape or null if there is no next edge shape.
  		**/
  def GetNextEdge(): b2EdgeShape = js.native
  /**
  		* Get a perpendicular unit vector, pointing from the solid side to the empty side.
  		* @return Normal vector.
  		**/
  def GetNormalVector(): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Get the previous edge in the chain.
  		* @return Previous edge shape or null if there is no previous edge shape.
  		**/
  def GetPrevEdge(): b2EdgeShape = js.native
  /**
  		* Get the local position of vertex1 in the parent body.
  		* @return Local position of vertex1 in the parent body.
  		**/
  def GetVertex1(): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Get the local position of vertex2 in the parent body.
  		* @return Local position of vertex2 in the parent body.
  		**/
  def GetVertex2(): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Get the support point in the given world direction with the supplied transform.
  		* @param xf Transform to apply.
  		* @param dX X world direction.
  		* @param dY Y world direction.
  		* @return Support point.
  		**/
  def Support(xf: box2dLib.Box2DNs.CommonNs.MathNs.b2Transform, dX: scala.Double, dY: scala.Double): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
}

