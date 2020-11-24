package typings.babylonjs.physicsHelperMod

import typings.babylonjs.meshMod.Mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsVortexEventData extends js.Object {
  
  /**
    * A cylinder used for the vortex event
    */
  var cylinder: Mesh = js.native
}
object PhysicsVortexEventData {
  
  @scala.inline
  def apply(cylinder: Mesh): PhysicsVortexEventData = {
    val __obj = js.Dynamic.literal(cylinder = cylinder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsVortexEventData]
  }
  
  @scala.inline
  implicit class PhysicsVortexEventDataOps[Self <: PhysicsVortexEventData] (val x: Self) extends AnyVal {
    
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
    def setCylinder(value: Mesh): Self = this.set("cylinder", value.asInstanceOf[js.Any])
  }
}
