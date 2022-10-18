package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.Default
import typings.babylonjs.materialsImageProcessingConfigurationMod.IImageProcessingConfigurationDefines
import typings.babylonjs.materialsImageProcessingConfigurationMod.ImageProcessingConfiguration
import typings.babylonjs.materialsMaterialDefinesMod.MaterialDefines
import typings.babylonjs.materialsMaterialDotdetailMapConfigurationMod.DetailMapConfiguration
import typings.babylonjs.materialsPbrPbrAnisotropicConfigurationMod.PBRAnisotropicConfiguration
import typings.babylonjs.materialsPbrPbrBRDFConfigurationMod.PBRBRDFConfiguration
import typings.babylonjs.materialsPbrPbrClearCoatConfigurationMod.PBRClearCoatConfiguration
import typings.babylonjs.materialsPbrPbrIridescenceConfigurationMod.PBRIridescenceConfiguration
import typings.babylonjs.materialsPbrPbrSheenConfigurationMod.PBRSheenConfiguration
import typings.babylonjs.materialsPbrPbrSubSurfaceConfigurationMod.PBRSubSurfaceConfiguration
import typings.babylonjs.materialsPrePassConfigurationMod.PrePassConfiguration
import typings.babylonjs.materialsPushMaterialMod.PushMaterial
import typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typings.babylonjs.mathsMathDotcolorMod.Color3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsPbrPbrBaseMaterialMod {
  
  /* note: abstract class */ @JSImport("babylonjs/Materials/PBR/pbrBaseMaterial", "PBRBaseMaterial")
  @js.native
  open class PBRBaseMaterial protected () extends PushMaterial {
    /**
      * Instantiates a new PBRMaterial instance.
      *
      * @param name The material name
      * @param scene The scene the material will be use in.
      */
    def this(name: String) = this()
    def this(name: String, scene: Scene) = this()
    
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
  /* static members */
  object PBRBaseMaterial {
    
    @JSImport("babylonjs/Materials/PBR/pbrBaseMaterial", "PBRBaseMaterial")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Defines the default value of how much AO map is occluding the analytical lights
      * (point spot...).
      */
    @JSImport("babylonjs/Materials/PBR/pbrBaseMaterial", "PBRBaseMaterial.DEFAULT_AO_ON_ANALYTICAL_LIGHTS")
    @js.native
    def DEFAULT_AO_ON_ANALYTICAL_LIGHTS: Double = js.native
    inline def DEFAULT_AO_ON_ANALYTICAL_LIGHTS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_AO_ON_ANALYTICAL_LIGHTS")(x.asInstanceOf[js.Any])
    
    /**
      * PBRMaterialLightFalloff gltf: light is falling off as described in the gltf moving to PBR document
      * to enhance interoperability with other engines.
      */
    @JSImport("babylonjs/Materials/PBR/pbrBaseMaterial", "PBRBaseMaterial.LIGHTFALLOFF_GLTF")
    @js.native
    val LIGHTFALLOFF_GLTF: Double = js.native
    
    /**
      * PBRMaterialLightFalloff Physical: light is falling off following the inverse squared distance law.
      */
    @JSImport("babylonjs/Materials/PBR/pbrBaseMaterial", "PBRBaseMaterial.LIGHTFALLOFF_PHYSICAL")
    @js.native
    val LIGHTFALLOFF_PHYSICAL: Double = js.native
    
    /**
      * PBRMaterialLightFalloff Standard: light is falling off like in the standard material
      * to enhance interoperability with other materials.
      */
    @JSImport("babylonjs/Materials/PBR/pbrBaseMaterial", "PBRBaseMaterial.LIGHTFALLOFF_STANDARD")
    @js.native
    val LIGHTFALLOFF_STANDARD: Double = js.native
    
    /**
      * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
      */
    @JSImport("babylonjs/Materials/PBR/pbrBaseMaterial", "PBRBaseMaterial.PBRMATERIAL_ALPHABLEND")
    @js.native
    val PBRMATERIAL_ALPHABLEND: Double = js.native
    
    /**
      * PBRMaterialTransparencyMode: Alpha Test mode, pixel are discarded below a certain threshold defined by the alpha cutoff value.
      */
    @JSImport("babylonjs/Materials/PBR/pbrBaseMaterial", "PBRBaseMaterial.PBRMATERIAL_ALPHATEST")
    @js.native
    val PBRMATERIAL_ALPHATEST: Double = js.native
    
    /**
      * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
      * They are also discarded below the alpha cutoff threshold to improve performances.
      */
    @JSImport("babylonjs/Materials/PBR/pbrBaseMaterial", "PBRBaseMaterial.PBRMATERIAL_ALPHATESTANDBLEND")
    @js.native
    val PBRMATERIAL_ALPHATESTANDBLEND: Double = js.native
    
    /**
      * PBRMaterialTransparencyMode: No transparency mode, Alpha channel is not use.
      */
    @JSImport("babylonjs/Materials/PBR/pbrBaseMaterial", "PBRBaseMaterial.PBRMATERIAL_OPAQUE")
    @js.native
    val PBRMATERIAL_OPAQUE: Double = js.native
  }
  
  @JSImport("babylonjs/Materials/PBR/pbrBaseMaterial", "PBRMaterialDefines")
  @js.native
  /**
    * Initializes the PBR Material defines.
    * @param externalProperties The external properties
    */
  open class PBRMaterialDefines ()
    extends MaterialDefines
       with IImageProcessingConfigurationDefines {
    def this(externalProperties: StringDictionary[Default]) = this()
    
    var ALBEDO: Boolean = js.native
    
    var ALBEDODIRECTUV: Double = js.native
    
    var ALPHABLEND: Boolean = js.native
    
    var ALPHAFRESNEL: Boolean = js.native
    
    var ALPHAFROMALBEDO: Boolean = js.native
    
    var ALPHATEST: Boolean = js.native
    
    var ALPHATESTVALUE: String = js.native
    
    var AMBIENT: Boolean = js.native
    
    var AMBIENTDIRECTUV: Double = js.native
    
    var AMBIENTINGRAYSCALE: Boolean = js.native
    
    var AOSTOREINMETALMAPRED: Boolean = js.native
    
    var BAKED_VERTEX_ANIMATION_TEXTURE: Boolean = js.native
    
    var BONES_VELOCITY_ENABLED: Boolean = js.native
    
    var BONETEXTURE: Boolean = js.native
    
    var BUMP: Boolean = js.native
    
    var BUMPDIRECTUV: Double = js.native
    
    var BonesPerMesh: Double = js.native
    
    var CLIPPLANE: Boolean = js.native
    
    var CLIPPLANE2: Boolean = js.native
    
    var CLIPPLANE3: Boolean = js.native
    
    var CLIPPLANE4: Boolean = js.native
    
    var CLIPPLANE5: Boolean = js.native
    
    var CLIPPLANE6: Boolean = js.native
    
    /* CompleteClass */
    var COLORCURVES: Boolean = js.native
    
    /* CompleteClass */
    var COLORGRADING: Boolean = js.native
    
    /* CompleteClass */
    var COLORGRADING3D: Boolean = js.native
    
    /* CompleteClass */
    var CONTRAST: Boolean = js.native
    
    var DEBUGMODE: Double = js.native
    
    var DEPTHPREPASS: Boolean = js.native
    
    /* CompleteClass */
    var DITHER: Boolean = js.native
    
    var EMISSIVE: Boolean = js.native
    
    var EMISSIVEDIRECTUV: Double = js.native
    
    var ENVIRONMENTBRDF: Boolean = js.native
    
    var ENVIRONMENTBRDF_RGBD: Boolean = js.native
    
    /* CompleteClass */
    var EXPOSURE: Boolean = js.native
    
    var FOG: Boolean = js.native
    
    var FORCENORMALFORWARD: Boolean = js.native
    
    var GAMMAALBEDO: Boolean = js.native
    
    var GAMMAEMISSIVE: Boolean = js.native
    
    var GAMMALIGHTMAP: Boolean = js.native
    
    var GAMMAREFLECTION: Boolean = js.native
    
    var HORIZONOCCLUSION: Boolean = js.native
    
    /* CompleteClass */
    var IMAGEPROCESSING: Boolean = js.native
    
    /* CompleteClass */
    var IMAGEPROCESSINGPOSTPROCESS: Boolean = js.native
    
    var INSTANCES: Boolean = js.native
    
    var INSTANCESCOLOR: Boolean = js.native
    
    var INVERTCUBICMAP: Boolean = js.native
    
    var LIGHTMAP: Boolean = js.native
    
    var LIGHTMAPDIRECTUV: Double = js.native
    
    var LINEARALPHAFRESNEL: Boolean = js.native
    
    var LINEARSPECULARREFLECTION: Boolean = js.native
    
    var LODBASEDMICROSFURACE: Boolean = js.native
    
    var LODINREFLECTIONALPHA: Boolean = js.native
    
    var LOGARITHMICDEPTH: Boolean = js.native
    
    var MAINUV1: Boolean = js.native
    
    var MAINUV2: Boolean = js.native
    
    var MAINUV3: Boolean = js.native
    
    var MAINUV4: Boolean = js.native
    
    var MAINUV5: Boolean = js.native
    
    var MAINUV6: Boolean = js.native
    
    var METALLICWORKFLOW: Boolean = js.native
    
    var METALLIC_REFLECTANCE: Boolean = js.native
    
    var METALLIC_REFLECTANCEDIRECTUV: Double = js.native
    
    var METALLIC_REFLECTANCE_GAMMA: Boolean = js.native
    
    var METALLIC_REFLECTANCE_USE_ALPHA_ONLY: Boolean = js.native
    
    var METALLNESSSTOREINMETALMAPBLUE: Boolean = js.native
    
    var MICROSURFACEAUTOMATIC: Boolean = js.native
    
    var MICROSURFACEFROMREFLECTIVITYMAP: Boolean = js.native
    
    var MICROSURFACEMAP: Boolean = js.native
    
    var MICROSURFACEMAPDIRECTUV: Double = js.native
    
    var MORPHTARGETS: Boolean = js.native
    
    var MORPHTARGETS_NORMAL: Boolean = js.native
    
    var MORPHTARGETS_TANGENT: Boolean = js.native
    
    var MORPHTARGETS_TEXTURE: Boolean = js.native
    
    var MORPHTARGETS_UV: Boolean = js.native
    
    var MULTIVIEW: Boolean = js.native
    
    var NONUNIFORMSCALING: Boolean = js.native
    
    var NORMAL: Boolean = js.native
    
    var NORMALXYSCALE: Boolean = js.native
    
    var NUM_BONE_INFLUENCERS: Double = js.native
    
    var NUM_MORPH_INFLUENCERS: Double = js.native
    
    var NUM_SAMPLES: String = js.native
    
    var OBJECTSPACE_NORMALMAP: Boolean = js.native
    
    var OPACITY: Boolean = js.native
    
    var OPACITYDIRECTUV: Double = js.native
    
    var OPACITYRGB: Boolean = js.native
    
    var ORDER_INDEPENDENT_TRANSPARENCY: Boolean = js.native
    
    var ORDER_INDEPENDENT_TRANSPARENCY_16BITS: Boolean = js.native
    
    var PARALLAX: Boolean = js.native
    
    var PARALLAXOCCLUSION: Boolean = js.native
    
    var PBR: Boolean = js.native
    
    var POINTSIZE: Boolean = js.native
    
    var PREMULTIPLYALPHA: Boolean = js.native
    
    var PREPASS: Boolean = js.native
    
    var PREPASS_ALBEDO_SQRT: Boolean = js.native
    
    var PREPASS_ALBEDO_SQRT_INDEX: Double = js.native
    
    var PREPASS_DEPTH: Boolean = js.native
    
    var PREPASS_DEPTH_INDEX: Double = js.native
    
    var PREPASS_IRRADIANCE: Boolean = js.native
    
    var PREPASS_IRRADIANCE_INDEX: Double = js.native
    
    var PREPASS_NORMAL: Boolean = js.native
    
    var PREPASS_NORMAL_INDEX: Double = js.native
    
    var PREPASS_POSITION: Boolean = js.native
    
    var PREPASS_POSITION_INDEX: Double = js.native
    
    var PREPASS_REFLECTIVITY: Boolean = js.native
    
    var PREPASS_REFLECTIVITY_INDEX: Double = js.native
    
    var PREPASS_VELOCITY: Boolean = js.native
    
    var PREPASS_VELOCITY_INDEX: Double = js.native
    
    var RADIANCEOCCLUSION: Boolean = js.native
    
    var RADIANCEOVERALPHA: Boolean = js.native
    
    var REALTIME_FILTERING: Boolean = js.native
    
    var REFLECTANCE: Boolean = js.native
    
    var REFLECTANCEDIRECTUV: Double = js.native
    
    var REFLECTANCE_GAMMA: Boolean = js.native
    
    var REFLECTION: Boolean = js.native
    
    var REFLECTIONMAP_3D: Boolean = js.native
    
    var REFLECTIONMAP_CUBIC: Boolean = js.native
    
    var REFLECTIONMAP_EQUIRECTANGULAR: Boolean = js.native
    
    var REFLECTIONMAP_EQUIRECTANGULAR_FIXED: Boolean = js.native
    
    var REFLECTIONMAP_EXPLICIT: Boolean = js.native
    
    var REFLECTIONMAP_MIRROREDEQUIRECTANGULAR_FIXED: Boolean = js.native
    
    var REFLECTIONMAP_OPPOSITEZ: Boolean = js.native
    
    var REFLECTIONMAP_PLANAR: Boolean = js.native
    
    var REFLECTIONMAP_PROJECTION: Boolean = js.native
    
    var REFLECTIONMAP_SKYBOX: Boolean = js.native
    
    var REFLECTIONMAP_SPHERICAL: Boolean = js.native
    
    var REFLECTIVITY: Boolean = js.native
    
    var REFLECTIVITYDIRECTUV: Double = js.native
    
    var REFLECTIVITY_GAMMA: Boolean = js.native
    
    var RGBDLIGHTMAP: Boolean = js.native
    
    var RGBDREFLECTION: Boolean = js.native
    
    var ROUGHNESSSTOREINMETALMAPALPHA: Boolean = js.native
    
    var ROUGHNESSSTOREINMETALMAPGREEN: Boolean = js.native
    
    /* CompleteClass */
    var SAMPLER3DBGRMAP: Boolean = js.native
    
    /* CompleteClass */
    var SAMPLER3DGREENDEPTH: Boolean = js.native
    
    var SCENE_MRT_COUNT: Double = js.native
    
    var SHADOWFLOAT: Boolean = js.native
    
    /* CompleteClass */
    var SKIPFINALCOLORCLAMP: Boolean = js.native
    
    var SPECULARAA: Boolean = js.native
    
    var SPECULAROVERALPHA: Boolean = js.native
    
    var SPECULARTERM: Boolean = js.native
    
    var TANGENT: Boolean = js.native
    
    var THIN_INSTANCES: Boolean = js.native
    
    /* CompleteClass */
    var TONEMAPPING: Boolean = js.native
    
    /* CompleteClass */
    var TONEMAPPING_ACES: Boolean = js.native
    
    var TWOSIDEDLIGHTING: Boolean = js.native
    
    var UNLIT: Boolean = js.native
    
    var USEGLTFLIGHTFALLOFF: Boolean = js.native
    
    var USEIRRADIANCEMAP: Boolean = js.native
    
    var USELIGHTMAPASSHADOWMAP: Boolean = js.native
    
    var USEPHYSICALLIGHTFALLOFF: Boolean = js.native
    
    var USESPHERICALFROMREFLECTIONMAP: Boolean = js.native
    
    var USESPHERICALINVERTEX: Boolean = js.native
    
    var USE_LOCAL_REFLECTIONMAP_CUBIC: Boolean = js.native
    
    var UV1: Boolean = js.native
    
    var UV2: Boolean = js.native
    
    var UV3: Boolean = js.native
    
    var UV4: Boolean = js.native
    
    var UV5: Boolean = js.native
    
    var UV6: Boolean = js.native
    
    var VERTEXALPHA: Boolean = js.native
    
    var VERTEXCOLOR: Boolean = js.native
    
    /* CompleteClass */
    var VIGNETTE: Boolean = js.native
    
    /* CompleteClass */
    var VIGNETTEBLENDMODEMULTIPLY: Boolean = js.native
    
    /* CompleteClass */
    var VIGNETTEBLENDMODEOPAQUE: Boolean = js.native
  }
}
