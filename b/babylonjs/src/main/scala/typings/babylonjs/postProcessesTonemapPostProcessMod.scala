package typings.babylonjs

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.postProcessesPostProcessMod.PostProcess
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessesTonemapPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/tonemapPostProcess", "TonemapPostProcess")
  @js.native
  open class TonemapPostProcess protected () extends PostProcess {
    /**
      * Creates a new TonemapPostProcess
      * @param name defines the name of the postprocess
      * @param _operator defines the operator to use
      * @param exposureAdjustment defines the required exposure adjustment
      * @param camera defines the camera to use (can be null)
      * @param samplingMode defines the required sampling mode (BABYLON.Texture.BILINEAR_SAMPLINGMODE by default)
      * @param engine defines the hosting engine (can be ignore if camera is set)
      * @param textureFormat defines the texture format to use (BABYLON.Engine.TEXTURETYPE_UNSIGNED_INT by default)
      * @param reusable If the post process can be reused on the same frame. (default: false)
      */
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustment */
    exposureAdjustment: Double,
      camera: Nullable[Camera]
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustment */
    exposureAdjustment: Double,
      camera: Nullable[Camera],
      samplingMode: Double
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustment */
    exposureAdjustment: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustment */
    exposureAdjustment: Double,
      camera: Nullable[Camera],
      samplingMode: Unit,
      engine: Engine
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustment */
    exposureAdjustment: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Unit,
      textureFormat: Double
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustment */
    exposureAdjustment: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      textureFormat: Double
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustment */
    exposureAdjustment: Double,
      camera: Nullable[Camera],
      samplingMode: Unit,
      engine: Unit,
      textureFormat: Double
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustment */
    exposureAdjustment: Double,
      camera: Nullable[Camera],
      samplingMode: Unit,
      engine: Engine,
      textureFormat: Double
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustment */
    exposureAdjustment: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Unit,
      textureFormat: Double,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustment */
    exposureAdjustment: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Unit,
      textureFormat: Unit,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustment */
    exposureAdjustment: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      textureFormat: Double,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustment */
    exposureAdjustment: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      textureFormat: Unit,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustment */
    exposureAdjustment: Double,
      camera: Nullable[Camera],
      samplingMode: Unit,
      engine: Unit,
      textureFormat: Double,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustment */
    exposureAdjustment: Double,
      camera: Nullable[Camera],
      samplingMode: Unit,
      engine: Unit,
      textureFormat: Unit,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustment */
    exposureAdjustment: Double,
      camera: Nullable[Camera],
      samplingMode: Unit,
      engine: Engine,
      textureFormat: Double,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustment */
    exposureAdjustment: Double,
      camera: Nullable[Camera],
      samplingMode: Unit,
      engine: Engine,
      textureFormat: Unit,
      reusable: Boolean
    ) = this()
    
    /* private */ var _operator: Any = js.native
    
    /** Defines the required exposure adjustment */
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
    /* 0 */ val Hable: typings.babylonjs.postProcessesTonemapPostProcessMod.TonemappingOperator.Hable & Double = js.native
    
    /** HejiDawson */
    @js.native
    sealed trait HejiDawson
      extends StObject
         with TonemappingOperator
    /* 2 */ val HejiDawson: typings.babylonjs.postProcessesTonemapPostProcessMod.TonemappingOperator.HejiDawson & Double = js.native
    
    /** Photographic */
    @js.native
    sealed trait Photographic
      extends StObject
         with TonemappingOperator
    /* 3 */ val Photographic: typings.babylonjs.postProcessesTonemapPostProcessMod.TonemappingOperator.Photographic & Double = js.native
    
    /** Reinhard */
    @js.native
    sealed trait Reinhard
      extends StObject
         with TonemappingOperator
    /* 1 */ val Reinhard: typings.babylonjs.postProcessesTonemapPostProcessMod.TonemappingOperator.Reinhard & Double = js.native
  }
}
