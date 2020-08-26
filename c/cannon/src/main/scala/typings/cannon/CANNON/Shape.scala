package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shape extends js.Object {
  var boundingSphereRadius: Double = js.native
  var collisionResponse: Boolean = js.native
  var `type`: Double = js.native
  def calculateLocalInertia(mass: Double, target: Vec3): Vec3 = js.native
  def updateBoundingSphereRadius(): Double = js.native
  def volume(): Double = js.native
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
  @scala.inline
  implicit class ShapeOps[Self <: Shape] (val x: Self) extends AnyVal {
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
    def setBoundingSphereRadius(value: Double): Self = this.set("boundingSphereRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setCalculateLocalInertia(value: (Double, Vec3) => Vec3): Self = this.set("calculateLocalInertia", js.Any.fromFunction2(value))
    @scala.inline
    def setCollisionResponse(value: Boolean): Self = this.set("collisionResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateBoundingSphereRadius(value: () => Double): Self = this.set("updateBoundingSphereRadius", js.Any.fromFunction0(value))
    @scala.inline
    def setVolume(value: () => Double): Self = this.set("volume", js.Any.fromFunction0(value))
  }
  
}

