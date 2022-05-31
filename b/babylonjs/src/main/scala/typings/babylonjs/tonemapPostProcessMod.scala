package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.postProcessMod.PostProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tonemapPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/tonemapPostProcess", "TonemapPostProcess")
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
      samplingMode: Unit,
      engine: Engine
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustement */
    exposureAdjustment: Double,
      camera: Camera,
      samplingMode: Double,
      engine: Unit,
      textureFormat: Double
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
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustement */
    exposureAdjustment: Double,
      camera: Camera,
      samplingMode: Unit,
      engine: Unit,
      textureFormat: Double
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustement */
    exposureAdjustment: Double,
      camera: Camera,
      samplingMode: Unit,
      engine: Engine,
      textureFormat: Double
    ) = this()
    
    /* private */ var _operator: js.Any = js.native
    
    /** Defines the required exposure adjustement */
    var exposureAdjustment: Double = js.native
  }
  
  @js.native
  sealed trait TonemappingOperator extends StObject
  @JSImport("babylonjs/PostProcesses/tonemapPostProcess", "TonemappingOperator")
  @js.native
  object TonemappingOperator extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TonemappingOperator & Double] = js.native
    
    /** Hable */
    @js.native
    sealed trait Hable
      extends StObject
         with TonemappingOperator
    /* 0 */ val Hable: typings.babylonjs.tonemapPostProcessMod.TonemappingOperator.Hable & Double = js.native
    
    /** HejiDawson */
    @js.native
    sealed trait HejiDawson
      extends StObject
         with TonemappingOperator
    /* 2 */ val HejiDawson: typings.babylonjs.tonemapPostProcessMod.TonemappingOperator.HejiDawson & Double = js.native
    
    /** Photographic */
    @js.native
    sealed trait Photographic
      extends StObject
         with TonemappingOperator
    /* 3 */ val Photographic: typings.babylonjs.tonemapPostProcessMod.TonemappingOperator.Photographic & Double = js.native
    
    /** Reinhard */
    @js.native
    sealed trait Reinhard
      extends StObject
         with TonemappingOperator
    /* 1 */ val Reinhard: typings.babylonjs.tonemapPostProcessMod.TonemappingOperator.Reinhard & Double = js.native
  }
}
