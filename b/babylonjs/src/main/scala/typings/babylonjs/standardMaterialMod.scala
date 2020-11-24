package typings.babylonjs

import typings.babylonjs.animatableInterfaceMod.IAnimatable
import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.colorCurvesMod.ColorCurves
import typings.babylonjs.fresnelParametersMod.FresnelParameters
import typings.babylonjs.imageProcessingConfigurationMod.IImageProcessingConfigurationDefines
import typings.babylonjs.imageProcessingConfigurationMod.ImageProcessingConfiguration
import typings.babylonjs.materialDefinesMod.MaterialDefines
import typings.babylonjs.materialDetailMapConfigurationMod.DetailMapConfiguration
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.prePassConfigurationMod.PrePassConfiguration
import typings.babylonjs.pushMaterialMod.PushMaterial
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.smartArrayMod.SmartArray
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/standardMaterial", JSImport.Namespace)
@js.native
object standardMaterialMod extends js.Object {
  
  @js.native
  class StandardMaterial protected () extends PushMaterial {
    /**
      * Instantiates a new standard material.
      * This is the default material used in Babylon. It is the best trade off between quality
      * and performances.
      * @see https://doc.babylonjs.com/babylon101/materials
      * @param name Define the name of the material in the scene
      * @param scene Define the scene the material belong to
      */
    def this(name: String, scene: Scene) = this()
    
    var _ambientTexture: js.Any = js.native
    
    /**
      * Attaches a new image processing configuration to the Standard Material.
      * @param configuration
      */
    /* protected */ def _attachImageProcessingConfiguration(configuration: Nullable[ImageProcessingConfiguration]): Unit = js.native
    
    var _bumpTexture: js.Any = js.native
    
    var _diffuseFresnelParameters: js.Any = js.native
    
    var _diffuseTexture: js.Any = js.native
    
    var _disableLighting: js.Any = js.native
    
    var _emissiveFresnelParameters: js.Any = js.native
    
    var _emissiveTexture: js.Any = js.native
    
    var _globalAmbientColor: Color3 = js.native
    
    /**
      * Specifies whether or not there is a usable alpha channel for transparency.
      */
    /* protected */ def _hasAlphaChannel(): Boolean = js.native
    
    /**
      * Default configuration related to image processing available in the standard Material.
      */
    var _imageProcessingConfiguration: ImageProcessingConfiguration = js.native
    
    /**
      * Keep track of the image processing observer to allow dispose and replace.
      */
    var _imageProcessingObserver: js.Any = js.native
    
    var _invertNormalMapX: js.Any = js.native
    
    var _invertNormalMapY: js.Any = js.native
    
    var _lightmapTexture: js.Any = js.native
    
    var _linkEmissiveWithDiffuse: js.Any = js.native
    
    var _maxSimultaneousLights: js.Any = js.native
    
    var _opacityFresnelParameters: js.Any = js.native
    
    var _opacityTexture: js.Any = js.native
    
    var _rebuildInParallel: Boolean = js.native
    
    var _reflectionFresnelParameters: js.Any = js.native
    
    var _reflectionTexture: js.Any = js.native
    
    var _refractionFresnelParameters: js.Any = js.native
    
    var _refractionTexture: js.Any = js.native
    
    var _renderTargets: SmartArray[RenderTargetTexture] = js.native
    
    var _roughness: js.Any = js.native
    
    /**
      * Specifies whether or not the alpha value of the diffuse texture should be used for alpha blending.
      */
    /* protected */ def _shouldUseAlphaFromDiffuseTexture(): Boolean = js.native
    
    var _specularTexture: js.Any = js.native
    
    var _twoSidedLighting: js.Any = js.native
    
    var _useAlphaFromDiffuseTexture: js.Any = js.native
    
    var _useEmissiveAsIllumination: js.Any = js.native
    
    var _useGlossinessFromSpecularMapAlpha: js.Any = js.native
    
    var _useLightmapAsShadowmap: js.Any = js.native
    
    var _useLogarithmicDepth: Boolean = js.native
    
