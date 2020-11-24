package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneOptions extends js.Object {
  
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
  implicit class SceneOptionsOps[Self <: SceneOptions] (val x: Self) extends AnyVal {
    
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
    def setUseClonedMeshMap(value: Boolean): Self = this.set("useClonedMeshMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseClonedMeshMap: Self = this.set("useClonedMeshMap", js.undefined)
    
    @scala.inline
    def setUseGeometryUniqueIdsMap(value: Boolean): Self = this.set("useGeometryUniqueIdsMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseGeometryUniqueIdsMap: Self = this.set("useGeometryUniqueIdsMap", js.undefined)
    
    @scala.inline
    def setUseMaterialMeshMap(value: Boolean): Self = this.set("useMaterialMeshMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseMaterialMeshMap: Self = this.set("useMaterialMeshMap", js.undefined)
    
    @scala.inline
    def setVirtual(value: Boolean): Self = this.set("virtual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtual: Self = this.set("virtual", js.undefined)
  }
}
