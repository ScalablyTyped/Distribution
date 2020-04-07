package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.animatableInterfaceMod.IAnimatable
import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.imageProcessingConfigurationMod.IImageProcessingConfigurationDefines
import typings.babylonjs.imageProcessingConfigurationMod.ImageProcessingConfiguration
import typings.babylonjs.materialDefinesMod.MaterialDefines
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.pbrAnisotropicConfigurationMod.PBRAnisotropicConfiguration
import typings.babylonjs.pbrBRDFConfigurationMod.PBRBRDFConfiguration
import typings.babylonjs.pbrClearCoatConfigurationMod.PBRClearCoatConfiguration
import typings.babylonjs.pbrSheenConfigurationMod.PBRSheenConfiguration
import typings.babylonjs.pbrSubSurfaceConfigurationMod.PBRSubSurfaceConfiguration
import typings.babylonjs.pushMaterialMod.PushMaterial
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.subMeshMod.SubMesh
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/PBR/pbrBaseMaterial", JSImport.Namespace)
@js.native
object pbrBaseMaterialMod extends js.Object {
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
    var _albedoColor: Color3 = js.native
    /**
      * AKA Diffuse Texture in standard nomenclature.
      */
    var _albedoTexture: Nullable[BaseTexture] = js.native
    /**
      * Defines the alpha limits in alpha test mode.
      */
    var _alphaCutOff: Double = js.native
    /**
      * The color of a material in ambient lighting.
      */
    var _ambientColor: Color3 = js.native
    /**
      * AKA Occlusion Texture in other nomenclature.
      */
    var _ambientTexture: Nullable[BaseTexture] = js.native
    /**
      * Defines how much the AO map is occluding the analytical lights (point spot...).
      * 1 means it completely occludes it
      * 0 mean it has no impact
      */
    var _ambientTextureImpactOnAnalyticalLights: Double = js.native
    /**
      * AKA Occlusion Texture Intensity in other nomenclature.
      */
    var _ambientTextureStrength: Double = js.native
    /**
      * Stores surface normal data used to displace a mesh in a texture.
      */
    var _bumpTexture: Nullable[BaseTexture] = js.native
    var _debugMode: js.Any = js.native
    /**
      * Intensity of the direct lights e.g. the four lights available in your scene.
      * This impacts both the direct diffuse and specular highlights.
      */
    var _directIntensity: Double = js.native
    /**
      * Debug Control allowing disabling the bump map on this material.
      */
    var _disableBumpMap: Boolean = js.native
    /**
      * If sets to true, disables all the lights affecting the material.
      */
    var _disableLighting: Boolean = js.native
    /**
      * The color applied when light is emitted from a material.
      */
    var _emissiveColor: Color3 = js.native
    /**
      * Intensity of the emissive part of the material.
      * This helps controlling the emissive effect without modifying the emissive color.
      */
    var _emissiveIntensity: Double = js.native
    /**
      * Stores the emissive values in a texture.
      */
    var _emissiveTexture: Nullable[BaseTexture] = js.native
    /**
      * Enables specular anti aliasing in the PBR shader.
      * It will both interacts on the Geometry for analytical and IBL lighting.
      * It also prefilter the roughness map based on the bump values.
      */
    var _enableSpecularAntiAliasing: Boolean = js.native
    /**
      * Specifies the environment BRDF texture used to comput the scale and offset roughness values
      * from cos thetav and roughness:
      * http://blog.selfshadow.com/publications/s2013-shading-course/karis/s2013_pbs_epic_notes_v2.pdf
      */
    var _environmentBRDFTexture: Nullable[BaseTexture] = js.native
    /**
      * Intensity of the environment e.g. how much the environment will light the object
      * either through harmonics for rough material or through the refelction for shiny ones.
      */
    var _environmentIntensity: Double = js.native
    /**
      * Enforces alpha test in opaque or blend mode in order to improve the performances of some situations.
      */
    var _forceAlphaTest: Boolean = js.native
    /**
      * Force the shader to compute irradiance in the fragment shader in order to take bump in account.
      */
    var _forceIrradianceInFragment: Boolean = js.native
    /**
      * Force normal to face away from face.
      */
    var _forceNormalForward: Boolean = js.native
    /**
      * Returns the texture used for reflections.
      * @returns - Reflection texture if present.  Otherwise, returns the environment texture.
      */
    var _getReflectionTexture: js.Any = js.native
    /**
      * Sets the global ambient color for the material used in lighting calculations.
      */
    var _globalAmbientColor: js.Any = js.native
    /**
      * Default configuration related to image processing available in the PBR Material.
      */
    var _imageProcessingConfiguration: ImageProcessingConfiguration = js.native
    /**
      * Keep track of the image processing observer to allow dispose and replace.
      */
    var _imageProcessingObserver: js.Any = js.native
    /**
      * If sets to true, x component of normal map value will be inverted (x = 1.0 - x).
      */
    var _invertNormalMapX: Boolean = js.native
    /**
      * If sets to true, y component of normal map value will be inverted (y = 1.0 - y).
      */
    var _invertNormalMapY: Boolean = js.native
    /**
      * Defines the  falloff type used in this material.
      * It by default is Physical.
      */
    var _lightFalloff: Double = js.native
    /**
      * This stores the direct, emissive, environment, and specular light intensities into a Vector4.
      */
    var _lightingInfos: js.Any = js.native
    /**
      * Stores the pre-calculated light information of a mesh in a texture.
      */
    var _lightmapTexture: Nullable[BaseTexture] = js.native
    /**
      * Number of Simultaneous lights allowed on the material.
      */
    var _maxSimultaneousLights: Double = js.native
    /**
      * Specifies the metallic scalar of the metallic/roughness workflow.
      * Can also be used to scale the metalness values of the metallic texture.
      */
    var _metallic: Nullable[Double] = js.native
    /**
      * Specifies the an F0 factor to help configuring the material F0.
      * Instead of the default 4%, 8% * factor will be used. As the factor is defaulting
      * to 0.5 the previously hard coded value stays the same.
      * Can also be used to scale the F0 values of the metallic texture.
      */
    var _metallicF0Factor: Double = js.native
    /**
      * Used to switch from specular/glossiness to metallic/roughness workflow.
      */
    var _metallicTexture: Nullable[BaseTexture] = js.native
    /**
      * AKA Glossiness in other nomenclature.
      */
    var _microSurface: Double = js.native
    /**
      * Used to enable roughness/glossiness fetch from a separate channel depending on the current mode.
      * Gray Scale represents roughness in metallic mode and glossiness in specular mode.
      */
    var _microSurfaceTexture: Nullable[BaseTexture] = js.native
    /**
      * Stores the alpha values in a texture.
      */
    var _opacityTexture: Nullable[BaseTexture] = js.native
    /**
      * Controls the scale bias of the parallax mode.
      */
    var _parallaxScaleBias: Double = js.native
    var _prepareDefines: js.Any = js.native
    var _prepareEffect: js.Any = js.native
    var _rebuildInParallel: Boolean = js.native
    /**
      * The color applied when light is reflected from a material.
      */
    var _reflectionColor: Color3 = js.native
    /**
      * Stores the reflection values in a texture.
      */
    var _reflectionTexture: Nullable[BaseTexture] = js.native
    /**
      * AKA Specular Color in other nomenclature.
      */
    var _reflectivityColor: Color3 = js.native
    /**
      * AKA Specular texture in other nomenclature.
      */
    var _reflectivityTexture: Nullable[BaseTexture] = js.native
    /**
      * Stores the available render targets.
      */
    var _renderTargets: js.Any = js.native
    /**
      * Specifies the roughness scalar of the metallic/roughness workflow.
      * Can also be used to scale the roughness values of the metallic texture.
      */
    var _roughness: Nullable[Double] = js.native
    /**
      * This is a special control allowing the reduction of the specular highlights coming from the
      * four lights of the scene. Those highlights may not be needed in full environment lighting.
      */
    var _specularIntensity: Double = js.native
    /**
      * The transparency mode of the material.
      */
    var _transparencyMode: Nullable[Double] = js.native
    /**
      * If sets to true and backfaceCulling is false, normals will be flipped on the backside.
      */
    var _twoSidedLighting: Boolean = js.native
    /**
      * If set to true, no lighting calculations will be applied.
      */
    var _unlit: js.Any = js.native
    /**
      * A fresnel is applied to the alpha of the model to ensure grazing angles edges are not alpha tested.
      * And/Or occlude the blended part. (alpha is converted to gamma to compute the fresnel)
      */
    var _useAlphaFresnel: Boolean = js.native
    /**
      * Specifies that the alpha is coming form the albedo channel alpha channel for alpha blending.
      */
    var _useAlphaFromAlbedoTexture: Boolean = js.native
    /**
      * Specifies if the ambient texture contains the ambient occlusion information in its red channel only.
      */
    var _useAmbientInGrayScale: Boolean = js.native
    /**
      * Specifies if the metallic texture contains the ambient occlusion information in its red channel.
      */
    var _useAmbientOcclusionFromMetallicTextureRed: Boolean = js.native
    /**
      * In case the reflectivity map does not contain the microsurface information in its alpha channel,
      * The material will try to infer what glossiness each pixel should be.
      */
    var _useAutoMicroSurfaceFromReflectivityMap: Boolean = js.native
    /**
      * This parameters will enable/disable Horizon occlusion to prevent normal maps to look shiny when the normal
      * makes the reflect vector face the model (under horizon).
      */
    var _useHorizonOcclusion: Boolean = js.native
    /**
      * Specifies that the material will use the light map as a show map.
      */
    var _useLightmapAsShadowmap: Boolean = js.native
    /**
      * A fresnel is applied to the alpha of the model to ensure grazing angles edges are not alpha tested.
      * And/Or occlude the blended part. (alpha stays linear to compute the fresnel)
      */
    var _useLinearAlphaFresnel: Boolean = js.native
    /**
      * Enables the use of logarithmic depth buffers, which is good for wide depth buffers.
      */
    var _useLogarithmicDepth: js.Any = js.native
    /**
      * Specifies whether the F0 factor can be fetched from the mettalic texture.
      * If set to true, please adapt the metallicF0Factor to ensure it fits with
      * your expectation as it multiplies with the texture data.
      */
    var _useMetallicF0FactorFromMetallicTexture: Boolean = js.native
    /**
      * Specifies if the metallic texture contains the metallness information in its blue channel.
      */
    var _useMetallnessFromMetallicTextureBlue: Boolean = js.native
    /**
      * Specifies if the reflectivity texture contains the glossiness information in its alpha channel.
      */
    var _useMicroSurfaceFromReflectivityMapAlpha: Boolean = js.native
    /**
      * Allows using an object space normal map (instead of tangent space).
      */
    var _useObjectSpaceNormalMap: Boolean = js.native
    /**
      * Allows using the bump map in parallax mode.
      */
    var _useParallax: Boolean = js.native
    /**
      * Allows using the bump map in parallax occlusion mode.
      */
    var _useParallaxOcclusion: Boolean = js.native
    /**
      * This parameters will enable/disable radiance occlusion by preventing the radiance to lit
      * too much the area relying on ambient texture to define their ambient occlusion.
      */
    var _useRadianceOcclusion: Boolean = js.native
    /**
      * Specifies that the material will keeps the reflection highlights over a transparent surface (only the most limunous ones).
      * A car glass is a good exemple of that. When the street lights reflects on it you can not see what is behind.
      */
    var _useRadianceOverAlpha: Boolean = js.native
    /**
      * Specifies if the metallic texture contains the roughness information in its alpha channel.
      */
    var _useRoughnessFromMetallicTextureAlpha: Boolean = js.native
    /**
      * Specifies if the metallic texture contains the roughness information in its green channel.
      */
    var _useRoughnessFromMetallicTextureGreen: Boolean = js.native
    /**
      * Specifies that the material will keeps the specular highlights over a transparent surface (only the most limunous ones).
      * A car glass is a good exemple of that. When sun reflects on it you can not see what is behind.
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
      * @hidden
      * This is reserved for the inspector.
      * As the default viewing range might not be enough (if the ambient is really small for instance)
      * You can use the factor to better multiply the final value.
      */
    var debugFactor: js.Any = js.native
    /**
      * @hidden
      * This is reserved for the inspector.
      * Specify from where on screen the debug mode should start.
      * The value goes from -1 (full screen) to 1 (not visible)
      * It helps with side by side comparison against the final render
      * This defaults to -1
      */
    var debugLimit: js.Any = js.native
    /**
      * @hidden
      * This is reserved for the inspector.
      * Defines the material debug mode.
      * It helps seeing only some components of the material while troubleshooting.
      */
    var debugMode: Double = js.native
    /**
      * Defines the Sheen parameters for the material.
      */
    val sheen: PBRSheenConfiguration = js.native
    /**
      * Defines the SubSurface parameters for the material.
      */
    val subSurface: PBRSubSurfaceConfiguration = js.native
    /**
      * Attaches a new image processing configuration to the PBR Material.
      * @param configuration
      */
    /* protected */ def _attachImageProcessingConfiguration(configuration: Nullable[ImageProcessingConfiguration]): Unit = js.native
    /**
      * Returns true if alpha blending should be disabled.
      */
    /* private */ def _disableAlphaBlending(): js.Any = js.native
    /**
      * Specifies whether or not the alpha value of the albedo texture should be used for alpha blending.
      */
    /* protected */ def _shouldUseAlphaFromAlbedoTexture(): Boolean = js.native
    /**
      * Initializes the uniform buffer layout for the shader.
      */
    def buildUniformLayout(): Unit = js.native
    /**
      * Custom callback helping to override the default shader used in the material.
      */
    def customShaderNameResolve(
      shaderName: String,
      uniforms: js.Array[String],
      uniformBuffers: js.Array[String],
      samplers: js.Array[String],
      defines: PBRMaterialDefines
    ): String = js.native
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
      * Specifies that the submesh is ready to be used.
      * @param mesh - BJS mesh.
      * @param subMesh - A submesh of the BJS mesh.  Used to check if it is ready.
      * @param useInstances - Specifies that instances should be used.
      * @returns - boolean indicating that the submesh is ready or not.
      */
    def isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh): Boolean = js.native
    def isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
    /**
      * Gets the current transparency mode.
      */
    def transparencyMode(): Nullable[Double] = js.native
    /**
      * Sets the transparency mode of the material.
      *
      * | Value | Type                                | Description |
      * | ----- | ----------------------------------- | ----------- |
      * | 0     | OPAQUE                              |             |
      * | 1     | ALPHATEST                           |             |
      * | 2     | ALPHABLEND                          |             |
      * | 3     | ALPHATESTANDBLEND                   |             |
      *
      */
    def transparencyMode(value: Nullable[Double]): js.Any = js.native
    /**
      * Enabled the use of logarithmic depth buffers, which is good for wide depth buffers.
      */
    def useLogarithmicDepth(): Boolean = js.native
    /**
      * Enabled the use of logarithmic depth buffers, which is good for wide depth buffers.
      */
    def useLogarithmicDepth(value: Boolean): js.Any = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.babylonjs.pbrSubSurfaceConfigurationMod.IMaterialSubSurfaceDefines because var conflicts: _areTexturesDirty. Inlined SUBSURFACE, SS_REFRACTION, SS_TRANSLUCENCY, SS_SCATERRING, SS_THICKNESSANDMASK_TEXTURE, SS_THICKNESSANDMASK_TEXTUREDIRECTUV, SS_REFRACTIONMAP_3D, SS_REFRACTIONMAP_OPPOSITEZ, SS_LODINREFRACTIONALPHA, SS_GAMMAREFRACTION, SS_RGBDREFRACTION, SS_LINEARSPECULARREFRACTION, SS_LINKREFRACTIONTOTRANSPARENCY, SS_MASK_FROM_THICKNESS_TEXTURE
  - typings.babylonjs.pbrSheenConfigurationMod.IMaterialSheenDefines because var conflicts: _areTexturesDirty. Inlined SHEEN, SHEEN_TEXTURE, SHEEN_TEXTUREDIRECTUV, SHEEN_LINKWITHALBEDO
  - typings.babylonjs.pbrBRDFConfigurationMod.IMaterialBRDFDefines because var conflicts: _areMiscDirty. Inlined BRDF_V_HEIGHT_CORRELATED, MS_BRDF_ENERGY_CONSERVATION, SPHERICAL_HARMONICS, SPECULAR_GLOSSINESS_ENERGY_CONSERVATION
  - typings.babylonjs.pbrAnisotropicConfigurationMod.IMaterialAnisotropicDefines because var conflicts: _areTexturesDirty, _needUVs. Inlined ANISOTROPIC, ANISOTROPIC_TEXTURE, ANISOTROPIC_TEXTUREDIRECTUV, MAINUV1
  - typings.babylonjs.pbrClearCoatConfigurationMod.IMaterialClearCoatDefines because var conflicts: _areTexturesDirty. Inlined CLEARCOAT, CLEARCOAT_DEFAULTIOR, CLEARCOAT_TEXTURE, CLEARCOAT_TEXTUREDIRECTUV, CLEARCOAT_BUMP, CLEARCOAT_BUMPDIRECTUV, CLEARCOAT_TINT, CLEARCOAT_TINT_TEXTURE, CLEARCOAT_TINT_TEXTUREDIRECTUV */ @js.native
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
    var BONETEXTURE: Boolean = js.native
    var BRDF_V_HEIGHT_CORRELATED: Boolean = js.native
    var BUMP: Boolean = js.native
    var BUMPDIRECTUV: Double = js.native
    var BonesPerMesh: Double = js.native
    var CLEARCOAT: Boolean = js.native
    var CLEARCOAT_BUMP: Boolean = js.native
    var CLEARCOAT_BUMPDIRECTUV: Double = js.native
    var CLEARCOAT_DEFAULTIOR: Boolean = js.native
    var CLEARCOAT_TEXTURE: Boolean = js.native
    var CLEARCOAT_TEXTUREDIRECTUV: Double = js.native
    var CLEARCOAT_TINT: Boolean = js.native
    var CLEARCOAT_TINT_TEXTURE: Boolean = js.native
    var CLEARCOAT_TINT_TEXTUREDIRECTUV: Double = js.native
    var CLIPPLANE: Boolean = js.native
    var CLIPPLANE2: Boolean = js.native
    var CLIPPLANE3: Boolean = js.native
    var CLIPPLANE4: Boolean = js.native
    var CLIPPLANE5: Boolean = js.native
    var CLIPPLANE6: Boolean = js.native
    /* CompleteClass */
    override var COLORCURVES: Boolean = js.native
    /* CompleteClass */
    override var COLORGRADING: Boolean = js.native
    /* CompleteClass */
    override var COLORGRADING3D: Boolean = js.native
    /* CompleteClass */
    override var CONTRAST: Boolean = js.native
    var DEBUGMODE: Double = js.native
    var DEPTHPREPASS: Boolean = js.native
    var EMISSIVE: Boolean = js.native
    var EMISSIVEDIRECTUV: Double = js.native
    var ENVIRONMENTBRDF: Boolean = js.native
    var ENVIRONMENTBRDF_RGBD: Boolean = js.native
    /* CompleteClass */
    override var EXPOSURE: Boolean = js.native
    var FOG: Boolean = js.native
    var FORCENORMALFORWARD: Boolean = js.native
    var GAMMAALBEDO: Boolean = js.native
    var GAMMALIGHTMAP: Boolean = js.native
    var GAMMAREFLECTION: Boolean = js.native
    var HORIZONOCCLUSION: Boolean = js.native
    /* CompleteClass */
    override var IMAGEPROCESSING: Boolean = js.native
    /* CompleteClass */
    override var IMAGEPROCESSINGPOSTPROCESS: Boolean = js.native
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
    var METALLICF0FACTORFROMMETALLICMAP: Boolean = js.native
    var METALLICWORKFLOW: Boolean = js.native
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
    var OBJECTSPACE_NORMALMAP: Boolean = js.native
    var OPACITY: Boolean = js.native
    var OPACITYDIRECTUV: Double = js.native
    var OPACITYRGB: Boolean = js.native
    var PARALLAX: Boolean = js.native
    var PARALLAXOCCLUSION: Boolean = js.native
    var PBR: Boolean = js.native
    var POINTSIZE: Boolean = js.native
    var PREMULTIPLYALPHA: Boolean = js.native
    var RADIANCEOCCLUSION: Boolean = js.native
    var RADIANCEOVERALPHA: Boolean = js.native
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
    override var SAMPLER3DBGRMAP: Boolean = js.native
    /* CompleteClass */
    override var SAMPLER3DGREENDEPTH: Boolean = js.native
    var SHADOWFLOAT: Boolean = js.native
    var SHEEN: Boolean = js.native
    var SHEEN_LINKWITHALBEDO: Boolean = js.native
    var SHEEN_TEXTURE: Boolean = js.native
    var SHEEN_TEXTUREDIRECTUV: Double = js.native
    var SPECULARAA: Boolean = js.native
    var SPECULAROVERALPHA: Boolean = js.native
    var SPECULARTERM: Boolean = js.native
    var SPECULAR_GLOSSINESS_ENERGY_CONSERVATION: Boolean = js.native
    var SPHERICAL_HARMONICS: Boolean = js.native
    var SS_GAMMAREFRACTION: Boolean = js.native
    var SS_LINEARSPECULARREFRACTION: Boolean = js.native
    var SS_LINKREFRACTIONTOTRANSPARENCY: Boolean = js.native
    var SS_LODINREFRACTIONALPHA: Boolean = js.native
    var SS_MASK_FROM_THICKNESS_TEXTURE: Boolean = js.native
    var SS_REFRACTION: Boolean = js.native
    var SS_REFRACTIONMAP_3D: Boolean = js.native
    var SS_REFRACTIONMAP_OPPOSITEZ: Boolean = js.native
    var SS_RGBDREFRACTION: Boolean = js.native
    var SS_SCATERRING: Boolean = js.native
    var SS_THICKNESSANDMASK_TEXTURE: Boolean = js.native
    var SS_THICKNESSANDMASK_TEXTUREDIRECTUV: Double = js.native
    var SS_TRANSLUCENCY: Boolean = js.native
    var SUBSURFACE: Boolean = js.native
    var TANGENT: Boolean = js.native
    /* CompleteClass */
    override var TONEMAPPING: Boolean = js.native
    /* CompleteClass */
    override var TONEMAPPING_ACES: Boolean = js.native
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
    override var VIGNETTE: Boolean = js.native
    /* CompleteClass */
    override var VIGNETTEBLENDMODEMULTIPLY: Boolean = js.native
    /* CompleteClass */
    override var VIGNETTEBLENDMODEOPAQUE: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PBRBaseMaterial extends js.Object {
    /**
      * Defines the default value of how much AO map is occluding the analytical lights
      * (point spot...).
      */
    var DEFAULT_AO_ON_ANALYTICAL_LIGHTS: Double = js.native
    /**
      * PBRMaterialLightFalloff gltf: light is falling off as described in the gltf moving to PBR document
      * to enhance interoperability with other engines.
      */
    val LIGHTFALLOFF_GLTF: Double = js.native
    /**
      * PBRMaterialLightFalloff Physical: light is falling off following the inverse squared distance law.
      */
    val LIGHTFALLOFF_PHYSICAL: Double = js.native
    /**
      * PBRMaterialLightFalloff Standard: light is falling off like in the standard material
      * to enhance interoperability with other materials.
      */
    val LIGHTFALLOFF_STANDARD: Double = js.native
    /**
      * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
      */
    val PBRMATERIAL_ALPHABLEND: Double = js.native
    /**
      * PBRMaterialTransparencyMode: Alpha Test mode, pixel are discarded below a certain threshold defined by the alpha cutoff value.
      */
    val PBRMATERIAL_ALPHATEST: Double = js.native
    /**
      * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
      * They are also discarded below the alpha cutoff threshold to improve performances.
      */
    val PBRMATERIAL_ALPHATESTANDBLEND: Double = js.native
    /**
      * PBRMaterialTransparencyMode: No transparency mode, Alpha channel is not use.
      */
    val PBRMATERIAL_OPAQUE: Double = js.native
  }
  
}

