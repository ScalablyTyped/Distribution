package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.babylonjs.BABYLON.IMaterialSubSurfaceDefines because var conflicts: _areTexturesDirty. Inlined SUBSURFACE, SS_REFRACTION, SS_TRANSLUCENCY, SS_SCATERRING, SS_THICKNESSANDMASK_TEXTURE, SS_THICKNESSANDMASK_TEXTUREDIRECTUV, SS_REFRACTIONMAP_3D, SS_REFRACTIONMAP_OPPOSITEZ, SS_LODINREFRACTIONALPHA, SS_GAMMAREFRACTION, SS_RGBDREFRACTION, SS_LINEARSPECULARREFRACTION, SS_LINKREFRACTIONTOTRANSPARENCY, SS_MASK_FROM_THICKNESS_TEXTURE
- typings.babylonjs.BABYLON.IMaterialSheenDefines because var conflicts: _areTexturesDirty. Inlined SHEEN, SHEEN_TEXTURE, SHEEN_TEXTUREDIRECTUV, SHEEN_LINKWITHALBEDO
- typings.babylonjs.BABYLON.IMaterialBRDFDefines because var conflicts: _areMiscDirty. Inlined BRDF_V_HEIGHT_CORRELATED, MS_BRDF_ENERGY_CONSERVATION, SPHERICAL_HARMONICS, SPECULAR_GLOSSINESS_ENERGY_CONSERVATION
- typings.babylonjs.BABYLON.IMaterialAnisotropicDefines because var conflicts: _areTexturesDirty, _needUVs. Inlined ANISOTROPIC, ANISOTROPIC_TEXTURE, ANISOTROPIC_TEXTUREDIRECTUV, MAINUV1
- typings.babylonjs.BABYLON.IMaterialClearCoatDefines because var conflicts: _areTexturesDirty. Inlined CLEARCOAT, CLEARCOAT_DEFAULTIOR, CLEARCOAT_TEXTURE, CLEARCOAT_TEXTUREDIRECTUV, CLEARCOAT_BUMP, CLEARCOAT_BUMPDIRECTUV, CLEARCOAT_TINT, CLEARCOAT_TINT_TEXTURE, CLEARCOAT_TINT_TEXTUREDIRECTUV */ @JSGlobal("BABYLON.PBRMaterialDefines")
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

