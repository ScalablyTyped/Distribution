package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Physically based material base class of BJS.
  *
  * This offers the main features of a standard PBR material.
  * For more information, please refer to the documentation :
  * http://doc.babylonjs.com/extensions/Physically_Based_Rendering
  */
@JSGlobal("BABYLON.PBRBaseMaterial")
@js.native
abstract class PBRBaseMaterial protected () extends PushMaterial {
  /**
    * Instantiates a new PBRMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: java.lang.String, scene: Scene) = this()
  /**
    * AKA Diffuse Color in other nomenclature.
    */
  var _albedoColor: Color3 = js.native
  /**
    * AKA Diffuse Texture in standard nomenclature.
    */
  var _albedoTexture: BaseTexture = js.native
  /**
    * Defines the alpha limits in alpha test mode.
    */
  var _alphaCutOff: scala.Double = js.native
  /**
    * The color of a material in ambient lighting.
    */
  var _ambientColor: Color3 = js.native
  /**
    * AKA Occlusion Texture in other nomenclature.
    */
  var _ambientTexture: BaseTexture = js.native
  /**
    * Defines how much the AO map is occluding the analytical lights (point spot...).
    * 1 means it completely occludes it
    * 0 mean it has no impact
    */
  var _ambientTextureImpactOnAnalyticalLights: scala.Double = js.native
  /**
    * AKA Occlusion Texture Intensity in other nomenclature.
    */
  var _ambientTextureStrength: scala.Double = js.native
  /**
    * Stores surface normal data used to displace a mesh in a texture.
    */
  var _bumpTexture: BaseTexture = js.native
  /**
    * Intensity of the direct lights e.g. the four lights available in your scene.
    * This impacts both the direct diffuse and specular highlights.
    */
  var _directIntensity: scala.Double = js.native
  /**
    * Returns true if alpha blending should be disabled.
    */
  val _disableAlphaBlending: js.Any = js.native
  /**
    * Debug Control allowing disabling the bump map on this material.
    */
  var _disableBumpMap: scala.Boolean = js.native
  /**
    * If sets to true, disables all the lights affecting the material.
    */
  var _disableLighting: scala.Boolean = js.native
  /**
    * The color applied when light is emitted from a material.
    */
  var _emissiveColor: Color3 = js.native
  /**
    * Intensity of the emissive part of the material.
    * This helps controlling the emissive effect without modifying the emissive color.
    */
  var _emissiveIntensity: scala.Double = js.native
  /**
    * Stores the emissive values in a texture.
    */
  var _emissiveTexture: BaseTexture = js.native
  /**
    * Enables specular anti aliasing in the PBR shader.
    * It will both interacts on the Geometry for analytical and IBL lighting.
    * It also prefilter the roughness map based on the bump values.
    */
  var _enableSpecularAntiAliasing: scala.Boolean = js.native
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
  var _environmentIntensity: scala.Double = js.native
  /**
    * Enforces alpha test in opaque or blend mode in order to improve the performances of some situations.
    */
  var _forceAlphaTest: scala.Boolean = js.native
  /**
    * Force the shader to compute irradiance in the fragment shader in order to take bump in account.
    */
  var _forceIrradianceInFragment: scala.Boolean = js.native
  /**
    * Force normal to face away from face.
    */
  var _forceNormalForward: scala.Boolean = js.native
  /**
    * Returns the texture used for reflections.
    * @returns - Reflection texture if present.  Otherwise, returns the environment texture.
    */
  var _getReflectionTexture: js.Any = js.native
  /**
    * Returns the texture used for refraction or null if none is used.
    * @returns - Refection texture if present.  If no refraction texture and refraction
    * is linked with transparency, returns environment texture.  Otherwise, returns null.
    */
  var _getRefractionTexture: js.Any = js.native
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
    * source material index of refraction (IOR)' / 'destination material IOR.
    */
  var _indexOfRefraction: scala.Double = js.native
  /**
    * If sets to true, x component of normal map value will be inverted (x = 1.0 - x).
    */
  var _invertNormalMapX: scala.Boolean = js.native
  /**
    * If sets to true, y component of normal map value will be inverted (y = 1.0 - y).
    */
  var _invertNormalMapY: scala.Boolean = js.native
  /**
    * Controls if refraction needs to be inverted on Y. This could be usefull for procedural texture.
    */
  var _invertRefractionY: scala.Boolean = js.native
  /**
    * Defines the  falloff type used in this material.
    * It by default is Physical.
    */
  var _lightFalloff: scala.Double = js.native
  /**
    * This stores the direct, emissive, environment, and specular light intensities into a Vector4.
    */
  var _lightingInfos: js.Any = js.native
  /**
    * Stores the pre-calculated light information of a mesh in a texture.
    */
  var _lightmapTexture: BaseTexture = js.native
  /**
    * This parameters will make the material used its opacity to control how much it is refracting aginst not.
    * Materials half opaque for instance using refraction could benefit from this control.
    */
  var _linkRefractionWithTransparency: scala.Boolean = js.native
  /**
    * Number of Simultaneous lights allowed on the material.
    */
  var _maxSimultaneousLights: scala.Double = js.native
  /**
    * Specifies the metallic scalar of the metallic/roughness workflow.
    * Can also be used to scale the metalness values of the metallic texture.
    */
  var _metallic: Nullable[scala.Double] = js.native
  /**
    * Used to switch from specular/glossiness to metallic/roughness workflow.
    */
  var _metallicTexture: BaseTexture = js.native
  /**
    * AKA Glossiness in other nomenclature.
    */
  var _microSurface: scala.Double = js.native
  /**
    * Used to enable roughness/glossiness fetch from a separate channel depending on the current mode.
    * Gray Scale represents roughness in metallic mode and glossiness in specular mode.
    */
  var _microSurfaceTexture: BaseTexture = js.native
  /**
    * Stores the alpha values in a texture.
    */
  var _opacityTexture: BaseTexture = js.native
  /**
    * Controls the scale bias of the parallax mode.
    */
  var _parallaxScaleBias: scala.Double = js.native
  var _prepareDefines: js.Any = js.native
  var _prepareEffect: js.Any = js.native
  /**
    * The color applied when light is reflected from a material.
    */
  var _reflectionColor: Color3 = js.native
  /**
    * Stores the reflection values in a texture.
    */
  var _reflectionTexture: BaseTexture = js.native
  /**
    * AKA Specular Color in other nomenclature.
    */
  var _reflectivityColor: Color3 = js.native
  /**
    * AKA Specular texture in other nomenclature.
    */
  var _reflectivityTexture: BaseTexture = js.native
  /**
    * Stores the refraction values in a texture.
    */
  var _refractionTexture: BaseTexture = js.native
  /**
    * Stores the available render targets.
    */
  var _renderTargets: js.Any = js.native
  /**
    * Specifies the roughness scalar of the metallic/roughness workflow.
    * Can also be used to scale the roughness values of the metallic texture.
    */
  var _roughness: Nullable[scala.Double] = js.native
  /**
    * This is a special control allowing the reduction of the specular highlights coming from the
    * four lights of the scene. Those highlights may not be needed in full environment lighting.
    */
  var _specularIntensity: scala.Double = js.native
  /**
    * The transparency mode of the material.
    */
  var _transparencyMode: Nullable[scala.Double] = js.native
  /**
    * If sets to true and backfaceCulling is false, normals will be flipped on the backside.
    */
  var _twoSidedLighting: scala.Boolean = js.native
  /**
    * If set to true, no lighting calculations will be applied.
    */
  var _unlit: js.Any = js.native
  /**
    * A fresnel is applied to the alpha of the model to ensure grazing angles edges are not alpha tested.
    * And/Or occlude the blended part. (alpha is converted to gamma to compute the fresnel)
    */
  var _useAlphaFresnel: scala.Boolean = js.native
  /**
    * Specifies that the alpha is coming form the albedo channel alpha channel for alpha blending.
    */
  var _useAlphaFromAlbedoTexture: scala.Boolean = js.native
  /**
    * Specifies if the ambient texture contains the ambient occlusion information in its red channel only.
    */
  var _useAmbientInGrayScale: scala.Boolean = js.native
  /**
    * Specifies if the metallic texture contains the ambient occlusion information in its red channel.
    */
  var _useAmbientOcclusionFromMetallicTextureRed: scala.Boolean = js.native
  /**
    * In case the reflectivity map does not contain the microsurface information in its alpha channel,
    * The material will try to infer what glossiness each pixel should be.
    */
  var _useAutoMicroSurfaceFromReflectivityMap: scala.Boolean = js.native
  /**
    * This parameters will enable/disable Horizon occlusion to prevent normal maps to look shiny when the normal
    * makes the reflect vector face the model (under horizon).
    */
  var _useHorizonOcclusion: scala.Boolean = js.native
  /**
    * Specifies that the material will use the light map as a show map.
    */
  var _useLightmapAsShadowmap: scala.Boolean = js.native
  /**
    * A fresnel is applied to the alpha of the model to ensure grazing angles edges are not alpha tested.
    * And/Or occlude the blended part. (alpha stays linear to compute the fresnel)
    */
  var _useLinearAlphaFresnel: scala.Boolean = js.native
  /**
    * Enables the use of logarithmic depth buffers, which is good for wide depth buffers.
    */
  var _useLogarithmicDepth: js.Any = js.native
  /**
    * Specifies if the metallic texture contains the metallness information in its blue channel.
    */
  var _useMetallnessFromMetallicTextureBlue: scala.Boolean = js.native
  /**
    * Specifies if the reflectivity texture contains the glossiness information in its alpha channel.
    */
  var _useMicroSurfaceFromReflectivityMapAlpha: scala.Boolean = js.native
  /**
    * Allows using an object space normal map (instead of tangent space).
    */
  var _useObjectSpaceNormalMap: scala.Boolean = js.native
  /**
    * Allows using the bump map in parallax mode.
    */
  var _useParallax: scala.Boolean = js.native
  /**
    * Allows using the bump map in parallax occlusion mode.
    */
  var _useParallaxOcclusion: scala.Boolean = js.native
  /**
    * This parameters will enable/disable radiance occlusion by preventing the radiance to lit
    * too much the area relying on ambient texture to define their ambient occlusion.
    */
  var _useRadianceOcclusion: scala.Boolean = js.native
  /**
    * Specifies that the material will keeps the reflection highlights over a transparent surface (only the most limunous ones).
    * A car glass is a good exemple of that. When the street lights reflects on it you can not see what is behind.
    */
  var _useRadianceOverAlpha: scala.Boolean = js.native
  /**
    * Specifies if the metallic texture contains the roughness information in its alpha channel.
    */
  var _useRoughnessFromMetallicTextureAlpha: scala.Boolean = js.native
  /**
    * Specifies if the metallic texture contains the roughness information in its green channel.
    */
  var _useRoughnessFromMetallicTextureGreen: scala.Boolean = js.native
  /**
    * Specifies that the material will keeps the specular highlights over a transparent surface (only the most limunous ones).
    * A car glass is a good exemple of that. When sun reflects on it you can not see what is behind.
    */
  var _useSpecularOverAlpha: scala.Boolean = js.native
  /**
    * Gets the current transparency mode.
    */
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
  var transparencyMode: Nullable[scala.Double] = js.native
  /**
    * Enabled the use of logarithmic depth buffers, which is good for wide depth buffers.
    */
  /**
    * Enabled the use of logarithmic depth buffers, which is good for wide depth buffers.
    */
  var useLogarithmicDepth: scala.Boolean = js.native
  /**
    * Attaches a new image processing configuration to the PBR Material.
    * @param configuration
    */
  /* protected */ def _attachImageProcessingConfiguration(configuration: Nullable[ImageProcessingConfiguration]): scala.Unit = js.native
  /**
    * Specifies whether or not the alpha value of the albedo texture should be used for alpha blending.
    */
  /* protected */ def _shouldUseAlphaFromAlbedoTexture(): scala.Boolean = js.native
  /**
    * Initializes the uniform buffer layout for the shader.
    */
  def buildUniformLayout(): scala.Unit = js.native
  /**
    * Returns the animatable textures.
    * @returns - Array of animatable textures.
    */
  def getAnimatables(): js.Array[IAnimatable] = js.native
  /**
    * Specifies if the material uses metallic roughness workflow.
    * @returns boolean specifiying if the material uses metallic roughness workflow.
    */
  def isMetallicWorkflow(): scala.Boolean = js.native
  /**
    * Specifies that the submesh is ready to be used.
    * @param mesh - BJS mesh.
    * @param subMesh - A submesh of the BJS mesh.  Used to check if it is ready.
    * @param useInstances - Specifies that instances should be used.
    * @returns - boolean indicating that the submesh is ready or not.
    */
  def isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh): scala.Boolean = js.native
  def isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: scala.Boolean): scala.Boolean = js.native
}

/* static members */
@JSGlobal("BABYLON.PBRBaseMaterial")
@js.native
object PBRBaseMaterial extends js.Object {
  /**
    * PBRMaterialLightFalloff gltf: light is falling off as described in the gltf moving to PBR document
    * to enhance interoperability with other engines.
    */
  val LIGHTFALLOFF_GLTF: scala.Double = js.native
  /**
    * PBRMaterialLightFalloff Physical: light is falling off following the inverse squared distance law.
    */
  val LIGHTFALLOFF_PHYSICAL: scala.Double = js.native
  /**
    * PBRMaterialLightFalloff Standard: light is falling off like in the standard material
    * to enhance interoperability with other materials.
    */
  val LIGHTFALLOFF_STANDARD: scala.Double = js.native
  /**
    * Stores the reflectivity values based on metallic roughness workflow.
    */
  var _scaledReflectivity: js.Any = js.native
}

