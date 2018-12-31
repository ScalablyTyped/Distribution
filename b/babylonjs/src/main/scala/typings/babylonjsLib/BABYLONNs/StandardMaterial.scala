package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the default material used in Babylon. It is the best trade off between quality
  * and performances.
  * @see http://doc.babylonjs.com/babylon101/materials
  */
@JSGlobal("BABYLON.StandardMaterial")
@js.native
class StandardMaterial protected () extends PushMaterial {
  /**
    * Instantiates a new standard material.
    * This is the default material used in Babylon. It is the best trade off between quality
    * and performances.
    * @see http://doc.babylonjs.com/babylon101/materials
    * @param name Define the name of the material in the scene
    * @param scene Define the scene the material belong to
    */
  def this(name: java.lang.String, scene: Scene) = this()
  var _ambientTexture: js.Any = js.native
  var _bumpTexture: js.Any = js.native
  var _diffuseFresnelParameters: js.Any = js.native
  var _diffuseTexture: js.Any = js.native
  var _disableLighting: js.Any = js.native
  var _emissiveFresnelParameters: js.Any = js.native
  var _emissiveTexture: js.Any = js.native
  var _globalAmbientColor: Color3 = js.native
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
  var _reflectionFresnelParameters: js.Any = js.native
  var _reflectionTexture: js.Any = js.native
  var _refractionFresnelParameters: js.Any = js.native
  var _refractionTexture: js.Any = js.native
  var _renderTargets: SmartArray[RenderTargetTexture] = js.native
  var _roughness: js.Any = js.native
  var _specularTexture: js.Any = js.native
  var _twoSidedLighting: js.Any = js.native
  var _useAlphaFromDiffuseTexture: js.Any = js.native
  var _useEmissiveAsIllumination: js.Any = js.native
  var _useGlossinessFromSpecularMapAlpha: js.Any = js.native
  var _useLightmapAsShadowmap: js.Any = js.native
  var _useLogarithmicDepth: scala.Boolean = js.native
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
  var alphaCutOff: scala.Double = js.native
  /**
    * The color of the material lit by the environmental background lighting.
    * @see http://doc.babylonjs.com/babylon101/materials#ambient-color-example
    */
  var ambientColor: Color3 = js.native
  /**
    * AKA Occlusion Texture in other nomenclature, it helps adding baked shadows into your material.
    */
  var ambientTexture: Nullable[BaseTexture] = js.native
  /**
    * Bump mapping is a technique to simulate bump and dents on a rendered surface.
    * These are made by creating a normal map from an image. The means to do this can be found on the web, a search for 'normal map generator' will bring up free and paid for methods of doing this.
    * @see http://doc.babylonjs.com/how_to/more_materials#bump-map
    */
  var bumpTexture: Nullable[BaseTexture] = js.native
  /**
    * The color grading curves provide additional color adjustmnent that is applied after any color grading transform (3D LUT).
    * They allow basic adjustment of saturation and small exposure adjustments, along with color filter tinting to provide white balance adjustment or more stylistic effects.
    * These are similar to controls found in many professional imaging or colorist software. The global controls are applied to the entire image. For advanced tuning, extra controls are provided to adjust the shadow, midtone and highlight areas of the image;
    * corresponding to low luminance, medium luminance, and high luminance areas respectively.
    */
  /**
    * The color grading curves provide additional color adjustmnent that is applied after any color grading transform (3D LUT).
    * They allow basic adjustment of saturation and small exposure adjustments, along with color filter tinting to provide white balance adjustment or more stylistic effects.
    * These are similar to controls found in many professional imaging or colorist software. The global controls are applied to the entire image. For advanced tuning, extra controls are provided to adjust the shadow, midtone and highlight areas of the image;
    * corresponding to low luminance, medium luminance, and high luminance areas respectively.
    */
  var cameraColorCurves: Nullable[ColorCurves] = js.native
  /**
    * Gets wether the color curves effect is enabled.
    */
  /**
    * Sets wether the color curves effect is enabled.
    */
  var cameraColorCurvesEnabled: scala.Boolean = js.native
  /**
    * Gets wether the color grading effect is enabled.
    */
  /**
    * Gets wether the color grading effect is enabled.
    */
  var cameraColorGradingEnabled: scala.Boolean = js.native
  /**
    * Gets the Color Grading 2D Lookup Texture.
    */
  /**
    * Sets the Color Grading 2D Lookup Texture.
    */
  var cameraColorGradingTexture: Nullable[BaseTexture] = js.native
  /**
    * Gets The camera contrast used on this material.
    */
  /**
    * Sets The camera contrast used on this material.
    */
  var cameraContrast: scala.Double = js.native
  /**
    * The camera exposure used on this material.
    * This property is here and not in the camera to allow controlling exposure without full screen post process.
    * This corresponds to a photographic exposure.
    */
  /**
    * The camera exposure used on this material.
    * This property is here and not in the camera to allow controlling exposure without full screen post process.
    * This corresponds to a photographic exposure.
    */
  var cameraExposure: scala.Double = js.native
  /**
    * Gets wether tonemapping is enabled or not.
    */
  /**
    * Sets wether tonemapping is enabled or not
    */
  var cameraToneMappingEnabled: scala.Boolean = js.native
  /**
    * The basic color of the material as viewed under a light.
    */
  var diffuseColor: Color3 = js.native
  /**
    * Define the diffuse fresnel parameters of the material.
    * @see http://doc.babylonjs.com/how_to/how_to_use_fresnelparameters
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
  var disableLighting: scala.Boolean = js.native
  /**
    * Define the color of the material as if self lit.
    * This will be mixed in the final result even in the absence of light.
    */
  var emissiveColor: Color3 = js.native
  /**
    * Define the emissive fresnel parameters of the material.
    * @see http://doc.babylonjs.com/how_to/how_to_use_fresnelparameters
    */
  var emissiveFresnelParameters: FresnelParameters = js.native
  /**
    * Define texture of the material as if self lit.
    * This will be mixed in the final result even in the absence of light.
    */
  var emissiveTexture: Nullable[BaseTexture] = js.native
  /**
    * Gets the image processing configuration used either in this material.
    */
  /**
    * Sets the Default image processing configuration used either in the this material.
    *
    * If sets to null, the scene one is in use.
    */
  var imageProcessingConfiguration: ImageProcessingConfiguration = js.native
  /**
    * In case of refraction, define the value of the indice of refraction.
    * @see http://doc.babylonjs.com/how_to/reflect#how-to-obtain-reflections-and-refractions
    */
  var indexOfRefraction: scala.Double = js.native
  /**
    * If sets to true, x component of normal map value will invert (x = 1.0 - x).
    */
  var invertNormalMapX: scala.Boolean = js.native
  /**
    * If sets to true, y component of normal map value will invert (y = 1.0 - y).
    */
  var invertNormalMapY: scala.Boolean = js.native
  /**
    * Invert the refraction texture alongside the y axis.
    * It can be usefull with procedural textures or probe for instance.
    * @see http://doc.babylonjs.com/how_to/reflect#how-to-obtain-reflections-and-refractions
    */
  var invertRefractionY: scala.Boolean = js.native
  /**
    * Complex lighting can be computationally expensive to compute at runtime.
    * To save on computation, lightmaps may be used to store calculated lighting in a texture which will be applied to a given mesh.
    * @see http://doc.babylonjs.com/babylon101/lights#lightmaps
    */
  var lightmapTexture: Nullable[BaseTexture] = js.native
  /**
    * If true, some kind of energy conservation will prevent the end result to be more than 1 by reducing
    * the emissive level when the final color is close to one.
    */
  var linkEmissiveWithDiffuse: scala.Boolean = js.native
  /**
    * Defines the maximum number of lights that can be used in the material
    */
  var maxSimultaneousLights: scala.Double = js.native
  /**
    * Define the opacity fresnel parameters of the material.
    * @see http://doc.babylonjs.com/how_to/how_to_use_fresnelparameters
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
  var parallaxScaleBias: scala.Double = js.native
  /**
    * Define the reflection fresnel parameters of the material.
    * @see http://doc.babylonjs.com/how_to/how_to_use_fresnelparameters
    */
  var reflectionFresnelParameters: FresnelParameters = js.native
  /**
    * Define the texture used to display the reflection.
    * @see http://doc.babylonjs.com/how_to/reflect#how-to-obtain-reflections-and-refractions
    */
  var reflectionTexture: Nullable[BaseTexture] = js.native
  /**
    * Define the refraction fresnel parameters of the material.
    * @see http://doc.babylonjs.com/how_to/how_to_use_fresnelparameters
    */
  var refractionFresnelParameters: FresnelParameters = js.native
  /**
    * Define the texture used to display the refraction.
    * @see http://doc.babylonjs.com/how_to/reflect#how-to-obtain-reflections-and-refractions
    */
  var refractionTexture: Nullable[BaseTexture] = js.native
  /**
    * Helps to define how blurry the reflections should appears in the material.
    */
  var roughness: scala.Double = js.native
  /**
    * Define how the color and intensity of the highlight given by the light in the material.
    */
  var specularColor: Color3 = js.native
  /**
    * Defines how sharp are the highlights in the material.
    * The bigger the value the sharper giving a more glossy feeling to the result.
    * Reversely, the smaller the value the blurrier giving a more rough feeling to the result.
    */
  var specularPower: scala.Double = js.native
  /**
    * Define how the color and intensity of the highlight given by the light in the material.
    */
  var specularTexture: Nullable[BaseTexture] = js.native
  /**
    * If sets to true and backfaceCulling is false, normals will be flipped on the backside.
    */
  var twoSidedLighting: scala.Boolean = js.native
  /**
    * Does the transparency come from the diffuse texture alpha channel.
    */
  var useAlphaFromDiffuseTexture: scala.Boolean = js.native
  /**
    * If true, the emissive value is added into the end result, otherwise it is multiplied in.
    */
  var useEmissiveAsIllumination: scala.Boolean = js.native
  /**
    * Defines if the glossiness/roughness of the material should be read from the specular map alpha channel
    */
  var useGlossinessFromSpecularMapAlpha: scala.Boolean = js.native
  /**
    * In case of light mapping, define whether the map contains light or shadow informations.
    */
  var useLightmapAsShadowmap: scala.Boolean = js.native
  /**
    * In case the depth buffer does not allow enough depth precision for your scene (might be the case in large scenes)
    * You can try switching to logarithmic depth.
    * @see http://doc.babylonjs.com/how_to/using_logarithmic_depth_buffer
    */
  var useLogarithmicDepth: scala.Boolean = js.native
  /**
    * Allows using an object space normal map (instead of tangent space).
    */
  var useObjectSpaceNormalMap: scala.Boolean = js.native
  /**
    * Is parallax enabled or not.
    * @see http://doc.babylonjs.com/how_to/using_parallax_mapping
    */
  var useParallax: scala.Boolean = js.native
  /**
    * Is parallax occlusion enabled or not.
    * If true, the outcome is way more realistic than traditional Parallax but you can expect a performance hit that worthes consideration.
    * @see http://doc.babylonjs.com/how_to/using_parallax_mapping
    */
  var useParallaxOcclusion: scala.Boolean = js.native
  /**
    * If true automatically deducts the fresnels values from the material specularity.
    * @see http://doc.babylonjs.com/how_to/how_to_use_fresnelparameters
    */
  var useReflectionFresnelFromSpecular: scala.Boolean = js.native
  /**
    * Specifies that the material will keeps the reflection highlights over a transparent surface (only the most limunous ones).
    * A car glass is a good exemple of that. When the street lights reflects on it you can not see what is behind.
    */
  var useReflectionOverAlpha: scala.Boolean = js.native
  /**
    * Specifies that the material will keep the specular highlights over a transparent surface (only the most limunous ones).
    * A car glass is a good exemple of that. When sun reflects on it you can not see what is behind.
    */
  var useSpecularOverAlpha: scala.Boolean = js.native
  /**
    * Attaches a new image processing configuration to the Standard Material.
    * @param configuration
    */
  /* protected */ def _attachImageProcessingConfiguration(configuration: Nullable[ImageProcessingConfiguration]): scala.Unit = js.native
  /* protected */ def _shouldUseAlphaFromDiffuseTexture(): scala.Boolean = js.native
  /**
    * Builds the material UBO layouts.
    * Used internally during the effect preparation.
    */
  def buildUniformLayout(): scala.Unit = js.native
  /**
    * Custom callback helping to override the default shader used in the material.
    */
  def customShaderNameResolve(
    shaderName: java.lang.String,
    uniforms: js.Array[java.lang.String],
    uniformBuffers: js.Array[java.lang.String],
    samplers: js.Array[java.lang.String],
    defines: StandardMaterialDefines
  ): java.lang.String = js.native
  /**
    * Get the list of animatables in the material.
    * @returns the list of animatables object used in the material
    */
  def getAnimatables(): js.Array[IAnimatable] = js.native
  /**
    * Get if the submesh is ready to be used and all its information available.
    * Child classes can use it to update shaders
    * @param mesh defines the mesh to check
    * @param subMesh defines which submesh to check
    * @param useInstances specifies that instances should be used
    * @returns a boolean indicating that the submesh is ready or not
    */
  def isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh): scala.Boolean = js.native
  def isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: scala.Boolean): scala.Boolean = js.native
}

