package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardMaterialDefines
  extends MaterialDefines
     with IImageProcessingConfigurationDefines {
  var ALPHAFROMDIFFUSE: Boolean = js.native
  var ALPHATEST: Boolean = js.native
  var AMBIENT: Boolean = js.native
  var AMBIENTDIRECTUV: Double = js.native
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
  var ROUGHNESS: Boolean = js.native
  var SHADOWFLOAT: Boolean = js.native
  var SPECULAR: Boolean = js.native
  var SPECULARDIRECTUV: Double = js.native
  var SPECULAROVERALPHA: Boolean = js.native
  var SPECULARTERM: Boolean = js.native
  var TWOSIDEDLIGHTING: Boolean = js.native
  var USELIGHTMAPASSHADOWMAP: Boolean = js.native
  var USE_LOCAL_REFLECTIONMAP_CUBIC: Boolean = js.native
  var UV1: Boolean = js.native
  var UV2: Boolean = js.native
  var VERTEXALPHA: Boolean = js.native
  var VERTEXCOLOR: Boolean = js.native
  def setReflectionMode(modeToEnable: String): Unit = js.native
}

