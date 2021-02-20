package typings.babylonjs.anon

import typings.babylonjs.materialMod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableAnimation extends StObject {
  
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
  implicit class DisableAnimationMutableBuilder[Self <: DisableAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableAnimation(value: Boolean): Self = StObject.set(x, "disableAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAnimationUndefined: Self = StObject.set(x, "disableAnimation", js.undefined)
    
    @scala.inline
    def setDisableLighting(value: Boolean): Self = StObject.set(x, "disableLighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableLightingUndefined: Self = StObject.set(x, "disableLighting", js.undefined)
    
    @scala.inline
    def setTeleportationBorderColor(value: String): Self = StObject.set(x, "teleportationBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeleportationBorderColorUndefined: Self = StObject.set(x, "teleportationBorderColor", js.undefined)
    
    @scala.inline
    def setTeleportationFillColor(value: String): Self = StObject.set(x, "teleportationFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeleportationFillColorUndefined: Self = StObject.set(x, "teleportationFillColor", js.undefined)
    
    @scala.inline
    def setTorusArrowMaterial(value: Material): Self = StObject.set(x, "torusArrowMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTorusArrowMaterialUndefined: Self = StObject.set(x, "torusArrowMaterial", js.undefined)
  }
}
