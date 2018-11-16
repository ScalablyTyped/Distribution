package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines a post process to apply tone mapping
     */
@JSImport("babylonjs", "TonemapPostProcess")
@js.native
class TonemapPostProcess protected ()
  extends babylonjsLib.BABYLONNs.TonemapPostProcess {
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
  def this(name: java.lang.String, _operator: babylonjsLib.BABYLONNs.TonemappingOperator, /** Defines the required exposure adjustement */
  exposureAdjustment: scala.Double, camera: babylonjsLib.BABYLONNs.Camera) = this()
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
  def this(name: java.lang.String, _operator: babylonjsLib.BABYLONNs.TonemappingOperator, /** Defines the required exposure adjustement */
  exposureAdjustment: scala.Double, camera: babylonjsLib.BABYLONNs.Camera, samplingMode: scala.Double) = this()
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
  def this(name: java.lang.String, _operator: babylonjsLib.BABYLONNs.TonemappingOperator, /** Defines the required exposure adjustement */
  exposureAdjustment: scala.Double, camera: babylonjsLib.BABYLONNs.Camera, samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine) = this()
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
  def this(name: java.lang.String, _operator: babylonjsLib.BABYLONNs.TonemappingOperator, /** Defines the required exposure adjustement */
  exposureAdjustment: scala.Double, camera: babylonjsLib.BABYLONNs.Camera, samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, textureFormat: scala.Double) = this()
}

