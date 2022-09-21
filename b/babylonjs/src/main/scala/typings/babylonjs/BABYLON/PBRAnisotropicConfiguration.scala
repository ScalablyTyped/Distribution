package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PBRAnisotropicConfiguration
  extends StObject
     with MaterialPluginBase {
  
  /** @hidden */
  /* private */ var _internalMarkAllSubMeshesAsTexturesDirty: Any = js.native
  
  /* private */ var _isEnabled: Any = js.native
  
  /** @hidden */
  def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
  
  /* private */ var _texture: Any = js.native
  
  def addFallbacks(defines: MaterialAnisotropicDefines, fallbacks: EffectFallbacks, currentRank: Double): Double = js.native
  
  def bindForSubMesh(uniformBuffer: UniformBuffer, scene: Scene): Unit = js.native
  
  /**
    * Defines if the effect is along the tangents, bitangents or in between.
    * By default, the effect is "stretching" the highlights along the tangents.
    */
  var direction: Vector2 = js.native
  
  /**
    * Defines the anisotropy strength (between 0 and 1) it defaults to 1.
    */
  var intensity: Double = js.native
  
  /**
    * Defines if the anisotropy is enabled in the material.
    */
  var isEnabled: Boolean = js.native
  
  def isReadyForSubMesh(defines: MaterialAnisotropicDefines, scene: Scene): Boolean = js.native
  
  def prepareDefinesBeforeAttributes(defines: MaterialAnisotropicDefines, scene: Scene, mesh: AbstractMesh): Unit = js.native
  
  /**
    * Stores the anisotropy values in a texture.
    * rg is direction (like normal from -1 to 1)
    * b is a intensity
    */
  var texture: Nullable[BaseTexture] = js.native
}
