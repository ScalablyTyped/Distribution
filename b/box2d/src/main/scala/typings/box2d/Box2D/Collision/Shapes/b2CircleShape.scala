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
trait b2CircleShape extends b2Shape {
  /**
    * Get the local position of this circle in its parent body.
    * @return This circle's local position.
    **/
  def GetLocalPosition(): b2Vec2 = js.native
  /**
    * Get the radius of the circle.
    * @return This circle's radius.
    **/
  def GetRadius(): Double = js.native
  /**
    * Set the circle shape values from another shape.
    * @param other The other circle shape to copy values from.
    **/
  def Set(other: b2CircleShape): Unit = js.native
  /**
    * Set the local position of this circle in its parent body.
    * @param position The new local position of this circle.
    **/
  def SetLocalPosition(position: b2Vec2): Unit = js.native
  /**
    * Set the radius of the circle.
    * @param radius The new radius of the circle.
    **/
  def SetRadius(radius: Double): Unit = js.native
}

object b2CircleShape {
  @scala.inline
  def apply(
    ComputeAABB: (b2AABB, b2Transform) => Unit,
    ComputeMass: (b2MassData, Double) => Unit,
    ComputeSubmergedArea: (b2Vec2, Double, b2Transform, b2Vec2) => Double,
    Copy: () => b2Shape,
    GetLocalPosition: () => b2Vec2,
    GetRadius: () => Double,
    GetType: () => Double,
    RayCast: (b2RayCastOutput, b2RayCastInput, b2Transform) => Boolean,
    Set: b2CircleShape => Unit,
    SetLocalPosition: b2Vec2 => Unit,
    SetRadius: Double => Unit,
    TestPoint: (b2Transform, b2Vec2) => Boolean
  ): b2CircleShape = {
    val __obj = js.Dynamic.literal(ComputeAABB = js.Any.fromFunction2(ComputeAABB), ComputeMass = js.Any.fromFunction2(ComputeMass), ComputeSubmergedArea = js.Any.fromFunction4(ComputeSubmergedArea), Copy = js.Any.fromFunction0(Copy), GetLocalPosition = js.Any.fromFunction0(GetLocalPosition), GetRadius = js.Any.fromFunction0(GetRadius), GetType = js.Any.fromFunction0(GetType), RayCast = js.Any.fromFunction3(RayCast), Set = js.Any.fromFunction1(Set), SetLocalPosition = js.Any.fromFunction1(SetLocalPosition), SetRadius = js.Any.fromFunction1(SetRadius), TestPoint = js.Any.fromFunction2(TestPoint))
    __obj.asInstanceOf[b2CircleShape]
  }
  @scala.inline
  implicit class b2CircleShapeOps[Self <: b2CircleShape] (val x: Self) extends AnyVal {
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
    def setGetLocalPosition(value: () => b2Vec2): Self = this.set("GetLocalPosition", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRadius(value: () => Double): Self = this.set("GetRadius", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: b2CircleShape => Unit): Self = this.set("Set", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLocalPosition(value: b2Vec2 => Unit): Self = this.set("SetLocalPosition", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRadius(value: Double => Unit): Self = this.set("SetRadius", js.Any.fromFunction1(value))
  }
  
}

