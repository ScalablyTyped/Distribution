package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PBRSubSurfaceConfiguration extends js.Object {
  
  /**
    * Returns the texture used for refraction or null if none is used.
    * @param scene defines the scene the material belongs to.
    * @returns - Refraction texture if present.  If no refraction texture and refraction
    * is linked with transparency, returns environment texture.  Otherwise, returns null.
    */
  var _getRefractionTexture: js.Any = js.native
  
  var _indexOfRefraction: js.Any = js.native
  
  /** @hidden */
  var _internalMarkAllSubMeshesAsTexturesDirty: js.Any = js.native
  
  var _internalMarkScenePrePassDirty: js.Any = js.native
  
  var _invertRefractionY: js.Any = js.native
  
  var _isRefractionEnabled: js.Any = js.native
  
  var _isScatteringEnabled: js.Any = js.native
  
  var _isTranslucencyEnabled: js.Any = js.native
  
  var _linkRefractionWithTransparency: js.Any = js.native
  
  /** @hidden */
  def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
  
  /** @hidden */
  def _markScenePrePassDirty(): Unit = js.native
  
  var _refractionTexture: js.Any = js.native
  
  var _scatteringDiffusionProfileIndex: js.Any = js.native
  
  var _scene: js.Any = js.native
  
  var _thicknessTexture: js.Any = js.native
  
  var _useMaskFromThicknessTexture: js.Any = js.native
  
  var _useMaskFromThicknessTextureGltf: js.Any = js.native
  
  var _volumeIndexOfRefraction: js.Any = js.native
  
  /**
    * Binds the material data.
    * @param uniformBuffer defines the Uniform buffer to fill in.
    * @param scene defines the scene the material belongs to.
    * @param engine defines the engine the material belongs to.
    * @param isFrozen defines whether the material is frozen or not.
    * @param lodBasedMicrosurface defines whether the material relies on lod based microsurface or not.
    * @param realTimeFiltering defines whether the textures should be filtered on the fly.
    */
  def bindForSubMesh(
    uniformBuffer: UniformBuffer,
    scene: Scene,
    engine: Engine,
    isFrozen: Boolean,
    lodBasedMicrosurface: Boolean,
    realTimeFiltering: Boolean
  ): Unit = js.native
  
  /**
    * Makes a duplicate of the current configuration into another one.
    * @param configuration define the config where to copy the info
    */
  def copyTo(configuration: PBRSubSurfaceConfiguration): Unit = js.native
  
  /**
    * Defines how far each channel transmit through the media.
    * It is defined as a color to simplify it selection.
    */
  var diffusionDistance: Color3 = js.native
  
  /**
    * Returns true if alpha blending should be disabled.
    */
  def disableAlphaBlending: Boolean = js.native
  
  /**
    * Disposes the resources of the material.
    * @param forceDisposeTextures - Forces the disposal of all textures.
    */
  def dispose(): Unit = js.native
  def dispose(forceDisposeTextures: Boolean): Unit = js.native
  
  /**
    * Fills the list of render target textures.
    * @param renderTargets the list of render targets to update
    */
  def fillRenderTargetTextures(renderTargets: SmartArray[RenderTargetTexture]): Unit = js.native
  
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
    * @returns "PBRSubSurfaceConfiguration"
    */
  def getClassName(): String = js.native
  
  /**
    * Gets a boolean indicating that current material needs to register RTT
    * @returns true if this uses a render target otherwise false.
    */
  def hasRenderTargetTextures(): Boolean = js.native
  
  /**
    * Checks to see if a texture is used in the material.
    * @param texture - Base texture to use.
    * @returns - Boolean specifying if a texture is used in the material.
    */
  def hasTexture(texture: BaseTexture): Boolean = js.native
  
  /**
    * Index of refraction of the material base layer.
    * https://en.wikipedia.org/wiki/List_of_refractive_indices
    *
    * This does not only impact refraction but also the Base F0 of Dielectric Materials.
    *
    * From dielectric fresnel rules: F0 = square((iorT - iorI) / (iorT + iorI))
    */
  var indexOfRefraction: Double = js.native
  
  /**
    * Controls if refraction needs to be inverted on Y. This could be useful for procedural texture.
    */
  var invertRefractionY: Boolean = js.native
  
  /**
    * Gets wehter the submesh is ready to be used or not.
    * @param defines the list of "defines" to update.
    * @param scene defines the scene the material belongs to.
    * @returns - boolean indicating that the submesh is ready or not.
    */
  def isReadyForSubMesh(defines: IMaterialSubSurfaceDefines, scene: Scene): Boolean = js.native
  
  /**
    * Defines if the refraction is enabled in the material.
    */
  var isRefractionEnabled: Boolean = js.native
  
  /**
    * Defines if the sub surface scattering is enabled in the material.
    */
  var isScatteringEnabled: Boolean = js.native
  
  /**
    * Defines if the translucency is enabled in the material.
    */
  var isTranslucencyEnabled: Boolean = js.native
  
  /**
    * This parameters will make the material used its opacity to control how much it is refracting aginst not.
    * Materials half opaque for instance using refraction could benefit from this control.
    */
  var linkRefractionWithTransparency: Boolean = js.native
  
  /**
    * Defines the maximum thickness stored in the thickness map.
    */
  var maximumThickness: Double = js.native
  
  /**
    * Defines the minimum thickness stored in the thickness map.
    * If no thickness map is defined, this value will be used to simulate thickness.
    */
  var minimumThickness: Double = js.native
  
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
  def prepareDefines(defines: IMaterialSubSurfaceDefines, scene: Scene): Unit = js.native
  
  /**
    * Defines the refraction intensity of the material.
    * The refraction when enabled replaces the Diffuse part of the material.
    * The intensity helps transitionning between diffuse and refraction.
    */
  var refractionIntensity: Double = js.native
  
  /**
    * Defines the texture to use for refraction.
    */
  var refractionTexture: Nullable[BaseTexture] = js.native
  
  /**
    * Diffusion profile for subsurface scattering.
    * Useful for better scattering in the skins or foliages.
    */
  def scatteringDiffusionProfile: Nullable[Color3] = js.native
  def scatteringDiffusionProfile_=(c: Nullable[Color3]): Unit = js.native
  
  /**
    * Serializes this Sub Surface configuration.
    * @returns - An object with the serialized config.
    */
  def serialize(): js.Any = js.native
  
  /**
    * Stores the average thickness of a mesh in a texture (The texture is holding the values linearly).
    * The red channel of the texture should contain the thickness remapped between 0 and 1.
    * 0 would mean minimumThickness
    * 1 would mean maximumThickness
    * The other channels might be use as a mask to vary the different effects intensity.
    */
  var thicknessTexture: Nullable[BaseTexture] = js.native
  
  /**
    * Defines the volume tint of the material.
    * This is used for both translucency and scattering.
    */
  var tintColor: Color3 = js.native
  
  /**
    * Defines the distance at which the tint color should be found in the media.
    * This is used for refraction only.
    */
  var tintColorAtDistance: Double = js.native
  
  /**
    * Defines the translucency intensity of the material.
    * When translucency has been enabled, this defines how much of the "translucency"
    * is addded to the diffuse part of the material.
    */
  var translucencyIntensity: Double = js.native
  
  /**
    * Unbinds the material from the mesh.
    * @param activeEffect defines the effect that should be unbound from.
    * @returns true if unbound, otherwise false
    */
  def unbind(activeEffect: Effect): Boolean = js.native
  
  /**
    * When enabled, transparent surfaces will be tinted with the albedo colour (independent of thickness)
    */
  var useAlbedoToTintRefraction: Boolean = js.native
  
  /**
    * Stores the intensity of the different subsurface effects in the thickness texture.
    * * the green channel is the translucency intensity.
    * * the blue channel is the scattering intensity.
    * * the alpha channel is the refraction intensity.
    */
  var useMaskFromThicknessTexture: Boolean = js.native
  
  /**
    * Stores the intensity of the different subsurface effects in the thickness texture. This variation
    * matches the channel-packing that is used by glTF.
    * * the red channel is the transmission/translucency intensity.
    * * the green channel is the thickness.
    */
  var useMaskFromThicknessTextureGltf: Boolean = js.native
  
  /**
    * Index of refraction of the material's volume.
    * https://en.wikipedia.org/wiki/List_of_refractive_indices
    *
    * This ONLY impacts refraction. If not provided or given a non-valid value,
    * the volume will use the same IOR as the surface.
    */
  def volumeIndexOfRefraction: Double = js.native
  def volumeIndexOfRefraction_=(value: Double): Unit = js.native
}
