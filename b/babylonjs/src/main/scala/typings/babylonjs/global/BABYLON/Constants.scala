package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Constants")
@js.native
class Constants ()
  extends StObject
     with typings.babylonjs.BABYLON.Constants
/* static members */
object Constants {
  
  /**
    * Nothing
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.Constants.ACTION_NothingTrigger")
  @js.native
  val ACTION_NothingTrigger: Double = js.native
  
  /**
    * On center pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.Constants.ACTION_OnCenterPickTrigger")
  @js.native
  val ACTION_OnCenterPickTrigger: Double = js.native
  
  /**
    * On double pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.Constants.ACTION_OnDoublePickTrigger")
  @js.native
  val ACTION_OnDoublePickTrigger: Double = js.native
  
  /**
    * On every frame
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.Constants.ACTION_OnEveryFrameTrigger")
  @js.native
  val ACTION_OnEveryFrameTrigger: Double = js.native
  
  /**
    * On intersection enter
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.Constants.ACTION_OnIntersectionEnterTrigger")
  @js.native
  val ACTION_OnIntersectionEnterTrigger: Double = js.native
  
  /**
    * On intersection exit
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.Constants.ACTION_OnIntersectionExitTrigger")
  @js.native
  val ACTION_OnIntersectionExitTrigger: Double = js.native
  
  /**
    * On key down
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.Constants.ACTION_OnKeyDownTrigger")
  @js.native
  val ACTION_OnKeyDownTrigger: Double = js.native
  
  /**
    * On key up
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.Constants.ACTION_OnKeyUpTrigger")
  @js.native
  val ACTION_OnKeyUpTrigger: Double = js.native
  
  /**
    * On left pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.Constants.ACTION_OnLeftPickTrigger")
  @js.native
  val ACTION_OnLeftPickTrigger: Double = js.native
  
  /**
    * On long press
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.Constants.ACTION_OnLongPressTrigger")
  @js.native
  val ACTION_OnLongPressTrigger: Double = js.native
  
  /**
    * On pick down
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.Constants.ACTION_OnPickDownTrigger")
  @js.native
  val ACTION_OnPickDownTrigger: Double = js.native
  
  /**
    * On pick out.
    * This trigger will only be raised if you also declared a OnPickDown
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.Constants.ACTION_OnPickOutTrigger")
  @js.native
  val ACTION_OnPickOutTrigger: Double = js.native
  
  /**
    * On pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.Constants.ACTION_OnPickTrigger")
  @js.native
  val ACTION_OnPickTrigger: Double = js.native
  
  /**
    * On pick up
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.Constants.ACTION_OnPickUpTrigger")
  @js.native
  val ACTION_OnPickUpTrigger: Double = js.native
  
  /**
    * On pointer out
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.Constants.ACTION_OnPointerOutTrigger")
  @js.native
  val ACTION_OnPointerOutTrigger: Double = js.native
  
  /**
    * On pointer over
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.Constants.ACTION_OnPointerOverTrigger")
  @js.native
  val ACTION_OnPointerOverTrigger: Double = js.native
  
  /**
    * On right pick
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
    */
  @JSGlobal("BABYLON.Constants.ACTION_OnRightPickTrigger")
  @js.native
  val ACTION_OnRightPickTrigger: Double = js.native
  
  /** Defines that alpha blending is SRC ALPHA * SRC + DEST */
  @JSGlobal("BABYLON.Constants.ALPHA_ADD")
  @js.native
  val ALPHA_ADD: Double = js.native
  
  /**
    * Defines that alpha blending is SRC * DST ALPHA + DST
    * Alpha will be set to 0
    */
  @JSGlobal("BABYLON.Constants.ALPHA_ALPHATOCOLOR")
  @js.native
  val ALPHA_ALPHATOCOLOR: Double = js.native
  
  /** Defines that alpha blending is SRC ALPHA * SRC + (1 - SRC ALPHA) * DEST */
  @JSGlobal("BABYLON.Constants.ALPHA_COMBINE")
  @js.native
  val ALPHA_COMBINE: Double = js.native
  
  /** Defines that alpha blending is disabled */
  @JSGlobal("BABYLON.Constants.ALPHA_DISABLE")
  @js.native
  val ALPHA_DISABLE: Double = js.native
  
  /** Defines that alpha blending equation a SUM */
  @JSGlobal("BABYLON.Constants.ALPHA_EQUATION_ADD")
  @js.native
  val ALPHA_EQUATION_ADD: Double = js.native
  
  /**
    * Defines that alpha blending equation a DARKEN operation:
    * It takes the min of the src and sums the alpha channels.
    */
  @JSGlobal("BABYLON.Constants.ALPHA_EQUATION_DARKEN")
  @js.native
  val ALPHA_EQUATION_DARKEN: Double = js.native
  
  /** Defines that alpha blending equation a MAX operation */
  @JSGlobal("BABYLON.Constants.ALPHA_EQUATION_MAX")
  @js.native
  val ALPHA_EQUATION_MAX: Double = js.native
  
