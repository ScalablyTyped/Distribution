package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PBRMaterial extends PBRBaseMaterial {
  /**
    * AKA Diffuse Color in other nomenclature.
    */
  var albedoColor: Color3 = js.native
  /**
    * AKA Diffuse Texture in standard nomenclature.
    */
  var albedoTexture: BaseTexture = js.native
  /**
    * Defines the alpha limits in alpha test mode.
    */
  var alphaCutOff: Double = js.native
  /**
    * The color of a material in ambient lighting.
    */
  var ambientColor: Color3 = js.native
  /**
    * AKA Occlusion Texture in other nomenclature.
    */
  var ambientTexture: BaseTexture = js.native
  /**
    * Defines how much the AO map is occluding the analytical lights (point spot...).
    * 1 means it completely occludes it
    * 0 mean it has no impact
    */
  var ambientTextureImpactOnAnalyticalLights: Double = js.native
  /**
    * AKA Occlusion Texture Intensity in other nomenclature.
    */
  var ambientTextureStrength: Double = js.native
  /**
    * Stores surface normal data used to displace a mesh in a texture.
    */
  var bumpTexture: BaseTexture = js.native
  /**
    * Intensity of the direct lights e.g. the four lights available in your scene.
    * This impacts both the direct diffuse and specular highlights.
    */
  var directIntensity: Double = js.native
  /**
    * Debug Control allowing disabling the bump map on this material.
    */
  var disableBumpMap: Boolean = js.native
  /**
    * If sets to true, disables all the lights affecting the material.
    */
  var disableLighting: Boolean = js.native
  /**
    * The color emitted from the material.
    */
  var emissiveColor: Color3 = js.native
  /**
    * Intensity of the emissive part of the material.
    * This helps controlling the emissive effect without modifying the emissive color.
    */
  var emissiveIntensity: Double = js.native
  /**
    * Stores the emissive values in a texture.
    */
  var emissiveTexture: BaseTexture = js.native
  /**
    * Enables specular anti aliasing in the PBR shader.
    * It will both interacts on the Geometry for analytical and IBL lighting.
    * It also prefilter the roughness map based on the bump values.
    */
  var enableSpecularAntiAliasing: Boolean = js.native
  /**
    * Let user defines the brdf lookup texture used for IBL.
    * A default 8bit version is embedded but you could point at :
    * * Default texture: https://assets.babylonjs.com/environments/correlatedMSBRDF_RGBD.png
    * * Default 16bit pixel depth texture: https://assets.babylonjs.com/environments/correlatedMSBRDF.dds
    * * LEGACY Default None correlated https://assets.babylonjs.com/environments/uncorrelatedBRDF_RGBD.png
    * * LEGACY Default None correlated 16bit pixel depth https://assets.babylonjs.com/environments/uncorrelatedBRDF.dds
    */
  var environmentBRDFTexture: Nullable[BaseTexture] = js.native
  /**
    * Intensity of the environment e.g. how much the environment will light the object
    * either through harmonics for rough material or through the refelction for shiny ones.
    */
  var environmentIntensity: Double = js.native
  /**
    * Enforces alpha test in opaque or blend mode in order to improve the performances of some situations.
    */
  var forceAlphaTest: Boolean = js.native
  /**
    * Force the shader to compute irradiance in the fragment shader in order to take bump in account.
    */
  var forceIrradianceInFragment: Boolean = js.native
  /**
    * Force normal to face away from face.
    */
  var forceNormalForward: Boolean = js.native
  /**
    * If sets to true, x component of normal map value will invert (x = 1.0 - x).
    */
  var invertNormalMapX: Boolean = js.native
  /**
    * If sets to true, y component of normal map value will invert (y = 1.0 - y).
    */
  var invertNormalMapY: Boolean = js.native
  /**
    * Stores the pre-calculated light information of a mesh in a texture.
    */
  var lightmapTexture: BaseTexture = js.native
  /**
    * Number of Simultaneous lights allowed on the material.
    */
  var maxSimultaneousLights: Double = js.native
  /**
    * Specifies the metallic scalar of the metallic/roughness workflow.
    * Can also be used to scale the metalness values of the metallic texture.
    */
  var metallic: Nullable[Double] = js.native
  /**
    * Specifies the an F0 factor to help configuring the material F0.
    * Instead of the default 4%, 8% * factor will be used. As the factor is defaulting
    * to 0.5 the previously hard coded value stays the same.
    * Can also be used to scale the F0 values of the metallic texture.
    */
  var metallicF0Factor: Double = js.native
  /**
    * Used to switch from specular/glossiness to metallic/roughness workflow.
    */
  var metallicTexture: BaseTexture = js.native
  /**
    * AKA Glossiness in other nomenclature.
    */
  var microSurface: Double = js.native
  /**
    * Used to enable roughness/glossiness fetch from a separate channel depending on the current mode.
    * Gray Scale represents roughness in metallic mode and glossiness in specular mode.
    */
  var microSurfaceTexture: BaseTexture = js.native
  /**
    * Stores the alpha values in a texture. Use luminance if texture.getAlphaFromRGB is true.
    */
  var opacityTexture: BaseTexture = js.native
  /**
    * Controls the scale bias of the parallax mode.
    */
  var parallaxScaleBias: Double = js.native
  /**
    * The color reflected from the material.
    */
  var reflectionColor: Color3 = js.native
  /**
    * Stores the reflection values in a texture.
    */
  var reflectionTexture: Nullable[BaseTexture] = js.native
  /**
    * AKA Specular Color in other nomenclature.
    */
  var reflectivityColor: Color3 = js.native
  /**
    * AKA Specular texture in other nomenclature.
    */
  var reflectivityTexture: BaseTexture = js.native
  /**
    * Specifies the roughness scalar of the metallic/roughness workflow.
    * Can also be used to scale the roughness values of the metallic texture.
    */
  var roughness: Nullable[Double] = js.native
  /**
    * This is a special control allowing the reduction of the specular highlights coming from the
    * four lights of the scene. Those highlights may not be needed in full environment lighting.
    */
  var specularIntensity: Double = js.native
  /**
    * If sets to true and backfaceCulling is false, normals will be flipped on the backside.
    */
  var twoSidedLighting: Boolean = js.native
  /**
    * If set to true, no lighting calculations will be applied.
    */
  var unlit: Boolean = js.native
  /**
    * A fresnel is applied to the alpha of the model to ensure grazing angles edges are not alpha tested.
    * And/Or occlude the blended part. (alpha is converted to gamma to compute the fresnel)
    */
  var useAlphaFresnel: Boolean = js.native
  /**
    * Specifies that the alpha is coming form the albedo channel alpha channel for alpha blending.
    */
  var useAlphaFromAlbedoTexture: Boolean = js.native
  /**
    * Specifies if the ambient texture contains the ambient occlusion information in its red channel only.
    */
  var useAmbientInGrayScale: Boolean = js.native
  /**
    * Specifies if the metallic texture contains the ambient occlusion information in its red channel.
    */
  var useAmbientOcclusionFromMetallicTextureRed: Boolean = js.native
  /**
    * In case the reflectivity map does not contain the microsurface information in its alpha channel,
    * The material will try to infer what glossiness each pixel should be.
    */
  var useAutoMicroSurfaceFromReflectivityMap: Boolean = js.native
  /**
    * This parameters will enable/disable Horizon occlusion to prevent normal maps to look shiny when the normal
    * makes the reflect vector face the model (under horizon).
    */
  var useHorizonOcclusion: Boolean = js.native
  /**
    * If true, the light map contains occlusion information instead of lighting info.
    */
  var useLightmapAsShadowmap: Boolean = js.native
  /**
    * A fresnel is applied to the alpha of the model to ensure grazing angles edges are not alpha tested.
    * And/Or occlude the blended part. (alpha stays linear to compute the fresnel)
    */
  var useLinearAlphaFresnel: Boolean = js.native
  /**
    * Specifies whether the F0 factor can be fetched from the mettalic texture.
    * If set to true, please adapt the metallicF0Factor to ensure it fits with
    * your expectation as it multiplies with the texture data.
    */
  var useMetallicF0FactorFromMetallicTexture: Boolean = js.native
  /**
    * Specifies if the metallic texture contains the metallness information in its blue channel.
    */
  var useMetallnessFromMetallicTextureBlue: Boolean = js.native
  /**
    * Specifies if the reflectivity texture contains the glossiness information in its alpha channel.
    */
  var useMicroSurfaceFromReflectivityMapAlpha: Boolean = js.native
  /**
    * Allows using an object space normal map (instead of tangent space).
    */
  var useObjectSpaceNormalMap: Boolean = js.native
  /**
    * Allows using the bump map in parallax mode.
    */
  var useParallax: Boolean = js.native
  /**
    * Allows using the bump map in parallax occlusion mode.
    */
  var useParallaxOcclusion: Boolean = js.native
  /**
    * This parameters will enable/disable radiance occlusion by preventing the radiance to lit
    * too much the area relying on ambient texture to define their ambient occlusion.
    */
  var useRadianceOcclusion: Boolean = js.native
  /**
    * Specifies that the material will keeps the reflection highlights over a transparent surface (only the most limunous ones).
    * A car glass is a good exemple of that. When the street lights reflects on it you can not see what is behind.
    */
  var useRadianceOverAlpha: Boolean = js.native
  /**
    * Specifies if the metallic texture contains the roughness information in its alpha channel.
    */
  var useRoughnessFromMetallicTextureAlpha: Boolean = js.native
  /**
    * Specifies if the metallic texture contains the roughness information in its green channel.
    */
  var useRoughnessFromMetallicTextureGreen: Boolean = js.native
  /**
    * Specifies that the material will keep the specular highlights over a transparent surface (only the most limunous ones).
    * A car glass is a good exemple of that. When sun reflects on it you can not see what is behind.
    */
  var useSpecularOverAlpha: Boolean = js.native
  /**
    * The color grading curves provide additional color adjustmnent that is applied after any color grading transform (3D LUT).
    * They allow basic adjustment of saturation and small exposure adjustments, along with color filter tinting to provide white balance adjustment or more stylistic effects.
    * These are similar to controls found in many professional imaging or colorist software. The global controls are applied to the entire image. For advanced tuning, extra controls are provided to adjust the shadow, midtone and highlight areas of the image;
    * corresponding to low luminance, medium luminance, and high luminance areas respectively.
    */
  def cameraColorCurves: Nullable[ColorCurves] = js.native
  /**
    * The color grading curves provide additional color adjustmnent that is applied after any color grading transform (3D LUT).
    * They allow basic adjustment of saturation and small exposure adjustments, along with color filter tinting to provide white balance adjustment or more stylistic effects.
    * These are similar to controls found in many professional imaging or colorist software. The global controls are applied to the entire image. For advanced tuning, extra controls are provided to adjust the shadow, midtone and highlight areas of the image;
    * corresponding to low luminance, medium luminance, and high luminance areas respectively.
    */
  def cameraColorCurves(value: Nullable[ColorCurves]): js.Any = js.native
  /**
    * Gets wether the color curves effect is enabled.
    */
  def cameraColorCurvesEnabled: Boolean = js.native
  /**
    * Sets wether the color curves effect is enabled.
    */
  def cameraColorCurvesEnabled(value: Boolean): js.Any = js.native
  /**
    * Gets wether the color grading effect is enabled.
    */
  def cameraColorGradingEnabled: Boolean = js.native
  /**
    * Gets wether the color grading effect is enabled.
    */
  def cameraColorGradingEnabled(value: Boolean): js.Any = js.native
  /**
    * Gets the Color Grading 2D Lookup Texture.
    */
  def cameraColorGradingTexture: Nullable[BaseTexture] = js.native
  /**
    * Sets the Color Grading 2D Lookup Texture.
    */
  def cameraColorGradingTexture(value: Nullable[BaseTexture]): js.Any = js.native
  /**
    * Gets The camera contrast used on this material.
    */
  def cameraContrast: Double = js.native
  /**
    * Sets The camera contrast used on this material.
    */
  def cameraContrast(value: Double): js.Any = js.native
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
  def cameraExposure(value: Double): js.Any = js.native
  /**
    * Gets wether tonemapping is enabled or not.
    */
  def cameraToneMappingEnabled: Boolean = js.native
  /**
    * Sets wether tonemapping is enabled or not
    */
  def cameraToneMappingEnabled(value: Boolean): js.Any = js.native
  /**
    * Gets the image processing configuration used either in this material.
    */
  def imageProcessingConfiguration: ImageProcessingConfiguration = js.native
  /**
    * Sets the Default image processing configuration used either in the this material.
    *
    * If sets to null, the scene one is in use.
    */
  def imageProcessingConfiguration(value: ImageProcessingConfiguration): js.Any = js.native
  /**
    * source material index of refraction (IOR)' / 'destination material IOR.
    */
  def indexOfRefraction: Double = js.native
  def indexOfRefraction(value: Double): js.Any = js.native
  /**
    * Controls if refraction needs to be inverted on Y. This could be useful for procedural texture.
    */
  def invertRefractionY: Boolean = js.native
  def invertRefractionY(value: Boolean): js.Any = js.native
  /**
    * This parameters will make the material used its opacity to control how much it is refracting aginst not.
    * Materials half opaque for instance using refraction could benefit from this control.
    */
  def linkRefractionWithTransparency: Boolean = js.native
  def linkRefractionWithTransparency(value: Boolean): js.Any = js.native
  /**
    * Stores the refracted light information in a texture.
    */
  def refractionTexture: Nullable[BaseTexture] = js.native
  def refractionTexture(value: Nullable[BaseTexture]): js.Any = js.native
  /**
    * In order to support the falloff compatibility with gltf, a special mode has been added
    * to reproduce the gltf light falloff.
    */
  def useGLTFLightFalloff: Boolean = js.native
  /**
    * In order to support the falloff compatibility with gltf, a special mode has been added
    * to reproduce the gltf light falloff.
    */
  def useGLTFLightFalloff(value: Boolean): js.Any = js.native
  /**
    * BJS is using an harcoded light falloff based on a manually sets up range.
    * In PBR, one way to represents the fallof is to use the inverse squared root algorythm.
    * This parameter can help you switch back to the BJS mode in order to create scenes using both materials.
    */
  def usePhysicalLightFalloff: Boolean = js.native
  /**
    * BJS is using an harcoded light falloff based on a manually sets up range.
    * In PBR, one way to represents the fallof is to use the inverse squared root algorythm.
    * This parameter can help you switch back to the BJS mode in order to create scenes using both materials.
    */
  def usePhysicalLightFalloff(value: Boolean): js.Any = js.native
}

