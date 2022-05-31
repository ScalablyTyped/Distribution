package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "TonemapPostProcess")
@js.native
class TonemapPostProcess protected ()
  extends typings.babylonjs.postProcessesIndexMod.TonemapPostProcess {
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
    _operator: typings.babylonjs.tonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustement */
  exposureAdjustment: Double,
    camera: typings.babylonjs.cameraMod.Camera
  ) = this()
  def this(
    name: String,
    _operator: typings.babylonjs.tonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustement */
  exposureAdjustment: Double,
    camera: typings.babylonjs.cameraMod.Camera,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    _operator: typings.babylonjs.tonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustement */
  exposureAdjustment: Double,
    camera: typings.babylonjs.cameraMod.Camera,
    samplingMode: Double,
    engine: typings.babylonjs.engineMod.Engine
  ) = this()
  def this(
    name: String,
    _operator: typings.babylonjs.tonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustement */
  exposureAdjustment: Double,
    camera: typings.babylonjs.cameraMod.Camera,
    samplingMode: Unit,
    engine: typings.babylonjs.engineMod.Engine
  ) = this()
  def this(
    name: String,
    _operator: typings.babylonjs.tonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustement */
  exposureAdjustment: Double,
    camera: typings.babylonjs.cameraMod.Camera,
    samplingMode: Double,
    engine: Unit,
    textureFormat: Double
  ) = this()
  def this(
    name: String,
    _operator: typings.babylonjs.tonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustement */
  exposureAdjustment: Double,
    camera: typings.babylonjs.cameraMod.Camera,
    samplingMode: Double,
    engine: typings.babylonjs.engineMod.Engine,
    textureFormat: Double
  ) = this()
  def this(
    name: String,
    _operator: typings.babylonjs.tonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustement */
  exposureAdjustment: Double,
    camera: typings.babylonjs.cameraMod.Camera,
    samplingMode: Unit,
    engine: Unit,
    textureFormat: Double
  ) = this()
  def this(
    name: String,
    _operator: typings.babylonjs.tonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustement */
  exposureAdjustment: Double,
    camera: typings.babylonjs.cameraMod.Camera,
    samplingMode: Unit,
    engine: typings.babylonjs.engineMod.Engine,
    textureFormat: Double
  ) = this()
}
