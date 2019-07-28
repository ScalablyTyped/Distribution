package typings.box2d.Box2DNs.CollisionNs.ShapesNs

import typings.box2d.Box2DNs.CollisionNs.b2AABB
import typings.box2d.Box2DNs.CollisionNs.b2RayCastInput
import typings.box2d.Box2DNs.CollisionNs.b2RayCastOutput
import typings.box2d.Box2DNs.CommonNs.MathNs.b2Transform
import typings.box2d.Box2DNs.CommonNs.MathNs.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.Shapes.b2Shape")
@js.native
/**
		* Creates a new b2Shape.
		**/
class b2Shape () extends js.Object {
  /**
  		* Given a transform, compute the associated axis aligned bounding box for this shape.
  		* @param aabb Calculated AABB, this argument is `out`.
  		* @param xf Transform to calculate the AABB.
  		**/
  def ComputeAABB(aabb: b2AABB, xf: b2Transform): Unit = js.native
  /**
  		* Compute the mass properties of this shape using its dimensions and density. The inertia tensor is computed about the local origin, not the centroid.
  		* @param massData Calculate the mass, this argument is `out`.
  		* @param density Density.
  		**/
  def ComputeMass(massData: b2MassData, density: Double): Unit = js.native
  /**
  		* Compute the volume and centroid of this shape intersected with a half plane
  		* @param normal The surface normal.
  		* @param offset The surface offset along the normal.
  		* @param xf The shape transform.
  		* @param c The centroid, this argument is `out`.
  		**/
  def ComputeSubmergedArea(normal: b2Vec2, offset: Double, xf: b2Transform, c: b2Vec2): Double = js.native
  /**
  		* Clone the shape.
  		**/
  def Copy(): b2Shape = js.native
  /**
  		* Get the type of this shape. You can use this to down cast to the concrete shape.
  		**/
  def GetType(): Double = js.native
  /**
  		* Cast a ray against this shape.
  		* @param output Ray cast results, this argument is `out`.
  		* @param input Ray cast input parameters.
  		* @param transform The transform to be applied to the shape.
  		* @param return True if the ray hits the shape, otherwise false.
  		**/
  def RayCast(output: b2RayCastOutput, input: b2RayCastInput, transform: b2Transform): Boolean = js.native
  /**
  		* Set the shape values from another shape.
  		* @param other The other shape to copy values from.
  		**/
  def Set(other: b2Shape): Unit = js.native
  /**
  		* Test a point for containment in this shape. This only works for convex shapes.
  		* @param xf Shape world transform.
  		* @param p Point to test against, in world coordinates.
  		* @return True if the point is in this shape, otherwise false.
  		**/
  def TestPoint(xf: b2Transform, p: b2Vec2): Boolean = js.native
}

/* static members */
@JSGlobal("Box2D.Collision.Shapes.b2Shape")
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
  def TestOverlap(shape1: b2Shape, transform1: b2Transform, shape2: b2Shape, transform2: b2Transform): Boolean = js.native
}