    var _useObjectSpaceNormalMap: js.Any = js.native
    
    var _useParallax: js.Any = js.native
    
    var _useParallaxOcclusion: js.Any = js.native
    
    var _useReflectionFresnelFromSpecular: js.Any = js.native
    
    var _useReflectionOverAlpha: js.Any = js.native
    
    var _useSpecularOverAlpha: js.Any = js.native
    
    var _worldViewProjectionMatrix: Matrix = js.native
    
    /**
      * Defines the alpha limits in alpha test mode.
      */
    var alphaCutOff: Double = js.native
    
    /**
      * The color of the material lit by the environmental background lighting.
      * @see https://doc.babylonjs.com/babylon101/materials#ambient-color-example
      */
    var ambientColor: Color3 = js.native
    
    /**
      * AKA Occlusion Texture in other nomenclature, it helps adding baked shadows into your material.
      */
    var ambientTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Builds the material UBO layouts.
      * Used internally during the effect preparation.
      */
    def buildUniformLayout(): Unit = js.native
    
    /**
      * Bump mapping is a technique to simulate bump and dents on a rendered surface.
      * These are made by creating a normal map from an image. The means to do this can be found on the web, a search for 'normal map generator' will bring up free and paid for methods of doing this.
      * @see https://doc.babylonjs.com/how_to/more_materials#bump-map
      */
    var bumpTexture: Nullable[BaseTexture] = js.native
    
    /**
      * The color grading curves provide additional color adjustmnent that is applied after any color grading transform (3D LUT).
      * They allow basic adjustment of saturation and small exposure adjustments, along with color filter tinting to provide white balance adjustment or more stylistic effects.
      * These are similar to controls found in many professional imaging or colorist software. The global controls are applied to the entire image. For advanced tuning, extra controls are provided to adjust the shadow, midtone and highlight areas of the image;
      * corresponding to low luminance, medium luminance, and high luminance areas respectively.
      */
    def cameraColorCurves: Nullable[ColorCurves] = js.native
    
    /**
      * Gets wether the color curves effect is enabled.
      */
    def cameraColorCurvesEnabled: Boolean = js.native
    /**
      * Sets wether the color curves effect is enabled.
      */
    def cameraColorCurvesEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * The color grading curves provide additional color adjustmnent that is applied after any color grading transform (3D LUT).
      * They allow basic adjustment of saturation and small exposure adjustments, along with color filter tinting to provide white balance adjustment or more stylistic effects.
      * These are similar to controls found in many professional imaging or colorist software. The global controls are applied to the entire image. For advanced tuning, extra controls are provided to adjust the shadow, midtone and highlight areas of the image;
      * corresponding to low luminance, medium luminance, and high luminance areas respectively.
      */
    def cameraColorCurves_=(value: Nullable[ColorCurves]): Unit = js.native
    
    /**
      * Gets wether the color grading effect is enabled.
      */
    def cameraColorGradingEnabled: Boolean = js.native
    /**
      * Gets wether the color grading effect is enabled.
      */
    def cameraColorGradingEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Gets the Color Grading 2D Lookup Texture.
      */
    def cameraColorGradingTexture: Nullable[BaseTexture] = js.native
    /**
      * Sets the Color Grading 2D Lookup Texture.
      */
    def cameraColorGradingTexture_=(value: Nullable[BaseTexture]): Unit = js.native
    
    /**
      * Gets The camera contrast used on this material.
      */
    def cameraContrast: Double = js.native
    /**
      * Sets The camera contrast used on this material.
      */
    def cameraContrast_=(value: Double): Unit = js.native
    
    /**
      * The camera exposure used on this material.
      * This property is here and not in the camera to allow controlling exposure without full screen post process.
      * This corresponds to a photographic exposure.
      */
    def cameraExposure: Double = js.native
    /**
      * The camera exposure used on this material.
      * This property is here and not in the camera to allow controlling exposure without full screen post process.
      * This corresponds to a photographic exposure.
      */
    def cameraExposure_=(value: Double): Unit = js.native
    
