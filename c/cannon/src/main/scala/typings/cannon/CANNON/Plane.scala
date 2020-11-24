package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plane extends Shape {
  
  def calculateWorldAABB(pos: Vec3, quat: Quaternion, min: Double, max: Double): Unit = js.native
  
  def computeWorldNormal(quat: Quaternion): Unit = js.native
  
  var worldNormal: Vec3 = js.native
  
  var worldNormalNeedsUpdate: Boolean = js.native
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
  
  @scala.inline
  implicit class PlaneOps[Self <: Plane] (val x: Self) extends AnyVal {
    
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
    def setCalculateWorldAABB(value: (Vec3, Quaternion, Double, Double) => Unit): Self = this.set("calculateWorldAABB", js.Any.fromFunction4(value))
    
    @scala.inline
    def setComputeWorldNormal(value: Quaternion => Unit): Self = this.set("computeWorldNormal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWorldNormal(value: Vec3): Self = this.set("worldNormal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldNormalNeedsUpdate(value: Boolean): Self = this.set("worldNormalNeedsUpdate", value.asInstanceOf[js.Any])
  }
}
