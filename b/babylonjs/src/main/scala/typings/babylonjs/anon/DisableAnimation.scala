package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableAnimation extends StObject {
  
  /**
    * Disable the mesh's animation sequence
    */
  var disableAnimation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable lighting on the material or the ring and arrow
    */
  var disableLighting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Border color for the teleportation area
    */
  var teleportationBorderColor: js.UndefOr[String] = js.undefined
  
  /**
    * Override the default material of the Landing Zone
    */
  var teleportationCircleMaterial: js.UndefOr[typings.babylonjs.materialsMaterialMod.Material] = js.undefined
  
  /**
    * Fill color of the teleportation area
    */
  var teleportationFillColor: js.UndefOr[String] = js.undefined
  
  /**
    * Override the default material of the torus and arrow
    */
  var torusArrowMaterial: js.UndefOr[typings.babylonjs.materialsMaterialMod.Material] = js.undefined
}
object DisableAnimation {
  
  inline def apply(): DisableAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableAnimation]
  }
  
  extension [Self <: DisableAnimation](x: Self) {
    
    inline def setDisableAnimation(value: Boolean): Self = StObject.set(x, "disableAnimation", value.asInstanceOf[js.Any])
    
    inline def setDisableAnimationUndefined: Self = StObject.set(x, "disableAnimation", js.undefined)
    
    inline def setDisableLighting(value: Boolean): Self = StObject.set(x, "disableLighting", value.asInstanceOf[js.Any])
    
    inline def setDisableLightingUndefined: Self = StObject.set(x, "disableLighting", js.undefined)
    
    inline def setTeleportationBorderColor(value: String): Self = StObject.set(x, "teleportationBorderColor", value.asInstanceOf[js.Any])
    
    inline def setTeleportationBorderColorUndefined: Self = StObject.set(x, "teleportationBorderColor", js.undefined)
    
    inline def setTeleportationCircleMaterial(value: typings.babylonjs.materialsMaterialMod.Material): Self = StObject.set(x, "teleportationCircleMaterial", value.asInstanceOf[js.Any])
    
    inline def setTeleportationCircleMaterialUndefined: Self = StObject.set(x, "teleportationCircleMaterial", js.undefined)
    
    inline def setTeleportationFillColor(value: String): Self = StObject.set(x, "teleportationFillColor", value.asInstanceOf[js.Any])
    
    inline def setTeleportationFillColorUndefined: Self = StObject.set(x, "teleportationFillColor", js.undefined)
    
    inline def setTorusArrowMaterial(value: typings.babylonjs.materialsMaterialMod.Material): Self = StObject.set(x, "torusArrowMaterial", value.asInstanceOf[js.Any])
    
    inline def setTorusArrowMaterialUndefined: Self = StObject.set(x, "torusArrowMaterial", js.undefined)
  }
}