    /**
      * Gets wether tonemapping is enabled or not.
      */
    def cameraToneMappingEnabled: Boolean = js.native
    /**
      * Sets wether tonemapping is enabled or not
      */
    def cameraToneMappingEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Defines the detail map parameters for the material.
      */
    val detailMap: DetailMapConfiguration = js.native
    
    /**
      * The basic color of the material as viewed under a light.
      */
    var diffuseColor: Color3 = js.native
    
    /**
      * Define the diffuse fresnel parameters of the material.
      * @see https://doc.babylonjs.com/how_to/how_to_use_fresnelparameters
      */
    var diffuseFresnelParameters: FresnelParameters = js.native
    
    /**
      * The basic texture of the material as viewed under a light.
      */
    var diffuseTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Does lights from the scene impacts this material.
      * It can be a nice trick for performance to disable lighting on a fully emissive material.
      */
    var disableLighting: Boolean = js.native
    
    /**
      * Define the color of the material as if self lit.
      * This will be mixed in the final result even in the absence of light.
      */
    var emissiveColor: Color3 = js.native
    
    /**
      * Define the emissive fresnel parameters of the material.
      * @see https://doc.babylonjs.com/how_to/how_to_use_fresnelparameters
      */
    var emissiveFresnelParameters: FresnelParameters = js.native
    
    /**
      * Define texture of the material as if self lit.
      * This will be mixed in the final result even in the absence of light.
      */
    var emissiveTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Get the list of animatables in the material.
      * @returns the list of animatables object used in the material
      */
    def getAnimatables(): js.Array[IAnimatable] = js.native
    
    /**
      * Gets the image processing configuration used either in this material.
      */
    def imageProcessingConfiguration: ImageProcessingConfiguration = js.native
    /**
      * Sets the Default image processing configuration used either in the this material.
      *
      * If sets to null, the scene one is in use.
      */
    def imageProcessingConfiguration_=(value: ImageProcessingConfiguration): Unit = js.native
    
    /**
      * In case of refraction, define the value of the index of refraction.
      * @see https://doc.babylonjs.com/how_to/reflect#how-to-obtain-reflections-and-refractions
      */
    var indexOfRefraction: Double = js.native
    
    /**
      * If sets to true, x component of normal map value will invert (x = 1.0 - x).
      */
    var invertNormalMapX: Boolean = js.native
    
    /**
      * If sets to true, y component of normal map value will invert (y = 1.0 - y).
      */
    var invertNormalMapY: Boolean = js.native
    
    /**
      * Invert the refraction texture alongside the y axis.
      * It can be useful with procedural textures or probe for instance.
      * @see https://doc.babylonjs.com/how_to/reflect#how-to-obtain-reflections-and-refractions
      */
    var invertRefractionY: Boolean = js.native
    
    /**
      * Complex lighting can be computationally expensive to compute at runtime.
      * To save on computation, lightmaps may be used to store calculated lighting in a texture which will be applied to a given mesh.
      * @see https://doc.babylonjs.com/babylon101/lights#lightmaps
      */
    var lightmapTexture: Nullable[BaseTexture] = js.native
    
    /**
      * If true, some kind of energy conservation will prevent the end result to be more than 1 by reducing
      * the emissive level when the final color is close to one.
      */
    var linkEmissiveWithDiffuse: Boolean = js.native
    
    /**
      * Defines the maximum number of lights that can be used in the material
      */
    var maxSimultaneousLights: Double = js.native
    
    /**
      * Define the opacity fresnel parameters of the material.
      * @see https://doc.babylonjs.com/how_to/how_to_use_fresnelparameters
      */
    var opacityFresnelParameters: FresnelParameters = js.native
    
    /**
      * Define the transparency of the material from a texture.
      * The final alpha value can be read either from the red channel (if texture.getAlphaFromRGB is false)
      * or from the luminance or the current texel (if texture.getAlphaFromRGB is true)
      */
    var opacityTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Apply a scaling factor that determine which "depth" the height map should reprensent. A value between 0.05 and 0.1 is reasonnable in Parallax, you can reach 0.2 using Parallax Occlusion.
      */
    var parallaxScaleBias: Double = js.native
    
