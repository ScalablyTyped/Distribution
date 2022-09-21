package typings.box2d.global.Box2D

import typings.box2d.Box2D.Collision.Shapes.b2Shape
import typings.box2d.Box2D.Common.Math.b2Mat22
import typings.box2d.Box2D.Common.Math.b2Sweep
import typings.box2d.Box2D.Common.Math.b2Transform
import typings.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collision {
  
  @JSGlobal("Box2D.Collision.Features")
  @js.native
  open class Features ()
    extends StObject
       with typings.box2d.Box2D.Collision.Features {
    
    /**
      * A value of 1 indicates that the reference edge is on shape2.
      **/
    /* CompleteClass */
    var flip: Double = js.native
    
    /**
      * The edge most anti-parallel to the reference edge.
      **/
    /* CompleteClass */
    var incidentEdge: Double = js.native
    
    /**
      * The vertex (0 or 1) on the incident edge that was clipped.
      **/
    /* CompleteClass */
    var incidentVertex: Double = js.native
    
    /**
      * The edge that defines the outward contact normal.
      **/
    /* CompleteClass */
    var referenceEdge: Double = js.native
  }
  
  object Shapes {
    
    @JSGlobal("Box2D.Collision.Shapes.b2CircleShape")
    @js.native
    /**
      * Creates a new circle shape.
      * @param radius Circle radius.
      **/
    open class b2CircleShape ()
      extends StObject
         with typings.box2d.Box2D.Collision.Shapes.b2CircleShape {
      def this(radius: Double) = this()
      
      /**
        * Given a transform, compute the associated axis aligned bounding box for this shape.
        * @param aabb Calculated AABB, this argument is `out`.
        * @param xf Transform to calculate the AABB.
        **/
      /* CompleteClass */
      override def ComputeAABB(aabb: typings.box2d.Box2D.Collision.b2AABB, xf: b2Transform): Unit = js.native
      
      /**
        * Compute the mass properties of this shape using its dimensions and density. The inertia tensor is computed about the local origin, not the centroid.
        * @param massData Calculate the mass, this argument is `out`.
        * @param density Density.
        **/
      /* CompleteClass */
      override def ComputeMass(massData: typings.box2d.Box2D.Collision.Shapes.b2MassData, density: Double): Unit = js.native
      
      /**
        * Compute the volume and centroid of this shape intersected with a half plane
        * @param normal The surface normal.
        * @param offset The surface offset along the normal.
        * @param xf The shape transform.
        * @param c The centroid, this argument is `out`.
        **/
      /* CompleteClass */
      override def ComputeSubmergedArea(normal: b2Vec2, offset: Double, xf: b2Transform, c: b2Vec2): Double = js.native
      
      /**
        * Clone the shape.
        **/
      /* CompleteClass */
      override def Copy(): typings.box2d.Box2D.Collision.Shapes.b2Shape = js.native
      
      /**
        * Get the local position of this circle in its parent body.
        * @return This circle's local position.
        **/
      /* CompleteClass */
      override def GetLocalPosition(): b2Vec2 = js.native
      
      /**
        * Get the radius of the circle.
        * @return This circle's radius.
        **/
      /* CompleteClass */
      override def GetRadius(): Double = js.native
      
      /**
        * Get the type of this shape. You can use this to down cast to the concrete shape.
        **/
      /* CompleteClass */
      override def GetType(): Double = js.native
      
      /**
        * Cast a ray against this shape.
        * @param output Ray cast results, this argument is `out`.
        * @param input Ray cast input parameters.
        * @param transform The transform to be applied to the shape.
        * @param return True if the ray hits the shape, otherwise false.
        **/
      /* CompleteClass */
      override def RayCast(
        output: typings.box2d.Box2D.Collision.b2RayCastOutput,
        input: typings.box2d.Box2D.Collision.b2RayCastInput,
        transform: b2Transform
      ): Boolean = js.native
      
      /**
        * Set the circle shape values from another shape.
        * @param other The other circle shape to copy values from.
        **/
      /* CompleteClass */
      override def Set(other: typings.box2d.Box2D.Collision.Shapes.b2CircleShape): Unit = js.native
      /**
        * Set the shape values from another shape.
        * @param other The other shape to copy values from.
        **/
      /* CompleteClass */
      override def Set(other: typings.box2d.Box2D.Collision.Shapes.b2Shape): Unit = js.native
      
      /**
        * Set the local position of this circle in its parent body.
        * @param position The new local position of this circle.
        **/
      /* CompleteClass */
      override def SetLocalPosition(position: b2Vec2): Unit = js.native
      
      /**
        * Set the radius of the circle.
        * @param radius The new radius of the circle.
        **/
      /* CompleteClass */
      override def SetRadius(radius: Double): Unit = js.native
      
      /**
        * Test a point for containment in this shape. This only works for convex shapes.
        * @param xf Shape world transform.
        * @param p Point to test against, in world coordinates.
        * @return True if the point is in this shape, otherwise false.
        **/
      /* CompleteClass */
      override def TestPoint(xf: b2Transform, p: b2Vec2): Boolean = js.native
    }
    
    @JSGlobal("Box2D.Collision.Shapes.b2EdgeChainDef")
    @js.native
    /**
      * Creates a new edge chain def.
      **/
    open class b2EdgeChainDef ()
      extends StObject
         with typings.box2d.Box2D.Collision.Shapes.b2EdgeChainDef {
      
      /**
        * Whether to create an extra edge between the first and last vertices.
        **/
      /* CompleteClass */
      var isALoop: Boolean = js.native
      
      /**
        * The number of vertices in the chain.
        **/
      /* CompleteClass */
      var vertexCount: Double = js.native
      
      /**
        * The vertices in local coordinates.
        **/
      /* CompleteClass */
      var vertices: b2Vec2 = js.native
    }
    
    @JSGlobal("Box2D.Collision.Shapes.b2EdgeShape")
    @js.native
    open class b2EdgeShape protected ()
      extends StObject
         with typings.box2d.Box2D.Collision.Shapes.b2EdgeShape {
      /**
        * Creates a new edge shape.
        * @param v1 First vertex
        * @param v2 Second vertex
        **/
      def this(v1: b2Vec2, v2: b2Vec2) = this()
      
      /**
        * Given a transform, compute the associated axis aligned bounding box for this shape.
        * @param aabb Calculated AABB, this argument is `out`.
        * @param xf Transform to calculate the AABB.
        **/
      /* CompleteClass */
      override def ComputeAABB(aabb: typings.box2d.Box2D.Collision.b2AABB, xf: b2Transform): Unit = js.native
      
      /**
        * Compute the mass properties of this shape using its dimensions and density. The inertia tensor is computed about the local origin, not the centroid.
        * @param massData Calculate the mass, this argument is `out`.
        * @param density Density.
        **/
      /* CompleteClass */
      override def ComputeMass(massData: typings.box2d.Box2D.Collision.Shapes.b2MassData, density: Double): Unit = js.native
      
      /**
        * Compute the volume and centroid of this shape intersected with a half plane
        * @param normal The surface normal.
        * @param offset The surface offset along the normal.
        * @param xf The shape transform.
        * @param c The centroid, this argument is `out`.
        **/
      /* CompleteClass */
      override def ComputeSubmergedArea(normal: b2Vec2, offset: Double, xf: b2Transform, c: b2Vec2): Double = js.native
      
      /**
        * Clone the shape.
        **/
      /* CompleteClass */
      override def Copy(): typings.box2d.Box2D.Collision.Shapes.b2Shape = js.native
      
      /**
        * Determines if the first corner of this edge bends towards the solid side.
        * @return True if convex, otherwise false.
        **/
      /* CompleteClass */
      override def Corner1IsConvex(): Boolean = js.native
      
      /**
        * Determines if the second corner of this edge bends towards the solid side.
        * @return True if convex, otherwise false.
        **/
      /* CompleteClass */
      override def Corner2IsConvex(): Boolean = js.native
      
      /**
        * Get a core vertex 1 in local coordinates.  These vertices represent a smaller edge that is used for time of impact.
        * @return core vertex 1 in local coordinates.
        **/
      /* CompleteClass */
      override def GetCoreVertex1(): b2Vec2 = js.native
      
      /**
        * Get a core vertex 2 in local coordinates.  These vertices represent a smaller edge that is used for time of impact.
        * @return core vertex 2 in local coordinates.
        **/
      /* CompleteClass */
      override def GetCoreVertex2(): b2Vec2 = js.native
      
      /**
        * Returns a unit vector halfway between direction and previous direction.
        * @return Halfway unit vector between direction and previous direction.
        **/
      /* CompleteClass */
      override def GetCorner1Vector(): b2Vec2 = js.native
      
      /**
        * Returns a unit vector halfway between direction and previous direction.
        * @return Halfway unit vector between direction and previous direction.
        **/
      /* CompleteClass */
      override def GetCorner2Vector(): b2Vec2 = js.native
      
      /**
        * Get a parallel unit vector, pointing from vertex 1 to vertex 2.
        * @return Vertex 1 to vertex 2 directional vector.
        **/
      /* CompleteClass */
      override def GetDirectionVector(): b2Vec2 = js.native
      
      /**
        * Get the first vertex and apply the supplied transform.
        * @param xf Transform to apply.
        * @return First vertex with xf transform applied.
        **/
      /* CompleteClass */
      override def GetFirstVertex(xf: b2Transform): b2Vec2 = js.native
      
      /**
        * Get the distance from vertex1 to vertex2.
        * @return Distance from vertex1 to vertex2.
        **/
      /* CompleteClass */
      override def GetLength(): Double = js.native
      
      /**
        * Get the next edge in the chain.
        * @return Next edge shape or null if there is no next edge shape.
        **/
      /* CompleteClass */
      override def GetNextEdge(): typings.box2d.Box2D.Collision.Shapes.b2EdgeShape = js.native
      
      /**
        * Get a perpendicular unit vector, pointing from the solid side to the empty side.
        * @return Normal vector.
        **/
      /* CompleteClass */
      override def GetNormalVector(): b2Vec2 = js.native
      
      /**
        * Get the previous edge in the chain.
        * @return Previous edge shape or null if there is no previous edge shape.
        **/
      /* CompleteClass */
      override def GetPrevEdge(): typings.box2d.Box2D.Collision.Shapes.b2EdgeShape = js.native
      
      /**
        * Get the type of this shape. You can use this to down cast to the concrete shape.
        **/
      /* CompleteClass */
      override def GetType(): Double = js.native
      
      /**
        * Get the local position of vertex1 in the parent body.
        * @return Local position of vertex1 in the parent body.
        **/
      /* CompleteClass */
      override def GetVertex1(): b2Vec2 = js.native
      
      /**
        * Get the local position of vertex2 in the parent body.
        * @return Local position of vertex2 in the parent body.
        **/
      /* CompleteClass */
      override def GetVertex2(): b2Vec2 = js.native
      
      /**
        * Cast a ray against this shape.
        * @param output Ray cast results, this argument is `out`.
        * @param input Ray cast input parameters.
        * @param transform The transform to be applied to the shape.
        * @param return True if the ray hits the shape, otherwise false.
        **/
      /* CompleteClass */
      override def RayCast(
        output: typings.box2d.Box2D.Collision.b2RayCastOutput,
        input: typings.box2d.Box2D.Collision.b2RayCastInput,
        transform: b2Transform
      ): Boolean = js.native
      
      /**
        * Set the shape values from another shape.
        * @param other The other shape to copy values from.
        **/
      /* CompleteClass */
      override def Set(other: typings.box2d.Box2D.Collision.Shapes.b2Shape): Unit = js.native
      
      /**
        * Get the support point in the given world direction with the supplied transform.
        * @param xf Transform to apply.
        * @param dX X world direction.
        * @param dY Y world direction.
        * @return Support point.
        **/
      /* CompleteClass */
      override def Support(xf: b2Transform, dX: Double, dY: Double): b2Vec2 = js.native
      
      /**
        * Test a point for containment in this shape. This only works for convex shapes.
        * @param xf Shape world transform.
        * @param p Point to test against, in world coordinates.
        * @return True if the point is in this shape, otherwise false.
        **/
      /* CompleteClass */
      override def TestPoint(xf: b2Transform, p: b2Vec2): Boolean = js.native
    }
    
    @JSGlobal("Box2D.Collision.Shapes.b2MassData")
    @js.native
    open class b2MassData ()
      extends StObject
         with typings.box2d.Box2D.Collision.Shapes.b2MassData {
      
      /**
        * The rotational inertia of the shape. This may be about the center or local origin, depending on usage.
        **/
      /* CompleteClass */
      var I: Double = js.native
      
      /**
        * The position of the shape's centroid relative to the shape's origin.
        **/
      /* CompleteClass */
      var center: b2Vec2 = js.native
      
      /**
        * The mass of the shape, usually in kilograms.
        **/
      /* CompleteClass */
      var mass: Double = js.native
    }
    
    @JSGlobal("Box2D.Collision.Shapes.b2PolygonShape")
    @js.native
    open class b2PolygonShape ()
      extends StObject
         with typings.box2d.Box2D.Collision.Shapes.b2PolygonShape {
      
      /**
        * Given a transform, compute the associated axis aligned bounding box for this shape.
        * @param aabb Calculated AABB, this argument is `out`.
        * @param xf Transform to calculate the AABB.
        **/
      /* CompleteClass */
      override def ComputeAABB(aabb: typings.box2d.Box2D.Collision.b2AABB, xf: b2Transform): Unit = js.native
      
      /**
        * Compute the mass properties of this shape using its dimensions and density. The inertia tensor is computed about the local origin, not the centroid.
        * @param massData Calculate the mass, this argument is `out`.
        * @param density Density.
        **/
      /* CompleteClass */
      override def ComputeMass(massData: typings.box2d.Box2D.Collision.Shapes.b2MassData, density: Double): Unit = js.native
      
      /**
        * Compute the volume and centroid of this shape intersected with a half plane
        * @param normal The surface normal.
        * @param offset The surface offset along the normal.
        * @param xf The shape transform.
        * @param c The centroid, this argument is `out`.
        **/
      /* CompleteClass */
      override def ComputeSubmergedArea(normal: b2Vec2, offset: Double, xf: b2Transform, c: b2Vec2): Double = js.native
      
      /**
        * Clone the shape.
        **/
      /* CompleteClass */
      override def Copy(): typings.box2d.Box2D.Collision.Shapes.b2Shape = js.native
      
      /**
        * Get the type of this shape. You can use this to down cast to the concrete shape.
        **/
      /* CompleteClass */
      override def GetType(): Double = js.native
      
      /**
        * Cast a ray against this shape.
        * @param output Ray cast results, this argument is `out`.
        * @param input Ray cast input parameters.
        * @param transform The transform to be applied to the shape.
        * @param return True if the ray hits the shape, otherwise false.
        **/
      /* CompleteClass */
      override def RayCast(
        output: typings.box2d.Box2D.Collision.b2RayCastOutput,
        input: typings.box2d.Box2D.Collision.b2RayCastInput,
        transform: b2Transform
      ): Boolean = js.native
      
      /**
        * Set the shape values from another shape.
        * @param other The other shape to copy values from.
        **/
      /* CompleteClass */
      override def Set(other: typings.box2d.Box2D.Collision.Shapes.b2Shape): Unit = js.native
      
      /**
        * Test a point for containment in this shape. This only works for convex shapes.
        * @param xf Shape world transform.
        * @param p Point to test against, in world coordinates.
        * @return True if the point is in this shape, otherwise false.
        **/
      /* CompleteClass */
      override def TestPoint(xf: b2Transform, p: b2Vec2): Boolean = js.native
    }
    /* static members */
    object b2PolygonShape {
      
      @JSGlobal("Box2D.Collision.Shapes.b2PolygonShape")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a b2PolygonShape from a vertices list. This assumes the vertices define a convex polygon.  It is assumed that the exterior is the the right of each edge.
        * @param vertices List of vertices to create the polygon shape from.
        * @param vertexCount Number of vertices in the shape, default value is 0 and in the box2dweb.js code it is ignored.
        * @return Convex polygon shape.
        **/
      inline def AsArray(vertices: js.Array[b2Vec2]): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = ^.asInstanceOf[js.Dynamic].applyDynamic("AsArray")(vertices.asInstanceOf[js.Any]).asInstanceOf[typings.box2d.Box2D.Collision.Shapes.b2PolygonShape]
      inline def AsArray(vertices: js.Array[b2Vec2], vertexCount: Double): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = (^.asInstanceOf[js.Dynamic].applyDynamic("AsArray")(vertices.asInstanceOf[js.Any], vertexCount.asInstanceOf[js.Any])).asInstanceOf[typings.box2d.Box2D.Collision.Shapes.b2PolygonShape]
      
      /**
        * Build vertices to represent an axis-aligned box.
        * @param hx The half-width.
        * @param hy The half-height.
        * @return Box polygon shape.
        **/
      inline def AsBox(hx: Double, hy: Double): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = (^.asInstanceOf[js.Dynamic].applyDynamic("AsBox")(hx.asInstanceOf[js.Any], hy.asInstanceOf[js.Any])).asInstanceOf[typings.box2d.Box2D.Collision.Shapes.b2PolygonShape]
      
      /**
        * Creates a single edge from two vertices.
        * @param v1 First vertex.
        * @param v2 Second vertex.
        * @return Edge polygon shape.
        **/
      inline def AsEdge(v1: b2Vec2, b2: b2Vec2): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = (^.asInstanceOf[js.Dynamic].applyDynamic("AsEdge")(v1.asInstanceOf[js.Any], b2.asInstanceOf[js.Any])).asInstanceOf[typings.box2d.Box2D.Collision.Shapes.b2PolygonShape]
      
      /**
        * Build vertices to represent an oriented box.
        * @param hx The half-width.
        * @param hy The half-height.
        * @param center The center of the box in local coordinates, default is null (no center?)
        * @param angle The rotation of the box in local coordinates, default is 0.0.
        * @return Oriented box shape.
        **/
      inline def AsOrientedBox(hx: Double, hy: Double): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = (^.asInstanceOf[js.Dynamic].applyDynamic("AsOrientedBox")(hx.asInstanceOf[js.Any], hy.asInstanceOf[js.Any])).asInstanceOf[typings.box2d.Box2D.Collision.Shapes.b2PolygonShape]
      inline def AsOrientedBox(hx: Double, hy: Double, center: Unit, angle: Double): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = (^.asInstanceOf[js.Dynamic].applyDynamic("AsOrientedBox")(hx.asInstanceOf[js.Any], hy.asInstanceOf[js.Any], center.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[typings.box2d.Box2D.Collision.Shapes.b2PolygonShape]
      inline def AsOrientedBox(hx: Double, hy: Double, center: b2Vec2): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = (^.asInstanceOf[js.Dynamic].applyDynamic("AsOrientedBox")(hx.asInstanceOf[js.Any], hy.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[typings.box2d.Box2D.Collision.Shapes.b2PolygonShape]
      inline def AsOrientedBox(hx: Double, hy: Double, center: b2Vec2, angle: Double): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = (^.asInstanceOf[js.Dynamic].applyDynamic("AsOrientedBox")(hx.asInstanceOf[js.Any], hy.asInstanceOf[js.Any], center.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[typings.box2d.Box2D.Collision.Shapes.b2PolygonShape]
      
      /**
        * This assumes the vertices define a convex polygon.  It is assumed that the exterior is the the right of each edge.
        * @param vertices List of vertices to create the polygon shape from.
        * @param vertexCount The number of vertices, default is 0 and in the box2dweb.js code it is ignored.
        * @return Convex polygon shape.
        **/
      inline def AsVector(vertices: js.Array[b2Vec2]): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = ^.asInstanceOf[js.Dynamic].applyDynamic("AsVector")(vertices.asInstanceOf[js.Any]).asInstanceOf[typings.box2d.Box2D.Collision.Shapes.b2PolygonShape]
      inline def AsVector(vertices: js.Array[b2Vec2], vertexCount: Double): typings.box2d.Box2D.Collision.Shapes.b2PolygonShape = (^.asInstanceOf[js.Dynamic].applyDynamic("AsVector")(vertices.asInstanceOf[js.Any], vertexCount.asInstanceOf[js.Any])).asInstanceOf[typings.box2d.Box2D.Collision.Shapes.b2PolygonShape]
    }
    
    @JSGlobal("Box2D.Collision.Shapes.b2Shape")
    @js.native
    /**
      * Creates a new b2Shape.
      **/
    open class b2Shape ()
      extends StObject
         with typings.box2d.Box2D.Collision.Shapes.b2Shape {
      
      /**
        * Given a transform, compute the associated axis aligned bounding box for this shape.
        * @param aabb Calculated AABB, this argument is `out`.
        * @param xf Transform to calculate the AABB.
        **/
      /* CompleteClass */
      override def ComputeAABB(aabb: typings.box2d.Box2D.Collision.b2AABB, xf: b2Transform): Unit = js.native
      
      /**
        * Compute the mass properties of this shape using its dimensions and density. The inertia tensor is computed about the local origin, not the centroid.
        * @param massData Calculate the mass, this argument is `out`.
        * @param density Density.
        **/
      /* CompleteClass */
      override def ComputeMass(massData: typings.box2d.Box2D.Collision.Shapes.b2MassData, density: Double): Unit = js.native
      
      /**
        * Compute the volume and centroid of this shape intersected with a half plane
        * @param normal The surface normal.
        * @param offset The surface offset along the normal.
        * @param xf The shape transform.
        * @param c The centroid, this argument is `out`.
        **/
      /* CompleteClass */
      override def ComputeSubmergedArea(normal: b2Vec2, offset: Double, xf: b2Transform, c: b2Vec2): Double = js.native
      
      /**
        * Clone the shape.
        **/
      /* CompleteClass */
      override def Copy(): typings.box2d.Box2D.Collision.Shapes.b2Shape = js.native
      
      /**
        * Get the type of this shape. You can use this to down cast to the concrete shape.
        **/
      /* CompleteClass */
      override def GetType(): Double = js.native
      
      /**
        * Cast a ray against this shape.
        * @param output Ray cast results, this argument is `out`.
        * @param input Ray cast input parameters.
        * @param transform The transform to be applied to the shape.
        * @param return True if the ray hits the shape, otherwise false.
        **/
      /* CompleteClass */
      override def RayCast(
        output: typings.box2d.Box2D.Collision.b2RayCastOutput,
        input: typings.box2d.Box2D.Collision.b2RayCastInput,
        transform: b2Transform
      ): Boolean = js.native
      
      /**
        * Set the shape values from another shape.
        * @param other The other shape to copy values from.
        **/
      /* CompleteClass */
      override def Set(other: typings.box2d.Box2D.Collision.Shapes.b2Shape): Unit = js.native
      
      /**
        * Test a point for containment in this shape. This only works for convex shapes.
        * @param xf Shape world transform.
        * @param p Point to test against, in world coordinates.
        * @return True if the point is in this shape, otherwise false.
        **/
      /* CompleteClass */
      override def TestPoint(xf: b2Transform, p: b2Vec2): Boolean = js.native
    }
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
      inline def TestOverlap(
        shape1: typings.box2d.Box2D.Collision.Shapes.b2Shape,
        transform1: b2Transform,
        shape2: typings.box2d.Box2D.Collision.Shapes.b2Shape,
        transform2: b2Transform
      ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("TestOverlap")(shape1.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], shape2.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      @JSGlobal("Box2D.Collision.Shapes.b2Shape.e_circleShape")
      @js.native
      def e_circleShape: Double = js.native
      inline def e_circleShape_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_circleShape")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Box2D.Collision.Shapes.b2Shape.e_edgeShape")
      @js.native
      def e_edgeShape: Double = js.native
      inline def e_edgeShape_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_edgeShape")(x.asInstanceOf[js.Any])
      
      /**
        * Return value for TestSegment indicating a hit.
        **/
      @JSGlobal("Box2D.Collision.Shapes.b2Shape.e_hitCollide")
      @js.native
      def e_hitCollide: Double = js.native
      inline def e_hitCollide_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_hitCollide")(x.asInstanceOf[js.Any])
      
      /**
        * Return value for TestSegment indicating a miss.
        **/
      @JSGlobal("Box2D.Collision.Shapes.b2Shape.e_missCollide")
      @js.native
      def e_missCollide: Double = js.native
      inline def e_missCollide_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_missCollide")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Box2D.Collision.Shapes.b2Shape.e_polygonShape")
      @js.native
      def e_polygonShape: Double = js.native
      inline def e_polygonShape_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_polygonShape")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Box2D.Collision.Shapes.b2Shape.e_shapeTypeCount")
      @js.native
      def e_shapeTypeCount: Double = js.native
      inline def e_shapeTypeCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_shapeTypeCount")(x.asInstanceOf[js.Any])
      
      // Note: these enums are public in the source but no referenced by the documentation
      @JSGlobal("Box2D.Collision.Shapes.b2Shape.e_unknownShape")
      @js.native
      def e_unknownShape: Double = js.native
      inline def e_unknownShape_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_unknownShape")(x.asInstanceOf[js.Any])
      
      /**
        * Return value for TestSegment indicating that the segment starting point, p1, is already inside the shape.
        **/
      @JSGlobal("Box2D.Collision.Shapes.b2Shape.startsInsideCollide")
      @js.native
      def startsInsideCollide: Double = js.native
      inline def startsInsideCollide_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startsInsideCollide")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSGlobal("Box2D.Collision.b2AABB")
  @js.native
  open class b2AABB ()
    extends StObject
       with typings.box2d.Box2D.Collision.b2AABB {
    
    /**
      * Combines two AABBs into one with max values for upper bound and min values for lower bound.  The result is stored in this AABB.
      * @param aabb1 First AABB to combine.
      * @param aabb2 Second AABB to combine.
      **/
    /* CompleteClass */
    override def Combine(aabb1: typings.box2d.Box2D.Collision.b2AABB, aabb2: typings.box2d.Box2D.Collision.b2AABB): Unit = js.native
    
    /**
      * Determines if an AABB is contained within this one.
      * @param aabb AABB to see if it is contained.
      * @return True if aabb is contained, otherwise false.
      **/
    /* CompleteClass */
    override def Contains(aabb: typings.box2d.Box2D.Collision.b2AABB): Boolean = js.native
    
    /**
      * Gets the center of the AABB.
      * @return Center of this AABB.
      **/
    /* CompleteClass */
    override def GetCenter(): b2Vec2 = js.native
    
    /**
      * Gets the extents of the AABB (half-widths).
      * @return Extents of this AABB.
      **/
    /* CompleteClass */
    override def GetExtents(): b2Vec2 = js.native
    
    /**
      * Verify that the bounds are sorted.
      * @return True if the bounds are sorted, otherwise false.
      **/
    /* CompleteClass */
    override def IsValid(): Boolean = js.native
    
    /**
      * Perform a precise raycast against this AABB.
      * @param output Ray cast output values.
      * @param input Ray cast input values.
      * @return True if the ray cast hits this AABB, otherwise false.
      **/
    /* CompleteClass */
    override def RayCast(
      output: typings.box2d.Box2D.Collision.b2RayCastOutput,
      input: typings.box2d.Box2D.Collision.b2RayCastInput
    ): Boolean = js.native
    
    /**
      * Tests if another AABB overlaps this AABB.
      * @param other Other AABB to test for overlap.
      * @return True if other overlaps this AABB, otherwise false.
      **/
    /* CompleteClass */
    override def TestOverlap(other: typings.box2d.Box2D.Collision.b2AABB): Boolean = js.native
    
    /**
      * Lower bound.
      **/
    /* CompleteClass */
    var lowerBound: b2Vec2 = js.native
    
    /**
      * Upper bound.
      **/
    /* CompleteClass */
    var upperBound: b2Vec2 = js.native
  }
  /* static members */
  object b2AABB {
    
    @JSGlobal("Box2D.Collision.b2AABB")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combines two AABBs into one with max values for upper bound and min values for lower bound.
      * @param aabb1 First AABB to combine.
      * @param aabb2 Second AABB to combine.
      * @return New AABB with max values from aabb1 and aabb2.
      **/
    inline def Combine(aabb1: typings.box2d.Box2D.Collision.b2AABB, aabb2: typings.box2d.Box2D.Collision.b2AABB): typings.box2d.Box2D.Collision.b2AABB = (^.asInstanceOf[js.Dynamic].applyDynamic("Combine")(aabb1.asInstanceOf[js.Any], aabb2.asInstanceOf[js.Any])).asInstanceOf[typings.box2d.Box2D.Collision.b2AABB]
  }
  
  @JSGlobal("Box2D.Collision.b2ContactID")
  @js.native
  /**
    * Creates a new Contact ID.
    **/
  open class b2ContactID ()
    extends StObject
       with typings.box2d.Box2D.Collision.b2ContactID {
    
    /**
      * Copies the Contact ID.
      * @return Copied Contact ID.
      **/
    /* CompleteClass */
    override def Copy(): typings.box2d.Box2D.Collision.b2ContactID = js.native
    
    /**
      * ID Key
      **/
    /* CompleteClass */
    var Key: Double = js.native
    
    /**
      * Sets the Contact ID from a Contact ID.
      * @param id The Contact ID to copy values from.
      **/
    /* CompleteClass */
    override def Set(id: typings.box2d.Box2D.Collision.b2ContactID): Unit = js.native
    
    /**
      * Features
      **/
    /* CompleteClass */
    var features: typings.box2d.Box2D.Collision.Features = js.native
  }
  
  @JSGlobal("Box2D.Collision.b2ContactPoint")
  @js.native
  open class b2ContactPoint ()
    extends StObject
       with typings.box2d.Box2D.Collision.b2ContactPoint {
    
    /**
      * The combined friction coefficient.
      **/
    /* CompleteClass */
    var friction: Double = js.native
    
    /**
      * The contact id identifies the features in contact.
      **/
    /* CompleteClass */
    var id: typings.box2d.Box2D.Collision.b2ContactID = js.native
    
    /**
      * Points from shape1 to shape2.
      **/
    /* CompleteClass */
    var normal: b2Vec2 = js.native
    
    /**
      * Position in world coordinates.
      **/
    /* CompleteClass */
    var position: b2Vec2 = js.native
    
    /**
      * The combined restitution coefficient.
      **/
    /* CompleteClass */
    var restitution: Double = js.native
    
    /**
      * The separation is negative when shapes are touching.
      **/
    /* CompleteClass */
    var separation: Double = js.native
    
    /**
      * The first shape.
      **/
    /* CompleteClass */
    var shape1: b2Shape = js.native
    
    /**
      * The second shape.
      **/
    /* CompleteClass */
    var shape2: b2Shape = js.native
    
    /**
      * Velocity of point on body2 relative to point on body1 (pre-solver).
      **/
    /* CompleteClass */
    var velocity: b2Vec2 = js.native
  }
  
  @JSGlobal("Box2D.Collision.b2DistanceInput")
  @js.native
  open class b2DistanceInput ()
    extends StObject
       with typings.box2d.Box2D.Collision.b2DistanceInput {
    
    /**
      * Proxy A
      **/
    /* CompleteClass */
    var proxyA: typings.box2d.Box2D.Collision.b2DistanceProxy = js.native
    
    /**
      * Proxy B
      **/
    /* CompleteClass */
    var proxyB: typings.box2d.Box2D.Collision.b2DistanceProxy = js.native
    
    /**
      * Transform A
      **/
    /* CompleteClass */
    var transformA: b2Transform = js.native
    
    /**
      * Transform B
      **/
    /* CompleteClass */
    var transformB: b2Transform = js.native
    
    /**
      * Use shape radii in computation?
      **/
    /* CompleteClass */
    var useRadii: Boolean = js.native
  }
  
  @JSGlobal("Box2D.Collision.b2DistanceOutput")
  @js.native
  open class b2DistanceOutput ()
    extends StObject
       with typings.box2d.Box2D.Collision.b2DistanceOutput {
    
    /**
      *  Calculated distance.
      **/
    /* CompleteClass */
    var distance: Double = js.native
    
    /**
      * Number of gjk iterations used in calculation.
      **/
    /* CompleteClass */
    var iterations: Double = js.native
    
    /**
      * Closest point on shape A.
      **/
    /* CompleteClass */
    var pointA: b2Vec2 = js.native
    
    /**
      * Closest point on shape B.
      **/
    /* CompleteClass */
    var pointB: b2Vec2 = js.native
  }
  
  @JSGlobal("Box2D.Collision.b2DistanceProxy")
  @js.native
  open class b2DistanceProxy ()
    extends StObject
       with typings.box2d.Box2D.Collision.b2DistanceProxy {
    
    /**
      * Get the supporting vertex index in the given direction.
      * @param d Direction to look for the supporting vertex.
      * @return Supporting vertex index.
      **/
    /* CompleteClass */
    override def GetSupport(d: b2Vec2): Double = js.native
    
    /**
      * Get the supporting vertex in the given direction.
      * @param d Direction to look for the supporting vertex.
      * @return Supporting vertex.
      **/
    /* CompleteClass */
    override def GetSupportVertex(d: b2Vec2): b2Vec2 = js.native
    
    /**
      * Get a vertex by index.  Used by b2Distance.
      * @param index Vetex's index.
      * @return Vertex at the given index.
      **/
    /* CompleteClass */
    override def GetVertex(index: Double): b2Vec2 = js.native
    
    /**
      * Get the vertex count.
      * @return The number of vertices. (m_vertices.length)
      **/
    /* CompleteClass */
    override def GetVertexCount(): Double = js.native
    
    /**
      * Initialize the proxy using the given shape. The shape must remain in scope while the proxy is in use.
      * @param shape Shape to initialize the distance proxy.
      **/
    /* CompleteClass */
    override def Set(shape: b2Shape): Unit = js.native
    
    /**
      * Count
      **/
    /* CompleteClass */
    var m_count: Double = js.native
    
    /**
      * Radius
      **/
    /* CompleteClass */
    var m_radius: Double = js.native
    
    /**
      * Verticies
      **/
    /* CompleteClass */
    var m_vertices: js.Array[b2Vec2] = js.native
  }
  
  @JSGlobal("Box2D.Collision.b2DynamicTree")
  @js.native
  /**
    * Constructing the tree initializes the node pool.
    **/
  open class b2DynamicTree ()
    extends StObject
       with typings.box2d.Box2D.Collision.b2DynamicTree {
    
    /**
      * Create a proxy. Provide a tight fitting AABB and a userData.
      * @param aabb AABB.
      * @param userDate User defined data for this proxy.
      * @return Dynamic tree node.
      **/
    /* CompleteClass */
    override def CreateProxy(aabb: typings.box2d.Box2D.Collision.b2AABB, userData: Any): typings.box2d.Box2D.Collision.b2DynamicTreeNode = js.native
    
    /**
      * Destroy a proxy. This asserts if the id is invalid.
      * @param proxy Proxy to destroy.
      **/
    /* CompleteClass */
    override def DestroyProxy(proxy: typings.box2d.Box2D.Collision.b2DynamicTreeNode): Unit = js.native
    
    /**
      * Gets the Fat AABB for the proxy.
      * @param proxy Proxy to retrieve Fat AABB.
      * @return Fat AABB for proxy.
      **/
    /* CompleteClass */
    override def GetFatAABB(proxy: typings.box2d.Box2D.Collision.b2DynamicTreeNode): typings.box2d.Box2D.Collision.b2AABB = js.native
    
    /**
      * Get user data from a proxy. Returns null if the proxy is invalid.
      * Cast to your type on return.
      * @param proxy Proxy to retrieve user data from.
      * @return User data for proxy or null if proxy is invalid.
      **/
    /* CompleteClass */
    override def GetUserData(proxy: typings.box2d.Box2D.Collision.b2DynamicTreeNode): Any = js.native
    
    /**
      * Move a proxy with a swept AABB. If the proxy has moved outside of its fattened AABB, then the proxy is removed from the tree and re-inserted. Otherwise the function returns immediately.
      * @param proxy Proxy to move.
      * @param aabb Swept AABB.
      * @param displacement Extra AABB displacement.
      **/
    /* CompleteClass */
    override def MoveProxy(
      proxy: typings.box2d.Box2D.Collision.b2DynamicTreeNode,
      aabb: typings.box2d.Box2D.Collision.b2AABB,
      displacement: b2Vec2
    ): Boolean = js.native
    
    /**
      * Query an AABB for overlapping proxies. The callback is called for each proxy that overlaps the supplied AABB. The callback should match function signature fuction callback(proxy:b2DynamicTreeNode):Boolean and should return false to trigger premature termination.
      * @param callback Called for each proxy that overlaps the supplied AABB.
      *    param proxy Proxy overlapping the supplied AABB.
      * @aabb Proxies are query for overlap on this AABB.
      **/
    /* CompleteClass */
    override def Query(
      callback: js.Function1[/* proxy */ typings.box2d.Box2D.Collision.b2DynamicTreeNode, Boolean],
      aabb: typings.box2d.Box2D.Collision.b2AABB
    ): Unit = js.native
    
    /**
      * Ray-cast against the proxies in the tree. This relies on the callback to perform a exact ray-cast in the case were the proxy contains a shape. The callback also performs the any collision filtering. This has performance roughly equal to k log(n), where k is the number of collisions and n is the number of proxies in the tree.
      * @param callback Called for each proxy that is hit by the ray.
      *    param input Ray cast input data.
      *    param proxy The proxy hit by the ray cast.
      *    return Return value is the new value for maxFraction.
      * @param input Ray cast input data.  Query all proxies along this ray cast.
      **/
    /* CompleteClass */
    override def RayCast(
      callback: js.Function2[
          /* input */ typings.box2d.Box2D.Collision.b2RayCastInput, 
          /* proxy */ typings.box2d.Box2D.Collision.b2DynamicTreeNode, 
          Double
        ],
      input: typings.box2d.Box2D.Collision.b2RayCastInput
    ): Unit = js.native
    
    /**
      * Perform some iterations to re-balance the tree.
      * @param iterations Number of rebalance iterations to perform.
      **/
    /* CompleteClass */
    override def Rebalance(iterations: Double): Unit = js.native
  }
  
  @JSGlobal("Box2D.Collision.b2DynamicTreeBroadPhase")
  @js.native
  /**
    * Creates the dynamic tree broad phase.
    **/
  open class b2DynamicTreeBroadPhase ()
    extends StObject
       with typings.box2d.Box2D.Collision.b2DynamicTreeBroadPhase {
    
    /**
      * Create a proxy with an initial AABB. Pairs are not reported until UpdatePairs is called.
      * @param aabb Proxy Fat AABB.
      * @param userData User defined data.
      * @return Proxy created from aabb and userData.
      **/
    /* CompleteClass */
    override def CreateProxy(aabb: typings.box2d.Box2D.Collision.b2AABB, userData: Any): typings.box2d.Box2D.Collision.b2DynamicTreeNode = js.native
    
    /**
      * Destroy a proxy. It is up to the client to remove any pairs.
      * @param proxy Proxy to destroy.
      **/
    /* CompleteClass */
    override def DestroyProxy(proxy: typings.box2d.Box2D.Collision.b2DynamicTreeNode): Unit = js.native
    
    /**
      * Get the Fat AABB for a proxy.
      * @param proxy Proxy to retrieve the Fat AABB.
      **/
    /* CompleteClass */
    override def GetFatAABB(proxy: typings.box2d.Box2D.Collision.b2DynamicTreeNode): typings.box2d.Box2D.Collision.b2AABB = js.native
    
    /**
      * Get the number of proxies.
      * @return Number of proxies.
      **/
    /* CompleteClass */
    override def GetProxyCount(): Double = js.native
    
    /**
      * Get user data from a proxy. Returns null if the proxy is invalid.
      * @param proxy Proxy to retrieve user data from.
      * @return Gets the user data from proxy, or null if the proxy is invalid.
      **/
    /* CompleteClass */
    override def GetUserData(proxy: typings.box2d.Box2D.Collision.b2DynamicTreeNode): Any = js.native
    
    /**
      * Call MoveProxy as many times as you like, then when you are done call UpdatePairs to finalized the proxy pairs (for your time step).
      * @param proxy Proxy to move.
      * @param aabb Swept AABB.
      * @param displacement Extra AABB displacement.
      **/
    /* CompleteClass */
    override def MoveProxy(
      proxy: typings.box2d.Box2D.Collision.b2DynamicTreeNode,
      aabb: typings.box2d.Box2D.Collision.b2AABB,
      displacement: b2Vec2
    ): Unit = js.native
    
    /**
      * Query an AABB for overlapping proxies. The callback is called for each proxy that overlaps the supplied AABB. The callback should match function signature fuction callback(proxy:b2DynamicTreeNode):Boolean and should return false to trigger premature termination.
      * @param callback Called for each proxy that overlaps the supplied AABB.
      *    param proxy Proxy overlapping the supplied AABB.
      * @param aabb Proxies are query for overlap on this AABB.
      **/
    /* CompleteClass */
    override def Query(
      callback: js.Function1[/* proxy */ typings.box2d.Box2D.Collision.b2DynamicTreeNode, Boolean],
      aabb: typings.box2d.Box2D.Collision.b2AABB
    ): Unit = js.native
    
    /**
      * Ray-cast against the proxies in the tree. This relies on the callback to perform a exact ray-cast in the case were the proxy contains a shape. The callback also performs the any collision filtering. This has performance roughly equal to k log(n), where k is the number of collisions and n is the number of proxies in the tree.
      * @param callback Called for each proxy that is hit by the ray.
      *    param input Ray cast input data.
      *    param proxy The proxy hit by the ray cast.
      *    param return Return value is the new value for maxFraction.
      * @param input Ray cast input data.  Query all proxies along this ray cast.
      **/
    /* CompleteClass */
    override def RayCast(
      callback: js.Function2[
          /* input */ typings.box2d.Box2D.Collision.b2RayCastInput, 
          /* proxy */ typings.box2d.Box2D.Collision.b2DynamicTreeNode, 
          Double
        ],
      input: typings.box2d.Box2D.Collision.b2RayCastInput
    ): Unit = js.native
    
    /**
      * Perform some iterations to re-balance the tree.
      * @param iterations Number of rebalance iterations to perform.
      **/
    /* CompleteClass */
    override def Rebalance(iterations: Double): Unit = js.native
    
    /**
      * Tests if two proxies overlap.
      * @param proxyA First proxy to test.
      * @param proxyB Second proxy to test.
      * @return True if the proxyA and proxyB overlap with Fat AABBs, otherwise false.
      **/
    /* CompleteClass */
    override def TestOverlap(
      proxyA: typings.box2d.Box2D.Collision.b2DynamicTreeNode,
      proxyB: typings.box2d.Box2D.Collision.b2DynamicTreeNode
    ): Boolean = js.native
    
    /**
      * Update the pairs. This results in pair callbacks. This can only add pairs.
      * @param callback Called for all new proxy pairs.
      *    param userDataA Proxy A in the pair user data.
      *    param userDataB Proxy B in the pair user data.
      **/
    /* CompleteClass */
    override def UpdatePairs(callback: js.Function2[/* userDataA */ Any, /* userDataB */ Any, Unit]): Unit = js.native
    
    /**
      * Validates the dynamic tree.
      * NOTE: this says "todo" in the current Box2DFlash code.
      **/
    /* CompleteClass */
    override def Validate(): Unit = js.native
  }
  
  @JSGlobal("Box2D.Collision.b2DynamicTreeNode")
  @js.native
  open class b2DynamicTreeNode ()
    extends StObject
       with typings.box2d.Box2D.Collision.b2DynamicTreeNode
  
  @JSGlobal("Box2D.Collision.b2Manifold")
  @js.native
  /**
    * Creates a new manifold.
    **/
  open class b2Manifold ()
    extends StObject
       with typings.box2d.Box2D.Collision.b2Manifold {
    
    /**
      * Copies the manifold.
      * @return Copy of this manifold.
      **/
    /* CompleteClass */
    override def Copy(): typings.box2d.Box2D.Collision.b2Manifold = js.native
    
    /**
      * Resets this manifold.
      **/
    /* CompleteClass */
    override def Reset(): Unit = js.native
    
    /**
      * Sets this manifold from another manifold.
      * @param m Manifold to copy values from.
      **/
    /* CompleteClass */
    override def Set(m: typings.box2d.Box2D.Collision.b2Manifold): Unit = js.native
    
    /**
      * Not used for Type e_points
      **/
    /* CompleteClass */
    var m_localPlaneNormal: b2Vec2 = js.native
    
    /**
      * Usage depends on manifold type
      **/
    /* CompleteClass */
    var m_localPoint: b2Vec2 = js.native
    
    /**
      * The number of manifold points
      **/
    /* CompleteClass */
    var m_pointCount: Double = js.native
    
    /**
      * The points of contact
      **/
    /* CompleteClass */
    var m_points: js.Array[typings.box2d.Box2D.Collision.b2ManifoldPoint] = js.native
    
    /**
      * Manifold type.
      **/
    /* CompleteClass */
    var m_type: Double = js.native
  }
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
    inline def e_circles_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_circles")(x.asInstanceOf[js.Any])
    
    /**
      * Face A
      **/
    @JSGlobal("Box2D.Collision.b2Manifold.e_faceA")
    @js.native
    def e_faceA: Double = js.native
    inline def e_faceA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_faceA")(x.asInstanceOf[js.Any])
    
    /**
      * Face B
      **/
    @JSGlobal("Box2D.Collision.b2Manifold.e_faceB")
    @js.native
    def e_faceB: Double = js.native
    inline def e_faceB_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_faceB")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Box2D.Collision.b2ManifoldPoint")
  @js.native
  /**
    * Creates a new manifold point.
    **/
  open class b2ManifoldPoint ()
    extends StObject
       with typings.box2d.Box2D.Collision.b2ManifoldPoint {
    
    /**
      * Resets this manifold point.
      **/
    /* CompleteClass */
    override def Reset(): Unit = js.native
    
    /**
      * Sets this manifold point from a manifold point.
      * @param m The manifold point to copy values from.
      **/
    /* CompleteClass */
    override def Set(m: typings.box2d.Box2D.Collision.b2ManifoldPoint): Unit = js.native
    
    /**
      * Contact ID.
      **/
    /* CompleteClass */
    var m_id: typings.box2d.Box2D.Collision.b2ContactID = js.native
    
    /**
      * Local contact point.
      **/
    /* CompleteClass */
    var m_localpoint: b2Vec2 = js.native
    
    /**
      * Normal impluse for this contact point.
      **/
    /* CompleteClass */
    var m_normalImpulse: Double = js.native
    
    /**
      * Tangent impulse for contact point.
      **/
    /* CompleteClass */
    var m_tangentImpulse: Double = js.native
  }
  
  @JSGlobal("Box2D.Collision.b2OBB")
  @js.native
  open class b2OBB ()
    extends StObject
       with typings.box2d.Box2D.Collision.b2OBB {
    
    /**
      * The rotation matrix.
      **/
    /* CompleteClass */
    var R: b2Mat22 = js.native
    
    /**
      * The local centroid.
      **/
    /* CompleteClass */
    var center: b2Vec2 = js.native
    
    /**
      * The half-widths.
      **/
    /* CompleteClass */
    var extents: b2Vec2 = js.native
  }
  
  @JSGlobal("Box2D.Collision.b2RayCastInput")
  @js.native
  /**
    * Creates a new ray cast input.
    * @param p1 Start point of the ray, default = null.
    * @param p2 End point of the ray, default = null.
    * @param maxFraction Truncate the ray to reach up to this fraction from p1 to p2.
    **/
  open class b2RayCastInput ()
    extends StObject
       with typings.box2d.Box2D.Collision.b2RayCastInput {
    def this(p1: b2Vec2) = this()
    def this(p1: Unit, p2: b2Vec2) = this()
    def this(p1: b2Vec2, p2: b2Vec2) = this()
    def this(p1: Unit, p2: Unit, maxFraction: Double) = this()
    def this(p1: Unit, p2: b2Vec2, maxFraction: Double) = this()
    def this(p1: b2Vec2, p2: Unit, maxFraction: Double) = this()
    def this(p1: b2Vec2, p2: b2Vec2, maxFraction: Double) = this()
    
    /**
      * Truncate the ray to reach up to this fraction from p1 to p2
      **/
    /* CompleteClass */
    var maxFraction: Double = js.native
    
    /**
      * The start point of the ray.
      **/
    /* CompleteClass */
    var p1: b2Vec2 = js.native
    
    /**
      * The end point of the ray.
      **/
    /* CompleteClass */
    var p2: b2Vec2 = js.native
  }
  
  @JSGlobal("Box2D.Collision.b2RayCastOutput")
  @js.native
  open class b2RayCastOutput ()
    extends StObject
       with typings.box2d.Box2D.Collision.b2RayCastOutput {
    
    /**
      * The fraction between p1 and p2 that the collision occurs at.
      **/
    /* CompleteClass */
    var fraction: Double = js.native
    
    /**
      * The normal at the point of collision.
      **/
    /* CompleteClass */
    var normal: b2Vec2 = js.native
  }
  
  @JSGlobal("Box2D.Collision.b2Segment")
  @js.native
  open class b2Segment ()
    extends StObject
       with typings.box2d.Box2D.Collision.b2Segment {
    
    /**
      * Extends or clips the segment so that it's ends lie on the boundary of the AABB.
      * @param aabb AABB to extend/clip the segement.
      **/
    /* CompleteClass */
    override def Extend(aabb: typings.box2d.Box2D.Collision.b2AABB): Unit = js.native
    
    /**
      * See Extend, this works on the ending point.
      * @param aabb AABB to extend/clip the ending point.
      **/
    /* CompleteClass */
    override def ExtendBackward(aabb: typings.box2d.Box2D.Collision.b2AABB): Unit = js.native
    
    /**
      * See Extend, this works on the starting point.
      * @param aabb AABB to extend/clip the starting point.
      **/
    /* CompleteClass */
    override def ExtendForward(aabb: typings.box2d.Box2D.Collision.b2AABB): Unit = js.native
    
    /**
      * Ray cast against this segment with another segment.
      * @param lambda returns the hit fraction. You can use this to compute the contact point * p = (1 - lambda) * segment.p1 + lambda * segment.p2 * @normal Normal at the contact point.  If there is no intersection, the normal is not set.
      * @param segment Defines the begining and end point of the ray cast.
      * @param maxLambda a number typically in the range [0,1].
      * @return True if there is an intersection, otherwise false.
      **/
    /* CompleteClass */
    override def TestSegment(
      lambda: js.Array[Double],
      normal: b2Vec2,
      segment: typings.box2d.Box2D.Collision.b2Segment,
      maxLambda: Double
    ): Boolean = js.native
    
    /**
      * The starting point.
      **/
    /* CompleteClass */
    var p1: b2Vec2 = js.native
    
    /**
      * The ending point.
      **/
    /* CompleteClass */
    var p2: b2Vec2 = js.native
  }
  
  @JSGlobal("Box2D.Collision.b2SimplexCache")
  @js.native
  open class b2SimplexCache ()
    extends StObject
       with typings.box2d.Box2D.Collision.b2SimplexCache {
    
    /**
      * Number in cache.
      **/
    /* CompleteClass */
    var count: Double = js.native
    
    /**
      * Vertices on shape a.
      **/
    /* CompleteClass */
    var indexA: js.Array[Double] = js.native
    
    /**
      * Vertices on shape b.
      **/
    /* CompleteClass */
    var indexB: js.Array[Double] = js.native
    
    /**
      * Length or area.
      **/
    /* CompleteClass */
    var metric: Double = js.native
  }
  
  @JSGlobal("Box2D.Collision.b2TOIInput")
  @js.native
  open class b2TOIInput ()
    extends StObject
       with typings.box2d.Box2D.Collision.b2TOIInput {
    
    /**
      * Proxy A
      **/
    /* CompleteClass */
    var proxyA: typings.box2d.Box2D.Collision.b2DistanceProxy = js.native
    
    /**
      * Proxy B
      **/
    /* CompleteClass */
    var proxyB: typings.box2d.Box2D.Collision.b2DistanceProxy = js.native
    
    /**
      * Sweep A
      **/
    /* CompleteClass */
    var sweepA: b2Sweep = js.native
    
    /**
      * Sweep B
      **/
    /* CompleteClass */
    var sweepB: b2Sweep = js.native
    
    /**
      * Tolerance
      **/
    /* CompleteClass */
    var tolerance: Double = js.native
  }
  
  @JSGlobal("Box2D.Collision.b2WorldManifold")
  @js.native
  /**
    * Creates a new b2WorldManifold.
    **/
  open class b2WorldManifold ()
    extends StObject
       with typings.box2d.Box2D.Collision.b2WorldManifold {
    
    /**
      * Evaluate the manifold with supplied transforms. This assumes modest motion from the original state. This does not change the point count, impulses, etc. The radii must come from the shapes that generated the manifold.
      * @param manifold Manifold to evaluate.
      * @param xfA A transform.
      * @param radiusA A radius.
      * @param xfB B transform.
      * @param radiusB B radius.
      **/
    /* CompleteClass */
    override def Initialize(
      manifold: typings.box2d.Box2D.Collision.b2Manifold,
      xfA: b2Transform,
      radiusA: Double,
      xfB: b2Transform,
      radiusB: Double
    ): Unit = js.native
    
    /**
      * World vector pointing from A to B.
      **/
    /* CompleteClass */
    var m_normal: b2Vec2 = js.native
    
    /**
      * World contact point (point of intersection).
      **/
    /* CompleteClass */
    var m_points: js.Array[b2Vec2] = js.native
  }
}
