package typings.babylonjs

import typings.babylonjs.anon.Capture
import typings.babylonjs.anon.CaptureConstraint
import typings.babylonjs.anon.PartialRenderTargetCreati
import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.dataBufferMod.DataBuffer
import typings.babylonjs.depthTextureCreationOptionsMod.DepthTextureCreationOptions
import typings.babylonjs.engineMod.IDisplayChangedEventArgs
import typings.babylonjs.engineRenderTargetMod.RenderTargetTextureSize
import typings.babylonjs.engineWebVRMod.IVRPresentationAttributes
import typings.babylonjs.fileRequestMod.IFileRequest
import typings.babylonjs.fileToolsMod.LoadFileError
import typings.babylonjs.iaudioengineMod.IAudioEngine
import typings.babylonjs.internalTextureLoaderMod.IInternalTextureLoader
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.iofflineproviderMod.IOfflineProvider
import typings.babylonjs.ipipelinecontextMod.IPipelineContext
import typings.babylonjs.loadingScreenMod.ILoadingScreen
import typings.babylonjs.materialMod.Material
import typings.babylonjs.mathSizeMod.Size
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.multiRenderTargetMod.IMultiRenderTargetOptions
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.renderTargetCreationOptionsMod.RenderTargetCreationOptions
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.thinEngineMod.EngineOptions
import typings.babylonjs.timeTokenMod.TimeToken
import typings.babylonjs.typesMod.DataArray
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.IndicesArray
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.typesMod.int
import typings.babylonjs.uniformBufferMod.UniformBuffer
import typings.babylonjs.webRequestMod.WebRequest
import typings.babylonjs.webVRCameraMod.WebVROptions
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Blob
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import typings.std.OffscreenCanvas
import typings.std.ProgressEvent
import typings.std.WebGL2RenderingContext
import typings.std.WebGLQuery
import typings.std.WebGLTransformFeedback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesIndexMod {
  
  @JSImport("babylonjs/Engines/index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Engines/index", "Constants")
  @js.native
  class Constants ()
    extends typings.babylonjs.constantsMod.Constants
  /* static members */
  object Constants {
    
    /**
      * Nothing
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Engines/index", "Constants.ACTION_NothingTrigger")
    @js.native
    val ACTION_NothingTrigger: Double = js.native
    
    /**
      * On center pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Engines/index", "Constants.ACTION_OnCenterPickTrigger")
    @js.native
    val ACTION_OnCenterPickTrigger: Double = js.native
    
    /**
      * On double pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Engines/index", "Constants.ACTION_OnDoublePickTrigger")
    @js.native
    val ACTION_OnDoublePickTrigger: Double = js.native
    
    /**
      * On every frame
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Engines/index", "Constants.ACTION_OnEveryFrameTrigger")
    @js.native
    val ACTION_OnEveryFrameTrigger: Double = js.native
    
    /**
      * On intersection enter
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Engines/index", "Constants.ACTION_OnIntersectionEnterTrigger")
    @js.native
    val ACTION_OnIntersectionEnterTrigger: Double = js.native
    
    /**
      * On intersection exit
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Engines/index", "Constants.ACTION_OnIntersectionExitTrigger")
    @js.native
    val ACTION_OnIntersectionExitTrigger: Double = js.native
    
    /**
      * On key down
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Engines/index", "Constants.ACTION_OnKeyDownTrigger")
    @js.native
    val ACTION_OnKeyDownTrigger: Double = js.native
    
    /**
      * On key up
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Engines/index", "Constants.ACTION_OnKeyUpTrigger")
    @js.native
    val ACTION_OnKeyUpTrigger: Double = js.native
    
    /**
      * On left pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Engines/index", "Constants.ACTION_OnLeftPickTrigger")
    @js.native
    val ACTION_OnLeftPickTrigger: Double = js.native
    
    /**
      * On long press
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Engines/index", "Constants.ACTION_OnLongPressTrigger")
    @js.native
    val ACTION_OnLongPressTrigger: Double = js.native
    
    /**
      * On pick down
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Engines/index", "Constants.ACTION_OnPickDownTrigger")
    @js.native
    val ACTION_OnPickDownTrigger: Double = js.native
    
    /**
      * On pick out.
      * This trigger will only be raised if you also declared a OnPickDown
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Engines/index", "Constants.ACTION_OnPickOutTrigger")
    @js.native
    val ACTION_OnPickOutTrigger: Double = js.native
    
    /**
      * On pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Engines/index", "Constants.ACTION_OnPickTrigger")
    @js.native
    val ACTION_OnPickTrigger: Double = js.native
    
    /**
      * On pick up
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Engines/index", "Constants.ACTION_OnPickUpTrigger")
    @js.native
    val ACTION_OnPickUpTrigger: Double = js.native
    
    /**
      * On pointer out
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Engines/index", "Constants.ACTION_OnPointerOutTrigger")
    @js.native
    val ACTION_OnPointerOutTrigger: Double = js.native
    
    /**
      * On pointer over
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Engines/index", "Constants.ACTION_OnPointerOverTrigger")
    @js.native
    val ACTION_OnPointerOverTrigger: Double = js.native
    
    /**
      * On right pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Engines/index", "Constants.ACTION_OnRightPickTrigger")
    @js.native
    val ACTION_OnRightPickTrigger: Double = js.native
    
    /** Defines that alpha blending is SRC ALPHA * SRC + DEST */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_ADD")
    @js.native
    val ALPHA_ADD: Double = js.native
    
    /**
      * Defines that alpha blending is SRC * DST ALPHA + DST
      * Alpha will be set to 0
      */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_ALPHATOCOLOR")
    @js.native
    val ALPHA_ALPHATOCOLOR: Double = js.native
    
    /** Defines that alpha blending is SRC ALPHA * SRC + (1 - SRC ALPHA) * DEST */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_COMBINE")
    @js.native
    val ALPHA_COMBINE: Double = js.native
    
    /** Defines that alpha blending is disabled */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_DISABLE")
    @js.native
    val ALPHA_DISABLE: Double = js.native
    
    /** Defines that alpha blending equation a SUM */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_EQUATION_ADD")
    @js.native
    val ALPHA_EQUATION_ADD: Double = js.native
    
    /**
      * Defines that alpha blending equation a DARKEN operation:
      * It takes the min of the src and sums the alpha channels.
      */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_EQUATION_DARKEN")
    @js.native
    val ALPHA_EQUATION_DARKEN: Double = js.native
    
    /** Defines that alpha blending equation a MAX operation */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_EQUATION_MAX")
    @js.native
    val ALPHA_EQUATION_MAX: Double = js.native
    
    /** Defines that alpha blending equation a MIN operation */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_EQUATION_MIN")
    @js.native
    val ALPHA_EQUATION_MIN: Double = js.native
    
    /** Defines that alpha blending equation a REVERSE SUBSTRACTION */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_EQUATION_REVERSE_SUBTRACT")
    @js.native
    val ALPHA_EQUATION_REVERSE_SUBTRACT: Double = js.native
    
    /** Defines that alpha blending equation a SUBSTRACTION */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_EQUATION_SUBSTRACT")
    @js.native
    val ALPHA_EQUATION_SUBSTRACT: Double = js.native
    
    /**
      * Defines that alpha blending is SRC * (1 - DST) + DST * (1 - SRC)
      * Alpha will be set to DST ALPHA
      */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_EXCLUSION")
    @js.native
    val ALPHA_EXCLUSION: Double = js.native
    
    /** Defines that alpha blending is CST * SRC + (1 - CST) * DEST */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_INTERPOLATE")
    @js.native
    val ALPHA_INTERPOLATE: Double = js.native
    
    /** Defines that alpha blending is SRC ALPHA * SRC + (1 - SRC) * DEST */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_MAXIMIZED")
    @js.native
    val ALPHA_MAXIMIZED: Double = js.native
    
    /** Defines that alpha blending is SRC * DEST */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_MULTIPLY")
    @js.native
    val ALPHA_MULTIPLY: Double = js.native
    
    /** Defines that alpha blending is SRC + DEST */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_ONEONE")
    @js.native
    val ALPHA_ONEONE: Double = js.native
    
    /**
      * Defines that alpha blending is SRC + DST
      * Alpha will be set to SRC ALPHA + DST ALPHA
      */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_ONEONE_ONEONE")
    @js.native
    val ALPHA_ONEONE_ONEONE: Double = js.native
    
    /**
      * Defines that alpha blending is SRC + DST
      * Alpha will be set to SRC ALPHA
      */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_ONEONE_ONEZERO")
    @js.native
    val ALPHA_ONEONE_ONEZERO: Double = js.native
    
    /** Defines that alpha blending is SRC + (1 - SRC ALPHA) * DEST */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_PREMULTIPLIED")
    @js.native
    val ALPHA_PREMULTIPLIED: Double = js.native
    
    /**
      * Defines that alpha blending is SRC + (1 - SRC ALPHA) * DEST
      * Alpha will be set to (1 - SRC ALPHA) * DEST ALPHA
      */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_PREMULTIPLIED_PORTERDUFF")
    @js.native
    val ALPHA_PREMULTIPLIED_PORTERDUFF: Double = js.native
    
    /**
      * Defines that alpha blending is SRC * (1 - DST) + DST * (1 - SRC)
      */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_REVERSEONEMINUS")
    @js.native
    val ALPHA_REVERSEONEMINUS: Double = js.native
    
    /**
      * Defines that alpha blending is SRC + (1 - SRC) * DEST
      * Alpha will be set to SRC ALPHA + (1 - SRC ALPHA) * DEST ALPHA
      */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_SCREENMODE")
    @js.native
    val ALPHA_SCREENMODE: Double = js.native
    
    /**
      * Defines that alpha blending is SRC + DST * (1 - SRC ALPHA)
      * Alpha will be set to SRC ALPHA + DST ALPHA * (1 - SRC ALPHA)
      */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_SRC_DSTONEMINUSSRCALPHA")
    @js.native
    val ALPHA_SRC_DSTONEMINUSSRCALPHA: Double = js.native
    
    /** Defines that alpha blending is DEST - SRC * DEST */
    @JSImport("babylonjs/Engines/index", "Constants.ALPHA_SUBTRACT")
    @js.native
    val ALPHA_SUBTRACT: Double = js.native
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will always pass. i.e. Pixels will be drawn in the order they are drawn */
    @JSImport("babylonjs/Engines/index", "Constants.ALWAYS")
    @js.native
    val ALWAYS: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be decremented */
    @JSImport("babylonjs/Engines/index", "Constants.DECR")
    @js.native
    val DECR: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be decremented with wrapping */
    @JSImport("babylonjs/Engines/index", "Constants.DECR_WRAP")
    @js.native
    val DECR_WRAP: Double = js.native
    
    /** Defines that the ressource was successfully delay loaded */
    @JSImport("babylonjs/Engines/index", "Constants.DELAYLOADSTATE_LOADED")
    @js.native
    val DELAYLOADSTATE_LOADED: Double = js.native
    
    /** Defines that the ressource is currently delay loading */
    @JSImport("babylonjs/Engines/index", "Constants.DELAYLOADSTATE_LOADING")
    @js.native
    val DELAYLOADSTATE_LOADING: Double = js.native
    
    /** Defines that the ressource is not delayed*/
    @JSImport("babylonjs/Engines/index", "Constants.DELAYLOADSTATE_NONE")
    @js.native
    val DELAYLOADSTATE_NONE: Double = js.native
    
    /** Defines that the ressource is delayed and has not started loading */
    @JSImport("babylonjs/Engines/index", "Constants.DELAYLOADSTATE_NOTLOADED")
    @js.native
    val DELAYLOADSTATE_NOTLOADED: Double = js.native
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is equals to the stored value */
    @JSImport("babylonjs/Engines/index", "Constants.EQUAL")
    @js.native
    val EQUAL: Double = js.native
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than or equal to the stored value */
    @JSImport("babylonjs/Engines/index", "Constants.GEQUAL")
    @js.native
    val GEQUAL: Double = js.native
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than the stored value */
    @JSImport("babylonjs/Engines/index", "Constants.GREATER")
    @js.native
    val GREATER: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be incremented */
    @JSImport("babylonjs/Engines/index", "Constants.INCR")
    @js.native
    val INCR: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be incremented with wrapping */
    @JSImport("babylonjs/Engines/index", "Constants.INCR_WRAP")
    @js.native
    val INCR_WRAP: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be inverted */
    @JSImport("babylonjs/Engines/index", "Constants.INVERT")
    @js.native
    val INVERT: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be kept */
    @JSImport("babylonjs/Engines/index", "Constants.KEEP")
    @js.native
    val KEEP: Double = js.native
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than or equal to the stored value */
    @JSImport("babylonjs/Engines/index", "Constants.LEQUAL")
    @js.native
    val LEQUAL: Double = js.native
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than the stored value */
    @JSImport("babylonjs/Engines/index", "Constants.LESS")
    @js.native
    val LESS: Double = js.native
    
    /**
      * The all dirty flag value
      */
    @JSImport("babylonjs/Engines/index", "Constants.MATERIAL_AllDirtyFlag")
    @js.native
    val MATERIAL_AllDirtyFlag: Double = js.native
    
    /**
      * The dirty attribute flag value
      */
    @JSImport("babylonjs/Engines/index", "Constants.MATERIAL_AttributesDirtyFlag")
    @js.native
    val MATERIAL_AttributesDirtyFlag: Double = js.native
    
    /**
      * Stores the clock-wise side orientation
      */
    @JSImport("babylonjs/Engines/index", "Constants.MATERIAL_ClockWiseSideOrientation")
    @js.native
    val MATERIAL_ClockWiseSideOrientation: Double = js.native
    
    /**
      * Stores the counter clock-wise side orientation
      */
    @JSImport("babylonjs/Engines/index", "Constants.MATERIAL_CounterClockWiseSideOrientation")
    @js.native
    val MATERIAL_CounterClockWiseSideOrientation: Double = js.native
    
    /**
      * The dirty fresnel flag value
      */
    @JSImport("babylonjs/Engines/index", "Constants.MATERIAL_FresnelDirtyFlag")
    @js.native
    val MATERIAL_FresnelDirtyFlag: Double = js.native
    
    /**
      * The dirty light flag value
      */
    @JSImport("babylonjs/Engines/index", "Constants.MATERIAL_LightDirtyFlag")
    @js.native
    val MATERIAL_LightDirtyFlag: Double = js.native
    
    /**
      * Returns the line list draw mode
      */
    @JSImport("babylonjs/Engines/index", "Constants.MATERIAL_LineListDrawMode")
    @js.native
    val MATERIAL_LineListDrawMode: Double = js.native
    
    /**
      * Returns the line loop draw mode
      */
    @JSImport("babylonjs/Engines/index", "Constants.MATERIAL_LineLoopDrawMode")
    @js.native
    val MATERIAL_LineLoopDrawMode: Double = js.native
    
    /**
      * Returns the line strip draw mode
      */
    @JSImport("babylonjs/Engines/index", "Constants.MATERIAL_LineStripDrawMode")
    @js.native
    val MATERIAL_LineStripDrawMode: Double = js.native
    
    /**
      * The dirty misc flag value
      */
    @JSImport("babylonjs/Engines/index", "Constants.MATERIAL_MiscDirtyFlag")
    @js.native
    val MATERIAL_MiscDirtyFlag: Double = js.native
    
    /**
      * Returns the point fill mode
      */
    @JSImport("babylonjs/Engines/index", "Constants.MATERIAL_PointFillMode")
    @js.native
    val MATERIAL_PointFillMode: Double = js.native
    
    /**
      * Returns the point list draw mode
      */
    @JSImport("babylonjs/Engines/index", "Constants.MATERIAL_PointListDrawMode")
    @js.native
    val MATERIAL_PointListDrawMode: Double = js.native
    
    /**
      * The dirty prepass flag value
      */
    @JSImport("babylonjs/Engines/index", "Constants.MATERIAL_PrePassDirtyFlag")
    @js.native
    val MATERIAL_PrePassDirtyFlag: Double = js.native
    
    /**
      * The dirty texture flag value
      */
    @JSImport("babylonjs/Engines/index", "Constants.MATERIAL_TextureDirtyFlag")
    @js.native
    val MATERIAL_TextureDirtyFlag: Double = js.native
    
    /**
      * Returns the triangle fan draw mode
      */
    @JSImport("babylonjs/Engines/index", "Constants.MATERIAL_TriangleFanDrawMode")
    @js.native
    val MATERIAL_TriangleFanDrawMode: Double = js.native
    
    /**
      * Returns the triangle fill mode
      */
    @JSImport("babylonjs/Engines/index", "Constants.MATERIAL_TriangleFillMode")
    @js.native
    val MATERIAL_TriangleFillMode: Double = js.native
    
    /**
      * Returns the triangle strip draw mode
      */
    @JSImport("babylonjs/Engines/index", "Constants.MATERIAL_TriangleStripDrawMode")
    @js.native
    val MATERIAL_TriangleStripDrawMode: Double = js.native
    
    /**
      * Returns the wireframe mode
      */
    @JSImport("babylonjs/Engines/index", "Constants.MATERIAL_WireFrameFillMode")
    @js.native
    val MATERIAL_WireFrameFillMode: Double = js.native
    
    /** Culling strategy : Bounding Sphere Only.
      *  This is an exclusion test. It's faster than the standard strategy because the bounding box is not tested.
      *  It's also less accurate than the standard because some not visible objects can still be selected.
      *  Test : is the bounding sphere outside the frustum ?
      *  If not, then the cullable object is in the frustum.
      */
    @JSImport("babylonjs/Engines/index", "Constants.MESHES_CULLINGSTRATEGY_BOUNDINGSPHERE_ONLY")
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
    @JSImport("babylonjs/Engines/index", "Constants.MESHES_CULLINGSTRATEGY_OPTIMISTIC_INCLUSION")
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
    @JSImport("babylonjs/Engines/index", "Constants.MESHES_CULLINGSTRATEGY_OPTIMISTIC_INCLUSION_THEN_BSPHERE_ONLY")
    @js.native
    val MESHES_CULLINGSTRATEGY_OPTIMISTIC_INCLUSION_THEN_BSPHERE_ONLY: Double = js.native
    
    /** Default culling strategy : this is an exclusion test and it's the more accurate.
      *  Test order :
      *  Is the bounding sphere outside the frustum ?
      *  If not, are the bounding box vertices outside the frustum ?
      *  It not, then the cullable object is in the frustum.
      */
    @JSImport("babylonjs/Engines/index", "Constants.MESHES_CULLINGSTRATEGY_STANDARD")
    @js.native
    val MESHES_CULLINGSTRATEGY_STANDARD: Double = js.native
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will never pass. i.e. Nothing will be drawn */
    @JSImport("babylonjs/Engines/index", "Constants.NEVER")
    @js.native
    val NEVER: Double = js.native
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is not equal to the stored value */
    @JSImport("babylonjs/Engines/index", "Constants.NOTEQUAL")
    @js.native
    val NOTEQUAL: Double = js.native
    
    /**
      * Billboard mode will apply to all axes
      */
    @JSImport("babylonjs/Engines/index", "Constants.PARTICLES_BILLBOARDMODE_ALL")
    @js.native
    val PARTICLES_BILLBOARDMODE_ALL: Double = js.native
    
    /**
      * Special billboard mode where the particle will be biilboard to the camera but rotated to align with direction
      */
    @JSImport("babylonjs/Engines/index", "Constants.PARTICLES_BILLBOARDMODE_STRETCHED")
    @js.native
    val PARTICLES_BILLBOARDMODE_STRETCHED: Double = js.native
    
    /**
      * Billboard mode will only apply to Y axis
      */
    @JSImport("babylonjs/Engines/index", "Constants.PARTICLES_BILLBOARDMODE_Y")
    @js.native
    val PARTICLES_BILLBOARDMODE_Y: Double = js.native
    
    /**
      * Constant used to retrieve albedo index in the textures array in the prepass
      * using the getIndex(Constants.PREPASS_ALBEDO_TEXTURE_TYPE)
      */
    @JSImport("babylonjs/Engines/index", "Constants.PREPASS_ALBEDO_TEXTURE_TYPE")
    @js.native
    val PREPASS_ALBEDO_TEXTURE_TYPE: Double = js.native
    
    /**
      * Constant used to retrieve the lit color texture index in the textures array in the prepass
      * using the getIndex(Constants.PREPASS_COLOR_TEXTURE_TYPE)
      */
    @JSImport("babylonjs/Engines/index", "Constants.PREPASS_COLOR_TEXTURE_TYPE")
    @js.native
    val PREPASS_COLOR_TEXTURE_TYPE: Double = js.native
    
    /**
      * Constant used to retrieve depth + normal index in the textures array in the prepass
      * using the getIndex(Constants.PREPASS_DEPTHNORMAL_TEXTURE_TYPE)
      */
    @JSImport("babylonjs/Engines/index", "Constants.PREPASS_DEPTHNORMAL_TEXTURE_TYPE")
    @js.native
    val PREPASS_DEPTHNORMAL_TEXTURE_TYPE: Double = js.native
    
    /**
      * Constant used to retrieve the irradiance texture index in the textures array in the prepass
      * using getIndex(Constants.PREPASS_IRRADIANCE_TEXTURE_TYPE)
      */
    @JSImport("babylonjs/Engines/index", "Constants.PREPASS_IRRADIANCE_TEXTURE_TYPE")
    @js.native
    val PREPASS_IRRADIANCE_TEXTURE_TYPE: Double = js.native
    
    /**
      * Constant used to retrieve the position texture index in the textures array in the prepass
      * using getIndex(Constants.PREPASS_POSITION_TEXTURE_INDEX)
      */
    @JSImport("babylonjs/Engines/index", "Constants.PREPASS_POSITION_TEXTURE_TYPE")
    @js.native
    val PREPASS_POSITION_TEXTURE_TYPE: Double = js.native
    
    /**
      * Constant used to retrieve the reflectivity texture index in the textures array in the prepass
      * using the getIndex(Constants.PREPASS_REFLECTIVITY_TEXTURE_TYPE)
      */
    @JSImport("babylonjs/Engines/index", "Constants.PREPASS_REFLECTIVITY_TEXTURE_TYPE")
    @js.native
    val PREPASS_REFLECTIVITY_TEXTURE_TYPE: Double = js.native
    
    /**
      * Constant used to retrieve the velocity texture index in the textures array in the prepass
      * using getIndex(Constants.PREPASS_VELOCITY_TEXTURE_INDEX)
      */
    @JSImport("babylonjs/Engines/index", "Constants.PREPASS_VELOCITY_TEXTURE_TYPE")
    @js.native
    val PREPASS_VELOCITY_TEXTURE_TYPE: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be replaced */
    @JSImport("babylonjs/Engines/index", "Constants.REPLACE")
    @js.native
    val REPLACE: Double = js.native
    
    /** Defines that texture rescaling will use a ceil to find the closer power of 2 size */
    @JSImport("babylonjs/Engines/index", "Constants.SCALEMODE_CEILING")
    @js.native
    val SCALEMODE_CEILING: Double = js.native
    
    /** Defines that texture rescaling will use a floor to find the closer power of 2 size */
    @JSImport("babylonjs/Engines/index", "Constants.SCALEMODE_FLOOR")
    @js.native
    val SCALEMODE_FLOOR: Double = js.native
    
    /** Defines that texture rescaling will look for the nearest power of 2 size */
    @JSImport("babylonjs/Engines/index", "Constants.SCALEMODE_NEAREST")
    @js.native
    val SCALEMODE_NEAREST: Double = js.native
    
    /**
      * Detailled logging while loading
      */
    @JSImport("babylonjs/Engines/index", "Constants.SCENELOADER_DETAILED_LOGGING")
    @js.native
    val SCENELOADER_DETAILED_LOGGING: Double = js.native
    
    /**
      * Minimal logging while loading
      */
    @JSImport("babylonjs/Engines/index", "Constants.SCENELOADER_MINIMAL_LOGGING")
    @js.native
    val SCENELOADER_MINIMAL_LOGGING: Double = js.native
    
    /**
      * No logging while loading
      */
    @JSImport("babylonjs/Engines/index", "Constants.SCENELOADER_NO_LOGGING")
    @js.native
    val SCENELOADER_NO_LOGGING: Double = js.native
    
    /**
      * Summary logging while loading
      */
    @JSImport("babylonjs/Engines/index", "Constants.SCENELOADER_SUMMARY_LOGGING")
    @js.native
    val SCENELOADER_SUMMARY_LOGGING: Double = js.native
    
    /** ALPHA */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTUREFORMAT_ALPHA")
    @js.native
    val TEXTUREFORMAT_ALPHA: Double = js.native
    
    /** LUMINANCE */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTUREFORMAT_LUMINANCE")
    @js.native
    val TEXTUREFORMAT_LUMINANCE: Double = js.native
    
    /** LUMINANCE_ALPHA */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTUREFORMAT_LUMINANCE_ALPHA")
    @js.native
    val TEXTUREFORMAT_LUMINANCE_ALPHA: Double = js.native
    
    /** RED (2nd reference) */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTUREFORMAT_R")
    @js.native
    val TEXTUREFORMAT_R: Double = js.native
    
    /** RED */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTUREFORMAT_RED")
    @js.native
    val TEXTUREFORMAT_RED: Double = js.native
    
    /** RED_INTEGER */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTUREFORMAT_RED_INTEGER")
    @js.native
    val TEXTUREFORMAT_RED_INTEGER: Double = js.native
    
    /** RG */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTUREFORMAT_RG")
    @js.native
    val TEXTUREFORMAT_RG: Double = js.native
    
    /** RGB */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTUREFORMAT_RGB")
    @js.native
    val TEXTUREFORMAT_RGB: Double = js.native
    
    /** RGBA */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTUREFORMAT_RGBA")
    @js.native
    val TEXTUREFORMAT_RGBA: Double = js.native
    
    /** RGBA_INTEGER */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTUREFORMAT_RGBA_INTEGER")
    @js.native
    val TEXTUREFORMAT_RGBA_INTEGER: Double = js.native
    
    /** RGB_INTEGER */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTUREFORMAT_RGB_INTEGER")
    @js.native
    val TEXTUREFORMAT_RGB_INTEGER: Double = js.native
    
    /** RG_INTEGER */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTUREFORMAT_RG_INTEGER")
    @js.native
    val TEXTUREFORMAT_RG_INTEGER: Double = js.native
    
    /** RED_INTEGER (2nd reference) */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTUREFORMAT_R_INTEGER")
    @js.native
    val TEXTUREFORMAT_R_INTEGER: Double = js.native
    
    /** BYTE */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURETYPE_BYTE")
    @js.native
    val TEXTURETYPE_BYTE: Double = js.native
    
    /** FLOAT */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURETYPE_FLOAT")
    @js.native
    val TEXTURETYPE_FLOAT: Double = js.native
    
    /** FLOAT_32_UNSIGNED_INT_24_8_REV */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURETYPE_FLOAT_32_UNSIGNED_INT_24_8_REV")
    @js.native
    val TEXTURETYPE_FLOAT_32_UNSIGNED_INT_24_8_REV: Double = js.native
    
    /** HALF_FLOAT */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURETYPE_HALF_FLOAT")
    @js.native
    val TEXTURETYPE_HALF_FLOAT: Double = js.native
    
    /** INT */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURETYPE_INT")
    @js.native
    val TEXTURETYPE_INT: Double = js.native
    
    /** SHORT */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURETYPE_SHORT")
    @js.native
    val TEXTURETYPE_SHORT: Double = js.native
    
    /** UNSIGNED_BYTE */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURETYPE_UNSIGNED_BYTE")
    @js.native
    val TEXTURETYPE_UNSIGNED_BYTE: Double = js.native
    
    /** UNSIGNED_BYTE (2nd reference) */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURETYPE_UNSIGNED_INT")
    @js.native
    val TEXTURETYPE_UNSIGNED_INT: Double = js.native
    
    /** UNSIGNED_INT */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURETYPE_UNSIGNED_INTEGER")
    @js.native
    val TEXTURETYPE_UNSIGNED_INTEGER: Double = js.native
    
    /** UNSIGNED_INT_10F_11F_11F_REV */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURETYPE_UNSIGNED_INT_10F_11F_11F_REV")
    @js.native
    val TEXTURETYPE_UNSIGNED_INT_10F_11F_11F_REV: Double = js.native
    
    /** UNSIGNED_INT_24_8 */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURETYPE_UNSIGNED_INT_24_8")
    @js.native
    val TEXTURETYPE_UNSIGNED_INT_24_8: Double = js.native
    
    /** UNSIGNED_INT_2_10_10_10_REV */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURETYPE_UNSIGNED_INT_2_10_10_10_REV")
    @js.native
    val TEXTURETYPE_UNSIGNED_INT_2_10_10_10_REV: Double = js.native
    
    /** UNSIGNED_INT_5_9_9_9_REV */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURETYPE_UNSIGNED_INT_5_9_9_9_REV")
    @js.native
    val TEXTURETYPE_UNSIGNED_INT_5_9_9_9_REV: Double = js.native
    
    /** UNSIGNED_SHORT */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURETYPE_UNSIGNED_SHORT")
    @js.native
    val TEXTURETYPE_UNSIGNED_SHORT: Double = js.native
    
    /** UNSIGNED_SHORT_4_4_4_4 */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURETYPE_UNSIGNED_SHORT_4_4_4_4")
    @js.native
    val TEXTURETYPE_UNSIGNED_SHORT_4_4_4_4: Double = js.native
    
    /** UNSIGNED_SHORT_5_5_5_1 */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURETYPE_UNSIGNED_SHORT_5_5_5_1")
    @js.native
    val TEXTURETYPE_UNSIGNED_SHORT_5_5_5_1: Double = js.native
    
    /** UNSIGNED_SHORT_5_6_5 */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURETYPE_UNSIGNED_SHORT_5_6_5")
    @js.native
    val TEXTURETYPE_UNSIGNED_SHORT_5_6_5: Double = js.native
    
    /** Bilinear is mag = linear and min = linear and no mip */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_BILINEAR_SAMPLINGMODE")
    @js.native
    val TEXTURE_BILINEAR_SAMPLINGMODE: Double = js.native
    
    /** Texture is not repeating outside of 0..1 UVs */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_CLAMP_ADDRESSMODE")
    @js.native
    val TEXTURE_CLAMP_ADDRESSMODE: Double = js.native
    
    /** Cubic coordinates mode */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_CUBIC_MODE")
    @js.native
    val TEXTURE_CUBIC_MODE: Double = js.native
    
    /** Equirectangular coordinates mode */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_EQUIRECTANGULAR_MODE")
    @js.native
    val TEXTURE_EQUIRECTANGULAR_MODE: Double = js.native
    
    /** Explicit coordinates mode */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_EXPLICIT_MODE")
    @js.native
    val TEXTURE_EXPLICIT_MODE: Double = js.native
    
    /** High quality for texture filtering */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_FILTERING_QUALITY_HIGH")
    @js.native
    val TEXTURE_FILTERING_QUALITY_HIGH: Double = js.native
    
    /** Low quality for texture filtering */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_FILTERING_QUALITY_LOW")
    @js.native
    val TEXTURE_FILTERING_QUALITY_LOW: Double = js.native
    
    /** Medium quality for texture filtering */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_FILTERING_QUALITY_MEDIUM")
    @js.native
    val TEXTURE_FILTERING_QUALITY_MEDIUM: Double = js.native
    
    /** Offline (baking) quality for texture filtering */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_FILTERING_QUALITY_OFFLINE")
    @js.native
    val TEXTURE_FILTERING_QUALITY_OFFLINE: Double = js.native
    
    /** Equirectangular Fixed Mirrored coordinates mode */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_FIXED_EQUIRECTANGULAR_MIRRORED_MODE")
    @js.native
    val TEXTURE_FIXED_EQUIRECTANGULAR_MIRRORED_MODE: Double = js.native
    
    /** Equirectangular Fixed coordinates mode */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_FIXED_EQUIRECTANGULAR_MODE")
    @js.native
    val TEXTURE_FIXED_EQUIRECTANGULAR_MODE: Double = js.native
    
    /** Inverse Cubic coordinates mode */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_INVCUBIC_MODE")
    @js.native
    val TEXTURE_INVCUBIC_MODE: Double = js.native
    
    /** mag = linear and min = linear and mip = none */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_LINEAR_LINEAR")
    @js.native
    val TEXTURE_LINEAR_LINEAR: Double = js.native
    
    /** Trilinear is mag = linear and min = linear and mip = linear */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_LINEAR_LINEAR_MIPLINEAR")
    @js.native
    val TEXTURE_LINEAR_LINEAR_MIPLINEAR: Double = js.native
    
    /** Bilinear is mag = linear and min = linear and mip = nearest */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_LINEAR_LINEAR_MIPNEAREST")
    @js.native
    val TEXTURE_LINEAR_LINEAR_MIPNEAREST: Double = js.native
    
    /** mag = linear and min = nearest and mip = none */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_LINEAR_NEAREST")
    @js.native
    val TEXTURE_LINEAR_NEAREST: Double = js.native
    
    /** mag = linear and min = nearest and mip = linear */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_LINEAR_NEAREST_MIPLINEAR")
    @js.native
    val TEXTURE_LINEAR_NEAREST_MIPLINEAR: Double = js.native
    
    /** mag = linear and min = nearest and mip = nearest */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_LINEAR_NEAREST_MIPNEAREST")
    @js.native
    val TEXTURE_LINEAR_NEAREST_MIPNEAREST: Double = js.native
    
    /** Texture is repeating and mirrored */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_MIRROR_ADDRESSMODE")
    @js.native
    val TEXTURE_MIRROR_ADDRESSMODE: Double = js.native
    
    /** mag = nearest and min = linear and mip = none */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_NEAREST_LINEAR")
    @js.native
    val TEXTURE_NEAREST_LINEAR: Double = js.native
    
    /** mag = nearest and min = linear and mip = linear */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_NEAREST_LINEAR_MIPLINEAR")
    @js.native
    val TEXTURE_NEAREST_LINEAR_MIPLINEAR: Double = js.native
    
    /** mag = nearest and min = linear and mip = nearest */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_NEAREST_LINEAR_MIPNEAREST")
    @js.native
    val TEXTURE_NEAREST_LINEAR_MIPNEAREST: Double = js.native
    
    /** mag = nearest and min = nearest and mip = none */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_NEAREST_NEAREST")
    @js.native
    val TEXTURE_NEAREST_NEAREST: Double = js.native
    
    /** nearest is mag = nearest and min = nearest and mip = linear */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_NEAREST_NEAREST_MIPLINEAR")
    @js.native
    val TEXTURE_NEAREST_NEAREST_MIPLINEAR: Double = js.native
    
    /** mag = nearest and min = nearest and mip = nearest */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_NEAREST_NEAREST_MIPNEAREST")
    @js.native
    val TEXTURE_NEAREST_NEAREST_MIPNEAREST: Double = js.native
    
    /** nearest is mag = nearest and min = nearest and no mip */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_NEAREST_SAMPLINGMODE")
    @js.native
    val TEXTURE_NEAREST_SAMPLINGMODE: Double = js.native
    
    /** Planar coordinates mode */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_PLANAR_MODE")
    @js.native
    val TEXTURE_PLANAR_MODE: Double = js.native
    
    /** Projection coordinates mode */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_PROJECTION_MODE")
    @js.native
    val TEXTURE_PROJECTION_MODE: Double = js.native
    
    /** Skybox coordinates mode */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_SKYBOX_MODE")
    @js.native
    val TEXTURE_SKYBOX_MODE: Double = js.native
    
    /** Spherical coordinates mode */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_SPHERICAL_MODE")
    @js.native
    val TEXTURE_SPHERICAL_MODE: Double = js.native
    
    /** Trilinear is mag = linear and min = linear and mip = linear */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_TRILINEAR_SAMPLINGMODE")
    @js.native
    val TEXTURE_TRILINEAR_SAMPLINGMODE: Double = js.native
    
    /** Texture is repeating outside of 0..1 UVs */
    @JSImport("babylonjs/Engines/index", "Constants.TEXTURE_WRAP_ADDRESSMODE")
    @js.native
    val TEXTURE_WRAP_ADDRESSMODE: Double = js.native
  }
  
  @JSImport("babylonjs/Engines/index", "Engine")
  @js.native
  class Engine protected ()
    extends typings.babylonjs.engineMod.Engine {
    /**
      * Creates a new engine
      * @param canvasOrContext defines the canvas or WebGL context to use for rendering. If you provide a WebGL context, Babylon.js will not hook events on the canvas (like pointers, keyboards, etc...) so no event observables will be available. This is mostly used when Babylon.js is used as a plugin on a system which alreay used the WebGL context
      * @param antialias defines enable antialiasing (default: false)
      * @param options defines further options to be sent to the getContext() function
      * @param adaptToDeviceRatio defines whether to adapt to the device's viewport characteristics (default: false)
      */
    def this(canvasOrContext: Nullable[HTMLCanvasElement | WebGLRenderingContext]) = this()
    def this(canvasOrContext: Nullable[HTMLCanvasElement | WebGLRenderingContext], antialias: Boolean) = this()
    def this(
      canvasOrContext: Nullable[HTMLCanvasElement | WebGLRenderingContext],
      antialias: Boolean,
      options: EngineOptions
    ) = this()
    def this(
      canvasOrContext: Nullable[HTMLCanvasElement | WebGLRenderingContext],
      antialias: Unit,
      options: EngineOptions
    ) = this()
    def this(
      canvasOrContext: Nullable[HTMLCanvasElement | WebGLRenderingContext],
      antialias: Boolean,
      options: Unit,
      adaptToDeviceRatio: Boolean
    ) = this()
    def this(
      canvasOrContext: Nullable[HTMLCanvasElement | WebGLRenderingContext],
      antialias: Boolean,
      options: EngineOptions,
      adaptToDeviceRatio: Boolean
    ) = this()
    def this(
      canvasOrContext: Nullable[HTMLCanvasElement | WebGLRenderingContext],
      antialias: Unit,
      options: Unit,
      adaptToDeviceRatio: Boolean
    ) = this()
    def this(
      canvasOrContext: Nullable[HTMLCanvasElement | WebGLRenderingContext],
      antialias: Unit,
      options: EngineOptions,
      adaptToDeviceRatio: Boolean
    ) = this()
  }
  /* static members */
  object Engine {
    
    @JSImport("babylonjs/Engines/index", "Engine")
    @js.native
    val ^ : js.Any = js.native
    
    /** Defines that alpha blending to SRC ALPHA * SRC + DEST */
    @JSImport("babylonjs/Engines/index", "Engine.ALPHA_ADD")
    @js.native
    val ALPHA_ADD: Double = js.native
    
    /** Defines that alpha blending to SRC ALPHA * SRC + (1 - SRC ALPHA) * DEST */
    @JSImport("babylonjs/Engines/index", "Engine.ALPHA_COMBINE")
    @js.native
    val ALPHA_COMBINE: Double = js.native
    
    /** Defines that alpha blending is disabled */
    @JSImport("babylonjs/Engines/index", "Engine.ALPHA_DISABLE")
    @js.native
    val ALPHA_DISABLE: Double = js.native
    
    /** Defines that alpha blending to CST * SRC + (1 - CST) * DEST */
    @JSImport("babylonjs/Engines/index", "Engine.ALPHA_INTERPOLATE")
    @js.native
    val ALPHA_INTERPOLATE: Double = js.native
    
    /** Defines that alpha blending to SRC ALPHA * SRC + (1 - SRC) * DEST */
    @JSImport("babylonjs/Engines/index", "Engine.ALPHA_MAXIMIZED")
    @js.native
    val ALPHA_MAXIMIZED: Double = js.native
    
    /** Defines that alpha blending to SRC * DEST */
    @JSImport("babylonjs/Engines/index", "Engine.ALPHA_MULTIPLY")
    @js.native
    val ALPHA_MULTIPLY: Double = js.native
    
    /** Defines that alpha blending to SRC + DEST */
    @JSImport("babylonjs/Engines/index", "Engine.ALPHA_ONEONE")
    @js.native
    val ALPHA_ONEONE: Double = js.native
    
    /** Defines that alpha blending to SRC + (1 - SRC ALPHA) * DEST */
    @JSImport("babylonjs/Engines/index", "Engine.ALPHA_PREMULTIPLIED")
    @js.native
    val ALPHA_PREMULTIPLIED: Double = js.native
    
    /**
      * Defines that alpha blending to SRC + (1 - SRC ALPHA) * DEST
      * Alpha will be set to (1 - SRC ALPHA) * DEST ALPHA
      */
    @JSImport("babylonjs/Engines/index", "Engine.ALPHA_PREMULTIPLIED_PORTERDUFF")
    @js.native
    val ALPHA_PREMULTIPLIED_PORTERDUFF: Double = js.native
    
    /**
      * Defines that alpha blending to SRC + (1 - SRC) * DEST
      * Alpha will be set to SRC ALPHA + (1 - SRC ALPHA) * DEST ALPHA
      */
    @JSImport("babylonjs/Engines/index", "Engine.ALPHA_SCREENMODE")
    @js.native
    val ALPHA_SCREENMODE: Double = js.native
    
    /** Defines that alpha blending to DEST - SRC * DEST */
    @JSImport("babylonjs/Engines/index", "Engine.ALPHA_SUBTRACT")
    @js.native
    val ALPHA_SUBTRACT: Double = js.native
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will always pass. i.e. Pixels will be drawn in the order they are drawn */
    @JSImport("babylonjs/Engines/index", "Engine.ALWAYS")
    @js.native
    val ALWAYS: Double = js.native
    
    /**
      * Default AudioEngine factory responsible of creating the Audio Engine.
      * By default, this will create a BabylonJS Audio Engine if the workload has been embedded.
      */
    inline def AudioEngineFactory(hostElement: Nullable[HTMLElement]): IAudioEngine = ^.asInstanceOf[js.Dynamic].applyDynamic("AudioEngineFactory")(hostElement.asInstanceOf[js.Any]).asInstanceOf[IAudioEngine]
    
    /** Passed to stencilOperation to specify that stencil value must be decremented */
    @JSImport("babylonjs/Engines/index", "Engine.DECR")
    @js.native
    val DECR: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be decremented with wrapping */
    @JSImport("babylonjs/Engines/index", "Engine.DECR_WRAP")
    @js.native
    val DECR_WRAP: Double = js.native
    
    /** Defines that the ressource was successfully delay loaded */
    @JSImport("babylonjs/Engines/index", "Engine.DELAYLOADSTATE_LOADED")
    @js.native
    val DELAYLOADSTATE_LOADED: Double = js.native
    
    /** Defines that the ressource is currently delay loading */
    @JSImport("babylonjs/Engines/index", "Engine.DELAYLOADSTATE_LOADING")
    @js.native
    val DELAYLOADSTATE_LOADING: Double = js.native
    
    /** Defines that the ressource is not delayed*/
    @JSImport("babylonjs/Engines/index", "Engine.DELAYLOADSTATE_NONE")
    @js.native
    val DELAYLOADSTATE_NONE: Double = js.native
    
    /** Defines that the ressource is delayed and has not started loading */
    @JSImport("babylonjs/Engines/index", "Engine.DELAYLOADSTATE_NOTLOADED")
    @js.native
    val DELAYLOADSTATE_NOTLOADED: Double = js.native
    
    /**
      * Method called to create the default loading screen.
      * This can be overriden in your own app.
      * @param canvas The rendering canvas element
      * @returns The loading screen
      */
    inline def DefaultLoadingScreenFactory(canvas: HTMLCanvasElement): ILoadingScreen = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultLoadingScreenFactory")(canvas.asInstanceOf[js.Any]).asInstanceOf[ILoadingScreen]
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is equals to the stored value */
    @JSImport("babylonjs/Engines/index", "Engine.EQUAL")
    @js.native
    val EQUAL: Double = js.native
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than or equal to the stored value */
    @JSImport("babylonjs/Engines/index", "Engine.GEQUAL")
    @js.native
    val GEQUAL: Double = js.native
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than the stored value */
    @JSImport("babylonjs/Engines/index", "Engine.GREATER")
    @js.native
    val GREATER: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be incremented */
    @JSImport("babylonjs/Engines/index", "Engine.INCR")
    @js.native
    val INCR: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be incremented with wrapping */
    @JSImport("babylonjs/Engines/index", "Engine.INCR_WRAP")
    @js.native
    val INCR_WRAP: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be inverted */
    @JSImport("babylonjs/Engines/index", "Engine.INVERT")
    @js.native
    val INVERT: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be kept */
    @JSImport("babylonjs/Engines/index", "Engine.KEEP")
    @js.native
    val KEEP: Double = js.native
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than or equal to the stored value */
    @JSImport("babylonjs/Engines/index", "Engine.LEQUAL")
    @js.native
    val LEQUAL: Double = js.native
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than the stored value */
    @JSImport("babylonjs/Engines/index", "Engine.LESS")
    @js.native
    val LESS: Double = js.native
    
    /**
      * Will flag all materials in all scenes in all engines as dirty to trigger new shader compilation
      * @param flag defines which part of the materials must be marked as dirty
      * @param predicate defines a predicate used to filter which materials should be affected
      */
    inline def MarkAllMaterialsAsDirty(flag: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("MarkAllMaterialsAsDirty")(flag.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def MarkAllMaterialsAsDirty(flag: Double, predicate: js.Function1[/* mat */ Material, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("MarkAllMaterialsAsDirty")(flag.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will never pass. i.e. Nothing will be drawn */
    @JSImport("babylonjs/Engines/index", "Engine.NEVER")
    @js.native
    val NEVER: Double = js.native
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is not equal to the stored value */
    @JSImport("babylonjs/Engines/index", "Engine.NOTEQUAL")
    @js.native
    val NOTEQUAL: Double = js.native
    
    /**
      * Default offline support factory responsible of creating a tool used to store data locally.
      * By default, this will create a Database object if the workload has been embedded.
      */
    inline def OfflineProviderFactory(
      urlToScene: String,
      callbackManifestChecked: js.Function1[/* checked */ Boolean, js.Any],
      disableManifestCheck: Boolean
    ): IOfflineProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("OfflineProviderFactory")(urlToScene.asInstanceOf[js.Any], callbackManifestChecked.asInstanceOf[js.Any], disableManifestCheck.asInstanceOf[js.Any])).asInstanceOf[IOfflineProvider]
    
    /** Passed to stencilOperation to specify that stencil value must be replaced */
    @JSImport("babylonjs/Engines/index", "Engine.REPLACE")
    @js.native
    val REPLACE: Double = js.native
    
    /** Defines that texture rescaling will use a ceil to find the closer power of 2 size */
    @JSImport("babylonjs/Engines/index", "Engine.SCALEMODE_CEILING")
    @js.native
    val SCALEMODE_CEILING: Double = js.native
    
    /** Defines that texture rescaling will use a floor to find the closer power of 2 size */
    @JSImport("babylonjs/Engines/index", "Engine.SCALEMODE_FLOOR")
    @js.native
    val SCALEMODE_FLOOR: Double = js.native
    
    /** Defines that texture rescaling will look for the nearest power of 2 size */
    @JSImport("babylonjs/Engines/index", "Engine.SCALEMODE_NEAREST")
    @js.native
    val SCALEMODE_NEAREST: Double = js.native
    
    /** ALPHA */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_ALPHA")
    @js.native
    val TEXTUREFORMAT_ALPHA: Double = js.native
    
    /** LUMINANCE */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_LUMINANCE")
    @js.native
    val TEXTUREFORMAT_LUMINANCE: Double = js.native
    
    /** LUMINANCE_ALPHA */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_LUMINANCE_ALPHA")
    @js.native
    val TEXTUREFORMAT_LUMINANCE_ALPHA: Double = js.native
    
    /** RED (2nd reference) */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_R")
    @js.native
    val TEXTUREFORMAT_R: Double = js.native
    
    /** RED */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_RED")
    @js.native
    val TEXTUREFORMAT_RED: Double = js.native
    
    /** RED_INTEGER */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_RED_INTEGER")
    @js.native
    val TEXTUREFORMAT_RED_INTEGER: Double = js.native
    
    /** RG */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_RG")
    @js.native
    val TEXTUREFORMAT_RG: Double = js.native
    
    /** RGB */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_RGB")
    @js.native
    val TEXTUREFORMAT_RGB: Double = js.native
    
    /** RGBA */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_RGBA")
    @js.native
    val TEXTUREFORMAT_RGBA: Double = js.native
    
    /** RGBA_INTEGER */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_RGBA_INTEGER")
    @js.native
    val TEXTUREFORMAT_RGBA_INTEGER: Double = js.native
    
    /** RGB_INTEGER */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_RGB_INTEGER")
    @js.native
    val TEXTUREFORMAT_RGB_INTEGER: Double = js.native
    
    /** RG_INTEGER */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_RG_INTEGER")
    @js.native
    val TEXTUREFORMAT_RG_INTEGER: Double = js.native
    
    /** RED_INTEGER (2nd reference) */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTUREFORMAT_R_INTEGER")
    @js.native
    val TEXTUREFORMAT_R_INTEGER: Double = js.native
    
    /** BYTE */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_BYTE")
    @js.native
    val TEXTURETYPE_BYTE: Double = js.native
    
    /** FLOAT */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_FLOAT")
    @js.native
    val TEXTURETYPE_FLOAT: Double = js.native
    
    /** FLOAT_32_UNSIGNED_INT_24_8_REV */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_FLOAT_32_UNSIGNED_INT_24_8_REV")
    @js.native
    val TEXTURETYPE_FLOAT_32_UNSIGNED_INT_24_8_REV: Double = js.native
    
    /** HALF_FLOAT */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_HALF_FLOAT")
    @js.native
    val TEXTURETYPE_HALF_FLOAT: Double = js.native
    
    /** INT */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_INT")
    @js.native
    val TEXTURETYPE_INT: Double = js.native
    
    /** SHORT */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_SHORT")
    @js.native
    val TEXTURETYPE_SHORT: Double = js.native
    
    /** UNSIGNED_BYTE */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_BYTE")
    @js.native
    val TEXTURETYPE_UNSIGNED_BYTE: Double = js.native
    
    /** UNSIGNED_BYTE (2nd reference) */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_INT")
    @js.native
    val TEXTURETYPE_UNSIGNED_INT: Double = js.native
    
    /** UNSIGNED_INT */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_INTEGER")
    @js.native
    val TEXTURETYPE_UNSIGNED_INTEGER: Double = js.native
    
    /** UNSIGNED_INT_10F_11F_11F_REV */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_INT_10F_11F_11F_REV")
    @js.native
    val TEXTURETYPE_UNSIGNED_INT_10F_11F_11F_REV: Double = js.native
    
    /** UNSIGNED_INT_24_8 */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_INT_24_8")
    @js.native
    val TEXTURETYPE_UNSIGNED_INT_24_8: Double = js.native
    
    /** UNSIGNED_INT_2_10_10_10_REV */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_INT_2_10_10_10_REV")
    @js.native
    val TEXTURETYPE_UNSIGNED_INT_2_10_10_10_REV: Double = js.native
    
    /** UNSIGNED_INT_5_9_9_9_REV */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_INT_5_9_9_9_REV")
    @js.native
    val TEXTURETYPE_UNSIGNED_INT_5_9_9_9_REV: Double = js.native
    
    /** UNSIGNED_SHORT */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_SHORT")
    @js.native
    val TEXTURETYPE_UNSIGNED_SHORT: Double = js.native
    
    /** UNSIGNED_SHORT_4_4_4_4 */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_SHORT_4_4_4_4")
    @js.native
    val TEXTURETYPE_UNSIGNED_SHORT_4_4_4_4: Double = js.native
    
    /** UNSIGNED_SHORT_5_5_5_1 */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_SHORT_5_5_5_1")
    @js.native
    val TEXTURETYPE_UNSIGNED_SHORT_5_5_5_1: Double = js.native
    
    /** UNSIGNED_SHORT_5_6_5 */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURETYPE_UNSIGNED_SHORT_5_6_5")
    @js.native
    val TEXTURETYPE_UNSIGNED_SHORT_5_6_5: Double = js.native
    
    /** Bilinear is mag = linear and min = linear and mip = nearest */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_BILINEAR_SAMPLINGMODE")
    @js.native
    val TEXTURE_BILINEAR_SAMPLINGMODE: Double = js.native
    
    /** Texture is not repeating outside of 0..1 UVs */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_CLAMP_ADDRESSMODE")
    @js.native
    val TEXTURE_CLAMP_ADDRESSMODE: Double = js.native
    
    /** Cubic coordinates mode */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_CUBIC_MODE")
    @js.native
    val TEXTURE_CUBIC_MODE: Double = js.native
    
    /** Equirectangular coordinates mode */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_EQUIRECTANGULAR_MODE")
    @js.native
    val TEXTURE_EQUIRECTANGULAR_MODE: Double = js.native
    
    /** Explicit coordinates mode */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_EXPLICIT_MODE")
    @js.native
    val TEXTURE_EXPLICIT_MODE: Double = js.native
    
    /** Equirectangular Fixed Mirrored coordinates mode */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_FIXED_EQUIRECTANGULAR_MIRRORED_MODE")
    @js.native
    val TEXTURE_FIXED_EQUIRECTANGULAR_MIRRORED_MODE: Double = js.native
    
    /** Equirectangular Fixed coordinates mode */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_FIXED_EQUIRECTANGULAR_MODE")
    @js.native
    val TEXTURE_FIXED_EQUIRECTANGULAR_MODE: Double = js.native
    
    /** Inverse Cubic coordinates mode */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_INVCUBIC_MODE")
    @js.native
    val TEXTURE_INVCUBIC_MODE: Double = js.native
    
    /** mag = linear and min = linear and mip = none */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_LINEAR_LINEAR")
    @js.native
    val TEXTURE_LINEAR_LINEAR: Double = js.native
    
    /** Trilinear is mag = linear and min = linear and mip = linear */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_LINEAR_LINEAR_MIPLINEAR")
    @js.native
    val TEXTURE_LINEAR_LINEAR_MIPLINEAR: Double = js.native
    
    /** Bilinear is mag = linear and min = linear and mip = nearest */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_LINEAR_LINEAR_MIPNEAREST")
    @js.native
    val TEXTURE_LINEAR_LINEAR_MIPNEAREST: Double = js.native
    
    /** mag = linear and min = nearest and mip = none */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_LINEAR_NEAREST")
    @js.native
    val TEXTURE_LINEAR_NEAREST: Double = js.native
    
    /** mag = linear and min = nearest and mip = linear */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_LINEAR_NEAREST_MIPLINEAR")
    @js.native
    val TEXTURE_LINEAR_NEAREST_MIPLINEAR: Double = js.native
    
    /** mag = linear and min = nearest and mip = nearest */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_LINEAR_NEAREST_MIPNEAREST")
    @js.native
    val TEXTURE_LINEAR_NEAREST_MIPNEAREST: Double = js.native
    
    /** Texture is repeating and mirrored */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_MIRROR_ADDRESSMODE")
    @js.native
    val TEXTURE_MIRROR_ADDRESSMODE: Double = js.native
    
    /** mag = nearest and min = linear and mip = none */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_NEAREST_LINEAR")
    @js.native
    val TEXTURE_NEAREST_LINEAR: Double = js.native
    
    /** mag = nearest and min = linear and mip = linear */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_NEAREST_LINEAR_MIPLINEAR")
    @js.native
    val TEXTURE_NEAREST_LINEAR_MIPLINEAR: Double = js.native
    
    /** mag = nearest and min = linear and mip = nearest */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_NEAREST_LINEAR_MIPNEAREST")
    @js.native
    val TEXTURE_NEAREST_LINEAR_MIPNEAREST: Double = js.native
    
    /** mag = nearest and min = nearest and mip = none */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_NEAREST_NEAREST")
    @js.native
    val TEXTURE_NEAREST_NEAREST: Double = js.native
    
    /** nearest is mag = nearest and min = nearest and mip = linear */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_NEAREST_NEAREST_MIPLINEAR")
    @js.native
    val TEXTURE_NEAREST_NEAREST_MIPLINEAR: Double = js.native
    
    /** mag = nearest and min = nearest and mip = nearest */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_NEAREST_NEAREST_MIPNEAREST")
    @js.native
    val TEXTURE_NEAREST_NEAREST_MIPNEAREST: Double = js.native
    
    /** nearest is mag = nearest and min = nearest and mip = linear */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_NEAREST_SAMPLINGMODE")
    @js.native
    val TEXTURE_NEAREST_SAMPLINGMODE: Double = js.native
    
    /** Planar coordinates mode */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_PLANAR_MODE")
    @js.native
    val TEXTURE_PLANAR_MODE: Double = js.native
    
    /** Projection coordinates mode */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_PROJECTION_MODE")
    @js.native
    val TEXTURE_PROJECTION_MODE: Double = js.native
    
    /** Skybox coordinates mode */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_SKYBOX_MODE")
    @js.native
    val TEXTURE_SKYBOX_MODE: Double = js.native
    
    /** Spherical coordinates mode */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_SPHERICAL_MODE")
    @js.native
    val TEXTURE_SPHERICAL_MODE: Double = js.native
    
    /** Trilinear is mag = linear and min = linear and mip = linear */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_TRILINEAR_SAMPLINGMODE")
    @js.native
    val TEXTURE_TRILINEAR_SAMPLINGMODE: Double = js.native
    
    /** Texture is repeating outside of 0..1 UVs */
    @JSImport("babylonjs/Engines/index", "Engine.TEXTURE_WRAP_ADDRESSMODE")
    @js.native
    val TEXTURE_WRAP_ADDRESSMODE: Double = js.native
    
    /**
      * Asks the browser to exit fullscreen mode
      */
    inline def _ExitFullscreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_ExitFullscreen")().asInstanceOf[Unit]
    
    /**
      * Asks the browser to exit pointerlock mode
      */
    inline def _ExitPointerlock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_ExitPointerlock")().asInstanceOf[Unit]
    
    /**
      * Ask the browser to promote the current element to fullscreen rendering mode
      * @param element defines the DOM element to promote
      */
    inline def _RequestFullscreen(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_RequestFullscreen")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Pointerlock and fullscreen */
    /**
      * Ask the browser to promote the current element to pointerlock mode
      * @param element defines the DOM element to promote
      */
    inline def _RequestPointerlock(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_RequestPointerlock")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Method called to create the default rescale post process on each engine.
      */
    @JSImport("babylonjs/Engines/index", "Engine._RescalePostProcessFactory")
    @js.native
    def _RescalePostProcessFactory: Nullable[js.Function1[/* engine */ this.type, PostProcess]] = js.native
    inline def _RescalePostProcessFactory_=(x: Nullable[js.Function1[/* engine */ this.type, PostProcess]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RescalePostProcessFactory")(x.asInstanceOf[js.Any])
    
    /**
      * Gets the audio engine
      * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
      * @ignorenaming
      */
    @JSImport("babylonjs/Engines/index", "Engine.audioEngine")
    @js.native
    def audioEngine: IAudioEngine = js.native
    inline def audioEngine_=(x: IAudioEngine): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("audioEngine")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Engines/index", "EngineStore")
  @js.native
  class EngineStore ()
    extends typings.babylonjs.engineStoreMod.EngineStore
  /* static members */
  object EngineStore {
    
    @JSImport("babylonjs/Engines/index", "EngineStore")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Texture content used if a texture cannot loaded
      * @ignorenaming
      */
    @JSImport("babylonjs/Engines/index", "EngineStore.FallbackTexture")
    @js.native
    def FallbackTexture: String = js.native
    inline def FallbackTexture_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FallbackTexture")(x.asInstanceOf[js.Any])
    
    /** Gets the list of created engines */
    @JSImport("babylonjs/Engines/index", "EngineStore.Instances")
    @js.native
    def Instances: js.Array[typings.babylonjs.engineMod.Engine] = js.native
    inline def Instances_=(x: js.Array[typings.babylonjs.engineMod.Engine]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Instances")(x.asInstanceOf[js.Any])
    
    /**
      * Gets or sets a global variable indicating if fallback texture must be used when a texture cannot be loaded
      * @ignorenaming
      */
    @JSImport("babylonjs/Engines/index", "EngineStore.UseFallbackTexture")
    @js.native
    def UseFallbackTexture: Boolean = js.native
    inline def UseFallbackTexture_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UseFallbackTexture")(x.asInstanceOf[js.Any])
    
    /** @hidden */
    @JSImport("babylonjs/Engines/index", "EngineStore._LastCreatedScene")
    @js.native
    def _LastCreatedScene: Nullable[Scene] = js.native
    inline def _LastCreatedScene_=(x: Nullable[Scene]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LastCreatedScene")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Engines/index", "EngineView")
  @js.native
  class EngineView ()
    extends typings.babylonjs.extensionsIndexMod.EngineView
  
  @JSImport("babylonjs/Engines/index", "NativeEngine")
  @js.native
  class NativeEngine ()
    extends typings.babylonjs.nativeEngineMod.NativeEngine
  
  @JSImport("babylonjs/Engines/index", "NullEngine")
  @js.native
  class NullEngine ()
    extends typings.babylonjs.nullEngineMod.NullEngine {
    def this(options: typings.babylonjs.nullEngineMod.NullEngineOptions) = this()
  }
  
  @JSImport("babylonjs/Engines/index", "NullEngineOptions")
  @js.native
  class NullEngineOptions ()
    extends typings.babylonjs.nullEngineMod.NullEngineOptions
  
  @JSImport("babylonjs/Engines/index", "_OcclusionDataStorage")
  @js.native
  class OcclusionDataStorage ()
    extends typings.babylonjs.extensionsIndexMod.OcclusionDataStorage
  
  @JSImport("babylonjs/Engines/index", "PerformanceConfigurator")
  @js.native
  class PerformanceConfigurator ()
    extends typings.babylonjs.performanceConfiguratorMod.PerformanceConfigurator
  /* static members */
  object PerformanceConfigurator {
    
    @JSImport("babylonjs/Engines/index", "PerformanceConfigurator")
    @js.native
    val ^ : js.Any = js.native
    
    /** @hidden */
    @JSImport("babylonjs/Engines/index", "PerformanceConfigurator.MatrixCurrentType")
    @js.native
    def MatrixCurrentType: js.Any = js.native
    inline def MatrixCurrentType_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MatrixCurrentType")(x.asInstanceOf[js.Any])
    
    /** @hidden */
    @JSImport("babylonjs/Engines/index", "PerformanceConfigurator.MatrixTrackPrecisionChange")
    @js.native
    def MatrixTrackPrecisionChange: Boolean = js.native
    inline def MatrixTrackPrecisionChange_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MatrixTrackPrecisionChange")(x.asInstanceOf[js.Any])
    
    /** @hidden */
    @JSImport("babylonjs/Engines/index", "PerformanceConfigurator.MatrixTrackedMatrices")
    @js.native
    def MatrixTrackedMatrices: js.Array[js.Any] | Null = js.native
    inline def MatrixTrackedMatrices_=(x: js.Array[js.Any] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MatrixTrackedMatrices")(x.asInstanceOf[js.Any])
    
    /** @hidden */
    @JSImport("babylonjs/Engines/index", "PerformanceConfigurator.MatrixUse64Bits")
    @js.native
    def MatrixUse64Bits: Boolean = js.native
    inline def MatrixUse64Bits_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MatrixUse64Bits")(x.asInstanceOf[js.Any])
    
    /** @hidden */
    inline def SetMatrixPrecision(use64bits: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("SetMatrixPrecision")(use64bits.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("babylonjs/Engines/index", "ShaderCodeInliner")
  @js.native
  class ShaderCodeInliner protected ()
    extends typings.babylonjs.shaderCodeInlinerMod.ShaderCodeInliner {
    /**
      * Initializes the inliner
      * @param sourceCode shader code source to inline
      * @param numMaxIterations maximum number of iterations (used to detect recursive calls)
      */
    def this(sourceCode: String) = this()
    def this(sourceCode: String, numMaxIterations: Double) = this()
  }
  /* static members */
  object ShaderCodeInliner {
    
    @JSImport("babylonjs/Engines/index", "ShaderCodeInliner._RegexpFindFunctionNameAndType")
    @js.native
    val _RegexpFindFunctionNameAndType: js.Any = js.native
  }
  
  @JSImport("babylonjs/Engines/index", "ThinEngine")
  @js.native
  class ThinEngine protected ()
    extends typings.babylonjs.thinEngineMod.ThinEngine {
    /**
      * Creates a new engine
      * @param canvasOrContext defines the canvas or WebGL context to use for rendering. If you provide a WebGL context, Babylon.js will not hook events on the canvas (like pointers, keyboards, etc...) so no event observables will be available. This is mostly used when Babylon.js is used as a plugin on a system which alreay used the WebGL context
      * @param antialias defines enable antialiasing (default: false)
      * @param options defines further options to be sent to the getContext() function
      * @param adaptToDeviceRatio defines whether to adapt to the device's viewport characteristics (default: false)
      */
    def this(canvasOrContext: Nullable[
            HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
          ]) = this()
    def this(
      canvasOrContext: Nullable[
            HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
          ],
      antialias: Boolean
    ) = this()
    def this(
      canvasOrContext: Nullable[
            HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
          ],
      antialias: Boolean,
      options: EngineOptions
    ) = this()
    def this(
      canvasOrContext: Nullable[
            HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
          ],
      antialias: Unit,
      options: EngineOptions
    ) = this()
    def this(
      canvasOrContext: Nullable[
            HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
          ],
      antialias: Boolean,
      options: Unit,
      adaptToDeviceRatio: Boolean
    ) = this()
    def this(
      canvasOrContext: Nullable[
            HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
          ],
      antialias: Boolean,
      options: EngineOptions,
      adaptToDeviceRatio: Boolean
    ) = this()
    def this(
      canvasOrContext: Nullable[
            HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
          ],
      antialias: Unit,
      options: Unit,
      adaptToDeviceRatio: Boolean
    ) = this()
    def this(
      canvasOrContext: Nullable[
            HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
          ],
      antialias: Unit,
      options: EngineOptions,
      adaptToDeviceRatio: Boolean
    ) = this()
  }
  /* static members */
  object ThinEngine {
    
    @JSImport("babylonjs/Engines/index", "ThinEngine")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Find the next highest power of two.
      * @param x Number to start search from.
      * @return Next highest power of two.
      */
    inline def CeilingPOT(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("CeilingPOT")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Gets or sets the epsilon value used by collision engine
      */
    @JSImport("babylonjs/Engines/index", "ThinEngine.CollisionsEpsilon")
    @js.native
    def CollisionsEpsilon: Double = js.native
    inline def CollisionsEpsilon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CollisionsEpsilon")(x.asInstanceOf[js.Any])
    
    /** Use this array to turn off some WebGL2 features on known buggy browsers version */
    @JSImport("babylonjs/Engines/index", "ThinEngine.ExceptionList")
    @js.native
    def ExceptionList: js.Array[Capture | CaptureConstraint] = js.native
    inline def ExceptionList_=(x: js.Array[Capture | CaptureConstraint]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExceptionList")(x.asInstanceOf[js.Any])
    
    /**
      * Find the next lowest power of two.
      * @param x Number to start search from.
      * @return Next lowest power of two.
      */
    inline def FloorPOT(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("FloorPOT")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Get the closest exponent of two
      * @param value defines the value to approximate
      * @param max defines the maximum value to return
      * @param mode defines how to define the closest value
      * @returns closest exponent of two of the given value
      */
    inline def GetExponentOfTwo(value: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetExponentOfTwo")(value.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def GetExponentOfTwo(value: Double, max: Double, mode: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetExponentOfTwo")(value.asInstanceOf[js.Any], max.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Find the nearest power of two.
      * @param x Number to start search from.
      * @return Next nearest power of two.
      */
    inline def NearestPOT(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("NearestPOT")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Queue a new function into the requested animation frame pool (ie. this function will be executed byt the browser for the next frame)
      * @param func - the function to be called
      * @param requester - the object that will request the next frame. Falls back to window.
      * @returns frame number
      */
    inline def QueueNewFrame(func: js.Function0[Unit]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("QueueNewFrame")(func.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def QueueNewFrame(func: js.Function0[Unit], requester: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("QueueNewFrame")(func.asInstanceOf[js.Any], requester.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def _ConcatenateShader(source: String, defines: Nullable[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_ConcatenateShader")(source.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def _ConcatenateShader(source: String, defines: Nullable[String], shaderVersion: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_ConcatenateShader")(source.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], shaderVersion.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Loads a file from a url
      * @param url url to load
      * @param onSuccess callback called when the file successfully loads
      * @param onProgress callback called while file is loading (if the server supports this mode)
      * @param offlineProvider defines the offline provider for caching
      * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
      * @param onError callback called when the file fails to load
      * @returns a file request object
      * @hidden
      */
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: Unit,
      useArrayBuffer: Boolean
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: Unit,
      useArrayBuffer: Boolean,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: Unit,
      useArrayBuffer: Unit,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Unit,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: Unit,
      offlineProvider: Unit,
      useArrayBuffer: Boolean
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: Unit,
      offlineProvider: Unit,
      useArrayBuffer: Boolean,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: Unit,
      offlineProvider: Unit,
      useArrayBuffer: Unit,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: Unit,
      offlineProvider: IOfflineProvider
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: Unit,
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: Unit,
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
      onProgress: Unit,
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Unit,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    
    /**
      * Loads an image as an HTMLImageElement.
      * @param input url string, ArrayBuffer, or Blob to load
      * @param onLoad callback called when the image successfully loads
      * @param onError callback called when the image fails to load
      * @param offlineProvider offline provider for caching
      * @param mimeType optional mime type
      * @returns the HTMLImageElement of the loaded image
      * @hidden
      */
    inline def _FileToolsLoadImage(
      input: String,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
      offlineProvider: Nullable[IOfflineProvider]
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: String,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: ArrayBufferView,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
      offlineProvider: Nullable[IOfflineProvider]
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: ArrayBufferView,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: ArrayBuffer,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
      offlineProvider: Nullable[IOfflineProvider]
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: ArrayBuffer,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: Blob,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
      offlineProvider: Nullable[IOfflineProvider]
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: Blob,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    
    @JSImport("babylonjs/Engines/index", "ThinEngine._HasMajorPerformanceCaveat")
    @js.native
    def _HasMajorPerformanceCaveat: js.Any = js.native
    inline def _HasMajorPerformanceCaveat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_HasMajorPerformanceCaveat")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/index", "ThinEngine._IsSupported")
    @js.native
    def _IsSupported: js.Any = js.native
    inline def _IsSupported_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsSupported")(x.asInstanceOf[js.Any])
    
    /** @hidden */
    @JSImport("babylonjs/Engines/index", "ThinEngine._TextureLoaders")
    @js.native
    def _TextureLoaders: js.Array[IInternalTextureLoader] = js.native
    inline def _TextureLoaders_=(x: js.Array[IInternalTextureLoader]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TextureLoaders")(x.asInstanceOf[js.Any])
    
    /**
      * Gets a boolean indicating if the engine can be instanciated (ie. if a webGL context can be found)
      * @returns true if the engine can be created
      * @ignorenaming
      */
    inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  }
  
  @JSImport("babylonjs/Engines/index", "WebGL2ShaderProcessor")
  @js.native
  class WebGL2ShaderProcessor ()
    extends typings.babylonjs.webGL2ShaderProcessorsMod.WebGL2ShaderProcessor
  
  @JSImport("babylonjs/Engines/index", "WebGLPipelineContext")
  @js.native
  class WebGLPipelineContext ()
    extends typings.babylonjs.webGLPipelineContextMod.WebGLPipelineContext
  
  @JSImport("babylonjs/Engines/index", "_forceTransformFeedbackToBundle")
  @js.native
  def forceTransformFeedbackToBundle: Boolean = js.native
  
  inline def forceTransformFeedbackToBundle_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_forceTransformFeedbackToBundle")(x.asInstanceOf[js.Any])
  
  /* augmented module */
  object babylonjsCamerasCameraAugmentingMod {
    
    trait Camera extends StObject {
      
      /**
        * @hidden
        * For cameras that cannot use multiview images to display directly. (e.g. webVR camera will render to multiview texture, then copy to each eye texture and go from there)
        */
      var _multiviewTexture: Nullable[RenderTargetTexture]
      
      /**
        * @hidden
        * ensures the multiview texture of the camera exists and has the specified width/height
        * @param width height to set on the multiview texture
        * @param height width to set on the multiview texture
        */
      def _resizeOrCreateMultiviewTexture(width: Double, height: Double): Unit
      
      /**
        * @hidden
        * For cameras that cannot use multiview images to display directly. (e.g. webVR camera will render to multiview texture, then copy to each eye texture and go from there)
        */
      var _useMultiviewToSingleView: Boolean
    }
    object Camera {
      
      inline def apply(_resizeOrCreateMultiviewTexture: (Double, Double) => Unit, _useMultiviewToSingleView: Boolean): Camera = {
        val __obj = js.Dynamic.literal(_resizeOrCreateMultiviewTexture = js.Any.fromFunction2(_resizeOrCreateMultiviewTexture), _useMultiviewToSingleView = _useMultiviewToSingleView.asInstanceOf[js.Any], _multiviewTexture = null)
        __obj.asInstanceOf[Camera]
      }
      
      extension [Self <: Camera](x: Self) {
        
        inline def set_multiviewTexture(value: Nullable[RenderTargetTexture]): Self = StObject.set(x, "_multiviewTexture", value.asInstanceOf[js.Any])
        
        inline def set_multiviewTextureNull: Self = StObject.set(x, "_multiviewTexture", null)
        
        inline def set_resizeOrCreateMultiviewTexture(value: (Double, Double) => Unit): Self = StObject.set(x, "_resizeOrCreateMultiviewTexture", js.Any.fromFunction2(value))
        
        inline def set_useMultiviewToSingleView(value: Boolean): Self = StObject.set(x, "_useMultiviewToSingleView", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object babylonjsEnginesEngineAugmentingMod {
    
    @js.native
    trait Engine extends StObject {
      
      /** @hidden */
      def _createTimeQuery(): WebGLQuery = js.native
      
      /** @hidden */
      var _currentNonTimestampToken: Nullable[TimeToken] = js.native
      
      /** @hidden */
      def _deleteTimeQuery(query: WebGLQuery): Unit = js.native
      
      /** @hidden */
      var _excludedCompressedTextures: js.Array[String] = js.native
      
      /** @hidden */
      def _getGlAlgorithmType(algorithmType: Double): Double = js.native
      
      /** @hidden */
      def _getTimeQueryAvailability(query: WebGLQuery): js.Any = js.native
      
      /** @hidden */
      def _getTimeQueryResult(query: WebGLQuery): js.Any = js.native
      
      /** @hidden */
      def _getVRDisplaysAsync(): js.Promise[IDisplayChangedEventArgs] = js.native
      
      /** @hidden */
      var _oldHardwareScaleFactor: Double = js.native
      
      /** @hidden */
      var _oldSize: Size = js.native
      
      /** @hidden */
      def _onVRDisplayPointerRestricted(): Unit = js.native
      
      /** @hidden */
      def _onVRDisplayPointerUnrestricted(): Unit = js.native
      
      /** @hidden */
      def _onVRFullScreenTriggered(): Unit = js.native
      
      /** @hidden */
      var _onVrDisplayConnect: Nullable[js.Function1[/* display */ js.Any, Unit]] = js.native
      
      /** @hidden */
      var _onVrDisplayDisconnect: Nullable[js.Function0[Unit]] = js.native
      
      /** @hidden */
      var _onVrDisplayPresentChange: Nullable[js.Function0[Unit]] = js.native
      
      /** @hidden */
      var _textureFormatInUse: String = js.native
      
      /** @hidden */
      var _vrDisplay: js.Any = js.native
      
      /** @hidden */
      var _vrExclusivePointerMode: Boolean = js.native
      
      /** @hidden */
      var _vrSupported: Boolean = js.native
      
      /** @hidden */
      var _webVRInitPromise: js.Promise[IDisplayChangedEventArgs] = js.native
      
      /**
        * Gets the current engine view
        * @see https://doc.babylonjs.com/how_to/multi_canvases
        */
      var activeView: Nullable[typings.babylonjs.engineViewsMod.EngineView] = js.native
      
      /**
        * Initiates an occlusion query
        * @param algorithmType defines the algorithm to use
        * @param query defines the query to use
        * @returns the current engine
        * @see https://doc.babylonjs.com/features/occlusionquery
        */
      def beginOcclusionQuery(algorithmType: Double, query: WebGLQuery): typings.babylonjs.engineOcclusionQueryMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
      
      /**
        * Begins a transform feedback operation
        * @param usePoints defines if points or triangles must be used
        */
      def beginTransformFeedback(usePoints: Boolean): Unit = js.native
      
      /**
        * Binds a multiview framebuffer to be drawn to
        * @param multiviewTexture texture to bind
        */
      def bindMultiviewFramebuffer(multiviewTexture: InternalTexture): Unit = js.native
      
      /**
        * Bind a webGL transform feedback object to the webgl context
        * @param value defines the webGL transform feedback object to bind
        */
      def bindTransformFeedback(value: Nullable[WebGLTransformFeedback]): Unit = js.native
      
      /**
        * Bind a webGL buffer for a transform feedback operation
        * @param value defines the webGL buffer to bind
        */
      def bindTransformFeedbackBuffer(value: Nullable[DataBuffer]): Unit = js.native
      
      /**
        * Creates a new multiview render target
        * @param width defines the width of the texture
        * @param height defines the height of the texture
        * @returns the created multiview texture
        */
      def createMultiviewRenderTargetTexture(width: Double, height: Double): InternalTexture = js.native
      
      /**
        * Create a new webGL query (you must be sure that queries are supported by checking getCaps() function)
        * @return the new query
        */
      def createQuery(): WebGLQuery = js.native
      
      /**
        * Creates a webGL transform feedback object
        * Please makes sure to check webGLVersion property to check if you are running webGL 2+
        * @returns the webGL transform feedback object
        */
      def createTransformFeedback(): WebGLTransformFeedback = js.native
      
      /**
        * Delete and release a webGL query
        * @param query defines the query to delete
        * @return the current engine
        */
      def deleteQuery(query: WebGLQuery): typings.babylonjs.engineOcclusionQueryMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
      
      /**
        * Delete a webGL transform feedback object
        * @param value defines the webGL transform feedback object to delete
        */
      def deleteTransformFeedback(value: WebGLTransformFeedback): Unit = js.native
      
      /**
        * Call this function to switch to webVR mode
        * Will do nothing if webVR is not supported or if there is no webVR device
        * @param options the webvr options provided to the camera. mainly used for multiview
        * @see https://doc.babylonjs.com/how_to/webvr_camera
        */
      def enableVR(options: WebVROptions): Unit = js.native
      
      /**
        * Ends an occlusion query
        * @see https://doc.babylonjs.com/features/occlusionquery
        * @param algorithmType defines the algorithm to use
        * @returns the current engine
        */
      def endOcclusionQuery(algorithmType: Double): typings.babylonjs.engineOcclusionQueryMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
      
      /**
        * Ends a time query
        * @param token defines the token used to measure the time span
        * @returns the time spent (in ns)
        */
      def endTimeQuery(token: TimeToken): int = js.native
      
      /**
        * Ends a transform feedback operation
        */
      def endTransformFeedback(): Unit = js.native
      
      /**
        * Gets the value of a given query
        * @param query defines the query to check
        * @returns the value of the query
        */
      def getQueryResult(query: WebGLQuery): Double = js.native
      
      /**
        * Gets the current webVR device
        * @returns the current webVR device (or null)
        */
      def getVRDevice(): js.Any = js.native
      
      /**
        * Initializes a webVR display and starts listening to display change events
        * The onVRDisplayChangedObservable will be notified upon these changes
        * @returns A promise containing a VRDisplay and if vr is supported
        */
      def initWebVRAsync(): js.Promise[IDisplayChangedEventArgs] = js.native
      
      /**
        * Gets or sets the  HTML element to use for attaching events
        */
      var inputElement: Nullable[HTMLElement] = js.native
      
      /**
        * Gets a boolean indicating that the engine is currently in VR exclusive mode for the pointers
        * @see https://docs.microsoft.com/en-us/microsoft-edge/webvr/essentials#mouse-input
        */
      var isInVRExclusivePointerMode: Boolean = js.native
      
      /**
        * Check if a given query has resolved and got its value
        * @param query defines the query to check
        * @returns true if the query got its value
        */
      def isQueryResultAvailable(query: WebGLQuery): Boolean = js.native
      
      /**
        * Gets a boolean indicating if a webVR device was detected
        * @returns true if a webVR device was detected
        */
      def isVRDevicePresent(): Boolean = js.native
      
      /**
        * Observable signaled when VR display mode changes
        */
      var onVRDisplayChangedObservable: Observable[IDisplayChangedEventArgs] = js.native
      
      /**
        * Observable signaled when VR request present is complete
        */
      var onVRRequestPresentComplete: Observable[Boolean] = js.native
      
      /**
        * Observable signaled when VR request present starts
        */
      var onVRRequestPresentStart: Observable[typings.babylonjs.engineWebVRMod.babylonjsEnginesEngineAugmentingMod.Engine] = js.native
      
      /**
        * Register a new child canvas
        * @param canvas defines the canvas to register
        * @param camera defines an optional camera to use with this canvas (it will overwrite the scene.camera for this view)
        * @returns the associated view
        */
      def registerView(canvas: HTMLCanvasElement): typings.babylonjs.engineViewsMod.EngineView = js.native
      def registerView(canvas: HTMLCanvasElement, camera: Camera): typings.babylonjs.engineViewsMod.EngineView = js.native
      
      /**
        * Set the compressed texture extensions or file names to skip.
        *
        * @param skippedFiles defines the list of those texture files you want to skip
        * Example: [".dds", ".env", "myfile.png"]
        */
      def setCompressedTextureExclusions(skippedFiles: js.Array[String]): Unit = js.native
      
      /**
        * Set the compressed texture format to use, based on the formats you have, and the formats
        * supported by the hardware / browser.
        *
        * Khronos Texture Container (.ktx) files are used to support this.  This format has the
        * advantage of being specifically designed for OpenGL.  Header elements directly correspond
        * to API arguments needed to compressed textures.  This puts the burden on the container
        * generator to house the arcane code for determining these for current & future formats.
        *
        * for description see https://www.khronos.org/opengles/sdk/tools/KTX/
        * for file layout see https://www.khronos.org/opengles/sdk/tools/KTX/file_format_spec/
        *
        * Note: The result of this call is not taken into account when a texture is base64.
        *
        * @param formatsAvailable defines the list of those format families you have created
        * on your server.  Syntax: '-' + format family + '.ktx'.  (Case and order do not matter.)
        *
        * Current families are astc, dxt, pvrtc, etc2, & etc1.
        * @returns The extension selected.
        */
      def setTextureFormatToUse(formatsAvailable: js.Array[String]): Nullable[String] = js.native
      
      /**
        * Specify the varyings to use with transform feedback
        * @param program defines the associated webGL program
        * @param value defines the list of strings representing the varying names
        */
      def setTranformFeedbackVaryings(program: WebGLProgram, value: js.Array[String]): Unit = js.native
      
      /**
        * Starts a time query (used to measure time spent by the GPU on a specific frame)
        * Please note that only one query can be issued at a time
        * @returns a time token used to track the time span
        */
      def startTimeQuery(): Nullable[TimeToken] = js.native
      
      /**
        * Gets the texture format in use
        */
      val textureFormatInUse: Nullable[String] = js.native
      
      /**
        * Gets the list of texture formats supported
        */
      val texturesSupported: js.Array[String] = js.native
      
      /**
        * Remove a registered child canvas
        * @param canvas defines the canvas to remove
        * @returns the current engine
        */
      def unRegisterView(canvas: HTMLCanvasElement): typings.babylonjs.engineViewsMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
      
      /** Gets or sets the list of views */
      var views: js.Array[typings.babylonjs.engineViewsMod.EngineView] = js.native
      
      /**
        * Gets or sets the presentation attributes used to configure VR rendering
        */
      var vrPresentationAttributes: js.UndefOr[IVRPresentationAttributes] = js.native
    }
  }
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    @js.native
    trait ThinEngine extends StObject {
      
      /** @hidden */
      def _cascadeLoadFiles(
        scene: Nullable[Scene],
        onfinish: js.Function1[/* images */ js.Array[ArrayBuffer], Unit],
        files: js.Array[String],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
            ]
      ): Unit = js.native
      
      /** @hidden */
      def _cascadeLoadImgs(
        scene: Nullable[Scene],
        onfinish: js.Function1[/* images */ js.Array[HTMLImageElement], Unit],
        files: js.Array[String],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
            ]
      ): Unit = js.native
      def _cascadeLoadImgs(
        scene: Nullable[Scene],
        onfinish: js.Function1[/* images */ js.Array[HTMLImageElement], Unit],
        files: js.Array[String],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
            ],
        mimeType: String
      ): Unit = js.native
      
      /**
        * Creates a depth stencil cube texture.
        * This is only available in WebGL 2.
        * @param size The size of face edge in the cube texture.
        * @param options The options defining the cube texture.
        * @returns The cube texture
        */
      def _createDepthStencilCubeTexture(size: Double, options: DepthTextureCreationOptions): InternalTexture = js.native
      
      /** @hidden */
      def _createDepthStencilTexture(size: RenderTargetTextureSize, options: DepthTextureCreationOptions): InternalTexture = js.native
      
      /** @hidden */
      def _partialLoadFile(
        url: String,
        index: Double,
        loadedFiles: js.Array[ArrayBuffer],
        onfinish: js.Function1[/* files */ js.Array[ArrayBuffer], Unit],
        onErrorCallBack: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
            ]
      ): Unit = js.native
      
      /** @hidden */
      def _partialLoadImg(
        url: String,
        index: Double,
        loadedImages: js.Array[HTMLImageElement],
        scene: Nullable[Scene],
        onfinish: js.Function1[/* images */ js.Array[HTMLImageElement], Unit],
        onErrorCallBack: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
            ]
      ): Unit = js.native
      def _partialLoadImg(
        url: String,
        index: Double,
        loadedImages: js.Array[HTMLImageElement],
        scene: Nullable[Scene],
        onfinish: js.Function1[/* images */ js.Array[HTMLImageElement], Unit],
        onErrorCallBack: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
            ],
        mimeType: String
      ): Unit = js.native
      
      /** @hidden */
      def _readTexturePixels(texture: InternalTexture, width: Double, height: Double): ArrayBufferView = js.native
      def _readTexturePixels(texture: InternalTexture, width: Double, height: Double, faceIndex: Double): ArrayBufferView = js.native
      def _readTexturePixels(texture: InternalTexture, width: Double, height: Double, faceIndex: Double, level: Double): ArrayBufferView = js.native
      def _readTexturePixels(
        texture: InternalTexture,
        width: Double,
        height: Double,
        faceIndex: Double,
        level: Double,
        buffer: Nullable[ArrayBufferView]
      ): ArrayBufferView = js.native
      def _readTexturePixels(
        texture: InternalTexture,
        width: Double,
        height: Double,
        faceIndex: Double,
        level: Unit,
        buffer: Nullable[ArrayBufferView]
      ): ArrayBufferView = js.native
      def _readTexturePixels(texture: InternalTexture, width: Double, height: Double, faceIndex: Unit, level: Double): ArrayBufferView = js.native
      def _readTexturePixels(
        texture: InternalTexture,
        width: Double,
        height: Double,
        faceIndex: Unit,
        level: Double,
        buffer: Nullable[ArrayBufferView]
      ): ArrayBufferView = js.native
      def _readTexturePixels(
        texture: InternalTexture,
        width: Double,
        height: Double,
        faceIndex: Unit,
        level: Unit,
        buffer: Nullable[ArrayBufferView]
      ): ArrayBufferView = js.native
      
      /**
        * @hidden
        */
      def _setCubeMapTextureParams(texture: InternalTexture, loadMipmap: Boolean): Unit = js.native
      
      /**
        * Select a subsets of attachments to draw to.
        * @param attachments gl attachments
        */
      def bindAttachments(attachments: js.Array[Double]): Unit = js.native
      
      /**
        * Bind a specific block at a given index in a specific shader program
        * @param pipelineContext defines the pipeline context to use
        * @param blockName defines the block name
        * @param index defines the index where to bind the block
        */
      def bindUniformBlock(pipelineContext: IPipelineContext, blockName: String, index: Double): Unit = js.native
      
      /**
        * Bind an uniform buffer to the current webGL context
        * @param buffer defines the buffer to bind
        */
      def bindUniformBuffer(buffer: Nullable[DataBuffer]): Unit = js.native
      
      /**
        * Bind a buffer to the current webGL context at a given location
        * @param buffer defines the buffer to bind
        * @param location defines the index where to bind the buffer
        */
      def bindUniformBufferBase(buffer: DataBuffer, location: Double): Unit = js.native
      
      /**
        * Creates a layout object to draw/clear on specific textures in a MRT
        * @param textureStatus textureStatus[i] indicates if the i-th is active
        * @returns A layout to be fed to the engine, calling `bindAttachments`.
        */
      def buildTextureLayout(textureStatus: js.Array[Boolean]): js.Array[Double] = js.native
      
      /**
        * Creates a cube texture
        * @param rootUrl defines the url where the files to load is located
        * @param scene defines the current scene
        * @param files defines the list of files to load (1 per face)
        * @param noMipmap defines a boolean indicating that no mipmaps shall be generated (false by default)
        * @param onLoad defines an optional callback raised when the texture is loaded
        * @param onError defines an optional callback raised if there is an issue to load the texture
        * @param format defines the format of the data
        * @param forcedExtension defines the extension to use to pick the right loader
        * @returns the cube texture as an InternalTexture
        */
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Boolean,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[js.Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
            ],
        format: Double,
        forcedExtension: js.Any
      ): InternalTexture = js.native
      /**
        * Creates a cube texture
        * @param rootUrl defines the url where the files to load is located
        * @param scene defines the current scene
        * @param files defines the list of files to load (1 per face)
        * @param noMipmap defines a boolean indicating that no mipmaps shall be generated (false by default)
        * @param onLoad defines an optional callback raised when the texture is loaded
        * @param onError defines an optional callback raised if there is an issue to load the texture
        * @param format defines the format of the data
        * @param forcedExtension defines the extension to use to pick the right loader
        * @param createPolynomials if a polynomial sphere should be created for the cube texture
        * @param lodScale defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness
        * @param lodOffset defines the offset applied to environment texture. This manages first LOD level used for IBL according to the roughness
        * @returns the cube texture as an InternalTexture
        */
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Boolean,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[js.Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
            ],
        format: Double,
        forcedExtension: js.Any,
        createPolynomials: Boolean,
        lodScale: Double,
        lodOffset: Double
      ): InternalTexture = js.native
      /**
        * Creates a cube texture
        * @param rootUrl defines the url where the files to load is located
        * @param scene defines the current scene
        * @param files defines the list of files to load (1 per face)
        * @param noMipmap defines a boolean indicating that no mipmaps shall be generated (false by default)
        * @param onLoad defines an optional callback raised when the texture is loaded
        * @param onError defines an optional callback raised if there is an issue to load the texture
        * @param format defines the format of the data
        * @param forcedExtension defines the extension to use to pick the right loader
        * @param createPolynomials if a polynomial sphere should be created for the cube texture
        * @param lodScale defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness
        * @param lodOffset defines the offset applied to environment texture. This manages first LOD level used for IBL according to the roughness
        * @param fallback defines texture to use while falling back when (compressed) texture file not found.
        * @param loaderOptions options to be passed to the loader
        * @returns the cube texture as an InternalTexture
        */
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Boolean,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[js.Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
            ],
        format: Double,
        forcedExtension: js.Any,
        createPolynomials: Boolean,
        lodScale: Double,
        lodOffset: Double,
        fallback: Nullable[InternalTexture],
        loaderOptions: js.Any
      ): InternalTexture = js.native
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Boolean,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[js.Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
            ],
        format: Unit,
        forcedExtension: js.Any
      ): InternalTexture = js.native
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Boolean,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[js.Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
            ],
        format: Unit,
        forcedExtension: js.Any,
        createPolynomials: Boolean,
        lodScale: Double,
        lodOffset: Double
      ): InternalTexture = js.native
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Boolean,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[js.Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
            ],
        format: Unit,
        forcedExtension: js.Any,
        createPolynomials: Boolean,
        lodScale: Double,
        lodOffset: Double,
        fallback: Nullable[InternalTexture],
        loaderOptions: js.Any
      ): InternalTexture = js.native
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Unit,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[js.Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
            ],
        format: Double,
        forcedExtension: js.Any,
        createPolynomials: Boolean,
        lodScale: Double,
        lodOffset: Double,
        fallback: Nullable[InternalTexture],
        loaderOptions: js.Any
      ): InternalTexture = js.native
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Unit,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[js.Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
            ],
        format: Unit,
        forcedExtension: js.Any,
        createPolynomials: Boolean,
        lodScale: Double,
        lodOffset: Double,
        fallback: Nullable[InternalTexture],
        loaderOptions: js.Any
      ): InternalTexture = js.native
      
      /**
        * Creates a depth stencil texture.
        * This is only available in WebGL 2 or with the depth texture extension available.
        * @param size The size of face edge in the texture.
        * @param options The options defining the texture.
        * @returns The texture
        */
      def createDepthStencilTexture(size: RenderTargetTextureSize, options: DepthTextureCreationOptions): InternalTexture = js.native
      
      /**
        * Creates a dynamic texture
        * @param width defines the width of the texture
        * @param height defines the height of the texture
        * @param generateMipMaps defines if the engine should generate the mip levels
        * @param samplingMode defines the required sampling mode (Texture.NEAREST_SAMPLINGMODE by default)
        * @returns the dynamic texture inside an InternalTexture
        */
      def createDynamicTexture(width: Double, height: Double, generateMipMaps: Boolean, samplingMode: Double): InternalTexture = js.native
      
      /**
        * Create a dynamic uniform buffer
        * @see https://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
        * @param elements defines the content of the uniform buffer
        * @returns the webGL uniform buffer
        */
      def createDynamicUniformBuffer(elements: FloatArray): DataBuffer = js.native
      
      /**
        * Create a multi render target texture
        * @see https://doc.babylonjs.com/features/webgl2#multiple-render-target
        * @param size defines the size of the texture
        * @param options defines the creation options
        * @returns the cube texture as an InternalTexture
        */
      def createMultipleRenderTarget(size: js.Any, options: IMultiRenderTargetOptions): js.Array[InternalTexture] = js.native
      
      /**
        * Creates a new raw cube texture
        * @param data defines the array of data to use to create each face
        * @param size defines the size of the textures
        * @param format defines the format of the data
        * @param type defines the type of the data (like Engine.TEXTURETYPE_UNSIGNED_INT)
        * @param generateMipMaps  defines if the engine should generate the mip levels
        * @param invertY defines if data must be stored with Y axis inverted
        * @param samplingMode defines the required sampling mode (like Texture.NEAREST_SAMPLINGMODE)
        * @param compression defines the compression used (null by default)
        * @returns the cube texture as an InternalTexture
        */
      def createRawCubeTexture(
        data: Nullable[js.Array[ArrayBufferView]],
        size: Double,
        format: Double,
        `type`: Double,
        generateMipMaps: Boolean,
        invertY: Boolean,
        samplingMode: Double,
        compression: Nullable[String]
      ): InternalTexture = js.native
      
      /**
        * Creates a new raw cube texture from a specified url
        * @param url defines the url where the data is located
        * @param scene defines the current scene
        * @param size defines the size of the textures
        * @param format defines the format of the data
        * @param type defines the type fo the data (like Engine.TEXTURETYPE_UNSIGNED_INT)
        * @param noMipmap defines if the engine should avoid generating the mip levels
        * @param callback defines a callback used to extract texture data from loaded data
        * @param mipmapGenerator defines to provide an optional tool to generate mip levels
        * @param onLoad defines a callback called when texture is loaded
        * @param onError defines a callback called if there is an error
        * @returns the cube texture as an InternalTexture
        */
      def createRawCubeTextureFromUrl(
        url: String,
        scene: Nullable[Scene],
        size: Double,
        format: Double,
        `type`: Double,
        noMipmap: Boolean,
        callback: js.Function1[/* ArrayBuffer */ ArrayBuffer, Nullable[js.Array[ArrayBufferView]]],
        mipmapGenerator: Nullable[
              js.Function1[/* faces */ js.Array[ArrayBufferView], js.Array[js.Array[ArrayBufferView]]]
            ],
        onLoad: Nullable[js.Function0[Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
            ]
      ): InternalTexture = js.native
      /**
        * Creates a new raw cube texture from a specified url
        * @param url defines the url where the data is located
        * @param scene defines the current scene
        * @param size defines the size of the textures
        * @param format defines the format of the data
        * @param type defines the type fo the data (like Engine.TEXTURETYPE_UNSIGNED_INT)
        * @param noMipmap defines if the engine should avoid generating the mip levels
        * @param callback defines a callback used to extract texture data from loaded data
        * @param mipmapGenerator defines to provide an optional tool to generate mip levels
        * @param onLoad defines a callback called when texture is loaded
        * @param onError defines a callback called if there is an error
        * @param samplingMode defines the required sampling mode (like Texture.NEAREST_SAMPLINGMODE)
        * @param invertY defines if data must be stored with Y axis inverted
        * @returns the cube texture as an InternalTexture
        */
      def createRawCubeTextureFromUrl(
        url: String,
        scene: Nullable[Scene],
        size: Double,
        format: Double,
        `type`: Double,
        noMipmap: Boolean,
        callback: js.Function1[/* ArrayBuffer */ ArrayBuffer, Nullable[js.Array[ArrayBufferView]]],
        mipmapGenerator: Nullable[
              js.Function1[/* faces */ js.Array[ArrayBufferView], js.Array[js.Array[ArrayBufferView]]]
            ],
        onLoad: Nullable[js.Function0[Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
            ],
        samplingMode: Double,
        invertY: Boolean
      ): InternalTexture = js.native
      
      /**
        * Creates a raw texture
        * @param data defines the data to store in the texture
        * @param width defines the width of the texture
        * @param height defines the height of the texture
        * @param format defines the format of the data
        * @param generateMipMaps defines if the engine should generate the mip levels
        * @param invertY defines if data must be stored with Y axis inverted
        * @param samplingMode defines the required sampling mode (Texture.NEAREST_SAMPLINGMODE by default)
        * @param compression defines the compression used (null by default)
        * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
        * @returns the raw texture inside an InternalTexture
        */
      def createRawTexture(
        data: Nullable[ArrayBufferView],
        width: Double,
        height: Double,
        format: Double,
        generateMipMaps: Boolean,
        invertY: Boolean,
        samplingMode: Double,
        compression: Nullable[String],
        `type`: Double
      ): InternalTexture = js.native
      
      /**
        * Creates a new raw 2D array texture
        * @param data defines the data used to create the texture
        * @param width defines the width of the texture
        * @param height defines the height of the texture
        * @param depth defines the number of layers of the texture
        * @param format defines the format of the texture
        * @param generateMipMaps defines if the engine must generate mip levels
        * @param invertY defines if data must be stored with Y axis inverted
        * @param samplingMode defines the required sampling mode (like Texture.NEAREST_SAMPLINGMODE)
        * @param compression defines the compressed used (can be null)
        * @param textureType defines the compressed used (can be null)
        * @returns a new raw 2D array texture (stored in an InternalTexture)
        */
      def createRawTexture2DArray(
        data: Nullable[ArrayBufferView],
        width: Double,
        height: Double,
        depth: Double,
        format: Double,
        generateMipMaps: Boolean,
        invertY: Boolean,
        samplingMode: Double,
        compression: Nullable[String],
        textureType: Double
      ): InternalTexture = js.native
      
      /**
        * Creates a new raw 3D texture
        * @param data defines the data used to create the texture
        * @param width defines the width of the texture
        * @param height defines the height of the texture
        * @param depth defines the depth of the texture
        * @param format defines the format of the texture
        * @param generateMipMaps defines if the engine must generate mip levels
        * @param invertY defines if data must be stored with Y axis inverted
        * @param samplingMode defines the required sampling mode (like Texture.NEAREST_SAMPLINGMODE)
        * @param compression defines the compressed used (can be null)
        * @param textureType defines the compressed used (can be null)
        * @returns a new raw 3D texture (stored in an InternalTexture)
        */
      def createRawTexture3D(
        data: Nullable[ArrayBufferView],
        width: Double,
        height: Double,
        depth: Double,
        format: Double,
        generateMipMaps: Boolean,
        invertY: Boolean,
        samplingMode: Double,
        compression: Nullable[String],
        textureType: Double
      ): InternalTexture = js.native
      
      /**
        * Creates a new render target cube texture
        * @param size defines the size of the texture
        * @param options defines the options used to create the texture
        * @returns a new render target cube texture stored in an InternalTexture
        */
      def createRenderTargetCubeTexture(size: Double): InternalTexture = js.native
      def createRenderTargetCubeTexture(size: Double, options: PartialRenderTargetCreati): InternalTexture = js.native
      
      /**
        * Creates a new render target texture
        * @param size defines the size of the texture
        * @param options defines the options used to create the texture
        * @returns a new render target texture stored in an InternalTexture
        */
      def createRenderTargetTexture(size: RenderTargetTextureSize, options: Boolean): InternalTexture = js.native
      def createRenderTargetTexture(size: RenderTargetTextureSize, options: RenderTargetCreationOptions): InternalTexture = js.native
      
      /**
        * Create an uniform buffer
        * @see https://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
        * @param elements defines the content of the uniform buffer
        * @returns the webGL uniform buffer
        */
      def createUniformBuffer(elements: FloatArray): DataBuffer = js.native
      
      /**
        * Gets the current alpha equation.
        * @returns the current alpha equation
        */
      def getAlphaEquation(): Double = js.native
      
      /**
        * Gets the current alpha mode
        * @see https://doc.babylonjs.com/resources/transparency_and_how_meshes_are_rendered
        * @returns the current alpha mode
        */
      def getAlphaMode(): Double = js.native
      
      /**
        * Restores the webgl state to only draw on the main color attachment
        */
      def restoreSingleAttachment(): Unit = js.native
      
      /**
        * Sets alpha constants used by some alpha blending modes
        * @param r defines the red component
        * @param g defines the green component
        * @param b defines the blue component
        * @param a defines the alpha component
        */
      def setAlphaConstants(r: Double, g: Double, b: Double, a: Double): Unit = js.native
      
      /**
        * Sets the current alpha equation
        * @param equation defines the equation to use (one of the Engine.ALPHA_EQUATION_XXX)
        */
      def setAlphaEquation(equation: Double): Unit = js.native
      
      /**
        * Sets the current alpha mode
        * @param mode defines the mode to use (one of the Engine.ALPHA_XXX)
        * @param noDepthWriteChange defines if depth writing state should remains unchanged (false by default)
        * @see https://doc.babylonjs.com/resources/transparency_and_how_meshes_are_rendered
        */
      def setAlphaMode(mode: Double): Unit = js.native
      def setAlphaMode(mode: Double, noDepthWriteChange: Boolean): Unit = js.native
      
      /**
        * Unbind a list of render target textures from the webGL context
        * This is used only when drawBuffer extension or webGL2 are active
        * @param textures defines the render target textures to unbind
        * @param disableGenerateMipMaps defines a boolean indicating that mipmaps must not be generated
        * @param onBeforeUnbind defines a function which will be called before the effective unbind
        */
      def unBindMultiColorAttachmentFramebuffer(textures: js.Array[InternalTexture], disableGenerateMipMaps: Boolean): Unit = js.native
      def unBindMultiColorAttachmentFramebuffer(
        textures: js.Array[InternalTexture],
        disableGenerateMipMaps: Boolean,
        onBeforeUnbind: js.Function0[Unit]
      ): Unit = js.native
      
      /**
        * Update a dynamic index buffer
        * @param indexBuffer defines the target index buffer
        * @param indices defines the data to update
        * @param offset defines the offset in the target index buffer where update should start
        */
      def updateDynamicIndexBuffer(indexBuffer: DataBuffer, indices: IndicesArray): Unit = js.native
      def updateDynamicIndexBuffer(indexBuffer: DataBuffer, indices: IndicesArray, offset: Double): Unit = js.native
      
      /**
        * Update the content of a dynamic texture
        * @param texture defines the texture to update
        * @param source defines the source containing the data
        * @param invertY defines if data must be stored with Y axis inverted
        * @param premulAlpha defines if alpha is stored as premultiplied
        * @param format defines the format of the data
        * @param forceBindTexture if the texture should be forced to be bound eg. after a graphics context loss (Default: false)
        */
      def updateDynamicTexture(
        texture: Nullable[InternalTexture],
        source: ImageBitmap | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | OffscreenCanvas,
        invertY: js.UndefOr[Boolean],
        premulAlpha: js.UndefOr[Boolean],
        format: js.UndefOr[Double],
        forceBindTexture: js.UndefOr[Boolean]
      ): Unit = js.native
      
      /**
        * Updates a dynamic vertex buffer.
        * @param vertexBuffer the vertex buffer to update
        * @param data the data used to update the vertex buffer
        * @param byteOffset the byte offset of the data
        * @param byteLength the byte length of the data
        */
      def updateDynamicVertexBuffer(vertexBuffer: DataBuffer, data: DataArray): Unit = js.native
      def updateDynamicVertexBuffer(vertexBuffer: DataBuffer, data: DataArray, byteOffset: Double): Unit = js.native
      def updateDynamicVertexBuffer(vertexBuffer: DataBuffer, data: DataArray, byteOffset: Double, byteLength: Double): Unit = js.native
      def updateDynamicVertexBuffer(vertexBuffer: DataBuffer, data: DataArray, byteOffset: Unit, byteLength: Double): Unit = js.native
      
      /**
        * Update the sample count for a given multiple render target texture
        * @see https://doc.babylonjs.com/features/webgl2#multisample-render-targets
        * @param textures defines the textures to update
        * @param samples defines the sample count to set
        * @returns the effective sample count (could be 0 if multisample render targets are not supported)
        */
      def updateMultipleRenderTargetTextureSampleCount(textures: Nullable[js.Array[InternalTexture]], samples: Double): Double = js.native
      
      /**
        * Update a raw cube texture
        * @param texture defines the texture to udpdate
        * @param data defines the data to store
        * @param format defines the data format
        * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
        * @param invertY defines if data must be stored with Y axis inverted
        */
      def updateRawCubeTexture(
        texture: InternalTexture,
        data: js.Array[ArrayBufferView],
        format: Double,
        `type`: Double,
        invertY: Boolean
      ): Unit = js.native
      /**
        * Update a raw cube texture
        * @param texture defines the texture to udpdate
        * @param data defines the data to store
        * @param format defines the data format
        * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
        * @param invertY defines if data must be stored with Y axis inverted
        * @param compression defines the compression used (null by default)
        */
      def updateRawCubeTexture(
        texture: InternalTexture,
        data: js.Array[ArrayBufferView],
        format: Double,
        `type`: Double,
        invertY: Boolean,
        compression: Nullable[String]
      ): Unit = js.native
      /**
        * Update a raw cube texture
        * @param texture defines the texture to udpdate
        * @param data defines the data to store
        * @param format defines the data format
        * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
        * @param invertY defines if data must be stored with Y axis inverted
        * @param compression defines the compression used (null by default)
        * @param level defines which level of the texture to update
        */
      def updateRawCubeTexture(
        texture: InternalTexture,
        data: js.Array[ArrayBufferView],
        format: Double,
        `type`: Double,
        invertY: Boolean,
        compression: Nullable[String],
        level: Double
      ): Unit = js.native
      
      /**
        * Update a raw texture
        * @param texture defines the texture to update
        * @param data defines the data to store in the texture
        * @param format defines the format of the data
        * @param invertY defines if data must be stored with Y axis inverted
        */
      def updateRawTexture(
        texture: Nullable[InternalTexture],
        data: Nullable[ArrayBufferView],
        format: Double,
        invertY: Boolean
      ): Unit = js.native
      /**
        * Update a raw texture
        * @param texture defines the texture to update
        * @param data defines the data to store in the texture
        * @param format defines the format of the data
        * @param invertY defines if data must be stored with Y axis inverted
        * @param compression defines the compression used (null by default)
        * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
        */
      def updateRawTexture(
        texture: Nullable[InternalTexture],
        data: Nullable[ArrayBufferView],
        format: Double,
        invertY: Boolean,
        compression: Nullable[String],
        `type`: Double
      ): Unit = js.native
      
      /**
        * Update a raw 2D array texture
        * @param texture defines the texture to update
        * @param data defines the data to store
        * @param format defines the data format
        * @param invertY defines if data must be stored with Y axis inverted
        */
      def updateRawTexture2DArray(texture: InternalTexture, data: Nullable[ArrayBufferView], format: Double, invertY: Boolean): Unit = js.native
      /**
        * Update a raw 2D array texture
        * @param texture defines the texture to update
        * @param data defines the data to store
        * @param format defines the data format
        * @param invertY defines if data must be stored with Y axis inverted
        * @param compression defines the used compression (can be null)
        * @param textureType defines the texture Type (Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT...)
        */
      def updateRawTexture2DArray(
        texture: InternalTexture,
        data: Nullable[ArrayBufferView],
        format: Double,
        invertY: Boolean,
        compression: Nullable[String],
        textureType: Double
      ): Unit = js.native
      
      /**
        * Update a raw 3D texture
        * @param texture defines the texture to update
        * @param data defines the data to store
        * @param format defines the data format
        * @param invertY defines if data must be stored with Y axis inverted
        */
      def updateRawTexture3D(texture: InternalTexture, data: Nullable[ArrayBufferView], format: Double, invertY: Boolean): Unit = js.native
      /**
        * Update a raw 3D texture
        * @param texture defines the texture to update
        * @param data defines the data to store
        * @param format defines the data format
        * @param invertY defines if data must be stored with Y axis inverted
        * @param compression defines the used compression (can be null)
        * @param textureType defines the texture Type (Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT...)
        */
      def updateRawTexture3D(
        texture: InternalTexture,
        data: Nullable[ArrayBufferView],
        format: Double,
        invertY: Boolean,
        compression: Nullable[String],
        textureType: Double
      ): Unit = js.native
      
      /**
        * Update an existing uniform buffer
        * @see https://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
        * @param uniformBuffer defines the target uniform buffer
        * @param elements defines the content to update
        * @param offset defines the offset in the uniform buffer where update should start
        * @param count defines the size of the data to update
        */
      def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray): Unit = js.native
      def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray, offset: Double): Unit = js.native
      def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray, offset: Double, count: Double): Unit = js.native
      def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray, offset: Unit, count: Double): Unit = js.native
      
      /**
        * Update a video texture
        * @param texture defines the texture to update
        * @param video defines the video element to use
        * @param invertY defines if data must be stored with Y axis inverted
        */
      def updateVideoTexture(texture: Nullable[InternalTexture], video: HTMLVideoElement, invertY: Boolean): Unit = js.native
    }
  }
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    trait AbstractMesh extends StObject {
      
      /**
        * Backing filed
        * @hidden
        */
      var __occlusionDataStorage: typings.babylonjs.engineOcclusionQueryMod.OcclusionDataStorage
      
      /**
        * Access property
        * @hidden
        */
      var _occlusionDataStorage: typings.babylonjs.engineOcclusionQueryMod.OcclusionDataStorage
      
      /**
        * Gets or sets whether the mesh is occluded or not, it is used also to set the intial state of the mesh to be occluded or not
        * @see https://doc.babylonjs.com/features/occlusionquery
        */
      var isOccluded: Boolean
      
      /**
        * Flag to check the progress status of the query
        * @see https://doc.babylonjs.com/features/occlusionquery
        */
      var isOcclusionQueryInProgress: Boolean
      
      /**
        * This property determines the type of occlusion query algorithm to run in WebGl, you can use:
        * * AbstractMesh.OCCLUSION_ALGORITHM_TYPE_ACCURATE which is mapped to GL_ANY_SAMPLES_PASSED.
        * * AbstractMesh.OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE (Default Value) which is mapped to GL_ANY_SAMPLES_PASSED_CONSERVATIVE which is a false positive algorithm that is faster than GL_ANY_SAMPLES_PASSED but less accurate.
        * @see https://doc.babylonjs.com/features/occlusionquery
        */
      var occlusionQueryAlgorithmType: Double
      
      /**
        * This number indicates the number of allowed retries before stop the occlusion query, this is useful if the occlusion query is taking long time before to the query result is retireved, the query result indicates if the object is visible within the scene or not and based on that Babylon.Js engine decideds to show or hide the object.
        * The default value is -1 which means don't break the query and wait till the result
        * @see https://doc.babylonjs.com/features/occlusionquery
        */
      var occlusionRetryCount: Double
      
      /**
        * This property is responsible for starting the occlusion query within the Mesh or not, this property is also used to determine what should happen when the occlusionRetryCount is reached. It has supports 3 values:
        * * OCCLUSION_TYPE_NONE (Default Value): this option means no occlusion query whith the Mesh.
        * * OCCLUSION_TYPE_OPTIMISTIC: this option is means use occlusion query and if occlusionRetryCount is reached and the query is broken show the mesh.
        * * OCCLUSION_TYPE_STRICT: this option is means use occlusion query and if occlusionRetryCount is reached and the query is broken restore the last state of the mesh occlusion if the mesh was visible then show the mesh if was hidden then hide don't show.
        * @see https://doc.babylonjs.com/features/occlusionquery
        */
      var occlusionType: Double
    }
    object AbstractMesh {
      
      inline def apply(
        __occlusionDataStorage: typings.babylonjs.engineOcclusionQueryMod.OcclusionDataStorage,
        _occlusionDataStorage: typings.babylonjs.engineOcclusionQueryMod.OcclusionDataStorage,
        isOccluded: Boolean,
        isOcclusionQueryInProgress: Boolean,
        occlusionQueryAlgorithmType: Double,
        occlusionRetryCount: Double,
        occlusionType: Double
      ): AbstractMesh = {
        val __obj = js.Dynamic.literal(__occlusionDataStorage = __occlusionDataStorage.asInstanceOf[js.Any], _occlusionDataStorage = _occlusionDataStorage.asInstanceOf[js.Any], isOccluded = isOccluded.asInstanceOf[js.Any], isOcclusionQueryInProgress = isOcclusionQueryInProgress.asInstanceOf[js.Any], occlusionQueryAlgorithmType = occlusionQueryAlgorithmType.asInstanceOf[js.Any], occlusionRetryCount = occlusionRetryCount.asInstanceOf[js.Any], occlusionType = occlusionType.asInstanceOf[js.Any])
        __obj.asInstanceOf[AbstractMesh]
      }
      
      extension [Self <: AbstractMesh](x: Self) {
        
        inline def setIsOccluded(value: Boolean): Self = StObject.set(x, "isOccluded", value.asInstanceOf[js.Any])
        
        inline def setIsOcclusionQueryInProgress(value: Boolean): Self = StObject.set(x, "isOcclusionQueryInProgress", value.asInstanceOf[js.Any])
        
        inline def setOcclusionQueryAlgorithmType(value: Double): Self = StObject.set(x, "occlusionQueryAlgorithmType", value.asInstanceOf[js.Any])
        
        inline def setOcclusionRetryCount(value: Double): Self = StObject.set(x, "occlusionRetryCount", value.asInstanceOf[js.Any])
        
        inline def setOcclusionType(value: Double): Self = StObject.set(x, "occlusionType", value.asInstanceOf[js.Any])
        
        inline def set__occlusionDataStorage(value: typings.babylonjs.engineOcclusionQueryMod.OcclusionDataStorage): Self = StObject.set(x, "__occlusionDataStorage", value.asInstanceOf[js.Any])
        
        inline def set_occlusionDataStorage(value: typings.babylonjs.engineOcclusionQueryMod.OcclusionDataStorage): Self = StObject.set(x, "_occlusionDataStorage", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @hidden */
      def _createMultiviewUbo(): Unit = js.native
      
      /** @hidden */
      var _multiviewSceneUbo: Nullable[UniformBuffer] = js.native
      
      /** @hidden */
      def _renderMultiviewToSingleView(camera: Camera): Unit = js.native
      
      /** @hidden */
      var _transformMatrixR: Matrix = js.native
      
      /** @hidden */
      def _updateMultiviewUbo(): Unit = js.native
      def _updateMultiviewUbo(viewR: Unit, projectionR: Matrix): Unit = js.native
      def _updateMultiviewUbo(viewR: Matrix): Unit = js.native
      def _updateMultiviewUbo(viewR: Matrix, projectionR: Matrix): Unit = js.native
    }
  }
}