  /** Defines that alpha blending equation a MIN operation */
  @JSGlobal("BABYLON.Constants.ALPHA_EQUATION_MIN")
  @js.native
  val ALPHA_EQUATION_MIN: Double = js.native
  
  /** Defines that alpha blending equation a REVERSE SUBSTRACTION */
  @JSGlobal("BABYLON.Constants.ALPHA_EQUATION_REVERSE_SUBTRACT")
  @js.native
  val ALPHA_EQUATION_REVERSE_SUBTRACT: Double = js.native
  
  /** Defines that alpha blending equation a SUBSTRACTION */
  @JSGlobal("BABYLON.Constants.ALPHA_EQUATION_SUBSTRACT")
  @js.native
  val ALPHA_EQUATION_SUBSTRACT: Double = js.native
  
  /**
    * Defines that alpha blending is SRC * (1 - DST) + DST * (1 - SRC)
    * Alpha will be set to DST ALPHA
    */
  @JSGlobal("BABYLON.Constants.ALPHA_EXCLUSION")
  @js.native
  val ALPHA_EXCLUSION: Double = js.native
  
  /** Defines that alpha blending is CST * SRC + (1 - CST) * DEST */
  @JSGlobal("BABYLON.Constants.ALPHA_INTERPOLATE")
  @js.native
  val ALPHA_INTERPOLATE: Double = js.native
  
  /** Defines that alpha blending is SRC ALPHA * SRC + (1 - SRC) * DEST */
  @JSGlobal("BABYLON.Constants.ALPHA_MAXIMIZED")
  @js.native
  val ALPHA_MAXIMIZED: Double = js.native
  
  /** Defines that alpha blending is SRC * DEST */
  @JSGlobal("BABYLON.Constants.ALPHA_MULTIPLY")
  @js.native
  val ALPHA_MULTIPLY: Double = js.native
  
  /** Defines that alpha blending is SRC + DEST */
  @JSGlobal("BABYLON.Constants.ALPHA_ONEONE")
  @js.native
  val ALPHA_ONEONE: Double = js.native
  
  /**
    * Defines that alpha blending is SRC + DST
    * Alpha will be set to SRC ALPHA + DST ALPHA
    */
  @JSGlobal("BABYLON.Constants.ALPHA_ONEONE_ONEONE")
  @js.native
  val ALPHA_ONEONE_ONEONE: Double = js.native
  
  /**
    * Defines that alpha blending is SRC + DST
    * Alpha will be set to SRC ALPHA
    */
  @JSGlobal("BABYLON.Constants.ALPHA_ONEONE_ONEZERO")
  @js.native
  val ALPHA_ONEONE_ONEZERO: Double = js.native
  
  /** Defines that alpha blending is SRC + (1 - SRC ALPHA) * DEST */
  @JSGlobal("BABYLON.Constants.ALPHA_PREMULTIPLIED")
  @js.native
  val ALPHA_PREMULTIPLIED: Double = js.native
  
  /**
    * Defines that alpha blending is SRC + (1 - SRC ALPHA) * DEST
    * Alpha will be set to (1 - SRC ALPHA) * DEST ALPHA
    */
  @JSGlobal("BABYLON.Constants.ALPHA_PREMULTIPLIED_PORTERDUFF")
  @js.native
  val ALPHA_PREMULTIPLIED_PORTERDUFF: Double = js.native
  
  /**
    * Defines that alpha blending is SRC * (1 - DST) + DST * (1 - SRC)
    */
  @JSGlobal("BABYLON.Constants.ALPHA_REVERSEONEMINUS")
  @js.native
  val ALPHA_REVERSEONEMINUS: Double = js.native
  
  /**
    * Defines that alpha blending is SRC + (1 - SRC) * DEST
    * Alpha will be set to SRC ALPHA + (1 - SRC ALPHA) * DEST ALPHA
    */
  @JSGlobal("BABYLON.Constants.ALPHA_SCREENMODE")
  @js.native
  val ALPHA_SCREENMODE: Double = js.native
  
  /**
    * Defines that alpha blending is SRC + DST * (1 - SRC ALPHA)
    * Alpha will be set to SRC ALPHA + DST ALPHA * (1 - SRC ALPHA)
    */
  @JSGlobal("BABYLON.Constants.ALPHA_SRC_DSTONEMINUSSRCALPHA")
  @js.native
  val ALPHA_SRC_DSTONEMINUSSRCALPHA: Double = js.native
  
  /** Defines that alpha blending is DEST - SRC * DEST */
  @JSGlobal("BABYLON.Constants.ALPHA_SUBTRACT")
  @js.native
  val ALPHA_SUBTRACT: Double = js.native
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will always pass. i.e. Pixels will be drawn in the order they are drawn */
  @JSGlobal("BABYLON.Constants.ALWAYS")
  @js.native
  val ALWAYS: Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be decremented */
  @JSGlobal("BABYLON.Constants.DECR")
  @js.native
  val DECR: Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be decremented with wrapping */
  @JSGlobal("BABYLON.Constants.DECR_WRAP")
  @js.native
  val DECR_WRAP: Double = js.native
  
