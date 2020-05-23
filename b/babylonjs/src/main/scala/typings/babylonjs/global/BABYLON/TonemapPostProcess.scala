package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.TonemapPostProcess")
@js.native
class TonemapPostProcess protected ()
  extends typings.babylonjs.BABYLON.TonemapPostProcess {
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
    _operator: typings.babylonjs.BABYLON.TonemappingOperator,
    /** Defines the required exposure adjustement */
  exposureAdjustment: Double,
    camera: typings.babylonjs.BABYLON.Camera
  ) = this()
  def this(
    name: String,
    _operator: typings.babylonjs.BABYLON.TonemappingOperator,
    /** Defines the required exposure adjustement */
  exposureAdjustment: Double,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    _operator: typings.babylonjs.BABYLON.TonemappingOperator,
    /** Defines the required exposure adjustement */
  exposureAdjustment: Double,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    _operator: typings.babylonjs.BABYLON.TonemappingOperator,
    /** Defines the required exposure adjustement */
  exposureAdjustment: Double,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    textureFormat: Double
  ) = this()
}

