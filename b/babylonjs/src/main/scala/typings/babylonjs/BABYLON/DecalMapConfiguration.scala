package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecalMapConfiguration
  extends StObject
     with MaterialPluginBase {
  
  /* private */ var _internalMarkAllSubMeshesAsTexturesDirty: Any = js.native
  
  /* private */ var _isEnabled: Any = js.native
  
  /** @internal */
  def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
  
  /* private */ var _smoothAlpha: Any = js.native
  
  /**
    * Enables or disables the decal map on this material
    */
  var isEnabled: Boolean = js.native
  
  def isReadyForSubMesh(defines: DecalMapDefines, scene: Scene, engine: Engine, subMesh: SubMesh): Boolean = js.native
  
  def prepareDefines(defines: DecalMapDefines, scene: Scene, mesh: AbstractMesh): Unit = js.native
  
  /**
    * Enables or disables the smooth alpha mode on this material. Default: false.
    * When enabled, the alpha value used to blend the decal map will be the squared value and will produce a smoother result.
    */
  var smoothAlpha: Boolean = js.native
}
