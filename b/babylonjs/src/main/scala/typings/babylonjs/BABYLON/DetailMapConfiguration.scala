package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailMapConfiguration extends StObject {
  
  /** @hidden */
  /* private */ var _internalMarkAllSubMeshesAsTexturesDirty: js.Any = js.native
  
  /* private */ var _isEnabled: js.Any = js.native
  
  /** @hidden */
  def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
  
  /* private */ var _normalBlendMethod: js.Any = js.native
  
  /* private */ var _texture: js.Any = js.native
  
  /**
    * Binds the material data.
    * @param uniformBuffer defines the Uniform buffer to fill in.
    * @param scene defines the scene the material belongs to.
    * @param isFrozen defines whether the material is frozen or not.
    */
  def bindForSubMesh(uniformBuffer: UniformBuffer, scene: Scene, isFrozen: Boolean): Unit = js.native
  
  /**
    * Defines how strong the bump effect from the detail map is
    * Bigger values mean stronger effect
    */
  var bumpLevel: Double = js.native
  
  /**
    * Makes a duplicate of the current instance into another one.
    * @param detailMap define the instance where to copy the info
    */
  def copyTo(detailMap: DetailMapConfiguration): Unit = js.native
  
  /**
    * Defines how strongly the detail diffuse/albedo channel is blended with the regular diffuse/albedo texture
    * Bigger values mean stronger blending
    */
  var diffuseBlendLevel: Double = js.native
  
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
    * Get the current class name useful for serialization or dynamic coding.
    * @returns "DetailMap"
    */
  def getClassName(): String = js.native
  
  /**
    * Checks to see if a texture is used in the material.
    * @param texture - Base texture to use.
    * @returns - Boolean specifying if a texture is used in the material.
    */
  def hasTexture(texture: BaseTexture): Boolean = js.native
  
  /**
    * Enable or disable the detail map on this material
    */
  var isEnabled: Boolean = js.native
  
  /**
    * Gets whether the submesh is ready to be used or not.
    * @param defines the list of "defines" to update.
    * @param scene defines the scene the material belongs to.
    * @returns - boolean indicating that the submesh is ready or not.
    */
  def isReadyForSubMesh(defines: IMaterialDetailMapDefines, scene: Scene): Boolean = js.native
  
  /**
    * The method used to blend the bump and detail normals together
    */
  var normalBlendMethod: Double = js.native
  
  /**
    * Parses a detail map setting from a serialized object.
    * @param source - Serialized object.
    * @param scene Defines the scene we are parsing for
    * @param rootUrl Defines the rootUrl to load from
    */
  def parse(source: js.Any, scene: Scene, rootUrl: String): Unit = js.native
  
  /**
    * Update the defines for detail map usage
    * @param defines the list of "defines" to update.
    * @param scene defines the scene the material belongs to.
    */
  def prepareDefines(defines: IMaterialDetailMapDefines, scene: Scene): Unit = js.native
  
  /**
    * Defines how strongly the detail roughness channel is blended with the regular roughness value
    * Bigger values mean stronger blending. Only used with PBR materials
    */
  var roughnessBlendLevel: Double = js.native
  
  /**
    * Serializes this detail map instance
    * @returns - An object with the serialized instance.
    */
  def serialize(): js.Any = js.native
  
  /**
    * The detail texture of the material.
    */
  var texture: Nullable[BaseTexture] = js.native
}