/**
  * This is the default material used in Babylon. It is the best trade off between quality
  * and performances.
  * @see http://doc.babylonjs.com/babylon101/materials
  */
@JSGlobal("BABYLON.StandardMaterial")
@js.native
object StandardMaterial extends js.Object {
  /**
    * Are ambient textures enabled in the application.
    */
  var AmbientTextureEnabled: scala.Boolean = js.native
  /**
    * Are bump textures enabled in the application.
    */
  var BumpTextureEnabled: scala.Boolean = js.native
  /**
    * Are color grading textures enabled in the application.
    */
  var ColorGradingTextureEnabled: scala.Boolean = js.native
  /**
    * Are diffuse textures enabled in the application.
    */
  var DiffuseTextureEnabled: scala.Boolean = js.native
  /**
    * Are emissive textures enabled in the application.
    */
  var EmissiveTextureEnabled: scala.Boolean = js.native
  /**
    * Are fresnels enabled in the application.
    */
  var FresnelEnabled: scala.Boolean = js.native
  /**
    * Are lightmap textures enabled in the application.
    */
  var LightmapTextureEnabled: scala.Boolean = js.native
  /**
    * Are opacity textures enabled in the application.
    */
  var OpacityTextureEnabled: scala.Boolean = js.native
  /**
    * Are reflection textures enabled in the application.
    */
  var ReflectionTextureEnabled: scala.Boolean = js.native
  /**
    * Are refraction textures enabled in the application.
    */
  var RefractionTextureEnabled: scala.Boolean = js.native
  /**
    * Are specular textures enabled in the application.
    */
  var SpecularTextureEnabled: scala.Boolean = js.native
  var _AmbientTextureEnabled: js.Any = js.native
  var _BumpTextureEnabled: js.Any = js.native
  var _ColorGradingTextureEnabled: js.Any = js.native
  var _DiffuseTextureEnabled: js.Any = js.native
  var _EmissiveTextureEnabled: js.Any = js.native
  var _FresnelEnabled: js.Any = js.native
  var _LightmapTextureEnabled: js.Any = js.native
  var _OpacityTextureEnabled: js.Any = js.native
  var _ReflectionTextureEnabled: js.Any = js.native
  var _RefractionTextureEnabled: js.Any = js.native
  var _SpecularTextureEnabled: js.Any = js.native
  /**
    * Creates a standard material from parsed material data
    * @param source defines the JSON represnetation of the material
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a new material
    */
  def Parse(source: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.StandardMaterial = js.native
}

