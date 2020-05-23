package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape extends js.Object {
  var boundingSphereRadius: Double
  var collisionResponse: Boolean
  var `type`: Double
  def calculateLocalInertia(mass: Double, target: Vec3): Vec3
  def updateBoundingSphereRadius(): Double
  def volume(): Double
}

object Shape {
  @scala.inline
  def apply(
    boundingSphereRadius: Double,
    calculateLocalInertia: (Double, Vec3) => Vec3,
    collisionResponse: Boolean,
    `type`: Double,
    updateBoundingSphereRadius: () => Double,
    volume: () => Double
  ): Shape = {
    val __obj = js.Dynamic.literal(boundingSphereRadius = boundingSphereRadius.asInstanceOf[js.Any], calculateLocalInertia = js.Any.fromFunction2(calculateLocalInertia), collisionResponse = collisionResponse.asInstanceOf[js.Any], updateBoundingSphereRadius = js.Any.fromFunction0(updateBoundingSphereRadius), volume = js.Any.fromFunction0(volume))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
}

