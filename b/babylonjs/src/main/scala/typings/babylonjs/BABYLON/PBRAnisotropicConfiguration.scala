package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PBRAnisotropicConfiguration extends StObject {
  
  /** @hidden */
  /* private */ var _internalMarkAllSubMeshesAsTexturesDirty: js.Any = js.native
  
  /* private */ var _isEnabled: js.Any = js.native
  
  /** @hidden */
  def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
  
  /* private */ var _texture: js.Any = js.native
  
  /**
    * Binds the material data.
    * @param uniformBuffer defines the Uniform buffer to fill in.
    * @param scene defines the scene the material belongs to.
    * @param isFrozen defines wether the material is frozen or not.
    */
  def bindForSubMesh(uniformBuffer: UniformBuffer, scene: Scene, isFrozen: Boolean): Unit = js.native
  
  /**
    * Makes a duplicate of the current configuration into another one.
    * @param anisotropicConfiguration define the config where to copy the info
    */
  def copyTo(anisotropicConfiguration: PBRAnisotropicConfiguration): Unit = js.native
  
  /**
    * Defines if the effect is along the tangents, bitangents or in between.
    * By default, the effect is "strectching" the highlights along the tangents.
    */
  var direction: Vector2 = js.native
  
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
    * @returns "PBRAnisotropicConfiguration"
    */
  def getClassName(): String = js.native
  
  /**
    * Checks to see if a texture is used in the material.
    * @param texture - Base texture to use.
    * @returns - Boolean specifying if a texture is used in the material.
    */
  def hasTexture(texture: BaseTexture): Boolean = js.native
  
  /**
    * Defines the anisotropy strength (between 0 and 1) it defaults to 1.
    */
  var intensity: Double = js.native
  
  /**
    * Defines if the anisotropy is enabled in the material.
    */
  var isEnabled: Boolean = js.native
  
  /**
    * Specifies that the submesh is ready to be used.
    * @param defines the list of "defines" to update.
    * @param scene defines the scene the material belongs to.
    * @returns - boolean indicating that the submesh is ready or not.
    */
  def isReadyForSubMesh(defines: IMaterialAnisotropicDefines, scene: Scene): Boolean = js.native
  
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
    * @param mesh the mesh we are preparing the defines for.
    * @param scene defines the scene the material belongs to.
    */
  def prepareDefines(defines: IMaterialAnisotropicDefines, mesh: AbstractMesh, scene: Scene): Unit = js.native
  
  /**
    * Serializes this anisotropy configuration.
    * @returns - An object with the serialized config.
    */
  def serialize(): js.Any = js.native
  
  /**
    * Stores the anisotropy values in a texture.
    * rg is direction (like normal from -1 to 1)
    * b is a intensity
    */
  var texture: Nullable[BaseTexture] = js.native
}