    /**
      * Defines additionnal PrePass parameters for the material.
      */
    val prePassConfiguration: PrePassConfiguration = js.native
    
    /**
      * Define the reflection fresnel parameters of the material.
      * @see https://doc.babylonjs.com/how_to/how_to_use_fresnelparameters
      */
    var reflectionFresnelParameters: FresnelParameters = js.native
    
    /**
      * Define the texture used to display the reflection.
      * @see https://doc.babylonjs.com/how_to/reflect#how-to-obtain-reflections-and-refractions
      */
    var reflectionTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Define the refraction fresnel parameters of the material.
      * @see https://doc.babylonjs.com/how_to/how_to_use_fresnelparameters
      */
    var refractionFresnelParameters: FresnelParameters = js.native
    
    /**
      * Define the texture used to display the refraction.
      * @see https://doc.babylonjs.com/how_to/reflect#how-to-obtain-reflections-and-refractions
      */
    var refractionTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Helps to define how blurry the reflections should appears in the material.
      */
    var roughness: Double = js.native
    
    /**
      * Define how the color and intensity of the highlight given by the light in the material.
      */
    var specularColor: Color3 = js.native
    
    /**
      * Defines how sharp are the highlights in the material.
      * The bigger the value the sharper giving a more glossy feeling to the result.
      * Reversely, the smaller the value the blurrier giving a more rough feeling to the result.
      */
    var specularPower: Double = js.native
    
    /**
      * Define how the color and intensity of the highlight given by the light in the material.
      */
    var specularTexture: Nullable[BaseTexture] = js.native
    
    /**
      * If sets to true and backfaceCulling is false, normals will be flipped on the backside.
      */
    var twoSidedLighting: Boolean = js.native
    
    /**
      * Does the transparency come from the diffuse texture alpha channel.
      */
    var useAlphaFromDiffuseTexture: Boolean = js.native
    
    /**
      * If true, the emissive value is added into the end result, otherwise it is multiplied in.
      */
    var useEmissiveAsIllumination: Boolean = js.native
    
    /**
      * Defines if the glossiness/roughness of the material should be read from the specular map alpha channel
      */
    var useGlossinessFromSpecularMapAlpha: Boolean = js.native
    
    /**
      * In case of light mapping, define whether the map contains light or shadow informations.
      */
    var useLightmapAsShadowmap: Boolean = js.native
    
    /**
      * In case the depth buffer does not allow enough depth precision for your scene (might be the case in large scenes)
      * You can try switching to logarithmic depth.
      * @see https://doc.babylonjs.com/how_to/using_logarithmic_depth_buffer
      */
    def useLogarithmicDepth: Boolean = js.native
    def useLogarithmicDepth_=(value: Boolean): Unit = js.native
    
    /**
      * Allows using an object space normal map (instead of tangent space).
      */
    var useObjectSpaceNormalMap: Boolean = js.native
    
    /**
      * Is parallax enabled or not.
      * @see https://doc.babylonjs.com/how_to/using_parallax_mapping
      */
    var useParallax: Boolean = js.native
    
    /**
      * Is parallax occlusion enabled or not.
      * If true, the outcome is way more realistic than traditional Parallax but you can expect a performance hit that worthes consideration.
      * @see https://doc.babylonjs.com/how_to/using_parallax_mapping
      */
    var useParallaxOcclusion: Boolean = js.native
    
    /**
      * If true automatically deducts the fresnels values from the material specularity.
      * @see https://doc.babylonjs.com/how_to/how_to_use_fresnelparameters
      */
    var useReflectionFresnelFromSpecular: Boolean = js.native
    
    /**
      * Specifies that the material will keeps the reflection highlights over a transparent surface (only the most limunous ones).
      * A car glass is a good exemple of that. When the street lights reflects on it you can not see what is behind.
      */
    var useReflectionOverAlpha: Boolean = js.native
    
