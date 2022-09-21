package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomMeshes extends StObject {
  
  /**
    * Override the colors of the hand meshes.
    */
  var customColors: js.UndefOr[FingerColor] = js.undefined
  
  /**
    * Rigged hand meshes that will be tracked to the user's hands. This will override the default hand mesh.
    */
  var customMeshes: js.UndefOr[LeftRight] = js.undefined
  
  /**
    * If a hand mesh was provided, this array will define what axis will update which node. This will override the default hand mesh
    */
  var customRigMappings: js.UndefOr[LeftXRHandMeshRigMapping] = js.undefined
  
  /**
    * Should the default hand mesh be disabled. In this case, the spheres will be visible (unless set invisible).
    */
  var disableDefaultMeshes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Are the meshes prepared for a left-handed system. Default hand meshes are right-handed.
    */
  var meshesUseLeftHandedCoordinates: js.UndefOr[Boolean] = js.undefined
}
object CustomMeshes {
  
  inline def apply(): CustomMeshes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomMeshes]
  }
  
  extension [Self <: CustomMeshes](x: Self) {
    
    inline def setCustomColors(value: FingerColor): Self = StObject.set(x, "customColors", value.asInstanceOf[js.Any])
    
    inline def setCustomColorsUndefined: Self = StObject.set(x, "customColors", js.undefined)
    
    inline def setCustomMeshes(value: LeftRight): Self = StObject.set(x, "customMeshes", value.asInstanceOf[js.Any])
    
    inline def setCustomMeshesUndefined: Self = StObject.set(x, "customMeshes", js.undefined)
    
    inline def setCustomRigMappings(value: LeftXRHandMeshRigMapping): Self = StObject.set(x, "customRigMappings", value.asInstanceOf[js.Any])
    
    inline def setCustomRigMappingsUndefined: Self = StObject.set(x, "customRigMappings", js.undefined)
    
    inline def setDisableDefaultMeshes(value: Boolean): Self = StObject.set(x, "disableDefaultMeshes", value.asInstanceOf[js.Any])
    
    inline def setDisableDefaultMeshesUndefined: Self = StObject.set(x, "disableDefaultMeshes", js.undefined)
    
    inline def setMeshesUseLeftHandedCoordinates(value: Boolean): Self = StObject.set(x, "meshesUseLeftHandedCoordinates", value.asInstanceOf[js.Any])
    
    inline def setMeshesUseLeftHandedCoordinatesUndefined: Self = StObject.set(x, "meshesUseLeftHandedCoordinates", js.undefined)
  }
}