  /** Defines that the ressource was successfully delay loaded */
  @JSGlobal("BABYLON.Constants.DELAYLOADSTATE_LOADED")
  @js.native
  val DELAYLOADSTATE_LOADED: Double = js.native
  
  /** Defines that the ressource is currently delay loading */
  @JSGlobal("BABYLON.Constants.DELAYLOADSTATE_LOADING")
  @js.native
  val DELAYLOADSTATE_LOADING: Double = js.native
  
  /** Defines that the ressource is not delayed*/
  @JSGlobal("BABYLON.Constants.DELAYLOADSTATE_NONE")
  @js.native
  val DELAYLOADSTATE_NONE: Double = js.native
  
  /** Defines that the ressource is delayed and has not started loading */
  @JSGlobal("BABYLON.Constants.DELAYLOADSTATE_NOTLOADED")
  @js.native
  val DELAYLOADSTATE_NOTLOADED: Double = js.native
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is equals to the stored value */
  @JSGlobal("BABYLON.Constants.EQUAL")
  @js.native
  val EQUAL: Double = js.native
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than or equal to the stored value */
  @JSGlobal("BABYLON.Constants.GEQUAL")
  @js.native
  val GEQUAL: Double = js.native
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than the stored value */
  @JSGlobal("BABYLON.Constants.GREATER")
  @js.native
  val GREATER: Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be incremented */
  @JSGlobal("BABYLON.Constants.INCR")
  @js.native
  val INCR: Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be incremented with wrapping */
  @JSGlobal("BABYLON.Constants.INCR_WRAP")
  @js.native
  val INCR_WRAP: Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be inverted */
  @JSGlobal("BABYLON.Constants.INVERT")
  @js.native
  val INVERT: Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be kept */
  @JSGlobal("BABYLON.Constants.KEEP")
  @js.native
  val KEEP: Double = js.native
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than or equal to the stored value */
  @JSGlobal("BABYLON.Constants.LEQUAL")
  @js.native
  val LEQUAL: Double = js.native
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than the stored value */
  @JSGlobal("BABYLON.Constants.LESS")
  @js.native
  val LESS: Double = js.native
  
  /**
    * The all dirty flag value
    */
  @JSGlobal("BABYLON.Constants.MATERIAL_AllDirtyFlag")
  @js.native
  val MATERIAL_AllDirtyFlag: Double = js.native
  
  /**
    * The dirty attribute flag value
    */
  @JSGlobal("BABYLON.Constants.MATERIAL_AttributesDirtyFlag")
  @js.native
  val MATERIAL_AttributesDirtyFlag: Double = js.native
  
  /**
    * Stores the clock-wise side orientation
    */
  @JSGlobal("BABYLON.Constants.MATERIAL_ClockWiseSideOrientation")
  @js.native
  val MATERIAL_ClockWiseSideOrientation: Double = js.native
  
  /**
    * Stores the counter clock-wise side orientation
    */
  @JSGlobal("BABYLON.Constants.MATERIAL_CounterClockWiseSideOrientation")
  @js.native
  val MATERIAL_CounterClockWiseSideOrientation: Double = js.native
  
  /**
    * The dirty fresnel flag value
    */
  @JSGlobal("BABYLON.Constants.MATERIAL_FresnelDirtyFlag")
  @js.native
  val MATERIAL_FresnelDirtyFlag: Double = js.native
  
  /**
    * The dirty light flag value
    */
  @JSGlobal("BABYLON.Constants.MATERIAL_LightDirtyFlag")
  @js.native
  val MATERIAL_LightDirtyFlag: Double = js.native
  
  /**
    * Returns the line list draw mode
    */
  @JSGlobal("BABYLON.Constants.MATERIAL_LineListDrawMode")
  @js.native
  val MATERIAL_LineListDrawMode: Double = js.native
  
  /**
    * Returns the line loop draw mode
    */
  @JSGlobal("BABYLON.Constants.MATERIAL_LineLoopDrawMode")
  @js.native
  val MATERIAL_LineLoopDrawMode: Double = js.native
  
  /**
    * Returns the line strip draw mode
    */
  @JSGlobal("BABYLON.Constants.MATERIAL_LineStripDrawMode")
  @js.native
  val MATERIAL_LineStripDrawMode: Double = js.native
  
  /**
    * The dirty misc flag value
    */
  @JSGlobal("BABYLON.Constants.MATERIAL_MiscDirtyFlag")
  @js.native
  val MATERIAL_MiscDirtyFlag: Double = js.native
  
  /**
    * Returns the point fill mode
    */
  @JSGlobal("BABYLON.Constants.MATERIAL_PointFillMode")
  @js.native
  val MATERIAL_PointFillMode: Double = js.native
  
