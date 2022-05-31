package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneOptions extends StObject {
  
  /**
    * Defines that each mesh of the scene should keep up-to-date a map of referencing cloned meshes for fast diposing
    * It will improve performance when the number of mesh becomes important, but might consume a bit more memory
    */
  var useClonedMeshMap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines that scene should keep up-to-date a map of geometry to enable fast look-up by uniqueId
    * It will improve performance when the number of geometries becomes important.
    */
  var useGeometryUniqueIdsMap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines that each material of the scene should keep up-to-date a map of referencing meshes for fast diposing
    * It will improve performance when the number of mesh becomes important, but might consume a bit more memory
    */
  var useMaterialMeshMap: js.UndefOr[Boolean] = js.undefined
  
  /** Defines if the creation of the scene should impact the engine (Eg. UtilityLayer's scene) */
  var virtual: js.UndefOr[Boolean] = js.undefined
}
object SceneOptions {
  
  inline def apply(): SceneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneOptions]
  }
  
  extension [Self <: SceneOptions](x: Self) {
    
    inline def setUseClonedMeshMap(value: Boolean): Self = StObject.set(x, "useClonedMeshMap", value.asInstanceOf[js.Any])
    
    inline def setUseClonedMeshMapUndefined: Self = StObject.set(x, "useClonedMeshMap", js.undefined)
    
    inline def setUseGeometryUniqueIdsMap(value: Boolean): Self = StObject.set(x, "useGeometryUniqueIdsMap", value.asInstanceOf[js.Any])
    
    inline def setUseGeometryUniqueIdsMapUndefined: Self = StObject.set(x, "useGeometryUniqueIdsMap", js.undefined)
    
    inline def setUseMaterialMeshMap(value: Boolean): Self = StObject.set(x, "useMaterialMeshMap", value.asInstanceOf[js.Any])
    
    inline def setUseMaterialMeshMapUndefined: Self = StObject.set(x, "useMaterialMeshMap", js.undefined)
    
    inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
    
    inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
  }
}
