package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PBRSheenConfiguration extends js.Object {
  
  var _albedoScaling: js.Any = js.native
  
  /** @hidden */
  var _internalMarkAllSubMeshesAsTexturesDirty: js.Any = js.native
  
  var _isEnabled: js.Any = js.native
  
  var _linkSheenWithAlbedo: js.Any = js.native
  
  /** @hidden */
  def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
  
  var _roughness: js.Any = js.native
  
  var _texture: js.Any = js.native
  
  var _textureRoughness: js.Any = js.native
  
  var _useRoughnessFromMainTexture: js.Any = js.native
  
  /**
    * If true, the sheen effect is layered above the base BRDF with the albedo-scaling technique.
    * It allows the strength of the sheen effect to not depend on the base color of the material,
    * making it easier to setup and tweak the effect
    */
  var albedoScaling: Boolean = js.native
  
  /**
    * Binds the material data.
    * @param uniformBuffer defines the Uniform buffer to fill in.
    * @param scene defines the scene the material belongs to.
    * @param isFrozen defines wether the material is frozen or not.
    * @param subMesh the submesh to bind data for
    */
  def bindForSubMesh(uniformBuffer: UniformBuffer, scene: Scene, isFrozen: Boolean): Unit = js.native
  def bindForSubMesh(uniformBuffer: UniformBuffer, scene: Scene, isFrozen: Boolean, subMesh: SubMesh): Unit = js.native
  
  /**
    * Defines the sheen color.
    */
  var color: Color3 = js.native
  
  /**
    * Makes a duplicate of the current configuration into another one.
    * @param sheenConfiguration define the config where to copy the info
    */
  def copyTo(sheenConfiguration: PBRSheenConfiguration): Unit = js.native
  
  /**
    * Disposes the resources of the material.
    * @param forceDisposeTextures - Forces the disposal of all textures.
    */
  def dispose(): Unit = js.native
  def dispose(forceDisposeTextures: Boolean): Unit = js.native
  
  /**
    * Returns an array of the actively used textures.
    * @param activeTextures Array of BaseTextures
    */
  def getActiveTextures(activeTextures: js.Array[BaseTexture]): Unit = js.native
  
  /**
    * Returns the animatable textures.
    * @param animatables Array of animatable textures.
    */
  def getAnimatables(animatables: js.Array[IAnimatable]): Unit = js.native
  
  /**
    * Get the current class name of the texture useful for serialization or dynamic coding.
    * @returns "PBRSheenConfiguration"
    */
  def getClassName(): String = js.native
  
  /**
    * Checks to see if a texture is used in the material.
    * @param texture - Base texture to use.
    * @returns - Boolean specifying if a texture is used in the material.
    */
  def hasTexture(texture: BaseTexture): Boolean = js.native
  
  /**
    * Defines the sheen intensity.
    */
  var intensity: Double = js.native
  
  /**
    * Defines if the material uses sheen.
    */
  var isEnabled: Boolean = js.native
  
  /**
    * Specifies that the submesh is ready to be used.
    * @param defines the list of "defines" to update.
    * @param scene defines the scene the material belongs to.
    * @returns - boolean indicating that the submesh is ready or not.
    */
  def isReadyForSubMesh(defines: IMaterialSheenDefines, scene: Scene): Boolean = js.native
  
  /**
    * Defines if the sheen is linked to the sheen color.
    */
  var linkSheenWithAlbedo: Boolean = js.native
  
  /**
    * Parses a anisotropy Configuration from a serialized object.
    * @param source - Serialized object.
    * @param scene Defines the scene we are parsing for
    * @param rootUrl Defines the rootUrl to load from
    */
  def parse(source: js.Any, scene: Scene, rootUrl: String): Unit = js.native
  
  /**
    * Checks to see if a texture is used in the material.
    * @param defines the list of "defines" to update.
    * @param scene defines the scene the material belongs to.
    */
  def prepareDefines(defines: IMaterialSheenDefines, scene: Scene): Unit = js.native
  
  /**
    * Defines the sheen roughness.
    * It is not taken into account if linkSheenWithAlbedo is true.
    * To stay backward compatible, material roughness is used instead if sheen roughness = null
    */
  var roughness: Nullable[Double] = js.native
  
  /**
    * Serializes this BRDF configuration.
    * @returns - An object with the serialized config.
    */
  def serialize(): js.Any = js.native
  
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
