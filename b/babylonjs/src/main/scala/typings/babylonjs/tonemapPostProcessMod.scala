package typings.babylonjs

import org.scalablytyped.runtime.TopLevel
import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.postProcessMod.PostProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/PostProcesses/tonemapPostProcess", JSImport.Namespace)
@js.native
object tonemapPostProcessMod extends js.Object {
  @js.native
  class TonemapPostProcess protected () extends PostProcess {
    /**
      * Creates a new TonemapPostProcess
      * @param name defines the name of the postprocess
      * @param _operator defines the operator to use
      * @param exposureAdjustment defines the required exposure adjustement
      * @param camera defines the camera to use (can be null)
      * @param samplingMode defines the required sampling mode (BABYLON.Texture.BILINEAR_SAMPLINGMODE by default)
      * @param engine defines the hosting engine (can be ignore if camera is set)
      * @param textureFormat defines the texture format to use (BABYLON.Engine.TEXTURETYPE_UNSIGNED_INT by default)
      */
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustement */
    exposureAdjustment: Double,
      camera: Camera
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustement */
    exposureAdjustment: Double,
      camera: Camera,
      samplingMode: Double
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustement */
    exposureAdjustment: Double,
      camera: Camera,
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustement */
    exposureAdjustment: Double,
      camera: Camera,
      samplingMode: Double,
      engine: Engine,
      textureFormat: Double
    ) = this()
    var _operator: js.Any = js.native
    /** Defines the required exposure adjustement */
    var exposureAdjustment: Double = js.native
  }
  
  @js.native
  sealed trait TonemappingOperator extends js.Object
  
  @js.native
  object TonemappingOperator extends js.Object {
    /** Hable */
    @js.native
    sealed trait Hable extends TonemappingOperator
    
    /** HejiDawson */
    @js.native
    sealed trait HejiDawson extends TonemappingOperator
    
    /** Photographic */
    @js.native
    sealed trait Photographic extends TonemappingOperator
    
    /** Reinhard */
    @js.native
    sealed trait Reinhard extends TonemappingOperator
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TonemappingOperator with Double] = js.native
    /* 0 */ @js.native
    object Hable extends TopLevel[Hable with Double]
    
    /* 2 */ @js.native
    object HejiDawson extends TopLevel[HejiDawson with Double]
    
    /* 3 */ @js.native
    object Photographic extends TopLevel[Photographic with Double]
    
    /* 1 */ @js.native
    object Reinhard extends TopLevel[Reinhard with Double]
    
  }
  
}

