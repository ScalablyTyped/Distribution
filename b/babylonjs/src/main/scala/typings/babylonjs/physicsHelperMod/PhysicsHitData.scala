package typings.babylonjs.physicsHelperMod

import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsHitData extends js.Object {
  
  /**
    * The contact point
    */
  var contactPoint: Vector3 = js.native
  
  /**
    * The distance from the origin to the contact point
    */
  var distanceFromOrigin: Double = js.native
  
  /**
    * The force applied at the contact point
    */
  var force: Vector3 = js.native
}
object PhysicsHitData {
  
  @scala.inline
  def apply(contactPoint: Vector3, distanceFromOrigin: Double, force: Vector3): PhysicsHitData = {
    val __obj = js.Dynamic.literal(contactPoint = contactPoint.asInstanceOf[js.Any], distanceFromOrigin = distanceFromOrigin.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsHitData]
  }
  
  @scala.inline
  implicit class PhysicsHitDataOps[Self <: PhysicsHitData] (val x: Self) extends AnyVal {
    
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
    def setContactPoint(value: Vector3): Self = this.set("contactPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceFromOrigin(value: Double): Self = this.set("distanceFromOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForce(value: Vector3): Self = this.set("force", value.asInstanceOf[js.Any])
  }
}
