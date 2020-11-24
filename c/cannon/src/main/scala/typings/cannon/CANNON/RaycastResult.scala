package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaycastResult extends js.Object {
  
  var body: Body = js.native
  
  var distance: Double = js.native
  
  var hasHit: Boolean = js.native
  
  var hitNormalWorld: Vec3 = js.native
  
  var hitPointWorld: Vec3 = js.native
  
  var rayFromWorld: Vec3 = js.native
  
  var rayToWorld: Vec3 = js.native
  
  def reset(): Unit = js.native
  
  def set(
    rayFromWorld: Vec3,
    rayToWorld: Vec3,
    hitNormalWorld: Vec3,
    hitPointWorld: Vec3,
    shape: Shape,
    body: Body,
    distance: Double
  ): Unit = js.native
  
  var shape: Shape = js.native
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
  
  @scala.inline
  implicit class RaycastResultOps[Self <: RaycastResult] (val x: Self) extends AnyVal {
    
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
    def setBody(value: Body): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasHit(value: Boolean): Self = this.set("hasHit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitNormalWorld(value: Vec3): Self = this.set("hitNormalWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitPointWorld(value: Vec3): Self = this.set("hitPointWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRayFromWorld(value: Vec3): Self = this.set("rayFromWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRayToWorld(value: Vec3): Self = this.set("rayToWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: (Vec3, Vec3, Vec3, Vec3, Shape, Body, Double) => Unit): Self = this.set("set", js.Any.fromFunction7(value))
    
    @scala.inline
    def setShape(value: Shape): Self = this.set("shape", value.asInstanceOf[js.Any])
  }
}
