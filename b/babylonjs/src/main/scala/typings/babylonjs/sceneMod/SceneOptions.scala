package typings.babylonjs.sceneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneOptions extends js.Object {
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
  @scala.inline
  def apply(
    useClonedMeshMap: js.UndefOr[Boolean] = js.undefined,
    useGeometryUniqueIdsMap: js.UndefOr[Boolean] = js.undefined,
    useMaterialMeshMap: js.UndefOr[Boolean] = js.undefined,
    virtual: js.UndefOr[Boolean] = js.undefined
  ): SceneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useClonedMeshMap)) __obj.updateDynamic("useClonedMeshMap")(useClonedMeshMap.asInstanceOf[js.Any])
    if (!js.isUndefined(useGeometryUniqueIdsMap)) __obj.updateDynamic("useGeometryUniqueIdsMap")(useGeometryUniqueIdsMap.asInstanceOf[js.Any])
    if (!js.isUndefined(useMaterialMeshMap)) __obj.updateDynamic("useMaterialMeshMap")(useMaterialMeshMap.asInstanceOf[js.Any])
    if (!js.isUndefined(virtual)) __obj.updateDynamic("virtual")(virtual.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneOptions]
  }
}

