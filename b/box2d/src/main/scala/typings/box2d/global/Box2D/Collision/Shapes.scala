package typings.box2d.global.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Transform
import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.Shapes")
@js.native
object Shapes extends js.Object {
  @js.native
  /**
    * Creates a new circle shape.
    * @param radius Circle radius.
    **/
  class b2CircleShape ()
    extends typings.box2d.Box2D.Collision.Shapes.b2CircleShape {
    def this(radius: Double) = this()
  }
  
  @js.native
  /**
    * Creates a new edge chain def.
    **/
  class b2EdgeChainDef ()
    extends typings.box2d.Box2D.Collision.Shapes.b2EdgeChainDef
  
  @js.native
  class b2EdgeShape protected ()
    extends typings.box2d.Box2D.Collision.Shapes.b2EdgeShape {
    /**
      * Creates a new edge shape.
      * @param v1 First vertex
      * @param v2 Second vertex
      **/
    def this(v1: b2Vec2, v2: b2Vec2) = this()
  }
  
  @js.native
  class b2MassData ()
    extends typings.box2d.Box2D.Collision.Shapes.b2MassData
  
  @js.native
  class b2PolygonShape ()
    extends typings.box2d.Box2D.Collision.Shapes.b2PolygonShape
  
  @js.native
  /**
    * Creates a new b2Shape.
    **/
  class b2Shape ()
    extends typings.box2d.Box2D.Collision.Shapes.b2Shape
  
  /* static members */
  @js.native
  object b2PolygonShape extends js.Object {
    /**
      * Creates a b2PolygonShape from a vertices list. This assumes the vertices define a convex polygon.  It is assumed that the exterior is the the right of each edge.
      * @param vertices List of vertices to create the polygon shape from.
      * @param vertexCount Number of vertices in the shape, default value is 0 and in the box2dweb.js code it is ignored.
      * @return Convex polygon shape.
      **/
    def AsArray(vertices: js.Array[b2Vec2]): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = js.native
    def AsArray(vertices: js.Array[b2Vec2], vertexCount: Double): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = js.native
    /**
      * Build vertices to represent an axis-aligned box.
      * @param hx The half-width.
      * @param hy The half-height.
      * @return Box polygon shape.
      **/
    def AsBox(hx: Double, hy: Double): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = js.native
    /**
      * Creates a single edge from two vertices.
      * @param v1 First vertex.
      * @param v2 Second vertex.
      * @return Edge polygon shape.
      **/
    def AsEdge(v1: b2Vec2, b2: b2Vec2): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = js.native
    /**
      * Build vertices to represent an oriented box.
      * @param hx The half-width.
      * @param hy The half-height.
      * @param center The center of the box in local coordinates, default is null (no center?)
      * @param angle The rotation of the box in local coordinates, default is 0.0.
      * @return Oriented box shape.
      **/
    def AsOrientedBox(hx: Double, hy: Double): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = js.native
    def AsOrientedBox(hx: Double, hy: Double, center: js.UndefOr[scala.Nothing], angle: Double): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = js.native
    def AsOrientedBox(hx: Double, hy: Double, center: b2Vec2): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = js.native
    def AsOrientedBox(hx: Double, hy: Double, center: b2Vec2, angle: Double): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = js.native
    /**
      * This assumes the vertices define a convex polygon.  It is assumed that the exterior is the the right of each edge.
      * @param vertices List of vertices to create the polygon shape from.
      * @param vertexCount The number of vertices, default is 0 and in the box2dweb.js code it is ignored.
      * @return Convex polygon shape.
      **/
    def AsVector(vertices: js.Array[b2Vec2]): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = js.native
    def AsVector(vertices: js.Array[b2Vec2], vertexCount: Double): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = js.native
  }
  
  /* static members */
  @js.native
  object b2Shape extends js.Object {
    var e_circleShape: Double = js.native
    var e_edgeShape: Double = js.native
    /**
      * Return value for TestSegment indicating a hit.
      **/
    var e_hitCollide: Double = js.native
    /**
      * Return value for TestSegment indicating a miss.
      **/
    var e_missCollide: Double = js.native
    var e_polygonShape: Double = js.native
    var e_shapeTypeCount: Double = js.native
    // Note: these enums are public in the source but no referenced by the documentation
    var e_unknownShape: Double = js.native
    /**
      * Return value for TestSegment indicating that the segment starting point, p1, is already inside the shape.
      **/
    var startsInsideCollide: Double = js.native
    /**
      * Test if two shapes overlap with the applied transforms.
      * @param shape1 shape to test for overlap with shape2.
      * @param transform1 shape1 transform to apply.
      * @param shape2 shape to test for overlap with shape1.
      * @param transform2 shape2 transform to apply.
      * @return True if shape1 and shape2 overlap, otherwise false.
      **/
    def TestOverlap(
      shape1: typings.box2d.Box2D.Collision.Shapes.b2Shape,
      transform1: b2Transform,
      shape2: typings.box2d.Box2D.Collision.Shapes.b2Shape,
      transform2: b2Transform
    ): Boolean = js.native
  }
  
}

