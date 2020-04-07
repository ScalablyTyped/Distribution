package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "Constants")
@js.native
class Constants ()
  extends typings.babylonjs.enginesIndexMod.Constants

/* static members */
@JSImport("babylonjs/index", "Constants")
@js.native
object Constants extends js.Object {
  /**
    * Nothing
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val ACTION_NothingTrigger: Double = js.native
  /**
    * On center pick
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val ACTION_OnCenterPickTrigger: Double = js.native
  /**
    * On double pick
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val ACTION_OnDoublePickTrigger: Double = js.native
  /**
    * On every frame
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val ACTION_OnEveryFrameTrigger: Double = js.native
  /**
    * On intersection enter
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val ACTION_OnIntersectionEnterTrigger: Double = js.native
  /**
    * On intersection exit
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val ACTION_OnIntersectionExitTrigger: Double = js.native
  /**
    * On key down
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val ACTION_OnKeyDownTrigger: Double = js.native
  /**
    * On key up
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val ACTION_OnKeyUpTrigger: Double = js.native
  /**
    * On left pick
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val ACTION_OnLeftPickTrigger: Double = js.native
  /**
    * On long press
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val ACTION_OnLongPressTrigger: Double = js.native
  /**
    * On pick down
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val ACTION_OnPickDownTrigger: Double = js.native
  /**
    * On pick out.
    * This trigger will only be raised if you also declared a OnPickDown
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val ACTION_OnPickOutTrigger: Double = js.native
  /**
    * On pick
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val ACTION_OnPickTrigger: Double = js.native
  /**
    * On pick up
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val ACTION_OnPickUpTrigger: Double = js.native
  /**
    * On pointer out
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val ACTION_OnPointerOutTrigger: Double = js.native
  /**
    * On pointer over
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val ACTION_OnPointerOverTrigger: Double = js.native
  /**
    * On right pick
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  val ACTION_OnRightPickTrigger: Double = js.native
  /** Defines that alpha blending is SRC ALPHA * SRC + DEST */
  val ALPHA_ADD: Double = js.native
  /**
    * Defines that alpha blending is SRC * DST ALPHA + DST
    * Alpha will be set to 0
    */
  val ALPHA_ALPHATOCOLOR: Double = js.native
  /** Defines that alpha blending is SRC ALPHA * SRC + (1 - SRC ALPHA) * DEST */
  val ALPHA_COMBINE: Double = js.native
  /** Defines that alpha blending is disabled */
  val ALPHA_DISABLE: Double = js.native
  /** Defines that alpha blending equation a SUM */
  val ALPHA_EQUATION_ADD: Double = js.native
  /**
    * Defines that alpha blending equation a DARKEN operation:
    * It takes the min of the src and sums the alpha channels.
    */
  val ALPHA_EQUATION_DARKEN: Double = js.native
  /** Defines that alpha blending equation a MAX operation */
  val ALPHA_EQUATION_MAX: Double = js.native
  /** Defines that alpha blending equation a MIN operation */
  val ALPHA_EQUATION_MIN: Double = js.native
  /** Defines that alpha blending equation a REVERSE SUBSTRACTION */
  val ALPHA_EQUATION_REVERSE_SUBTRACT: Double = js.native
  /** Defines that alpha blending equation a SUBSTRACTION */
  val ALPHA_EQUATION_SUBSTRACT: Double = js.native
  /**
    * Defines that alpha blending is SRC * (1 - DST) + DST * (1 - SRC)
    * Alpha will be set to DST ALPHA
    */
  val ALPHA_EXCLUSION: Double = js.native
  /** Defines that alpha blending is CST * SRC + (1 - CST) * DEST */
  val ALPHA_INTERPOLATE: Double = js.native
  /** Defines that alpha blending is SRC ALPHA * SRC + (1 - SRC) * DEST */
  val ALPHA_MAXIMIZED: Double = js.native
  /** Defines that alpha blending is SRC * DEST */
  val ALPHA_MULTIPLY: Double = js.native
  /** Defines that alpha blending is SRC + DEST */
  val ALPHA_ONEONE: Double = js.native
  /**
    * Defines that alpha blending is SRC + DST
    * Alpha will be set to SRC ALPHA + DST ALPHA
    */
  val ALPHA_ONEONE_ONEONE: Double = js.native
  /**
    * Defines that alpha blending is SRC + DST
    * Alpha will be set to SRC ALPHA
    */
  val ALPHA_ONEONE_ONEZERO: Double = js.native
  /** Defines that alpha blending is SRC + (1 - SRC ALPHA) * DEST */
  val ALPHA_PREMULTIPLIED: Double = js.native
  /**
    * Defines that alpha blending is SRC + (1 - SRC ALPHA) * DEST
    * Alpha will be set to (1 - SRC ALPHA) * DEST ALPHA
    */
  val ALPHA_PREMULTIPLIED_PORTERDUFF: Double = js.native
  /**
    * Defines that alpha blending is SRC * (1 - DST) + DST * (1 - SRC)
    */
  val ALPHA_REVERSEONEMINUS: Double = js.native
  /**
    * Defines that alpha blending is SRC + (1 - SRC) * DEST
    * Alpha will be set to SRC ALPHA + (1 - SRC ALPHA) * DEST ALPHA
    */
  val ALPHA_SCREENMODE: Double = js.native
  /**
    * Defines that alpha blending is SRC + DST * (1 - SRC ALPHA)
    * Alpha will be set to SRC ALPHA + DST ALPHA * (1 - SRC ALPHA)
    */
  val ALPHA_SRC_DSTONEMINUSSRCALPHA: Double = js.native
  /** Defines that alpha blending is DEST - SRC * DEST */
  val ALPHA_SUBTRACT: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will always pass. i.e. Pixels will be drawn in the order they are drawn */
  val ALWAYS: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be decremented */
  val DECR: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be decremented with wrapping */
  val DECR_WRAP: Double = js.native
  /** Defines that the ressource was successfully delay loaded */
  val DELAYLOADSTATE_LOADED: Double = js.native
  /** Defines that the ressource is currently delay loading */
  val DELAYLOADSTATE_LOADING: Double = js.native
  /** Defines that the ressource is not delayed*/
  val DELAYLOADSTATE_NONE: Double = js.native
  /** Defines that the ressource is delayed and has not started loading */
  val DELAYLOADSTATE_NOTLOADED: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is equals to the stored value */
  val EQUAL: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than or equal to the stored value */
  val GEQUAL: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than the stored value */
  val GREATER: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be incremented */
  val INCR: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be incremented with wrapping */
  val INCR_WRAP: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be inverted */
  val INVERT: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be kept */
  val KEEP: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than or equal to the stored value */
  val LEQUAL: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than the stored value */
  val LESS: Double = js.native
  /**
    * The all dirty flag value
    */
  val MATERIAL_AllDirtyFlag: Double = js.native
  /**
    * The dirty attribute flag value
    */
  val MATERIAL_AttributesDirtyFlag: Double = js.native
  /**
    * Stores the clock-wise side orientation
    */
  val MATERIAL_ClockWiseSideOrientation: Double = js.native
  /**
    * Stores the counter clock-wise side orientation
    */
  val MATERIAL_CounterClockWiseSideOrientation: Double = js.native
  /**
    * The dirty fresnel flag value
    */
  val MATERIAL_FresnelDirtyFlag: Double = js.native
  /**
    * The dirty light flag value
    */
  val MATERIAL_LightDirtyFlag: Double = js.native
  /**
    * Returns the line list draw mode
    */
  val MATERIAL_LineListDrawMode: Double = js.native
  /**
    * Returns the line loop draw mode
    */
  val MATERIAL_LineLoopDrawMode: Double = js.native
  /**
    * Returns the line strip draw mode
    */
  val MATERIAL_LineStripDrawMode: Double = js.native
  /**
    * The dirty misc flag value
    */
  val MATERIAL_MiscDirtyFlag: Double = js.native
  /**
    * Returns the point fill mode
    */
  val MATERIAL_PointFillMode: Double = js.native
  /**
    * Returns the point list draw mode
    */
  val MATERIAL_PointListDrawMode: Double = js.native
  /**
    * The dirty texture flag value
    */
  val MATERIAL_TextureDirtyFlag: Double = js.native
  /**
    * Returns the triangle fan draw mode
    */
  val MATERIAL_TriangleFanDrawMode: Double = js.native
  /**
    * Returns the triangle fill mode
    */
  val MATERIAL_TriangleFillMode: Double = js.native
  /**
    * Returns the triangle strip draw mode
    */
  val MATERIAL_TriangleStripDrawMode: Double = js.native
  /**
    * Returns the wireframe mode
    */
  val MATERIAL_WireFrameFillMode: Double = js.native
  /** Culling strategy : Bounding Sphere Only.
    *  This is an exclusion test. It's faster than the standard strategy because the bounding box is not tested.
    *  It's also less accurate than the standard because some not visible objects can still be selected.
    *  Test : is the bounding sphere outside the frustum ?
    *  If not, then the cullable object is in the frustum.
    */
  val MESHES_CULLINGSTRATEGY_BOUNDINGSPHERE_ONLY: Double = js.native
  /** Culling strategy : Optimistic Inclusion.
    *  This in an inclusion test first, then the standard exclusion test.
    *  This can be faster when a cullable object is expected to be almost always in the camera frustum.
    *  This could also be a little slower than the standard test when the tested object center is not the frustum but one of its bounding box vertex is still inside.
    *  Anyway, it's as accurate as the standard strategy.
    *  Test :
    *  Is the cullable object bounding sphere center in the frustum ?
    *  If not, apply the default culling strategy.
    */
  val MESHES_CULLINGSTRATEGY_OPTIMISTIC_INCLUSION: Double = js.native
  /** Culling strategy : Optimistic Inclusion then Bounding Sphere Only.
    *  This in an inclusion test first, then the bounding sphere only exclusion test.
    *  This can be the fastest test when a cullable object is expected to be almost always in the camera frustum.
    *  This could also be a little slower than the BoundingSphereOnly strategy when the tested object center is not in the frustum but its bounding sphere still intersects it.
    *  It's less accurate than the standard strategy and as accurate as the BoundingSphereOnly strategy.
    *  Test :
    *  Is the cullable object bounding sphere center in the frustum ?
    *  If not, apply the Bounding Sphere Only strategy. No Bounding Box is tested here.
    */
  val MESHES_CULLINGSTRATEGY_OPTIMISTIC_INCLUSION_THEN_BSPHERE_ONLY: Double = js.native
  /** Default culling strategy : this is an exclusion test and it's the more accurate.
    *  Test order :
    *  Is the bounding sphere outside the frustum ?
    *  If not, are the bounding box vertices outside the frustum ?
    *  It not, then the cullable object is in the frustum.
    */
  val MESHES_CULLINGSTRATEGY_STANDARD: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will never pass. i.e. Nothing will be drawn */
  val NEVER: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is not equal to the stored value */
  val NOTEQUAL: Double = js.native
  /**
    * Billboard mode will apply to all axes
    */
  val PARTICLES_BILLBOARDMODE_ALL: Double = js.native
  /**
    * Special billboard mode where the particle will be biilboard to the camera but rotated to align with direction
    */
  val PARTICLES_BILLBOARDMODE_STRETCHED: Double = js.native
  /**
    * Billboard mode will only apply to Y axis
    */
  val PARTICLES_BILLBOARDMODE_Y: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be replaced */
  val REPLACE: Double = js.native
  /** Defines that texture rescaling will use a ceil to find the closer power of 2 size */
  val SCALEMODE_CEILING: Double = js.native
  /** Defines that texture rescaling will use a floor to find the closer power of 2 size */
  val SCALEMODE_FLOOR: Double = js.native
  /** Defines that texture rescaling will look for the nearest power of 2 size */
  val SCALEMODE_NEAREST: Double = js.native
  /**
    * Detailled logging while loading
    */
  val SCENELOADER_DETAILED_LOGGING: Double = js.native
  /**
    * Minimal logging while loading
    */
  val SCENELOADER_MINIMAL_LOGGING: Double = js.native
  /**
    * No logging while loading
    */
  val SCENELOADER_NO_LOGGING: Double = js.native
  /**
    * Summary logging while loading
    */
  val SCENELOADER_SUMMARY_LOGGING: Double = js.native
  /** ALPHA */
  val TEXTUREFORMAT_ALPHA: Double = js.native
  /** LUMINANCE */
  val TEXTUREFORMAT_LUMINANCE: Double = js.native
  /** LUMINANCE_ALPHA */
  val TEXTUREFORMAT_LUMINANCE_ALPHA: Double = js.native
  /** RED (2nd reference) */
  val TEXTUREFORMAT_R: Double = js.native
  /** RED */
  val TEXTUREFORMAT_RED: Double = js.native
  /** RED_INTEGER */
  val TEXTUREFORMAT_RED_INTEGER: Double = js.native
  /** RG */
  val TEXTUREFORMAT_RG: Double = js.native
  /** RGB */
  val TEXTUREFORMAT_RGB: Double = js.native
  /** RGBA */
  val TEXTUREFORMAT_RGBA: Double = js.native
  /** RGBA_INTEGER */
  val TEXTUREFORMAT_RGBA_INTEGER: Double = js.native
  /** RGB_INTEGER */
  val TEXTUREFORMAT_RGB_INTEGER: Double = js.native
  /** RG_INTEGER */
  val TEXTUREFORMAT_RG_INTEGER: Double = js.native
  /** RED_INTEGER (2nd reference) */
  val TEXTUREFORMAT_R_INTEGER: Double = js.native
  /** BYTE */
  val TEXTURETYPE_BYTE: Double = js.native
  /** FLOAT */
  val TEXTURETYPE_FLOAT: Double = js.native
  /** FLOAT_32_UNSIGNED_INT_24_8_REV */
  val TEXTURETYPE_FLOAT_32_UNSIGNED_INT_24_8_REV: Double = js.native
  /** HALF_FLOAT */
  val TEXTURETYPE_HALF_FLOAT: Double = js.native
  /** INT */
  val TEXTURETYPE_INT: Double = js.native
  /** SHORT */
  val TEXTURETYPE_SHORT: Double = js.native
  /** UNSIGNED_BYTE */
  val TEXTURETYPE_UNSIGNED_BYTE: Double = js.native
  /** UNSIGNED_BYTE (2nd reference) */
  val TEXTURETYPE_UNSIGNED_INT: Double = js.native
  /** UNSIGNED_INT */
  val TEXTURETYPE_UNSIGNED_INTEGER: Double = js.native
  /** UNSIGNED_INT_10F_11F_11F_REV */
  val TEXTURETYPE_UNSIGNED_INT_10F_11F_11F_REV: Double = js.native
  /** UNSIGNED_INT_24_8 */
  val TEXTURETYPE_UNSIGNED_INT_24_8: Double = js.native
  /** UNSIGNED_INT_2_10_10_10_REV */
  val TEXTURETYPE_UNSIGNED_INT_2_10_10_10_REV: Double = js.native
  /** UNSIGNED_INT_5_9_9_9_REV */
  val TEXTURETYPE_UNSIGNED_INT_5_9_9_9_REV: Double = js.native
  /** UNSIGNED_SHORT */
  val TEXTURETYPE_UNSIGNED_SHORT: Double = js.native
  /** UNSIGNED_SHORT_4_4_4_4 */
  val TEXTURETYPE_UNSIGNED_SHORT_4_4_4_4: Double = js.native
  /** UNSIGNED_SHORT_5_5_5_1 */
  val TEXTURETYPE_UNSIGNED_SHORT_5_5_5_1: Double = js.native
  /** UNSIGNED_SHORT_5_6_5 */
  val TEXTURETYPE_UNSIGNED_SHORT_5_6_5: Double = js.native
  /** Bilinear is mag = linear and min = linear and no mip */
  val TEXTURE_BILINEAR_SAMPLINGMODE: Double = js.native
  /** Texture is not repeating outside of 0..1 UVs */
  val TEXTURE_CLAMP_ADDRESSMODE: Double = js.native
  /** Cubic coordinates mode */
  val TEXTURE_CUBIC_MODE: Double = js.native
  /** Equirectangular coordinates mode */
  val TEXTURE_EQUIRECTANGULAR_MODE: Double = js.native
  /** Explicit coordinates mode */
  val TEXTURE_EXPLICIT_MODE: Double = js.native
  /** Equirectangular Fixed Mirrored coordinates mode */
  val TEXTURE_FIXED_EQUIRECTANGULAR_MIRRORED_MODE: Double = js.native
  /** Equirectangular Fixed coordinates mode */
  val TEXTURE_FIXED_EQUIRECTANGULAR_MODE: Double = js.native
  /** Inverse Cubic coordinates mode */
  val TEXTURE_INVCUBIC_MODE: Double = js.native
  /** mag = linear and min = linear and mip = none */
  val TEXTURE_LINEAR_LINEAR: Double = js.native
  /** Trilinear is mag = linear and min = linear and mip = linear */
  val TEXTURE_LINEAR_LINEAR_MIPLINEAR: Double = js.native
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  val TEXTURE_LINEAR_LINEAR_MIPNEAREST: Double = js.native
  /** mag = linear and min = nearest and mip = none */
  val TEXTURE_LINEAR_NEAREST: Double = js.native
  /** mag = linear and min = nearest and mip = linear */
  val TEXTURE_LINEAR_NEAREST_MIPLINEAR: Double = js.native
  /** mag = linear and min = nearest and mip = nearest */
  val TEXTURE_LINEAR_NEAREST_MIPNEAREST: Double = js.native
  /** Texture is repeating and mirrored */
  val TEXTURE_MIRROR_ADDRESSMODE: Double = js.native
  /** mag = nearest and min = linear and mip = none */
  val TEXTURE_NEAREST_LINEAR: Double = js.native
  /** mag = nearest and min = linear and mip = linear */
  val TEXTURE_NEAREST_LINEAR_MIPLINEAR: Double = js.native
  /** mag = nearest and min = linear and mip = nearest */
  val TEXTURE_NEAREST_LINEAR_MIPNEAREST: Double = js.native
  /** mag = nearest and min = nearest and mip = none */
  val TEXTURE_NEAREST_NEAREST: Double = js.native
  /** nearest is mag = nearest and min = nearest and mip = linear */
  val TEXTURE_NEAREST_NEAREST_MIPLINEAR: Double = js.native
  /** mag = nearest and min = nearest and mip = nearest */
  val TEXTURE_NEAREST_NEAREST_MIPNEAREST: Double = js.native
  /** nearest is mag = nearest and min = nearest and no mip */
  val TEXTURE_NEAREST_SAMPLINGMODE: Double = js.native
  /** Planar coordinates mode */
  val TEXTURE_PLANAR_MODE: Double = js.native
  /** Projection coordinates mode */
  val TEXTURE_PROJECTION_MODE: Double = js.native
  /** Skybox coordinates mode */
  val TEXTURE_SKYBOX_MODE: Double = js.native
  /** Spherical coordinates mode */
  val TEXTURE_SPHERICAL_MODE: Double = js.native
  /** Trilinear is mag = linear and min = linear and mip = linear */
  val TEXTURE_TRILINEAR_SAMPLINGMODE: Double = js.native
  /** Texture is repeating outside of 0..1 UVs */
  val TEXTURE_WRAP_ADDRESSMODE: Double = js.native
}

