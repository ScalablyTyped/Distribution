package typings
package box2dLib.Box2DNs.CollisionNs.ShapesNs

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
  def ComputeAABB(aabb: box2dLib.Box2DNs.CollisionNs.b2AABB, xf: box2dLib.Box2DNs.CommonNs.MathNs.b2Transform): scala.Unit = js.native
  /**
  		* Compute the mass properties of this shape using its dimensions and density. The inertia tensor is computed about the local origin, not the centroid.
  		* @param massData Calculate the mass, this argument is `out`.
  		* @param density Density.
  		**/
  def ComputeMass(massData: b2MassData, density: scala.Double): scala.Unit = js.native
  /**
  		* Compute the volume and centroid of this shape intersected with a half plane
  		* @param normal The surface normal.
  		* @param offset The surface offset along the normal.
  		* @param xf The shape transform.
  		* @param c The centroid, this argument is `out`.
  		**/
  def ComputeSubmergedArea(
    normal: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2,
    offset: scala.Double,
    xf: box2dLib.Box2DNs.CommonNs.MathNs.b2Transform,
    c: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2
  ): scala.Double = js.native
  /**
  		* Clone the shape.
  		**/
  def Copy(): b2Shape = js.native
  /**
  		* Get the type of this shape. You can use this to down cast to the concrete shape.
  		**/
  def GetType(): scala.Double = js.native
  /**
  		* Cast a ray against this shape.
  		* @param output Ray cast results, this argument is `out`.
  		* @param input Ray cast input parameters.
  		* @param transform The transform to be applied to the shape.
  		* @param return True if the ray hits the shape, otherwise false.
  		**/
  def RayCast(
    output: box2dLib.Box2DNs.CollisionNs.b2RayCastOutput,
    input: box2dLib.Box2DNs.CollisionNs.b2RayCastInput,
    transform: box2dLib.Box2DNs.CommonNs.MathNs.b2Transform
  ): scala.Boolean = js.native
  /**
  		* Set the shape values from another shape.
  		* @param other The other shape to copy values from.
  		**/
  def Set(other: b2Shape): scala.Unit = js.native
  /**
  		* Test a point for containment in this shape. This only works for convex shapes.
  		* @param xf Shape world transform.
  		* @param p Point to test against, in world coordinates.
  		* @return True if the point is in this shape, otherwise false.
  		**/
  def TestPoint(xf: box2dLib.Box2DNs.CommonNs.MathNs.b2Transform, p: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): scala.Boolean = js.native
}

@JSGlobal("Box2D.Collision.Shapes.b2Shape")
@js.native
object b2Shape extends js.Object {
  var e_circleShape: scala.Double = js.native
  var e_edgeShape: scala.Double = js.native
  /**
  		* Return value for TestSegment indicating a hit.
  		**/
  var e_hitCollide: scala.Double = js.native
  /**
  		* Return value for TestSegment indicating a miss.
  		**/
  var e_missCollide: scala.Double = js.native
  var e_polygonShape: scala.Double = js.native
  var e_shapeTypeCount: scala.Double = js.native
  // Note: these enums are public in the source but no referenced by the documentation
  var e_unknownShape: scala.Double = js.native
  /**
  		* Return value for TestSegment indicating that the segment starting point, p1, is already inside the shape.
  		**/
  var startsInsideCollide: scala.Double = js.native
  /**
  		* Test if two shapes overlap with the applied transforms.
  		* @param shape1 shape to test for overlap with shape2.
  		* @param transform1 shape1 transform to apply.
  		* @param shape2 shape to test for overlap with shape1.
  		* @param transform2 shape2 transform to apply.
  		* @return True if shape1 and shape2 overlap, otherwise false.
  		**/
  def TestOverlap(
    shape1: box2dLib.Box2DNs.CollisionNs.ShapesNs.b2Shape,
    transform1: box2dLib.Box2DNs.CommonNs.MathNs.b2Transform,
    shape2: box2dLib.Box2DNs.CollisionNs.ShapesNs.b2Shape,
    transform2: box2dLib.Box2DNs.CommonNs.MathNs.b2Transform
  ): scala.Boolean = js.native
}