    /**
      * Specifies that the material will keep the specular highlights over a transparent surface (only the most limunous ones).
      * A car glass is a good exemple of that. When sun reflects on it you can not see what is behind.
      */
    var useSpecularOverAlpha: Boolean = js.native
  }
  /* static members */
  @js.native
  object StandardMaterial extends js.Object {
    
    /**
      * Are ambient textures enabled in the application.
      */
    def AmbientTextureEnabled: Boolean = js.native
    def AmbientTextureEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Are bump textures enabled in the application.
      */
    def BumpTextureEnabled: Boolean = js.native
    def BumpTextureEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Are color grading textures enabled in the application.
      */
    def ColorGradingTextureEnabled: Boolean = js.native
    def ColorGradingTextureEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Are detail textures enabled in the application.
      */
    def DetailTextureEnabled: Boolean = js.native
    def DetailTextureEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Are diffuse textures enabled in the application.
      */
    def DiffuseTextureEnabled: Boolean = js.native
    def DiffuseTextureEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Are emissive textures enabled in the application.
      */
    def EmissiveTextureEnabled: Boolean = js.native
    def EmissiveTextureEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Are fresnels enabled in the application.
      */
    def FresnelEnabled: Boolean = js.native
    def FresnelEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Are lightmap textures enabled in the application.
      */
    def LightmapTextureEnabled: Boolean = js.native
    def LightmapTextureEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Are opacity textures enabled in the application.
      */
    def OpacityTextureEnabled: Boolean = js.native
    def OpacityTextureEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Creates a standard material from parsed material data
      * @param source defines the JSON representation of the material
      * @param scene defines the hosting scene
      * @param rootUrl defines the root URL to use to load textures and relative dependencies
      * @returns a new standard material
      */
    def Parse(source: js.Any, scene: Scene, rootUrl: String): StandardMaterial = js.native
    