  /**
    * Returns the point list draw mode
    */
  @JSGlobal("BABYLON.Constants.MATERIAL_PointListDrawMode")
  @js.native
  val MATERIAL_PointListDrawMode: Double = js.native
  
  /**
    * The dirty prepass flag value
    */
  @JSGlobal("BABYLON.Constants.MATERIAL_PrePassDirtyFlag")
  @js.native
  val MATERIAL_PrePassDirtyFlag: Double = js.native
  
  /**
    * The dirty texture flag value
    */
  @JSGlobal("BABYLON.Constants.MATERIAL_TextureDirtyFlag")
  @js.native
  val MATERIAL_TextureDirtyFlag: Double = js.native
  
  /**
    * Returns the triangle fan draw mode
    */
  @JSGlobal("BABYLON.Constants.MATERIAL_TriangleFanDrawMode")
  @js.native
  val MATERIAL_TriangleFanDrawMode: Double = js.native
  
  /**
    * Returns the triangle fill mode
    */
  @JSGlobal("BABYLON.Constants.MATERIAL_TriangleFillMode")
  @js.native
  val MATERIAL_TriangleFillMode: Double = js.native
  
  /**
    * Returns the triangle strip draw mode
    */
  @JSGlobal("BABYLON.Constants.MATERIAL_TriangleStripDrawMode")
  @js.native
  val MATERIAL_TriangleStripDrawMode: Double = js.native
  
  /**
    * Returns the wireframe mode
    */
  @JSGlobal("BABYLON.Constants.MATERIAL_WireFrameFillMode")
  @js.native
  val MATERIAL_WireFrameFillMode: Double = js.native
  
  /** Culling strategy : Bounding Sphere Only.
    *  This is an exclusion test. It's faster than the standard strategy because the bounding box is not tested.
    *  It's also less accurate than the standard because some not visible objects can still be selected.
    *  Test : is the bounding sphere outside the frustum ?
    *  If not, then the cullable object is in the frustum.
    */
  @JSGlobal("BABYLON.Constants.MESHES_CULLINGSTRATEGY_BOUNDINGSPHERE_ONLY")
  @js.native
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
  @JSGlobal("BABYLON.Constants.MESHES_CULLINGSTRATEGY_OPTIMISTIC_INCLUSION")
  @js.native
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
  @JSGlobal("BABYLON.Constants.MESHES_CULLINGSTRATEGY_OPTIMISTIC_INCLUSION_THEN_BSPHERE_ONLY")
  @js.native
  val MESHES_CULLINGSTRATEGY_OPTIMISTIC_INCLUSION_THEN_BSPHERE_ONLY: Double = js.native
  
  /** Default culling strategy : this is an exclusion test and it's the more accurate.
    *  Test order :
    *  Is the bounding sphere outside the frustum ?
    *  If not, are the bounding box vertices outside the frustum ?
    *  It not, then the cullable object is in the frustum.
    */
  @JSGlobal("BABYLON.Constants.MESHES_CULLINGSTRATEGY_STANDARD")
  @js.native
  val MESHES_CULLINGSTRATEGY_STANDARD: Double = js.native
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will never pass. i.e. Nothing will be drawn */
  @JSGlobal("BABYLON.Constants.NEVER")
  @js.native
  val NEVER: Double = js.native
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is not equal to the stored value */
  @JSGlobal("BABYLON.Constants.NOTEQUAL")
  @js.native
  val NOTEQUAL: Double = js.native
  
  /**
    * Billboard mode will apply to all axes
    */
  @JSGlobal("BABYLON.Constants.PARTICLES_BILLBOARDMODE_ALL")
  @js.native
  val PARTICLES_BILLBOARDMODE_ALL: Double = js.native
  
  /**
    * Special billboard mode where the particle will be biilboard to the camera but rotated to align with direction
    */
  @JSGlobal("BABYLON.Constants.PARTICLES_BILLBOARDMODE_STRETCHED")
  @js.native
  val PARTICLES_BILLBOARDMODE_STRETCHED: Double = js.native
  
  /**
    * Billboard mode will only apply to Y axis
    */
  @JSGlobal("BABYLON.Constants.PARTICLES_BILLBOARDMODE_Y")
  @js.native
  val PARTICLES_BILLBOARDMODE_Y: Double = js.native
  
  /**
    * Constant used to retrieve albedo index in the textures array in the prepass
    * using the getIndex(Constants.PREPASS_ALBEDO_TEXTURE_TYPE)
    */
  @JSGlobal("BABYLON.Constants.PREPASS_ALBEDO_TEXTURE_TYPE")
  @js.native
  val PREPASS_ALBEDO_TEXTURE_TYPE: Double = js.native
  
  /**
    * Constant used to retrieve the lit color texture index in the textures array in the prepass
    * using the getIndex(Constants.PREPASS_COLOR_TEXTURE_TYPE)
    */
  @JSGlobal("BABYLON.Constants.PREPASS_COLOR_TEXTURE_TYPE")
  @js.native
  val PREPASS_COLOR_TEXTURE_TYPE: Double = js.native
  
