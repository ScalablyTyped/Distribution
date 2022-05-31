package typings.babylonjs

import typings.babylonjs.animatableInterfaceMod.IAnimatable
import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.imageProcessingConfigurationMod.IImageProcessingConfigurationDefines
import typings.babylonjs.imageProcessingConfigurationMod.ImageProcessingConfiguration
import typings.babylonjs.materialDefinesMod.MaterialDefines
import typings.babylonjs.materialDetailMapConfigurationMod.DetailMapConfiguration
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.pbrAnisotropicConfigurationMod.PBRAnisotropicConfiguration
import typings.babylonjs.pbrBRDFConfigurationMod.PBRBRDFConfiguration
import typings.babylonjs.pbrClearCoatConfigurationMod.PBRClearCoatConfiguration
import typings.babylonjs.pbrSheenConfigurationMod.PBRSheenConfiguration
import typings.babylonjs.pbrSubSurfaceConfigurationMod.PBRSubSurfaceConfiguration
import typings.babylonjs.prePassConfigurationMod.PrePassConfiguration
import typings.babylonjs.pushMaterialMod.PushMaterial
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbrBaseMaterialMod {
  
  @JSImport("babylonjs/Materials/PBR/pbrBaseMaterial", "PBRBaseMaterial")
  @js.native
  abstract class PBRBaseMaterial protected () extends PushMaterial {
    /**
      * Instantiates a new PBRMaterial instance.
      *
      * @param name The material name
      * @param scene The scene the material will be use in.
      */
    def this(name: String, scene: Scene) = this()
    
    /**
      * AKA Diffuse Color in other nomenclature.
      */
    /* protected */ var _albedoColor: Color3 = js.native
    
    /**
      * AKA Diffuse Texture in standard nomenclature.
      */
    /* protected */ var _albedoTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Defines the alpha limits in alpha test mode.
      */
    /* protected */ var _alphaCutOff: Double = js.native
    
    /**
      * The color of a material in ambient lighting.
      */
    /* protected */ var _ambientColor: Color3 = js.native
    
    /**
      * AKA Occlusion Texture in other nomenclature.
      */
    /* protected */ var _ambientTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Defines how much the AO map is occluding the analytical lights (point spot...).
      * 1 means it completely occludes it
      * 0 mean it has no impact
      */
    /* protected */ var _ambientTextureImpactOnAnalyticalLights: Double = js.native
    
    /**
      * AKA Occlusion Texture Intensity in other nomenclature.
      */
    /* protected */ var _ambientTextureStrength: Double = js.native
    
    /**
      * Attaches a new image processing configuration to the PBR Material.
      * @param configuration
      */
    /* protected */ def _attachImageProcessingConfiguration(configuration: Nullable[ImageProcessingConfiguration]): Unit = js.native
    
    /**
      * Stores surface normal data used to displace a mesh in a texture.
      */
    /* protected */ var _bumpTexture: Nullable[BaseTexture] = js.native
    
    /* private */ var _debugMode: js.Any = js.native
    
    /**
      * Intensity of the direct lights e.g. the four lights available in your scene.
      * This impacts both the direct diffuse and specular highlights.
      */
    /* protected */ var _directIntensity: Double = js.native
    
    /**
      * Debug Control allowing disabling the bump map on this material.
      */
    /* protected */ var _disableBumpMap: Boolean = js.native
    
    /**
      * If sets to true, disables all the lights affecting the material.
      */
    /* protected */ var _disableLighting: Boolean = js.native
    
    /**
      * The color applied when light is emitted from a material.
      */
    /* protected */ var _emissiveColor: Color3 = js.native
    
    /**
      * Intensity of the emissive part of the material.
      * This helps controlling the emissive effect without modifying the emissive color.
      */
    /* protected */ var _emissiveIntensity: Double = js.native
    
    /**
      * Stores the emissive values in a texture.
      */
    /* protected */ var _emissiveTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Enables specular anti aliasing in the PBR shader.
      * It will both interacts on the Geometry for analytical and IBL lighting.
      * It also prefilter the roughness map based on the bump values.
      */
    /* protected */ var _enableSpecularAntiAliasing: Boolean = js.native
    
    /**
      * Specifies the environment BRDF texture used to comput the scale and offset roughness values
      * from cos thetav and roughness:
      * http://blog.selfshadow.com/publications/s2013-shading-course/karis/s2013_pbs_epic_notes_v2.pdf
      */
    /* protected */ var _environmentBRDFTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Intensity of the environment e.g. how much the environment will light the object
      * either through harmonics for rough material or through the refelction for shiny ones.
      */
    /* protected */ var _environmentIntensity: Double = js.native
    
    /**
      * Force the shader to compute irradiance in the fragment shader in order to take bump in account.
      */
    /* protected */ var _forceIrradianceInFragment: Boolean = js.native
    
    /**
      * Force normal to face away from face.
      */
    /* protected */ var _forceNormalForward: Boolean = js.native
    
    /**
      * Returns the texture used for reflections.
      * @returns - Reflection texture if present.  Otherwise, returns the environment texture.
      */
    /* private */ var _getReflectionTexture: js.Any = js.native
    
    /**
      * Sets the global ambient color for the material used in lighting calculations.
      */
    /* private */ var _globalAmbientColor: js.Any = js.native
    
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
    /* private */ var _imageProcessingObserver: js.Any = js.native
    
    /**
      * If sets to true, x component of normal map value will be inverted (x = 1.0 - x).
      */
    /* protected */ var _invertNormalMapX: Boolean = js.native
    
    /**
      * If sets to true, y component of normal map value will be inverted (y = 1.0 - y).
      */
    /* protected */ var _invertNormalMapY: Boolean = js.native
    
    /**
      * Defines the  falloff type used in this material.
      * It by default is Physical.
      */
    /* protected */ var _lightFalloff: Double = js.native
    
    /**
      * This stores the direct, emissive, environment, and specular light intensities into a Vector4.
      */
    /* private */ var _lightingInfos: js.Any = js.native
    
    /**
      * Stores the pre-calculated light information of a mesh in a texture.
      */
    /* protected */ var _lightmapTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Number of Simultaneous lights allowed on the material.
      */
    /* protected */ var _maxSimultaneousLights: Double = js.native
    
    /**
      * Specifies the metallic scalar of the metallic/roughness workflow.
      * Can also be used to scale the metalness values of the metallic texture.
      */
    /* protected */ var _metallic: Nullable[Double] = js.native
    
    /**
      * In metallic workflow, specifies an F0 factor to help configuring the material F0.
      * By default the indexOfrefraction is used to compute F0;
      *
      * This is used as a factor against the default reflectance at normal incidence to tweak it.
      *
      * F0 = defaultF0 * metallicF0Factor * metallicReflectanceColor;
      * F90 = metallicReflectanceColor;
      */
    /* protected */ var _metallicF0Factor: Double = js.native
    
    /**
      * In metallic workflow, specifies an F90 color to help configuring the material F90.
      * By default the F90 is always 1;
      *
      * Please note that this factor is also used as a factor against the default reflectance at normal incidence.
      *
      * F0 = defaultF0 * metallicF0Factor * metallicReflectanceColor
      * F90 = metallicReflectanceColor;
      */
    /* protected */ var _metallicReflectanceColor: Color3 = js.native
    
    /**
      * Defines to store metallicReflectanceColor in RGB and metallicF0Factor in A
      * This is multiply against the scalar values defined in the material.
      */
    /* protected */ var _metallicReflectanceTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Used to switch from specular/glossiness to metallic/roughness workflow.
      */
    /* protected */ var _metallicTexture: Nullable[BaseTexture] = js.native
    
    /**
      * AKA Glossiness in other nomenclature.
      */
    /* protected */ var _microSurface: Double = js.native
    
    /**
      * Used to enable roughness/glossiness fetch from a separate channel depending on the current mode.
      * Gray Scale represents roughness in metallic mode and glossiness in specular mode.
      */
    /* protected */ var _microSurfaceTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Stores the alpha values in a texture.
      */
    /* protected */ var _opacityTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Controls the scale bias of the parallax mode.
      */
    /* protected */ var _parallaxScaleBias: Double = js.native
    
    /* private */ var _prepareDefines: js.Any = js.native
    
    /* private */ var _prepareEffect: js.Any = js.native
    
    /* private */ var _realTimeFiltering: js.Any = js.native
    
    /* private */ var _realTimeFilteringQuality: js.Any = js.native
    
    /* protected */ var _rebuildInParallel: Boolean = js.native
    
    /**
      * The color applied when light is reflected from a material.
      */
    /* protected */ var _reflectionColor: Color3 = js.native
    
    /**
      * Stores the reflection values in a texture.
      */
    /* protected */ var _reflectionTexture: Nullable[BaseTexture] = js.native
    
    /**
      * AKA Specular Color in other nomenclature.
      */
    /* protected */ var _reflectivityColor: Color3 = js.native
    
    /**
      * AKA Specular texture in other nomenclature.
      */
    /* protected */ var _reflectivityTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Stores the available render targets.
      */
    /* private */ var _renderTargets: js.Any = js.native
    
    /**
      * Specifies the roughness scalar of the metallic/roughness workflow.
      * Can also be used to scale the roughness values of the metallic texture.
      */
    /* protected */ var _roughness: Nullable[Double] = js.native
    
    /**
      * Specifies whether or not the alpha value of the albedo texture should be used for alpha blending.
      */
    /* protected */ def _shouldUseAlphaFromAlbedoTexture(): Boolean = js.native
    
    /**
      * This is a special control allowing the reduction of the specular highlights coming from the
      * four lights of the scene. Those highlights may not be needed in full environment lighting.
      */
    /* protected */ var _specularIntensity: Double = js.native
    
    /**
      * If sets to true and backfaceCulling is false, normals will be flipped on the backside.
      */
    /* protected */ var _twoSidedLighting: Boolean = js.native
    
    /**
      * If set to true, no lighting calculations will be applied.
      */
    /* private */ var _unlit: js.Any = js.native
    
    /**
      * A fresnel is applied to the alpha of the model to ensure grazing angles edges are not alpha tested.
      * And/Or occlude the blended part. (alpha is converted to gamma to compute the fresnel)
      */
    /* protected */ var _useAlphaFresnel: Boolean = js.native
    
    /**
      * Specifies that the alpha is coming form the albedo channel alpha channel for alpha blending.
      */
    /* protected */ var _useAlphaFromAlbedoTexture: Boolean = js.native
    
    /**
      * Specifies if the ambient texture contains the ambient occlusion information in its red channel only.
      */
    /* protected */ var _useAmbientInGrayScale: Boolean = js.native
    
    /**
      * Specifies if the metallic texture contains the ambient occlusion information in its red channel.
      */
    /* protected */ var _useAmbientOcclusionFromMetallicTextureRed: Boolean = js.native
    
    /**
      * In case the reflectivity map does not contain the microsurface information in its alpha channel,
      * The material will try to infer what glossiness each pixel should be.
      */
    /* protected */ var _useAutoMicroSurfaceFromReflectivityMap: Boolean = js.native
    
    /**
      * This parameters will enable/disable Horizon occlusion to prevent normal maps to look shiny when the normal
      * makes the reflect vector face the model (under horizon).
      */
    /* protected */ var _useHorizonOcclusion: Boolean = js.native
    
    /**
      * Specifies that the material will use the light map as a show map.
      */
    /* protected */ var _useLightmapAsShadowmap: Boolean = js.native
    
    /**
      * A fresnel is applied to the alpha of the model to ensure grazing angles edges are not alpha tested.
      * And/Or occlude the blended part. (alpha stays linear to compute the fresnel)
      */
    /* protected */ var _useLinearAlphaFresnel: Boolean = js.native
    
    /**
      * Enables the use of logarithmic depth buffers, which is good for wide depth buffers.
      */
    /* private */ var _useLogarithmicDepth: js.Any = js.native
    
    /**
      * Specifies if the metallic texture contains the metallness information in its blue channel.
      */
    /* protected */ var _useMetallnessFromMetallicTextureBlue: Boolean = js.native
    
    /**
      * Specifies if the reflectivity texture contains the glossiness information in its alpha channel.
      */
    /* protected */ var _useMicroSurfaceFromReflectivityMapAlpha: Boolean = js.native
    
    /**
      * Allows using an object space normal map (instead of tangent space).
      */
    /* protected */ var _useObjectSpaceNormalMap: Boolean = js.native
    
    /**
      * Allows using the bump map in parallax mode.
      */
    /* protected */ var _useParallax: Boolean = js.native
    
    /**
      * Allows using the bump map in parallax occlusion mode.
      */
    /* protected */ var _useParallaxOcclusion: Boolean = js.native
    
    /**
      * This parameters will enable/disable radiance occlusion by preventing the radiance to lit
      * too much the area relying on ambient texture to define their ambient occlusion.
      */
    /* protected */ var _useRadianceOcclusion: Boolean = js.native
    
    /**
      * Specifies that the material will keeps the reflection highlights over a transparent surface (only the most limunous ones).
      * A car glass is a good exemple of that. When the street lights reflects on it you can not see what is behind.
      */
    /* protected */ var _useRadianceOverAlpha: Boolean = js.native
    
    /**
      * Specifies if the metallic texture contains the roughness information in its alpha channel.
      */
    /* protected */ var _useRoughnessFromMetallicTextureAlpha: Boolean = js.native
    
    /**
      * Specifies if the metallic texture contains the roughness information in its green channel.
      */
    /* protected */ var _useRoughnessFromMetallicTextureGreen: Boolean = js.native
    
    /**
      * Specifies that the material will keeps the specular highlights over a transparent surface (only the most limunous ones).
      * A car glass is a good exemple of that. When sun reflects on it you can not see what is behind.
      */
    /* protected */ var _useSpecularOverAlpha: Boolean = js.native
    
    /**
      * Defines the anisotropic parameters for the material.
      */
    val anisotropy: PBRAnisotropicConfiguration = js.native
    
    /**
      * Defines the BRDF parameters for the material.
      */
    val brdf: PBRBRDFConfiguration = js.native
    
    /**
      * Initializes the uniform buffer layout for the shader.
      */
    def buildUniformLayout(): Unit = js.native
    
    /**
      * Defines the clear coat layer parameters for the material.
      */
    val clearCoat: PBRClearCoatConfiguration = js.native
    
    /**
      * @hidden
      * This is reserved for the inspector.
      * As the default viewing range might not be enough (if the ambient is really small for instance)
      * You can use the factor to better multiply the final value.
      */
    /* private */ var debugFactor: js.Any = js.native
    
    /**
      * @hidden
      * This is reserved for the inspector.
      * Specify from where on screen the debug mode should start.
      * The value goes from -1 (full screen) to 1 (not visible)
      * It helps with side by side comparison against the final render
      * This defaults to -1
      */
    /* private */ var debugLimit: js.Any = js.native
    
    /**
      * @hidden
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
      * Returns the animatable textures.
      * @returns - Array of animatable textures.
      */
    def getAnimatables(): js.Array[IAnimatable] = js.native
    
    /**
      * Specifies if the material uses metallic roughness workflow.
      * @returns boolean specifiying if the material uses metallic roughness workflow.
      */
    def isMetallicWorkflow(): Boolean = js.native
    
    /**
      * Defines additionnal PrePass parameters for the material.
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
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.babylonjs.materialDetailMapConfigurationMod.IMaterialDetailMapDefines because var conflicts: _areTexturesDirty. Inlined DETAIL, DETAILDIRECTUV, DETAIL_NORMALBLENDMETHOD
  - typings.babylonjs.pbrSubSurfaceConfigurationMod.IMaterialSubSurfaceDefines because var conflicts: _areTexturesDirty. Inlined SUBSURFACE, SS_REFRACTION, SS_TRANSLUCENCY, SS_SCATTERING, SS_THICKNESSANDMASK_TEXTURE, SS_THICKNESSANDMASK_TEXTUREDIRECTUV, SS_REFRACTIONMAP_3D, SS_REFRACTIONMAP_OPPOSITEZ, SS_LODINREFRACTIONALPHA, SS_GAMMAREFRACTION, SS_RGBDREFRACTION, SS_LINEARSPECULARREFRACTION, SS_LINKREFRACTIONTOTRANSPARENCY, SS_ALBEDOFORREFRACTIONTINT, SS_MASK_FROM_THICKNESS_TEXTURE, SS_MASK_FROM_THICKNESS_TEXTURE_GLTF
  - typings.babylonjs.pbrSheenConfigurationMod.IMaterialSheenDefines because var conflicts: _areTexturesDirty. Inlined SHEEN, SHEEN_TEXTURE, SHEEN_TEXTURE_ROUGHNESS, SHEEN_TEXTUREDIRECTUV, SHEEN_TEXTURE_ROUGHNESSDIRECTUV, SHEEN_LINKWITHALBEDO, SHEEN_ROUGHNESS, SHEEN_ALBEDOSCALING, SHEEN_USE_ROUGHNESS_FROM_MAINTEXTURE, SHEEN_TEXTURE_ROUGHNESS_IDENTICAL
  - typings.babylonjs.pbrBRDFConfigurationMod.IMaterialBRDFDefines because var conflicts: _areMiscDirty. Inlined BRDF_V_HEIGHT_CORRELATED, MS_BRDF_ENERGY_CONSERVATION, SPHERICAL_HARMONICS, SPECULAR_GLOSSINESS_ENERGY_CONSERVATION
  - typings.babylonjs.pbrAnisotropicConfigurationMod.IMaterialAnisotropicDefines because var conflicts: _areTexturesDirty, _needUVs. Inlined ANISOTROPIC, ANISOTROPIC_TEXTURE, ANISOTROPIC_TEXTUREDIRECTUV, MAINUV1
  - typings.babylonjs.pbrClearCoatConfigurationMod.IMaterialClearCoatDefines because var conflicts: _areTexturesDirty. Inlined CLEARCOAT, CLEARCOAT_DEFAULTIOR, CLEARCOAT_TEXTURE, CLEARCOAT_TEXTURE_ROUGHNESS, CLEARCOAT_TEXTUREDIRECTUV, CLEARCOAT_TEXTURE_ROUGHNESSDIRECTUV, CLEARCOAT_BUMP, CLEARCOAT_BUMPDIRECTUV, CLEARCOAT_USE_ROUGHNESS_FROM_MAINTEXTURE, CLEARCOAT_TEXTURE_ROUGHNESS_IDENTICAL, CLEARCOAT_REMAP_F0, CLEARCOAT_TINT, CLEARCOAT_TINT_TEXTURE, CLEARCOAT_TINT_TEXTUREDIRECTUV */ @JSImport("babylonjs/Materials/PBR/pbrBaseMaterial", "PBRMaterialDefines")
  @js.native
  /**
    * Initializes the PBR Material defines.
    */
  class PBRMaterialDefines ()
    extends MaterialDefines
       with IImageProcessingConfigurationDefines {
    
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
    
    var ANISOTROPIC: Boolean = js.native
    
    var ANISOTROPIC_TEXTURE: Boolean = js.native
    
    var ANISOTROPIC_TEXTUREDIRECTUV: Double = js.native
    
    var AOSTOREINMETALMAPRED: Boolean = js.native
    
    var BONES_VELOCITY_ENABLED: Boolean = js.native
    
    var BONETEXTURE: Boolean = js.native
    
    var BRDF_V_HEIGHT_CORRELATED: Boolean = js.native
    
    var BUMP: Boolean = js.native
    
    var BUMPDIRECTUV: Double = js.native
    
    var BonesPerMesh: Double = js.native
    
    var CLEARCOAT: Boolean = js.native
    
    var CLEARCOAT_BUMP: Boolean = js.native
    
    var CLEARCOAT_BUMPDIRECTUV: Double = js.native
    
    var CLEARCOAT_DEFAULTIOR: Boolean = js.native
    
    var CLEARCOAT_REMAP_F0: Boolean = js.native
    
    var CLEARCOAT_TEXTURE: Boolean = js.native
    
    var CLEARCOAT_TEXTUREDIRECTUV: Double = js.native
    
    var CLEARCOAT_TEXTURE_ROUGHNESS: Boolean = js.native
    
    var CLEARCOAT_TEXTURE_ROUGHNESSDIRECTUV: Double = js.native
    
    var CLEARCOAT_TEXTURE_ROUGHNESS_IDENTICAL: Boolean = js.native
    
    var CLEARCOAT_TINT: Boolean = js.native
    
    var CLEARCOAT_TINT_TEXTURE: Boolean = js.native
    
    var CLEARCOAT_TINT_TEXTUREDIRECTUV: Double = js.native
    
    var CLEARCOAT_USE_ROUGHNESS_FROM_MAINTEXTURE: Boolean = js.native
    
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
    
    var DETAIL: Boolean = js.native
    
    var DETAILDIRECTUV: Double = js.native
    
    var DETAIL_NORMALBLENDMETHOD: Double = js.native
    
    var EMISSIVE: Boolean = js.native
    
    var EMISSIVEDIRECTUV: Double = js.native
    
    var ENVIRONMENTBRDF: Boolean = js.native
    
    var ENVIRONMENTBRDF_RGBD: Boolean = js.native
    
    /* CompleteClass */
    var EXPOSURE: Boolean = js.native
    
    var FOG: Boolean = js.native
    
    var FORCENORMALFORWARD: Boolean = js.native
    
    var GAMMAALBEDO: Boolean = js.native
    
    var GAMMALIGHTMAP: Boolean = js.native
    
    var GAMMAREFLECTION: Boolean = js.native
    
    var HORIZONOCCLUSION: Boolean = js.native
    
    /* CompleteClass */
    var IMAGEPROCESSING: Boolean = js.native
    
    /* CompleteClass */
    var IMAGEPROCESSINGPOSTPROCESS: Boolean = js.native
    
    var INSTANCES: Boolean = js.native
    
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
    
    var METALLICWORKFLOW: Boolean = js.native
    
    var METALLIC_REFLECTANCE: Boolean = js.native
    
    var METALLIC_REFLECTANCEDIRECTUV: Double = js.native
    
    var METALLNESSSTOREINMETALMAPBLUE: Boolean = js.native
    
    var MICROSURFACEAUTOMATIC: Boolean = js.native
    
    var MICROSURFACEFROMREFLECTIVITYMAP: Boolean = js.native
    
    var MICROSURFACEMAP: Boolean = js.native
    
    var MICROSURFACEMAPDIRECTUV: Double = js.native
    
    var MORPHTARGETS: Boolean = js.native
    
    var MORPHTARGETS_NORMAL: Boolean = js.native
    
    var MORPHTARGETS_TANGENT: Boolean = js.native
    
    var MORPHTARGETS_UV: Boolean = js.native
    
    var MS_BRDF_ENERGY_CONSERVATION: Boolean = js.native
    
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
    
    var PARALLAX: Boolean = js.native
    
    var PARALLAXOCCLUSION: Boolean = js.native
    
    var PBR: Boolean = js.native
    
    var POINTSIZE: Boolean = js.native
    
    var PREMULTIPLYALPHA: Boolean = js.native
    
    var PREPASS: Boolean = js.native
    
    var PREPASS_ALBEDO: Boolean = js.native
    
    var PREPASS_ALBEDO_INDEX: Double = js.native
    
    var PREPASS_DEPTHNORMAL: Boolean = js.native
    
    var PREPASS_DEPTHNORMAL_INDEX: Double = js.native
    
    var PREPASS_IRRADIANCE: Boolean = js.native
    
    var PREPASS_IRRADIANCE_INDEX: Double = js.native
    
    var PREPASS_POSITION: Boolean = js.native
    
    var PREPASS_POSITION_INDEX: Double = js.native
    
    var PREPASS_REFLECTIVITY: Boolean = js.native
    
    var PREPASS_REFLECTIVITY_INDEX: Double = js.native
    
    var PREPASS_VELOCITY: Boolean = js.native
    
    var PREPASS_VELOCITY_INDEX: Double = js.native
    
    var RADIANCEOCCLUSION: Boolean = js.native
    
    var RADIANCEOVERALPHA: Boolean = js.native
    
    var REALTIME_FILTERING: Boolean = js.native
    
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
    
    var SHEEN: Boolean = js.native
    
    var SHEEN_ALBEDOSCALING: Boolean = js.native
    
    var SHEEN_LINKWITHALBEDO: Boolean = js.native
    
    var SHEEN_ROUGHNESS: Boolean = js.native
    
    var SHEEN_TEXTURE: Boolean = js.native
    
    var SHEEN_TEXTUREDIRECTUV: Double = js.native
    
    var SHEEN_TEXTURE_ROUGHNESS: Boolean = js.native
    
    var SHEEN_TEXTURE_ROUGHNESSDIRECTUV: Double = js.native
    
    var SHEEN_TEXTURE_ROUGHNESS_IDENTICAL: Boolean = js.native
    
    var SHEEN_USE_ROUGHNESS_FROM_MAINTEXTURE: Boolean = js.native
    
    var SPECULARAA: Boolean = js.native
    
    var SPECULAROVERALPHA: Boolean = js.native
    
    var SPECULARTERM: Boolean = js.native
    
    var SPECULAR_GLOSSINESS_ENERGY_CONSERVATION: Boolean = js.native
    
    var SPHERICAL_HARMONICS: Boolean = js.native
    
    var SS_ALBEDOFORREFRACTIONTINT: Boolean = js.native
    
    var SS_GAMMAREFRACTION: Boolean = js.native
    
    var SS_LINEARSPECULARREFRACTION: Boolean = js.native
    
    var SS_LINKREFRACTIONTOTRANSPARENCY: Boolean = js.native
    
    var SS_LODINREFRACTIONALPHA: Boolean = js.native
    
    var SS_MASK_FROM_THICKNESS_TEXTURE: Boolean = js.native
    
    var SS_MASK_FROM_THICKNESS_TEXTURE_GLTF: Boolean = js.native
    
    var SS_REFRACTION: Boolean = js.native
    
    var SS_REFRACTIONMAP_3D: Boolean = js.native
    
    var SS_REFRACTIONMAP_OPPOSITEZ: Boolean = js.native
    
    var SS_RGBDREFRACTION: Boolean = js.native
    
    var SS_SCATTERING: Boolean = js.native
    
    var SS_THICKNESSANDMASK_TEXTURE: Boolean = js.native
    
    var SS_THICKNESSANDMASK_TEXTUREDIRECTUV: Double = js.native
    
    var SS_TRANSLUCENCY: Boolean = js.native
    
    var SUBSURFACE: Boolean = js.native
    
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
