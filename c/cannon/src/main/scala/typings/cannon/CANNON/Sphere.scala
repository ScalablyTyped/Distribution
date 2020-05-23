package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sphere extends Shape {
  var radius: Double
}

object Sphere {
  @scala.inline
  def apply(
    boundingSphereRadius: Double,
    calculateLocalInertia: (Double, Vec3) => Vec3,
    collisionResponse: Boolean,
    radius: Double,
    `type`: Double,
    updateBoundingSphereRadius: () => Double,
    volume: () => Double
  ): Sphere = {
    val __obj = js.Dynamic.literal(boundingSphereRadius = boundingSphereRadius.asInstanceOf[js.Any], calculateLocalInertia = js.Any.fromFunction2(calculateLocalInertia), collisionResponse = collisionResponse.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], updateBoundingSphereRadius = js.Any.fromFunction0(updateBoundingSphereRadius), volume = js.Any.fromFunction0(volume))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sphere]
  }
}