  /**
    * Constant used to retrieve depth + normal index in the textures array in the prepass
    * using the getIndex(Constants.PREPASS_DEPTHNORMAL_TEXTURE_TYPE)
    */
  @JSGlobal("BABYLON.Constants.PREPASS_DEPTHNORMAL_TEXTURE_TYPE")
  @js.native
  val PREPASS_DEPTHNORMAL_TEXTURE_TYPE: Double = js.native
  
  /**
    * Constant used to retrieve the irradiance texture index in the textures array in the prepass
    * using getIndex(Constants.PREPASS_IRRADIANCE_TEXTURE_TYPE)
    */
  @JSGlobal("BABYLON.Constants.PREPASS_IRRADIANCE_TEXTURE_TYPE")
  @js.native
  val PREPASS_IRRADIANCE_TEXTURE_TYPE: Double = js.native
  
  /**
    * Constant used to retrieve the position texture index in the textures array in the prepass
    * using getIndex(Constants.PREPASS_POSITION_TEXTURE_INDEX)
    */
  @JSGlobal("BABYLON.Constants.PREPASS_POSITION_TEXTURE_TYPE")
  @js.native
  val PREPASS_POSITION_TEXTURE_TYPE: Double = js.native
  
  /**
    * Constant used to retrieve the reflectivity texture index in the textures array in the prepass
    * using the getIndex(Constants.PREPASS_REFLECTIVITY_TEXTURE_TYPE)
    */
  @JSGlobal("BABYLON.Constants.PREPASS_REFLECTIVITY_TEXTURE_TYPE")
  @js.native
  val PREPASS_REFLECTIVITY_TEXTURE_TYPE: Double = js.native
  
  /**
    * Constant used to retrieve the velocity texture index in the textures array in the prepass
    * using getIndex(Constants.PREPASS_VELOCITY_TEXTURE_INDEX)
    */
  @JSGlobal("BABYLON.Constants.PREPASS_VELOCITY_TEXTURE_TYPE")
  @js.native
  val PREPASS_VELOCITY_TEXTURE_TYPE: Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be replaced */
  @JSGlobal("BABYLON.Constants.REPLACE")
  @js.native
  val REPLACE: Double = js.native
  
  /** Defines that texture rescaling will use a ceil to find the closer power of 2 size */
  @JSGlobal("BABYLON.Constants.SCALEMODE_CEILING")
  @js.native
  val SCALEMODE_CEILING: Double = js.native
  
  /** Defines that texture rescaling will use a floor to find the closer power of 2 size */
  @JSGlobal("BABYLON.Constants.SCALEMODE_FLOOR")
  @js.native
  val SCALEMODE_FLOOR: Double = js.native
  
  /** Defines that texture rescaling will look for the nearest power of 2 size */
  @JSGlobal("BABYLON.Constants.SCALEMODE_NEAREST")
  @js.native
  val SCALEMODE_NEAREST: Double = js.native
  
  /**
    * Detailled logging while loading
    */
  @JSGlobal("BABYLON.Constants.SCENELOADER_DETAILED_LOGGING")
  @js.native
  val SCENELOADER_DETAILED_LOGGING: Double = js.native
  
  /**
    * Minimal logging while loading
    */
  @JSGlobal("BABYLON.Constants.SCENELOADER_MINIMAL_LOGGING")
  @js.native
  val SCENELOADER_MINIMAL_LOGGING: Double = js.native
  
  /**
    * No logging while loading
    */
  @JSGlobal("BABYLON.Constants.SCENELOADER_NO_LOGGING")
  @js.native
  val SCENELOADER_NO_LOGGING: Double = js.native
  
  /**
    * Summary logging while loading
    */
  @JSGlobal("BABYLON.Constants.SCENELOADER_SUMMARY_LOGGING")
  @js.native
  val SCENELOADER_SUMMARY_LOGGING: Double = js.native
  
  /** ALPHA */
  @JSGlobal("BABYLON.Constants.TEXTUREFORMAT_ALPHA")
  @js.native
  val TEXTUREFORMAT_ALPHA: Double = js.native
  
  /** LUMINANCE */
  @JSGlobal("BABYLON.Constants.TEXTUREFORMAT_LUMINANCE")
  @js.native
  val TEXTUREFORMAT_LUMINANCE: Double = js.native
  
  /** LUMINANCE_ALPHA */
  @JSGlobal("BABYLON.Constants.TEXTUREFORMAT_LUMINANCE_ALPHA")
  @js.native
  val TEXTUREFORMAT_LUMINANCE_ALPHA: Double = js.native
  
  /** RED (2nd reference) */
  @JSGlobal("BABYLON.Constants.TEXTUREFORMAT_R")
  @js.native
  val TEXTUREFORMAT_R: Double = js.native
  
