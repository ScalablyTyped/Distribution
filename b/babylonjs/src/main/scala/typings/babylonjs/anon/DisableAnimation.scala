package typings.babylonjs.anon

import typings.babylonjs.materialMod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableAnimation extends js.Object {
  
  /**
    * Disable the mesh's animation sequence
    */
  var disableAnimation: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable lighting on the material or the ring and arrow
    */
  var disableLighting: js.UndefOr[Boolean] = js.native
  
  /**
    * Border color for the teleportation area
    */
  var teleportationBorderColor: js.UndefOr[String] = js.native
  
  /**
    * Fill color of the teleportation area
    */
  var teleportationFillColor: js.UndefOr[String] = js.native
  
  /**
    * Override the default material of the torus and arrow
    */
  var torusArrowMaterial: js.UndefOr[Material] = js.native
}
object DisableAnimation {
  
  @scala.inline
  def apply(): DisableAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableAnimation]
  }
  
  @scala.inline
  implicit class DisableAnimationOps[Self <: DisableAnimation] (val x: Self) extends AnyVal {
    
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
    def setDisableAnimation(value: Boolean): Self = this.set("disableAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAnimation: Self = this.set("disableAnimation", js.undefined)
    
    @scala.inline
    def setDisableLighting(value: Boolean): Self = this.set("disableLighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableLighting: Self = this.set("disableLighting", js.undefined)
    
    @scala.inline
    def setTeleportationBorderColor(value: String): Self = this.set("teleportationBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeleportationBorderColor: Self = this.set("teleportationBorderColor", js.undefined)
    
    @scala.inline
    def setTeleportationFillColor(value: String): Self = this.set("teleportationFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeleportationFillColor: Self = this.set("teleportationFillColor", js.undefined)
    
    @scala.inline
    def setTorusArrowMaterial(value: Material): Self = this.set("torusArrowMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTorusArrowMaterial: Self = this.set("torusArrowMaterial", js.undefined)
  }
}
