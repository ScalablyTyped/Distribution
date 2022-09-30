package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PBRSheenConfiguration
  extends StObject
     with MaterialPluginBase {
  
  /* private */ var _albedoScaling: Any = js.native
  
  /** @internal */
  /* private */ var _internalMarkAllSubMeshesAsTexturesDirty: Any = js.native
  
  /* private */ var _isEnabled: Any = js.native
  
  /* private */ var _linkSheenWithAlbedo: Any = js.native
  
  /** @internal */
  def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
  
  /* private */ var _roughness: Any = js.native
  
  /* private */ var _texture: Any = js.native
  
  /* private */ var _textureRoughness: Any = js.native
  
  /* private */ var _useRoughnessFromMainTexture: Any = js.native
  
  def addFallbacks(defines: MaterialSheenDefines, fallbacks: EffectFallbacks, currentRank: Double): Double = js.native
  
  /**
    * If true, the sheen effect is layered above the base BRDF with the albedo-scaling technique.
    * It allows the strength of the sheen effect to not depend on the base color of the material,
    * making it easier to setup and tweak the effect
    */
  var albedoScaling: Boolean = js.native
  
  /**
    * Defines the sheen color.
    */
  var color: Color3 = js.native
  
  /**
    * Defines the sheen intensity.
    */
  var intensity: Double = js.native
  
  /**
    * Defines if the material uses sheen.
    */
  var isEnabled: Boolean = js.native
  
  def isReadyForSubMesh(defines: MaterialSheenDefines, scene: Scene): Boolean = js.native
  
  /**
    * Defines if the sheen is linked to the sheen color.
    */
  var linkSheenWithAlbedo: Boolean = js.native
  
  def prepareDefinesBeforeAttributes(defines: MaterialSheenDefines, scene: Scene): Unit = js.native
  
  /**
    * Defines the sheen roughness.
    * It is not taken into account if linkSheenWithAlbedo is true.
    * To stay backward compatible, material roughness is used instead if sheen roughness = null
    */
  var roughness: Nullable[Double] = js.native
  
  /**
    * Stores the sheen tint values in a texture.
    * rgb is tint
    * a is a intensity or roughness if the roughness property has been defined and useRoughnessFromTexture is true (in that case, textureRoughness won't be used)
    * If the roughness property has been defined and useRoughnessFromTexture is false then the alpha channel is not used to modulate roughness
    */
  var texture: Nullable[BaseTexture] = js.native
  
  /**
    * Stores the sheen roughness in a texture.
    * alpha channel is the roughness. This texture won't be used if the texture property is not empty and useRoughnessFromTexture is true
    */
  var textureRoughness: Nullable[BaseTexture] = js.native
  
  /**
    * Indicates that the alpha channel of the texture property will be used for roughness.
    * Has no effect if the roughness (and texture!) property is not defined
    */
  var useRoughnessFromMainTexture: Boolean = js.native
}
