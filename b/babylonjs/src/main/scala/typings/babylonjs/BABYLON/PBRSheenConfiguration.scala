package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PBRSheenConfiguration")
@js.native
class PBRSheenConfiguration protected () extends js.Object {
  /**
    * Instantiate a new istance of clear coat configuration.
    * @param markAllSubMeshesAsTexturesDirty Callback to flag the material to dirty
    */
  def this(markAllSubMeshesAsTexturesDirty: js.Function0[Unit]) = this()
  /** @hidden */
  var _internalMarkAllSubMeshesAsTexturesDirty: js.Any = js.native
  var _isEnabled: js.Any = js.native
  var _linkSheenWithAlbedo: js.Any = js.native
  var _texture: js.Any = js.native
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
  /**
    * Defines if the sheen is linked to the sheen color.
    */
  var linkSheenWithAlbedo: Boolean = js.native
  /**
    * Stores the sheen tint values in a texture.
    * rgb is tint
    * a is a intensity
    */
  var texture: Nullable[BaseTexture] = js.native
  /** @hidden */
  def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
  /**
    * Binds the material data.
    * @param uniformBuffer defines the Uniform buffer to fill in.
    * @param scene defines the scene the material belongs to.
    * @param isFrozen defines wether the material is frozen or not.
    */
  def bindForSubMesh(uniformBuffer: UniformBuffer, scene: Scene, isFrozen: Boolean): Unit = js.native
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
    * Specifies that the submesh is ready to be used.
    * @param defines the list of "defines" to update.
    * @param scene defines the scene the material belongs to.
    * @returns - boolean indicating that the submesh is ready or not.
    */
  def isReadyForSubMesh(defines: IMaterialSheenDefines, scene: Scene): Boolean = js.native
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
    * Serializes this BRDF configuration.
    * @returns - An object with the serialized config.
    */
  def serialize(): js.Any = js.native
}

/* static members */
@JSGlobal("BABYLON.PBRSheenConfiguration")
@js.native
object PBRSheenConfiguration extends js.Object {
  /**
    * Add fallbacks to the effect fallbacks list.
    * @param defines defines the Base texture to use.
    * @param fallbacks defines the current fallback list.
    * @param currentRank defines the current fallback rank.
    * @returns the new fallback rank.
    */
  def AddFallbacks(defines: IMaterialSheenDefines, fallbacks: EffectFallbacks, currentRank: Double): Double = js.native
  /**
    * Add the required samplers to the current list.
    * @param samplers defines the current sampler list.
    */
  def AddSamplers(samplers: js.Array[String]): Unit = js.native
  /**
    * Add the required uniforms to the current list.
    * @param uniforms defines the current uniform list.
    */
  def AddUniforms(uniforms: js.Array[String]): Unit = js.native
  /**
    * Add the required uniforms to the current buffer.
    * @param uniformBuffer defines the current uniform buffer.
    */
  def PrepareUniformBuffer(uniformBuffer: UniformBuffer): Unit = js.native
}

