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
  
  @js.native
  /**
    * Creates a new edge chain def.
    **/
  class b2EdgeChainDef ()
    extends typings.box2d.Box2D.Collision.Shapes.b2EdgeChainDef {
    /**
      * Whether to create an extra edge between the first and last vertices.
      **/
    /* CompleteClass */
    override var isALoop: Boolean = js.native
    /**
      * The number of vertices in the chain.
      **/
    /* CompleteClass */
    override var vertexCount: Double = js.native
    /**
      * The vertices in local coordinates.
      **/
    /* CompleteClass */
    override var vertices: b2Vec2 = js.native
  }
  
  @js.native
  class b2EdgeShape protected ()
    extends typings.box2d.Box2D.Collision.Shapes.b2EdgeShape {
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
  
  @js.native
  class b2MassData ()
    extends typings.box2d.Box2D.Collision.Shapes.b2MassData {
    /**
      * The rotational inertia of the shape. This may be about the center or local origin, depending on usage.
      **/
    /* CompleteClass */
    override var I: Double = js.native
    /**
      * The position of the shape's centroid relative to the shape's origin.
      **/
    /* CompleteClass */
    override var center: b2Vec2 = js.native
    /**
      * The mass of the shape, usually in kilograms.
      **/
    /* CompleteClass */
    override var mass: Double = js.native
  }
  
  @js.native
  class b2PolygonShape ()
    extends typings.box2d.Box2D.Collision.Shapes.b2PolygonShape {
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
  
  @js.native
  /**
    * Creates a new b2Shape.
    **/
  class b2Shape ()
    extends typings.box2d.Box2D.Collision.Shapes.b2Shape {
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

