package typings.box2d.Box2D.Collision.Shapes

import typings.box2d.Box2D.Collision.b2AABB
import typings.box2d.Box2D.Collision.b2RayCastInput
import typings.box2d.Box2D.Collision.b2RayCastOutput
import typings.box2d.Box2D.Common.Math.b2Transform
import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2Shape extends js.Object {
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

object b2Shape {
  @scala.inline
  def apply(
    ComputeAABB: (b2AABB, b2Transform) => Unit,
    ComputeMass: (b2MassData, Double) => Unit,
    ComputeSubmergedArea: (b2Vec2, Double, b2Transform, b2Vec2) => Double,
    Copy: () => b2Shape,
    GetType: () => Double,
    RayCast: (b2RayCastOutput, b2RayCastInput, b2Transform) => Boolean,
    Set: b2Shape => Unit,
    TestPoint: (b2Transform, b2Vec2) => Boolean
  ): b2Shape = {
    val __obj = js.Dynamic.literal(ComputeAABB = js.Any.fromFunction2(ComputeAABB), ComputeMass = js.Any.fromFunction2(ComputeMass), ComputeSubmergedArea = js.Any.fromFunction4(ComputeSubmergedArea), Copy = js.Any.fromFunction0(Copy), GetType = js.Any.fromFunction0(GetType), RayCast = js.Any.fromFunction3(RayCast), Set = js.Any.fromFunction1(Set), TestPoint = js.Any.fromFunction2(TestPoint))
    __obj.asInstanceOf[b2Shape]
  }
  @scala.inline
  implicit class b2ShapeOps[Self <: b2Shape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComputeAABB(value: (b2AABB, b2Transform) => Unit): Self = this.set("ComputeAABB", js.Any.fromFunction2(value))
    @scala.inline
    def setComputeMass(value: (b2MassData, Double) => Unit): Self = this.set("ComputeMass", js.Any.fromFunction2(value))
    @scala.inline
    def setComputeSubmergedArea(value: (b2Vec2, Double, b2Transform, b2Vec2) => Double): Self = this.set("ComputeSubmergedArea", js.Any.fromFunction4(value))
    @scala.inline
    def setCopy(value: () => b2Shape): Self = this.set("Copy", js.Any.fromFunction0(value))
    @scala.inline
    def setGetType(value: () => Double): Self = this.set("GetType", js.Any.fromFunction0(value))
    @scala.inline
    def setRayCast(value: (b2RayCastOutput, b2RayCastInput, b2Transform) => Boolean): Self = this.set("RayCast", js.Any.fromFunction3(value))
    @scala.inline
    def setSet(value: b2Shape => Unit): Self = this.set("Set", js.Any.fromFunction1(value))
    @scala.inline
    def setTestPoint(value: (b2Transform, b2Vec2) => Boolean): Self = this.set("TestPoint", js.Any.fromFunction2(value))
  }
  
}

