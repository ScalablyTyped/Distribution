package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsRadialExplosionEventData extends js.Object {
  
  /**
    * A sphere used for the radial explosion event
    */
  var sphere: Mesh = js.native
}
object PhysicsRadialExplosionEventData {
  
  @scala.inline
  def apply(sphere: Mesh): PhysicsRadialExplosionEventData = {
    val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsRadialExplosionEventData]
  }
  
  @scala.inline
  implicit class PhysicsRadialExplosionEventDataOps[Self <: PhysicsRadialExplosionEventData] (val x: Self) extends AnyVal {
    
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
    def setSphere(value: Mesh): Self = this.set("sphere", value.asInstanceOf[js.Any])
  }
}
