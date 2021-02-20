package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneOptions extends StObject {
  
  /**
    * Defines that each mesh of the scene should keep up-to-date a map of referencing cloned meshes for fast diposing
    * It will improve performance when the number of mesh becomes important, but might consume a bit more memory
    */
  var useClonedMeshMap: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines that scene should keep up-to-date a map of geometry to enable fast look-up by uniqueId
    * It will improve performance when the number of geometries becomes important.
    */
  var useGeometryUniqueIdsMap: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines that each material of the scene should keep up-to-date a map of referencing meshes for fast diposing
    * It will improve performance when the number of mesh becomes important, but might consume a bit more memory
    */
  var useMaterialMeshMap: js.UndefOr[Boolean] = js.native
  
  /** Defines if the creation of the scene should impact the engine (Eg. UtilityLayer's scene) */
  var virtual: js.UndefOr[Boolean] = js.native
}
object SceneOptions {
  
  @scala.inline
  def apply(): SceneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneOptions]
  }
  
  @scala.inline
  implicit class SceneOptionsMutableBuilder[Self <: SceneOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseClonedMeshMap(value: Boolean): Self = StObject.set(x, "useClonedMeshMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseClonedMeshMapUndefined: Self = StObject.set(x, "useClonedMeshMap", js.undefined)
    
    @scala.inline
    def setUseGeometryUniqueIdsMap(value: Boolean): Self = StObject.set(x, "useGeometryUniqueIdsMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseGeometryUniqueIdsMapUndefined: Self = StObject.set(x, "useGeometryUniqueIdsMap", js.undefined)
    
    @scala.inline
    def setUseMaterialMeshMap(value: Boolean): Self = StObject.set(x, "useMaterialMeshMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMaterialMeshMapUndefined: Self = StObject.set(x, "useMaterialMeshMap", js.undefined)
    
    @scala.inline
    def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
  }
}
