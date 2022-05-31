package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PBRClearCoatConfiguration extends StObject {
  
  /* private */ var _bumpTexture: js.Any = js.native
  
  /* private */ var _indexOfRefraction: js.Any = js.native
  
  /** @hidden */
  /* private */ var _internalMarkAllSubMeshesAsTexturesDirty: js.Any = js.native
  
  /* private */ var _isEnabled: js.Any = js.native
  
  /* private */ var _isTintEnabled: js.Any = js.native
  
  /** @hidden */
  def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
  
  /* private */ var _remapF0OnInterfaceChange: js.Any = js.native
  
  /* private */ var _texture: js.Any = js.native
  
  /* private */ var _textureRoughness: js.Any = js.native
  
  /* private */ var _tintTexture: js.Any = js.native
  
  /* private */ var _useRoughnessFromMainTexture: js.Any = js.native
  
  /**
    * Binds the material data.
    * @param uniformBuffer defines the Uniform buffer to fill in.
    * @param scene defines the scene the material belongs to.
    * @param engine defines the engine the material belongs to.
    * @param disableBumpMap defines wether the material disables bump or not.
    * @param isFrozen defines wether the material is frozen or not.
    * @param invertNormalMapX If sets to true, x component of normal map value will be inverted (x = 1.0 - x).
    * @param invertNormalMapY If sets to true, y component of normal map value will be inverted (y = 1.0 - y).
    * @param subMesh the submesh to bind data for
    */
  def bindForSubMesh(
    uniformBuffer: UniformBuffer,
    scene: Scene,
    engine: Engine,
    disableBumpMap: Boolean,
    isFrozen: Boolean,
    invertNormalMapX: Boolean,
    invertNormalMapY: Boolean
  ): Unit = js.native
  def bindForSubMesh(
    uniformBuffer: UniformBuffer,
    scene: Scene,
    engine: Engine,
    disableBumpMap: Boolean,
    isFrozen: Boolean,
    invertNormalMapX: Boolean,
    invertNormalMapY: Boolean,
    subMesh: SubMesh
  ): Unit = js.native
  
  /**
    * Define the clear coat specific bump texture.
    */
  var bumpTexture: Nullable[BaseTexture] = js.native
  
  /**
    * Makes a duplicate of the current configuration into another one.
    * @param clearCoatConfiguration define the config where to copy the info
    */
  def copyTo(clearCoatConfiguration: PBRClearCoatConfiguration): Unit = js.native
  
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
    * @returns "PBRClearCoatConfiguration"
    */
  def getClassName(): String = js.native
  
  /**
    * Checks to see if a texture is used in the material.
    * @param texture - Base texture to use.
    * @returns - Boolean specifying if a texture is used in the material.
    */
  def hasTexture(texture: BaseTexture): Boolean = js.native
  
  /**
    * Defines the index of refraction of the clear coat.
    * This defaults to 1.5 corresponding to a 0.04 f0 or a 4% reflectance at normal incidence
    * The default fits with a polyurethane material.
    * Changing the default value is more performance intensive.
    */
  var indexOfRefraction: Double = js.native
  
  /**
    * Defines the clear coat layer strength (between 0 and 1) it defaults to 1.
    */
  var intensity: Double = js.native
  
  /**
    * Defines if the clear coat is enabled in the material.
    */
  var isEnabled: Boolean = js.native
  
  /**
    * Gets wehter the submesh is ready to be used or not.
    * @param defines the list of "defines" to update.
    * @param scene defines the scene the material belongs to.
    * @param engine defines the engine the material belongs to.
    * @param disableBumpMap defines wether the material disables bump or not.
    * @returns - boolean indicating that the submesh is ready or not.
    */
  def isReadyForSubMesh(defines: IMaterialClearCoatDefines, scene: Scene, engine: Engine, disableBumpMap: Boolean): Boolean = js.native
  
  /**
    * Defines if the clear coat tint is enabled in the material.
    */
  var isTintEnabled: Boolean = js.native
  
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
    * @param scene defines the scene to the material belongs to.
    */
  def prepareDefines(defines: IMaterialClearCoatDefines, scene: Scene): Unit = js.native
  
  /**
    * Defines if the F0 value should be remapped to account for the interface change in the material.
    */
  var remapF0OnInterfaceChange: Boolean = js.native
  
  /**
    * Defines the clear coat layer roughness.
    */
  var roughness: Double = js.native
  
  /**
    * Serializes this clear coat configuration.
    * @returns - An object with the serialized config.
    */
  def serialize(): js.Any = js.native
  
  /**
    * Stores the clear coat values in a texture (red channel is intensity and green channel is roughness)
    * If useRoughnessFromMainTexture is false, the green channel of texture is not used and the green channel of textureRoughness is used instead
    * if textureRoughness is not empty, else no texture roughness is used
    */
  var texture: Nullable[BaseTexture] = js.native
  
  /**
    * Stores the clear coat roughness in a texture (green channel)
    * Not used if useRoughnessFromMainTexture is true
    */
  var textureRoughness: Nullable[BaseTexture] = js.native
  
  /**
    * Defines the clear coat tint of the material.
    * This is only use if tint is enabled
    */
  var tintColor: Color3 = js.native
  
  /**
    * Defines the distance at which the tint color should be found in the
    * clear coat media.
    * This is only use if tint is enabled
    */
  var tintColorAtDistance: Double = js.native
  
  /**
    * Stores the clear tint values in a texture.
    * rgb is tint
    * a is a thickness factor
    */
  var tintTexture: Nullable[BaseTexture] = js.native
  
  /**
    * Defines the clear coat layer thickness.
    * This is only use if tint is enabled
    */
  var tintThickness: Double = js.native
  
  /**
    * Indicates that the green channel of the texture property will be used for roughness (default: true)
    * If false, the green channel from textureRoughness is used for roughness
    */
  var useRoughnessFromMainTexture: Boolean = js.native
}
