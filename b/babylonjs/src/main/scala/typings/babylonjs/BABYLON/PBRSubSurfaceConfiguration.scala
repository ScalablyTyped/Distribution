package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PBRSubSurfaceConfiguration
  extends StObject
     with MaterialPluginBase {
  
  /**
    * Returns the texture used for refraction or null if none is used.
    * @param scene defines the scene the material belongs to.
    * @returns - Refraction texture if present.  If no refraction texture and refraction
    * is linked with transparency, returns environment texture.  Otherwise, returns null.
    */
  /* private */ var _getRefractionTexture: Any = js.native
  
  /** @internal */
  var _indexOfRefraction: Double = js.native
  
  /** @internal */
  /* private */ var _internalMarkAllSubMeshesAsTexturesDirty: Any = js.native
  
  /* private */ var _internalMarkScenePrePassDirty: Any = js.native
  
  /* private */ var _invertRefractionY: Any = js.native
  
  /* private */ var _isRefractionEnabled: Any = js.native
  
  /* private */ var _isScatteringEnabled: Any = js.native
  
  /* private */ var _isTranslucencyEnabled: Any = js.native
  
  /** @internal */
  var _linkRefractionWithTransparency: Boolean = js.native
  
  /** @internal */
  def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
  
  /** @internal */
  def _markScenePrePassDirty(): Unit = js.native
  
  /* protected */ @JSName("_material")
  var _material_PBRSubSurfaceConfiguration: PBRBaseMaterial = js.native
  
  /* private */ var _refractionIntensityTexture: Any = js.native
  
  /* private */ var _refractionTexture: Any = js.native
  
  /* private */ var _scatteringDiffusionProfileIndex: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _thicknessTexture: Any = js.native
  
  /* private */ var _translucencyIntensityTexture: Any = js.native
  
  /* private */ var _useGltfStyleTextures: Any = js.native
  
  /* private */ var _useMaskFromThicknessTexture: Any = js.native
  
  /* private */ var _volumeIndexOfRefraction: Any = js.native
  
  def addFallbacks(defines: MaterialSubSurfaceDefines, fallbacks: EffectFallbacks, currentRank: Double): Double = js.native
  
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
  
  def isReadyForSubMesh(defines: MaterialSubSurfaceDefines, scene: Scene): Boolean = js.native
  
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
    * This parameters will make the material used its opacity to control how much it is refracting against not.
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
  
  def prepareDefinesBeforeAttributes(defines: MaterialSubSurfaceDefines, scene: Scene): Unit = js.native
  
  /**
    * Defines the refraction intensity of the material.
    * The refraction when enabled replaces the Diffuse part of the material.
    * The intensity helps transitioning between diffuse and refraction.
    */
  var refractionIntensity: Double = js.native
  
  /**
    * Stores the intensity of the refraction. If provided, it takes precedence over thicknessTexture + useMaskFromThicknessTexture
    * * the green (red if useGltfStyleTextures = true) channel is the refraction intensity.
    */
  var refractionIntensityTexture: Nullable[BaseTexture] = js.native
  
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
    * Stores the average thickness of a mesh in a texture (The texture is holding the values linearly).
    * The red (or green if useGltfStyleTextures=true) channel of the texture should contain the thickness remapped between 0 and 1.
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
    * is added to the diffuse part of the material.
    */
  var translucencyIntensity: Double = js.native
  
  /**
    * Stores the intensity of the translucency. If provided, it takes precedence over thicknessTexture + useMaskFromThicknessTexture
    * * the blue channel is the translucency intensity.
    */
  var translucencyIntensityTexture: Nullable[BaseTexture] = js.native
  
  /**
    * When enabled, transparent surfaces will be tinted with the albedo colour (independent of thickness)
    */
  var useAlbedoToTintRefraction: Boolean = js.native
  
  /**
    * When enabled, translucent surfaces will be tinted with the albedo colour (independent of thickness)
    */
  var useAlbedoToTintTranslucency: Boolean = js.native
  
  /**
    * Use channels layout used by glTF:
    * * thicknessTexture: the green (instead of red) channel is the thickness
    * * thicknessTexture/refractionIntensityTexture: the red (instead of green) channel is the refraction intensity
    * * thicknessTexture/translucencyIntensityTexture: no change, use the blue channel for the translucency intensity
    */
  var useGltfStyleTextures: Boolean = js.native
  
  /**
    * Stores the intensity of the different subsurface effects in the thickness texture.
    * Note that if refractionIntensityTexture and/or translucencyIntensityTexture is provided it takes precedence over thicknessTexture + useMaskFromThicknessTexture
    * * the green (red if useGltfStyleTextures = true) channel is the refraction intensity.
    * * the blue channel is the translucency intensity.
    */
  var useMaskFromThicknessTexture: Boolean = js.native
  
  /**
    * Defines that the thickness should be used as a measure of the depth volume.
    */
  var useThicknessAsDepth: Boolean = js.native
  
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