  /** RED */
  @JSGlobal("BABYLON.Constants.TEXTUREFORMAT_RED")
  @js.native
  val TEXTUREFORMAT_RED: Double = js.native
  
  /** RED_INTEGER */
  @JSGlobal("BABYLON.Constants.TEXTUREFORMAT_RED_INTEGER")
  @js.native
  val TEXTUREFORMAT_RED_INTEGER: Double = js.native
  
  /** RG */
  @JSGlobal("BABYLON.Constants.TEXTUREFORMAT_RG")
  @js.native
  val TEXTUREFORMAT_RG: Double = js.native
  
  /** RGB */
  @JSGlobal("BABYLON.Constants.TEXTUREFORMAT_RGB")
  @js.native
  val TEXTUREFORMAT_RGB: Double = js.native
  
  /** RGBA */
  @JSGlobal("BABYLON.Constants.TEXTUREFORMAT_RGBA")
  @js.native
  val TEXTUREFORMAT_RGBA: Double = js.native
  
  /** RGBA_INTEGER */
  @JSGlobal("BABYLON.Constants.TEXTUREFORMAT_RGBA_INTEGER")
  @js.native
  val TEXTUREFORMAT_RGBA_INTEGER: Double = js.native
  
  /** RGB_INTEGER */
  @JSGlobal("BABYLON.Constants.TEXTUREFORMAT_RGB_INTEGER")
  @js.native
  val TEXTUREFORMAT_RGB_INTEGER: Double = js.native
  
  /** RG_INTEGER */
  @JSGlobal("BABYLON.Constants.TEXTUREFORMAT_RG_INTEGER")
  @js.native
  val TEXTUREFORMAT_RG_INTEGER: Double = js.native
  
  /** RED_INTEGER (2nd reference) */
  @JSGlobal("BABYLON.Constants.TEXTUREFORMAT_R_INTEGER")
  @js.native
  val TEXTUREFORMAT_R_INTEGER: Double = js.native
  
  /** BYTE */
  @JSGlobal("BABYLON.Constants.TEXTURETYPE_BYTE")
  @js.native
  val TEXTURETYPE_BYTE: Double = js.native
  
  /** FLOAT */
  @JSGlobal("BABYLON.Constants.TEXTURETYPE_FLOAT")
  @js.native
  val TEXTURETYPE_FLOAT: Double = js.native
  
  /** FLOAT_32_UNSIGNED_INT_24_8_REV */
  @JSGlobal("BABYLON.Constants.TEXTURETYPE_FLOAT_32_UNSIGNED_INT_24_8_REV")
  @js.native
  val TEXTURETYPE_FLOAT_32_UNSIGNED_INT_24_8_REV: Double = js.native
  
  /** HALF_FLOAT */
  @JSGlobal("BABYLON.Constants.TEXTURETYPE_HALF_FLOAT")
  @js.native
  val TEXTURETYPE_HALF_FLOAT: Double = js.native
  
  /** INT */
  @JSGlobal("BABYLON.Constants.TEXTURETYPE_INT")
  @js.native
  val TEXTURETYPE_INT: Double = js.native
  
  /** SHORT */
  @JSGlobal("BABYLON.Constants.TEXTURETYPE_SHORT")
  @js.native
  val TEXTURETYPE_SHORT: Double = js.native
  
  /** UNSIGNED_BYTE */
  @JSGlobal("BABYLON.Constants.TEXTURETYPE_UNSIGNED_BYTE")
  @js.native
  val TEXTURETYPE_UNSIGNED_BYTE: Double = js.native
  
  /** UNSIGNED_BYTE (2nd reference) */
  @JSGlobal("BABYLON.Constants.TEXTURETYPE_UNSIGNED_INT")
  @js.native
  val TEXTURETYPE_UNSIGNED_INT: Double = js.native
  
  /** UNSIGNED_INT */
  @JSGlobal("BABYLON.Constants.TEXTURETYPE_UNSIGNED_INTEGER")
  @js.native
  val TEXTURETYPE_UNSIGNED_INTEGER: Double = js.native
  
  /** UNSIGNED_INT_10F_11F_11F_REV */
  @JSGlobal("BABYLON.Constants.TEXTURETYPE_UNSIGNED_INT_10F_11F_11F_REV")
  @js.native
  val TEXTURETYPE_UNSIGNED_INT_10F_11F_11F_REV: Double = js.native
  
  /** UNSIGNED_INT_24_8 */
  @JSGlobal("BABYLON.Constants.TEXTURETYPE_UNSIGNED_INT_24_8")
  @js.native
  val TEXTURETYPE_UNSIGNED_INT_24_8: Double = js.native
  
  /** UNSIGNED_INT_2_10_10_10_REV */
  @JSGlobal("BABYLON.Constants.TEXTURETYPE_UNSIGNED_INT_2_10_10_10_REV")
  @js.native
  val TEXTURETYPE_UNSIGNED_INT_2_10_10_10_REV: Double = js.native
  
