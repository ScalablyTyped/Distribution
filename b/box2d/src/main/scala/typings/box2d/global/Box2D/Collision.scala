package typings.box2d.global.Box2D

import typings.box2d.Box2D.Common.Math.b2Transform
import typings.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collision {
  
  @JSGlobal("Box2D.Collision.Features")
  @js.native
  class Features ()
    extends typings.box2d.Box2D.Collision.Features
  
  object Shapes {
    
    @JSGlobal("Box2D.Collision.Shapes.b2CircleShape")
    @js.native
    /**
      * Creates a new circle shape.
      * @param radius Circle radius.
      **/
    class b2CircleShape ()
      extends typings.box2d.Box2D.Collision.Shapes.b2CircleShape {
      def this(radius: Double) = this()
    }
    
    @JSGlobal("Box2D.Collision.Shapes.b2EdgeChainDef")
    @js.native
    /**
      * Creates a new edge chain def.
      **/
    class b2EdgeChainDef ()
      extends typings.box2d.Box2D.Collision.Shapes.b2EdgeChainDef
    
    @JSGlobal("Box2D.Collision.Shapes.b2EdgeShape")
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
    
    @JSGlobal("Box2D.Collision.Shapes.b2MassData")
    @js.native
    class b2MassData ()
      extends typings.box2d.Box2D.Collision.Shapes.b2MassData
    
    @JSGlobal("Box2D.Collision.Shapes.b2PolygonShape")
    @js.native
    class b2PolygonShape ()
      extends typings.box2d.Box2D.Collision.Shapes.b2PolygonShape
    /* static members */
    object b2PolygonShape {
      
      /**
        * Creates a b2PolygonShape from a vertices list. This assumes the vertices define a convex polygon.  It is assumed that the exterior is the the right of each edge.
        * @param vertices List of vertices to create the polygon shape from.
        * @param vertexCount Number of vertices in the shape, default value is 0 and in the box2dweb.js code it is ignored.
        * @return Convex polygon shape.
        **/
      @JSGlobal("Box2D.Collision.Shapes.b2PolygonShape.AsArray")
      @js.native
      def AsArray(vertices: js.Array[b2Vec2]): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = js.native
      @JSGlobal("Box2D.Collision.Shapes.b2PolygonShape.AsArray")
      @js.native
      def AsArray(vertices: js.Array[b2Vec2], vertexCount: Double): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = js.native
      
      /**
        * Build vertices to represent an axis-aligned box.
        * @param hx The half-width.
        * @param hy The half-height.
        * @return Box polygon shape.
        **/
      @JSGlobal("Box2D.Collision.Shapes.b2PolygonShape.AsBox")
      @js.native
      def AsBox(hx: Double, hy: Double): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = js.native
      
      /**
        * Creates a single edge from two vertices.
        * @param v1 First vertex.
        * @param v2 Second vertex.
        * @return Edge polygon shape.
        **/
      @JSGlobal("Box2D.Collision.Shapes.b2PolygonShape.AsEdge")
      @js.native
      def AsEdge(v1: b2Vec2, b2: b2Vec2): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = js.native
      
      /**
        * Build vertices to represent an oriented box.
        * @param hx The half-width.
        * @param hy The half-height.
        * @param center The center of the box in local coordinates, default is null (no center?)
        * @param angle The rotation of the box in local coordinates, default is 0.0.
        * @return Oriented box shape.
        **/
      @JSGlobal("Box2D.Collision.Shapes.b2PolygonShape.AsOrientedBox")
      @js.native
      def AsOrientedBox(hx: Double, hy: Double): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = js.native
      @JSGlobal("Box2D.Collision.Shapes.b2PolygonShape.AsOrientedBox")
      @js.native
      def AsOrientedBox(hx: Double, hy: Double, center: js.UndefOr[scala.Nothing], angle: Double): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = js.native
      @JSGlobal("Box2D.Collision.Shapes.b2PolygonShape.AsOrientedBox")
      @js.native
      def AsOrientedBox(hx: Double, hy: Double, center: b2Vec2): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = js.native
      @JSGlobal("Box2D.Collision.Shapes.b2PolygonShape.AsOrientedBox")
      @js.native
      def AsOrientedBox(hx: Double, hy: Double, center: b2Vec2, angle: Double): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = js.native
      
      /**
        * This assumes the vertices define a convex polygon.  It is assumed that the exterior is the the right of each edge.
        * @param vertices List of vertices to create the polygon shape from.
        * @param vertexCount The number of vertices, default is 0 and in the box2dweb.js code it is ignored.
        * @return Convex polygon shape.
        **/
      @JSGlobal("Box2D.Collision.Shapes.b2PolygonShape.AsVector")
      @js.native
      def AsVector(vertices: js.Array[b2Vec2]): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = js.native
      @JSGlobal("Box2D.Collision.Shapes.b2PolygonShape.AsVector")
      @js.native
      def AsVector(vertices: js.Array[b2Vec2], vertexCount: Double): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = js.native
    }
    
    @JSGlobal("Box2D.Collision.Shapes.b2Shape")
    @js.native
    /**
      * Creates a new b2Shape.
      **/
    class b2Shape ()
      extends typings.box2d.Box2D.Collision.Shapes.b2Shape
    /* static members */
    object b2Shape {
      
      @JSGlobal("Box2D.Collision.Shapes.b2Shape")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Test if two shapes overlap with the applied transforms.
        * @param shape1 shape to test for overlap with shape2.
        * @param transform1 shape1 transform to apply.
        * @param shape2 shape to test for overlap with shape1.
        * @param transform2 shape2 transform to apply.
        * @return True if shape1 and shape2 overlap, otherwise false.
        **/
      @JSGlobal("Box2D.Collision.Shapes.b2Shape.TestOverlap")
      @js.native
      def TestOverlap(
        shape1: typings.box2d.Box2D.Collision.Shapes.b2Shape,
        transform1: b2Transform,
        shape2: typings.box2d.Box2D.Collision.Shapes.b2Shape,
        transform2: b2Transform
      ): Boolean = js.native
      
      @JSGlobal("Box2D.Collision.Shapes.b2Shape.e_circleShape")
      @js.native
      def e_circleShape: Double = js.native
      @scala.inline
      def e_circleShape_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_circleShape")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Box2D.Collision.Shapes.b2Shape.e_edgeShape")
      @js.native
      def e_edgeShape: Double = js.native
      @scala.inline
      def e_edgeShape_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_edgeShape")(x.asInstanceOf[js.Any])
      
      /**
        * Return value for TestSegment indicating a hit.
        **/
      @JSGlobal("Box2D.Collision.Shapes.b2Shape.e_hitCollide")
      @js.native
      def e_hitCollide: Double = js.native
      @scala.inline
      def e_hitCollide_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_hitCollide")(x.asInstanceOf[js.Any])
      
      /**
        * Return value for TestSegment indicating a miss.
        **/
      @JSGlobal("Box2D.Collision.Shapes.b2Shape.e_missCollide")
      @js.native
      def e_missCollide: Double = js.native
      @scala.inline
      def e_missCollide_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_missCollide")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Box2D.Collision.Shapes.b2Shape.e_polygonShape")
      @js.native
      def e_polygonShape: Double = js.native
      @scala.inline
      def e_polygonShape_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_polygonShape")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Box2D.Collision.Shapes.b2Shape.e_shapeTypeCount")
      @js.native
      def e_shapeTypeCount: Double = js.native
      @scala.inline
      def e_shapeTypeCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_shapeTypeCount")(x.asInstanceOf[js.Any])
      
      // Note: these enums are public in the source but no referenced by the documentation
      @JSGlobal("Box2D.Collision.Shapes.b2Shape.e_unknownShape")
      @js.native
      def e_unknownShape: Double = js.native
      @scala.inline
      def e_unknownShape_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_unknownShape")(x.asInstanceOf[js.Any])
      
      /**
        * Return value for TestSegment indicating that the segment starting point, p1, is already inside the shape.
        **/
      @JSGlobal("Box2D.Collision.Shapes.b2Shape.startsInsideCollide")
      @js.native
      def startsInsideCollide: Double = js.native
      @scala.inline
      def startsInsideCollide_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startsInsideCollide")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSGlobal("Box2D.Collision.b2AABB")
  @js.native
  class b2AABB ()
    extends typings.box2d.Box2D.Collision.b2AABB
  /* static members */
  object b2AABB {
    
    /**
      * Combines two AABBs into one with max values for upper bound and min values for lower bound.
      * @param aabb1 First AABB to combine.
      * @param aabb2 Second AABB to combine.
      * @return New AABB with max values from aabb1 and aabb2.
      **/
    @JSGlobal("Box2D.Collision.b2AABB.Combine")
    @js.native
    def Combine(aabb1: typings.box2d.Box2D.Collision.b2AABB, aabb2: typings.box2d.Box2D.Collision.b2AABB): typings.box2d.Box2D.Collision.b2AABB = js.native
  }
  
  @JSGlobal("Box2D.Collision.b2ContactID")
  @js.native
  /**
    * Creates a new Contact ID.
    **/
  class b2ContactID ()
    extends typings.box2d.Box2D.Collision.b2ContactID
  
  @JSGlobal("Box2D.Collision.b2ContactPoint")
  @js.native
  class b2ContactPoint ()
    extends typings.box2d.Box2D.Collision.b2ContactPoint
  
  @JSGlobal("Box2D.Collision.b2DistanceInput")
  @js.native
  class b2DistanceInput ()
    extends typings.box2d.Box2D.Collision.b2DistanceInput
  
  @JSGlobal("Box2D.Collision.b2DistanceOutput")
  @js.native
  class b2DistanceOutput ()
    extends typings.box2d.Box2D.Collision.b2DistanceOutput
  
  @JSGlobal("Box2D.Collision.b2DistanceProxy")
  @js.native
  class b2DistanceProxy ()
    extends typings.box2d.Box2D.Collision.b2DistanceProxy
  
  @JSGlobal("Box2D.Collision.b2DynamicTree")
  @js.native
  /**
    * Constructing the tree initializes the node pool.
    **/
  class b2DynamicTree ()
    extends typings.box2d.Box2D.Collision.b2DynamicTree
  
  @JSGlobal("Box2D.Collision.b2DynamicTreeBroadPhase")
  @js.native
  /**
    * Creates the dynamic tree broad phase.
    **/
  class b2DynamicTreeBroadPhase ()
    extends typings.box2d.Box2D.Collision.b2DynamicTreeBroadPhase
  
  @JSGlobal("Box2D.Collision.b2DynamicTreeNode")
  @js.native
  class b2DynamicTreeNode ()
    extends typings.box2d.Box2D.Collision.b2DynamicTreeNode
  
  @JSGlobal("Box2D.Collision.b2Manifold")
  @js.native
  /**
    * Creates a new manifold.
    **/
  class b2Manifold ()
    extends typings.box2d.Box2D.Collision.b2Manifold
  /* static members */
  object b2Manifold {
    
    @JSGlobal("Box2D.Collision.b2Manifold")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Circles
      **/
    @JSGlobal("Box2D.Collision.b2Manifold.e_circles")
    @js.native
    def e_circles: Double = js.native
    @scala.inline
    def e_circles_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_circles")(x.asInstanceOf[js.Any])
    
    /**
      * Face A
      **/
    @JSGlobal("Box2D.Collision.b2Manifold.e_faceA")
    @js.native
    def e_faceA: Double = js.native
    @scala.inline
    def e_faceA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_faceA")(x.asInstanceOf[js.Any])
    
    /**
      * Face B
      **/
    @JSGlobal("Box2D.Collision.b2Manifold.e_faceB")
    @js.native
    def e_faceB: Double = js.native
    @scala.inline
    def e_faceB_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_faceB")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Box2D.Collision.b2ManifoldPoint")
  @js.native
  /**
    * Creates a new manifold point.
    **/
  class b2ManifoldPoint ()
    extends typings.box2d.Box2D.Collision.b2ManifoldPoint
  
  @JSGlobal("Box2D.Collision.b2OBB")
  @js.native
  class b2OBB ()
    extends typings.box2d.Box2D.Collision.b2OBB
  
  @JSGlobal("Box2D.Collision.b2RayCastInput")
  @js.native
  /**
    * Creates a new ray cast input.
    * @param p1 Start point of the ray, default = null.
    * @param p2 End point of the ray, default = null.
    * @param maxFraction Truncate the ray to reach up to this fraction from p1 to p2.
    **/
  class b2RayCastInput ()
    extends typings.box2d.Box2D.Collision.b2RayCastInput {
    def this(p1: b2Vec2) = this()
    def this(p1: js.UndefOr[scala.Nothing], p2: b2Vec2) = this()
    def this(p1: b2Vec2, p2: b2Vec2) = this()
    def this(p1: js.UndefOr[scala.Nothing], p2: js.UndefOr[scala.Nothing], maxFraction: Double) = this()
    def this(p1: js.UndefOr[scala.Nothing], p2: b2Vec2, maxFraction: Double) = this()
    def this(p1: b2Vec2, p2: js.UndefOr[scala.Nothing], maxFraction: Double) = this()
    def this(p1: b2Vec2, p2: b2Vec2, maxFraction: Double) = this()
  }
  
  @JSGlobal("Box2D.Collision.b2RayCastOutput")
  @js.native
  class b2RayCastOutput ()
    extends typings.box2d.Box2D.Collision.b2RayCastOutput
  
  @JSGlobal("Box2D.Collision.b2Segment")
  @js.native
  class b2Segment ()
    extends typings.box2d.Box2D.Collision.b2Segment
  
  @JSGlobal("Box2D.Collision.b2SimplexCache")
  @js.native
  class b2SimplexCache ()
    extends typings.box2d.Box2D.Collision.b2SimplexCache
  
  @JSGlobal("Box2D.Collision.b2TOIInput")
  @js.native
  class b2TOIInput ()
    extends typings.box2d.Box2D.Collision.b2TOIInput
  
  @JSGlobal("Box2D.Collision.b2WorldManifold")
  @js.native
  /**
    * Creates a new b2WorldManifold.
    **/
  class b2WorldManifold ()
    extends typings.box2d.Box2D.Collision.b2WorldManifold
}
