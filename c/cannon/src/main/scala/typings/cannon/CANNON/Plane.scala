package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plane extends Shape {
  var worldNormal: Vec3
  var worldNormalNeedsUpdate: Boolean
  def calculateWorldAABB(pos: Vec3, quat: Quaternion, min: Double, max: Double): Unit
  def computeWorldNormal(quat: Quaternion): Unit
}

object Plane {
  @scala.inline
  def apply(
    boundingSphereRadius: Double,
    calculateLocalInertia: (Double, Vec3) => Vec3,
    calculateWorldAABB: (Vec3, Quaternion, Double, Double) => Unit,
    collisionResponse: Boolean,
    computeWorldNormal: Quaternion => Unit,
    `type`: Double,
    updateBoundingSphereRadius: () => Double,
    volume: () => Double,
    worldNormal: Vec3,
    worldNormalNeedsUpdate: Boolean
  ): Plane = {
    val __obj = js.Dynamic.literal(boundingSphereRadius = boundingSphereRadius.asInstanceOf[js.Any], calculateLocalInertia = js.Any.fromFunction2(calculateLocalInertia), calculateWorldAABB = js.Any.fromFunction4(calculateWorldAABB), collisionResponse = collisionResponse.asInstanceOf[js.Any], computeWorldNormal = js.Any.fromFunction1(computeWorldNormal), updateBoundingSphereRadius = js.Any.fromFunction0(updateBoundingSphereRadius), volume = js.Any.fromFunction0(volume), worldNormal = worldNormal.asInstanceOf[js.Any], worldNormalNeedsUpdate = worldNormalNeedsUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plane]
  }
}