  /** UNSIGNED_INT_5_9_9_9_REV */
  @JSGlobal("BABYLON.Constants.TEXTURETYPE_UNSIGNED_INT_5_9_9_9_REV")
  @js.native
  val TEXTURETYPE_UNSIGNED_INT_5_9_9_9_REV: Double = js.native
  
  /** UNSIGNED_SHORT */
  @JSGlobal("BABYLON.Constants.TEXTURETYPE_UNSIGNED_SHORT")
  @js.native
  val TEXTURETYPE_UNSIGNED_SHORT: Double = js.native
  
  /** UNSIGNED_SHORT_4_4_4_4 */
  @JSGlobal("BABYLON.Constants.TEXTURETYPE_UNSIGNED_SHORT_4_4_4_4")
  @js.native
  val TEXTURETYPE_UNSIGNED_SHORT_4_4_4_4: Double = js.native
  
  /** UNSIGNED_SHORT_5_5_5_1 */
  @JSGlobal("BABYLON.Constants.TEXTURETYPE_UNSIGNED_SHORT_5_5_5_1")
  @js.native
  val TEXTURETYPE_UNSIGNED_SHORT_5_5_5_1: Double = js.native
  
  /** UNSIGNED_SHORT_5_6_5 */
  @JSGlobal("BABYLON.Constants.TEXTURETYPE_UNSIGNED_SHORT_5_6_5")
  @js.native
  val TEXTURETYPE_UNSIGNED_SHORT_5_6_5: Double = js.native
  
  /** Bilinear is mag = linear and min = linear and no mip */
  @JSGlobal("BABYLON.Constants.TEXTURE_BILINEAR_SAMPLINGMODE")
  @js.native
  val TEXTURE_BILINEAR_SAMPLINGMODE: Double = js.native
  
  /** Texture is not repeating outside of 0..1 UVs */
  @JSGlobal("BABYLON.Constants.TEXTURE_CLAMP_ADDRESSMODE")
  @js.native
  val TEXTURE_CLAMP_ADDRESSMODE: Double = js.native
  
  /** Cubic coordinates mode */
  @JSGlobal("BABYLON.Constants.TEXTURE_CUBIC_MODE")
  @js.native
  val TEXTURE_CUBIC_MODE: Double = js.native
  
  /** Equirectangular coordinates mode */
  @JSGlobal("BABYLON.Constants.TEXTURE_EQUIRECTANGULAR_MODE")
  @js.native
  val TEXTURE_EQUIRECTANGULAR_MODE: Double = js.native
  
  /** Explicit coordinates mode */
  @JSGlobal("BABYLON.Constants.TEXTURE_EXPLICIT_MODE")
  @js.native
  val TEXTURE_EXPLICIT_MODE: Double = js.native
  
  /** High quality for texture filtering */
  @JSGlobal("BABYLON.Constants.TEXTURE_FILTERING_QUALITY_HIGH")
  @js.native
  val TEXTURE_FILTERING_QUALITY_HIGH: Double = js.native
  
  /** Low quality for texture filtering */
  @JSGlobal("BABYLON.Constants.TEXTURE_FILTERING_QUALITY_LOW")
  @js.native
  val TEXTURE_FILTERING_QUALITY_LOW: Double = js.native
  
  /** Medium quality for texture filtering */
  @JSGlobal("BABYLON.Constants.TEXTURE_FILTERING_QUALITY_MEDIUM")
  @js.native
  val TEXTURE_FILTERING_QUALITY_MEDIUM: Double = js.native
  
  /** Offline (baking) quality for texture filtering */
  @JSGlobal("BABYLON.Constants.TEXTURE_FILTERING_QUALITY_OFFLINE")
  @js.native
  val TEXTURE_FILTERING_QUALITY_OFFLINE: Double = js.native
  
  /** Equirectangular Fixed Mirrored coordinates mode */
  @JSGlobal("BABYLON.Constants.TEXTURE_FIXED_EQUIRECTANGULAR_MIRRORED_MODE")
  @js.native
  val TEXTURE_FIXED_EQUIRECTANGULAR_MIRRORED_MODE: Double = js.native
  
  /** Equirectangular Fixed coordinates mode */
  @JSGlobal("BABYLON.Constants.TEXTURE_FIXED_EQUIRECTANGULAR_MODE")
  @js.native
  val TEXTURE_FIXED_EQUIRECTANGULAR_MODE: Double = js.native
  
  /** Inverse Cubic coordinates mode */
  @JSGlobal("BABYLON.Constants.TEXTURE_INVCUBIC_MODE")
  @js.native
  val TEXTURE_INVCUBIC_MODE: Double = js.native
  
  /** mag = linear and min = linear and mip = none */
  @JSGlobal("BABYLON.Constants.TEXTURE_LINEAR_LINEAR")
  @js.native
  val TEXTURE_LINEAR_LINEAR: Double = js.native
  
