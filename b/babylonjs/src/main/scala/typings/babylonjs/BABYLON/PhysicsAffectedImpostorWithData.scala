package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsAffectedImpostorWithData extends js.Object {
  
  /**
    * The data about the hit/horce from the explosion
    */
  var hitData: PhysicsHitData = js.native
  
  /**
    * The impostor affected by the effect
    */
  var impostor: PhysicsImpostor = js.native
}
object PhysicsAffectedImpostorWithData {
  
  @scala.inline
  def apply(hitData: PhysicsHitData, impostor: PhysicsImpostor): PhysicsAffectedImpostorWithData = {
    val __obj = js.Dynamic.literal(hitData = hitData.asInstanceOf[js.Any], impostor = impostor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsAffectedImpostorWithData]
  }
  
  @scala.inline
  implicit class PhysicsAffectedImpostorWithDataOps[Self <: PhysicsAffectedImpostorWithData] (val x: Self) extends AnyVal {
    
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
    def setHitData(value: PhysicsHitData): Self = this.set("hitData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpostor(value: PhysicsImpostor): Self = this.set("impostor", value.asInstanceOf[js.Any])
  }
}
