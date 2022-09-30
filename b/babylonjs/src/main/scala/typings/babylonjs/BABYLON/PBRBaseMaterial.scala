package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PBRBaseMaterial
  extends StObject
     with PushMaterial {
  
  /**
    * AKA Diffuse Color in other nomenclature.
    * @internal
    */
  var _albedoColor: Color3 = js.native
  
  /**
    * AKA Diffuse Texture in standard nomenclature.
    * @internal
    */
  var _albedoTexture: Nullable[BaseTexture] = js.native
  
  /**
    * Defines the alpha limits in alpha test mode.
    * @internal
    */
  var _alphaCutOff: Double = js.native
  
  /**
    * The color of a material in ambient lighting.
    * @internal
    */
  var _ambientColor: Color3 = js.native
  
  /**
    * AKA Occlusion Texture in other nomenclature.
    * @internal
    */
  var _ambientTexture: Nullable[BaseTexture] = js.native
  
  /**
    * Defines how much the AO map is occluding the analytical lights (point spot...).
    * 1 means it completely occludes it
    * 0 mean it has no impact
    * @internal
    */
  var _ambientTextureImpactOnAnalyticalLights: Double = js.native
  
  /**
    * AKA Occlusion Texture Intensity in other nomenclature.
    * @internal
    */
  var _ambientTextureStrength: Double = js.native
  
  /**
    * Attaches a new image processing configuration to the PBR Material.
    * @param configuration
    */
  /* protected */ def _attachImageProcessingConfiguration(configuration: Nullable[ImageProcessingConfiguration]): Unit = js.native
  
  /**
    * Stores surface normal data used to displace a mesh in a texture.
    * @internal
    */
  var _bumpTexture: Nullable[BaseTexture] = js.native
  
  /* protected */ var _cacheHasRenderTargetTextures: Boolean = js.native
  
  /**
    * @internal
    * This is reserved for the inspector.
    * As the default viewing range might not be enough (if the ambient is really small for instance)
    * You can use the factor to better multiply the final value.
    */
  /* private */ var _debugFactor: Any = js.native
  
  /**
    * @internal
    * This is reserved for the inspector.
    * Specify from where on screen the debug mode should start.
    * The value goes from -1 (full screen) to 1 (not visible)
    * It helps with side by side comparison against the final render
    * This defaults to -1
    */
  /* private */ var _debugLimit: Any = js.native
  
  /* private */ var _debugMode: Any = js.native
  
  /**
    * Intensity of the direct lights e.g. the four lights available in your scene.
    * This impacts both the direct diffuse and specular highlights.
    * @internal
    */
  var _directIntensity: Double = js.native
  
  /**
    * Debug Control allowing disabling the bump map on this material.
    * @internal
    */
  var _disableBumpMap: Boolean = js.native
  
  /**
    * If sets to true, disables all the lights affecting the material.
    * @internal
    */
  var _disableLighting: Boolean = js.native
  
  /**
    * The color applied when light is emitted from a material.
    * @internal
    */
  var _emissiveColor: Color3 = js.native
  
  /**
    * Intensity of the emissive part of the material.
    * This helps controlling the emissive effect without modifying the emissive color.
    * @internal
    */
  var _emissiveIntensity: Double = js.native
  
  /**
    * Stores the emissive values in a texture.
    * @internal
    */
  var _emissiveTexture: Nullable[BaseTexture] = js.native
  
  /**
    * Enables specular anti aliasing in the PBR shader.
    * It will both interacts on the Geometry for analytical and IBL lighting.
    * It also prefilter the roughness map based on the bump values.
    * @internal
    */
  var _enableSpecularAntiAliasing: Boolean = js.native
  
  /**
    * Specifies the environment BRDF texture used to compute the scale and offset roughness values
    * from cos theta and roughness:
    * http://blog.selfshadow.com/publications/s2013-shading-course/karis/s2013_pbs_epic_notes_v2.pdf
    * @internal
    */
  var _environmentBRDFTexture: Nullable[BaseTexture] = js.native
  
  /**
    * Intensity of the environment e.g. how much the environment will light the object
    * either through harmonics for rough material or through the reflection for shiny ones.
    * @internal
    */
  var _environmentIntensity: Double = js.native
  
  /**
    * Force the shader to compute irradiance in the fragment shader in order to take bump in account.
    * @internal
    */
  var _forceIrradianceInFragment: Boolean = js.native
  
  /**
    * Force normal to face away from face.
    * @internal
    */
  var _forceNormalForward: Boolean = js.native
  
  /**
    * Returns the texture used for reflections.
    * @returns - Reflection texture if present.  Otherwise, returns the environment texture.
    */
  /* private */ var _getReflectionTexture: Any = js.native
  
  /**
    * Sets the global ambient color for the material used in lighting calculations.
    */
  /* private */ var _globalAmbientColor: Any = js.native
  
  /**
    * Specifies whether or not there is a usable alpha channel for transparency.
    */
  /* protected */ def _hasAlphaChannel(): Boolean = js.native
  
  /**
    * Default configuration related to image processing available in the PBR Material.
    */
  /* protected */ var _imageProcessingConfiguration: ImageProcessingConfiguration = js.native
  
  /**
    * Keep track of the image processing observer to allow dispose and replace.
    */
  /* private */ var _imageProcessingObserver: Any = js.native
  
  /**
    * If sets to true, x component of normal map value will be inverted (x = 1.0 - x).
    * @internal
    */
  var _invertNormalMapX: Boolean = js.native
  
  /**
    * If sets to true, y component of normal map value will be inverted (y = 1.0 - y).
    * @internal
    */
  var _invertNormalMapY: Boolean = js.native
  
  /**
    * Defines the  falloff type used in this material.
    * It by default is Physical.
    * @internal
    */
  var _lightFalloff: Double = js.native
  
  /**
    * This stores the direct, emissive, environment, and specular light intensities into a Vector4.
    */
  /* private */ var _lightingInfos: Any = js.native
  
  /**
    * Stores the pre-calculated light information of a mesh in a texture.
    * @internal
    */
  var _lightmapTexture: Nullable[BaseTexture] = js.native
  
  /**
    * Number of Simultaneous lights allowed on the material.
    * @internal
    */
  var _maxSimultaneousLights: Double = js.native
  
  /**
    * Specifies the metallic scalar of the metallic/roughness workflow.
    * Can also be used to scale the metalness values of the metallic texture.
    * @internal
    */
  var _metallic: Nullable[Double] = js.native
  
  /**
    * In metallic workflow, specifies an F0 factor to help configuring the material F0.
    * By default the indexOfrefraction is used to compute F0;
    *
    * This is used as a factor against the default reflectance at normal incidence to tweak it.
    *
    * F0 = defaultF0 * metallicF0Factor * metallicReflectanceColor;
    * F90 = metallicReflectanceColor;
    * @internal
    */
  var _metallicF0Factor: Double = js.native
  
  /**
    * In metallic workflow, specifies an F90 color to help configuring the material F90.
    * By default the F90 is always 1;
    *
    * Please note that this factor is also used as a factor against the default reflectance at normal incidence.
    *
    * F0 = defaultF0 * metallicF0Factor * metallicReflectanceColor
    * F90 = metallicReflectanceColor;
    * @internal
    */
  var _metallicReflectanceColor: Color3 = js.native
  
  /**
    * Defines to store metallicReflectanceColor in RGB and metallicF0Factor in A
    * This is multiply against the scalar values defined in the material.
    * @internal
    */
  var _metallicReflectanceTexture: Nullable[BaseTexture] = js.native
  
  /**
    * Used to switch from specular/glossiness to metallic/roughness workflow.
    * @internal
    */
  var _metallicTexture: Nullable[BaseTexture] = js.native
  
  /**
    * AKA Glossiness in other nomenclature.
    * @internal
    */
  var _microSurface: Double = js.native
  
  /**
    * Used to enable roughness/glossiness fetch from a separate channel depending on the current mode.
    * Gray Scale represents roughness in metallic mode and glossiness in specular mode.
    * @internal
    */
  var _microSurfaceTexture: Nullable[BaseTexture] = js.native
  
  /**
    * Stores the alpha values in a texture.
    * @internal
    */
  var _opacityTexture: Nullable[BaseTexture] = js.native
  
  /**
    * Controls the scale bias of the parallax mode.
    * @internal
    */
  var _parallaxScaleBias: Double = js.native
  
  /* private */ var _prepareDefines: Any = js.native
  
  /* private */ var _prepareEffect: Any = js.native
  
  /* private */ var _realTimeFiltering: Any = js.native
  
  /* private */ var _realTimeFilteringQuality: Any = js.native
  
  /**
    * Defines to store reflectanceColor in RGB
    * This is multiplied against the scalar values defined in the material.
    * If both _reflectanceTexture and _metallicReflectanceTexture textures are provided and _useOnlyMetallicFromMetallicReflectanceTexture
    * is false, _metallicReflectanceTexture takes precedence and _reflectanceTexture is not used
    * @internal
    */
  var _reflectanceTexture: Nullable[BaseTexture] = js.native
  
  /**
    * The color applied when light is reflected from a material.
    * @internal
    */
  var _reflectionColor: Color3 = js.native
  
  /**
    * Stores the reflection values in a texture.
    * @internal
    */
  var _reflectionTexture: Nullable[BaseTexture] = js.native
  
  /**
    * AKA Specular Color in other nomenclature.
    * @internal
    */
  var _reflectivityColor: Color3 = js.native
  
  /**
    * AKA Specular texture in other nomenclature.
    * @internal
    */
  var _reflectivityTexture: Nullable[BaseTexture] = js.native
  
  /**
    * Stores the available render targets.
    */
  /* private */ var _renderTargets: Any = js.native
  
  /**
    * Specifies the roughness scalar of the metallic/roughness workflow.
    * Can also be used to scale the roughness values of the metallic texture.
    * @internal
    */
  var _roughness: Nullable[Double] = js.native
  
  /**
    * Specifies whether or not the alpha value of the albedo texture should be used for alpha blending.
    */
  /* protected */ def _shouldUseAlphaFromAlbedoTexture(): Boolean = js.native
  
  /**
    * This is a special control allowing the reduction of the specular highlights coming from the
    * four lights of the scene. Those highlights may not be needed in full environment lighting.
    * @internal
    */
  var _specularIntensity: Double = js.native
  
  /**
    * If sets to true and backfaceCulling is false, normals will be flipped on the backside.
    * @internal
    */
  var _twoSidedLighting: Boolean = js.native
  
  /**
    * If set to true, no lighting calculations will be applied.
    */
  /* private */ var _unlit: Any = js.native
  
  /**
    * A fresnel is applied to the alpha of the model to ensure grazing angles edges are not alpha tested.
    * And/Or occlude the blended part. (alpha is converted to gamma to compute the fresnel)
    * @internal
    */
  var _useAlphaFresnel: Boolean = js.native
  
  /**
    * Specifies that the alpha is coming form the albedo channel alpha channel for alpha blending.
    * @internal
    */
  var _useAlphaFromAlbedoTexture: Boolean = js.native
  
  /**
    * Specifies if the ambient texture contains the ambient occlusion information in its red channel only.
    * @internal
    */
  var _useAmbientInGrayScale: Boolean = js.native
  
  /**
    * Specifies if the metallic texture contains the ambient occlusion information in its red channel.
    * @internal
    */
  var _useAmbientOcclusionFromMetallicTextureRed: Boolean = js.native
  
  /**
    * In case the reflectivity map does not contain the microsurface information in its alpha channel,
    * The material will try to infer what glossiness each pixel should be.
    * @internal
    */
  var _useAutoMicroSurfaceFromReflectivityMap: Boolean = js.native
  
  /**
    * This parameters will enable/disable Horizon occlusion to prevent normal maps to look shiny when the normal
    * makes the reflect vector face the model (under horizon).
    * @internal
    */
  var _useHorizonOcclusion: Boolean = js.native
  
  /**
    * Specifies that the material will use the light map as a show map.
    * @internal
    */
  var _useLightmapAsShadowmap: Boolean = js.native
  
  /**
    * A fresnel is applied to the alpha of the model to ensure grazing angles edges are not alpha tested.
    * And/Or occlude the blended part. (alpha stays linear to compute the fresnel)
    * @internal
    */
  var _useLinearAlphaFresnel: Boolean = js.native
  
  /**
    * Enables the use of logarithmic depth buffers, which is good for wide depth buffers.
    */
  /* private */ var _useLogarithmicDepth: Any = js.native
  
  /**
    * Specifies if the metallic texture contains the metallness information in its blue channel.
    * @internal
    */
  var _useMetallnessFromMetallicTextureBlue: Boolean = js.native
  
  /**
    * Specifies if the reflectivity texture contains the glossiness information in its alpha channel.
    * @internal
    */
  var _useMicroSurfaceFromReflectivityMapAlpha: Boolean = js.native
  
  /**
    * Allows using an object space normal map (instead of tangent space).
    * @internal
    */
  var _useObjectSpaceNormalMap: Boolean = js.native
  
  /**
    * Specifies that only the A channel from _metallicReflectanceTexture should be used.
    * If false, both RGB and A channels will be used
    * @internal
    */
  var _useOnlyMetallicFromMetallicReflectanceTexture: Boolean = js.native
  
  /**
    * Allows using the bump map in parallax mode.
    * @internal
    */
  var _useParallax: Boolean = js.native
  
  /**
    * Allows using the bump map in parallax occlusion mode.
    * @internal
    */
  var _useParallaxOcclusion: Boolean = js.native
  
  /**
    * This parameters will enable/disable radiance occlusion by preventing the radiance to lit
    * too much the area relying on ambient texture to define their ambient occlusion.
    * @internal
    */
  var _useRadianceOcclusion: Boolean = js.native
  
  /**
    * Specifies that the material will keeps the reflection highlights over a transparent surface (only the most luminous ones).
    * A car glass is a good example of that. When the street lights reflects on it you can not see what is behind.
    * @internal
    */
  var _useRadianceOverAlpha: Boolean = js.native
  
  /**
    * Specifies if the metallic texture contains the roughness information in its alpha channel.
    * @internal
    */
  var _useRoughnessFromMetallicTextureAlpha: Boolean = js.native
  
  /**
    * Specifies if the metallic texture contains the roughness information in its green channel.
    * @internal
    */
  var _useRoughnessFromMetallicTextureGreen: Boolean = js.native
  
  /**
    * Specifies that the material will keeps the specular highlights over a transparent surface (only the most luminous ones).
    * A car glass is a good example of that. When sun reflects on it you can not see what is behind.
    * @internal
    */
  var _useSpecularOverAlpha: Boolean = js.native
  
  /**
    * Defines the anisotropic parameters for the material.
    */
  val anisotropy: PBRAnisotropicConfiguration = js.native
  
  /**
    * Defines the BRDF parameters for the material.
    */
  val brdf: PBRBRDFConfiguration = js.native
  
  /**
    * Defines the clear coat layer parameters for the material.
    */
  val clearCoat: PBRClearCoatConfiguration = js.native
  
  /**
    * @internal
    * This is reserved for the inspector.
    * Defines the material debug mode.
    * It helps seeing only some components of the material while troubleshooting.
    */
  var debugMode: Double = js.native
  
  /**
    * Defines the detail map parameters for the material.
    */
  val detailMap: DetailMapConfiguration = js.native
  
  /**
    * Defines the iridescence layer parameters for the material.
    */
  val iridescence: PBRIridescenceConfiguration = js.native
  
  /**
    * Specifies if the material uses metallic roughness workflow.
    * @returns boolean specifying if the material uses metallic roughness workflow.
    */
  def isMetallicWorkflow(): Boolean = js.native
  
  /**
    * Defines additional PrePass parameters for the material.
    */
  val prePassConfiguration: PrePassConfiguration = js.native
  
  /**
    * Enables realtime filtering on the texture.
    */
  def realTimeFiltering: Boolean = js.native
  
  /**
    * Quality switch for realtime filtering
    */
  def realTimeFilteringQuality: Double = js.native
  def realTimeFilteringQuality_=(n: Double): Unit = js.native
  
  def realTimeFiltering_=(b: Boolean): Unit = js.native
  
  /**
    * Sets the required values to the prepass renderer.
    */
  def setPrePassRenderer(): Boolean = js.native
  
  /**
    * Defines the Sheen parameters for the material.
    */
  val sheen: PBRSheenConfiguration = js.native
  
  /**
    * Defines the SubSurface parameters for the material.
    */
  val subSurface: PBRSubSurfaceConfiguration = js.native
  
  /**
    * Enabled the use of logarithmic depth buffers, which is good for wide depth buffers.
    */
  def useLogarithmicDepth: Boolean = js.native
  /**
    * Enabled the use of logarithmic depth buffers, which is good for wide depth buffers.
    */
  def useLogarithmicDepth_=(value: Boolean): Unit = js.native
}