  /** Trilinear is mag = linear and min = linear and mip = linear */
  @JSGlobal("BABYLON.Constants.TEXTURE_LINEAR_LINEAR_MIPLINEAR")
  @js.native
  val TEXTURE_LINEAR_LINEAR_MIPLINEAR: Double = js.native
  
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  @JSGlobal("BABYLON.Constants.TEXTURE_LINEAR_LINEAR_MIPNEAREST")
  @js.native
  val TEXTURE_LINEAR_LINEAR_MIPNEAREST: Double = js.native
  
  /** mag = linear and min = nearest and mip = none */
  @JSGlobal("BABYLON.Constants.TEXTURE_LINEAR_NEAREST")
  @js.native
  val TEXTURE_LINEAR_NEAREST: Double = js.native
  
  /** mag = linear and min = nearest and mip = linear */
  @JSGlobal("BABYLON.Constants.TEXTURE_LINEAR_NEAREST_MIPLINEAR")
  @js.native
  val TEXTURE_LINEAR_NEAREST_MIPLINEAR: Double = js.native
  
  /** mag = linear and min = nearest and mip = nearest */
  @JSGlobal("BABYLON.Constants.TEXTURE_LINEAR_NEAREST_MIPNEAREST")
  @js.native
  val TEXTURE_LINEAR_NEAREST_MIPNEAREST: Double = js.native
  
  /** Texture is repeating and mirrored */
  @JSGlobal("BABYLON.Constants.TEXTURE_MIRROR_ADDRESSMODE")
  @js.native
  val TEXTURE_MIRROR_ADDRESSMODE: Double = js.native
  
  /** mag = nearest and min = linear and mip = none */
  @JSGlobal("BABYLON.Constants.TEXTURE_NEAREST_LINEAR")
  @js.native
  val TEXTURE_NEAREST_LINEAR: Double = js.native
  
  /** mag = nearest and min = linear and mip = linear */
  @JSGlobal("BABYLON.Constants.TEXTURE_NEAREST_LINEAR_MIPLINEAR")
  @js.native
  val TEXTURE_NEAREST_LINEAR_MIPLINEAR: Double = js.native
  
  /** mag = nearest and min = linear and mip = nearest */
  @JSGlobal("BABYLON.Constants.TEXTURE_NEAREST_LINEAR_MIPNEAREST")
  @js.native
  val TEXTURE_NEAREST_LINEAR_MIPNEAREST: Double = js.native
  
  /** mag = nearest and min = nearest and mip = none */
  @JSGlobal("BABYLON.Constants.TEXTURE_NEAREST_NEAREST")
  @js.native
  val TEXTURE_NEAREST_NEAREST: Double = js.native
  
  /** nearest is mag = nearest and min = nearest and mip = linear */
  @JSGlobal("BABYLON.Constants.TEXTURE_NEAREST_NEAREST_MIPLINEAR")
  @js.native
  val TEXTURE_NEAREST_NEAREST_MIPLINEAR: Double = js.native
  
  /** mag = nearest and min = nearest and mip = nearest */
  @JSGlobal("BABYLON.Constants.TEXTURE_NEAREST_NEAREST_MIPNEAREST")
  @js.native
  val TEXTURE_NEAREST_NEAREST_MIPNEAREST: Double = js.native
  
  /** nearest is mag = nearest and min = nearest and no mip */
  @JSGlobal("BABYLON.Constants.TEXTURE_NEAREST_SAMPLINGMODE")
  @js.native
  val TEXTURE_NEAREST_SAMPLINGMODE: Double = js.native
  
  /** Planar coordinates mode */
  @JSGlobal("BABYLON.Constants.TEXTURE_PLANAR_MODE")
  @js.native
  val TEXTURE_PLANAR_MODE: Double = js.native
  
  /** Projection coordinates mode */
  @JSGlobal("BABYLON.Constants.TEXTURE_PROJECTION_MODE")
  @js.native
  val TEXTURE_PROJECTION_MODE: Double = js.native
  
  /** Skybox coordinates mode */
  @JSGlobal("BABYLON.Constants.TEXTURE_SKYBOX_MODE")
  @js.native
  val TEXTURE_SKYBOX_MODE: Double = js.native
  
  /** Spherical coordinates mode */
  @JSGlobal("BABYLON.Constants.TEXTURE_SPHERICAL_MODE")
  @js.native
  val TEXTURE_SPHERICAL_MODE: Double = js.native
  
  /** Trilinear is mag = linear and min = linear and mip = linear */
  @JSGlobal("BABYLON.Constants.TEXTURE_TRILINEAR_SAMPLINGMODE")
  @js.native
  val TEXTURE_TRILINEAR_SAMPLINGMODE: Double = js.native
  
  /** Texture is repeating outside of 0..1 UVs */
  @JSGlobal("BABYLON.Constants.TEXTURE_WRAP_ADDRESSMODE")
  @js.native
  val TEXTURE_WRAP_ADDRESSMODE: Double = js.native
}
