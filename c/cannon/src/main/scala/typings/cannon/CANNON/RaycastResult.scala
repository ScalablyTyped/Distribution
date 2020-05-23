package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaycastResult extends js.Object {
  var body: Body
  var distance: Double
  var hasHit: Boolean
  var hitNormalWorld: Vec3
  var hitPointWorld: Vec3
  var rayFromWorld: Vec3
  var rayToWorld: Vec3
  var shape: Shape
  def reset(): Unit
  def set(
    rayFromWorld: Vec3,
    rayToWorld: Vec3,
    hitNormalWorld: Vec3,
    hitPointWorld: Vec3,
    shape: Shape,
    body: Body,
    distance: Double
  ): Unit
}

object RaycastResult {
  @scala.inline
  def apply(
    body: Body,
    distance: Double,
    hasHit: Boolean,
    hitNormalWorld: Vec3,
    hitPointWorld: Vec3,
    rayFromWorld: Vec3,
    rayToWorld: Vec3,
    reset: () => Unit,
    set: (Vec3, Vec3, Vec3, Vec3, Shape, Body, Double) => Unit,
    shape: Shape
  ): RaycastResult = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], hasHit = hasHit.asInstanceOf[js.Any], hitNormalWorld = hitNormalWorld.asInstanceOf[js.Any], hitPointWorld = hitPointWorld.asInstanceOf[js.Any], rayFromWorld = rayFromWorld.asInstanceOf[js.Any], rayToWorld = rayToWorld.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction7(set), shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaycastResult]
  }
}