    /**
      * Are reflection textures enabled in the application.
      */
    def ReflectionTextureEnabled: Boolean = js.native
    def ReflectionTextureEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Are refraction textures enabled in the application.
      */
    def RefractionTextureEnabled: Boolean = js.native
    def RefractionTextureEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Are specular textures enabled in the application.
      */
    def SpecularTextureEnabled: Boolean = js.native
    def SpecularTextureEnabled_=(value: Boolean): Unit = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.babylonjs.materialDetailMapConfigurationMod.IMaterialDetailMapDefines because var conflicts: _areTexturesDirty. Inlined DETAIL, DETAILDIRECTUV, DETAIL_NORMALBLENDMETHOD */ @js.native
  class StandardMaterialDefines ()
    extends MaterialDefines
       with IImageProcessingConfigurationDefines {
    
    var ALPHABLEND: Boolean = js.native
    
    var ALPHAFROMDIFFUSE: Boolean = js.native
    
    var ALPHATEST: Boolean = js.native
    
    var ALPHATEST_AFTERALLALPHACOMPUTATIONS: Boolean = js.native
    
    var AMBIENT: Boolean = js.native
    
    var AMBIENTDIRECTUV: Double = js.native
    
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
    
    var DEPTHPREPASS: Boolean = js.native
    
    var DETAIL: Boolean = js.native
    
    var DETAILDIRECTUV: Double = js.native
    
    var DETAIL_NORMALBLENDMETHOD: Double = js.native
    
    var DIFFUSE: Boolean = js.native
    
    var DIFFUSEDIRECTUV: Double = js.native
    
    var DIFFUSEFRESNEL: Boolean = js.native
    
    var EMISSIVE: Boolean = js.native
    
    var EMISSIVEASILLUMINATION: Boolean = js.native
    
    var EMISSIVEDIRECTUV: Double = js.native
    
    var EMISSIVEFRESNEL: Boolean = js.native
    
    var FOG: Boolean = js.native
    
    var FRESNEL: Boolean = js.native
    
    var GLOSSINESS: Boolean = js.native
    
    var INSTANCES: Boolean = js.native
    
    var INVERTCUBICMAP: Boolean = js.native
    
    /**
      * If the reflection texture on this material is in linear color space
      * @hidden
      */
    var IS_REFLECTION_LINEAR: Boolean = js.native
    
    /**
      * If the refraction texture on this material is in linear color space
      * @hidden
      */
    var IS_REFRACTION_LINEAR: Boolean = js.native
    
    var LIGHTMAP: Boolean = js.native
    
    var LIGHTMAPDIRECTUV: Double = js.native
    
    var LINKEMISSIVEWITHDIFFUSE: Boolean = js.native
    
    var LOGARITHMICDEPTH: Boolean = js.native
    
    var MAINUV1: Boolean = js.native
    
    var MAINUV2: Boolean = js.native
    
    var MORPHTARGETS: Boolean = js.native
    
    var MORPHTARGETS_NORMAL: Boolean = js.native
    
    var MORPHTARGETS_TANGENT: Boolean = js.native
    
    var MORPHTARGETS_UV: Boolean = js.native
    
    var MULTIVIEW: Boolean = js.native
    
    var NONUNIFORMSCALING: Boolean = js.native
    
    var NORMAL: Boolean = js.native
    
    var NUM_BONE_INFLUENCERS: Double = js.native
    
    var NUM_MORPH_INFLUENCERS: Double = js.native
    
    var OBJECTSPACE_NORMALMAP: Boolean = js.native
    
    var OPACITY: Boolean = js.native
    
    var OPACITYDIRECTUV: Double = js.native
    
    var OPACITYFRESNEL: Boolean = js.native
    
    var OPACITYRGB: Boolean = js.native
    
    var PARALLAX: Boolean = js.native
    
    var PARALLAXOCCLUSION: Boolean = js.native
    
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
    
    var REFLECTION: Boolean = js.native
    
    var REFLECTIONFRESNEL: Boolean = js.native
    
    var REFLECTIONFRESNELFROMSPECULAR: Boolean = js.native
    
    var REFLECTIONMAP_3D: Boolean = js.native
    
    var REFLECTIONMAP_CUBIC: Boolean = js.native
    
    var REFLECTIONMAP_EQUIRECTANGULAR: Boolean = js.native
    
    var REFLECTIONMAP_EQUIRECTANGULAR_FIXED: Boolean = js.native
    
    var REFLECTIONMAP_EXPLICIT: Boolean = js.native
    
    var REFLECTIONMAP_MIRROREDEQUIRECTANGULAR_FIXED: Boolean = js.native
    
    var REFLECTIONMAP_PLANAR: Boolean = js.native
    
    var REFLECTIONMAP_PROJECTION: Boolean = js.native
    
    var REFLECTIONMAP_SKYBOX: Boolean = js.native
    
    var REFLECTIONMAP_SPHERICAL: Boolean = js.native
    
    var REFLECTIONOVERALPHA: Boolean = js.native
    
    var REFRACTION: Boolean = js.native
    
    var REFRACTIONFRESNEL: Boolean = js.native
    
    var REFRACTIONMAP_3D: Boolean = js.native
    
    var RGBDLIGHTMAP: Boolean = js.native
    
    var RGBDREFLECTION: Boolean = js.native
    
    var RGBDREFRACTION: Boolean = js.native
    
    var ROUGHNESS: Boolean = js.native
    
    var SCENE_MRT_COUNT: Double = js.native
    
    var SHADOWFLOAT: Boolean = js.native
    
    var SPECULAR: Boolean = js.native
    
    var SPECULARDIRECTUV: Double = js.native
    
    var SPECULAROVERALPHA: Boolean = js.native
    
    var SPECULARTERM: Boolean = js.native
    
    var THIN_INSTANCES: Boolean = js.native
    
    var TWOSIDEDLIGHTING: Boolean = js.native
    
    var USELIGHTMAPASSHADOWMAP: Boolean = js.native
    
    var USE_LOCAL_REFLECTIONMAP_CUBIC: Boolean = js.native
    
    var UV1: Boolean = js.native
    
    var UV2: Boolean = js.native
    
    var VERTEXALPHA: Boolean = js.native
    
    var VERTEXCOLOR: Boolean = js.native
    
    def setReflectionMode(modeToEnable: String): Unit = js.native
  }
}
