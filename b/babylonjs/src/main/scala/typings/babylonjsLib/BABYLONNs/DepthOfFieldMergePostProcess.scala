package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The DepthOfFieldMergePostProcess merges blurred images with the original based on the values of the circle of confusion.
  */
@JSGlobal("BABYLON.DepthOfFieldMergePostProcess")
@js.native
class DepthOfFieldMergePostProcess protected () extends PostProcess {
  def this(name: java.lang.String, originalFromInput: PostProcess, circleOfConfusion: PostProcess, blurSteps: js.Array[PostProcess], options: PostProcessOptions, camera: Nullable[Camera]) = this()
  /**
    * Creates a new instance of DepthOfFieldMergePostProcess
    * @param name The name of the effect.
    * @param originalFromInput Post process which's input will be used for the merge.
    * @param circleOfConfusion Circle of confusion post process which's output will be used to blur each pixel.
    * @param blurSteps Blur post processes from low to high which will be mixed with the original image.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType Type of textures used when performing the post process. (default: 0)
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(name: java.lang.String, originalFromInput: PostProcess, circleOfConfusion: PostProcess, blurSteps: js.Array[PostProcess], options: scala.Double, camera: Nullable[Camera]) = this()
  def this(name: java.lang.String, originalFromInput: PostProcess, circleOfConfusion: PostProcess, blurSteps: js.Array[PostProcess], options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double) = this()
  def this(name: java.lang.String, originalFromInput: PostProcess, circleOfConfusion: PostProcess, blurSteps: js.Array[PostProcess], options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double) = this()
  def this(name: java.lang.String, originalFromInput: PostProcess, circleOfConfusion: PostProcess, blurSteps: js.Array[PostProcess], options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine) = this()
  def this(name: java.lang.String, originalFromInput: PostProcess, circleOfConfusion: PostProcess, blurSteps: js.Array[PostProcess], options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine) = this()
  def this(name: java.lang.String, originalFromInput: PostProcess, circleOfConfusion: PostProcess, blurSteps: js.Array[PostProcess], options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean) = this()
  def this(name: java.lang.String, originalFromInput: PostProcess, circleOfConfusion: PostProcess, blurSteps: js.Array[PostProcess], options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean) = this()
  def this(name: java.lang.String, originalFromInput: PostProcess, circleOfConfusion: PostProcess, blurSteps: js.Array[PostProcess], options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean, textureType: scala.Double) = this()
  def this(name: java.lang.String, originalFromInput: PostProcess, circleOfConfusion: PostProcess, blurSteps: js.Array[PostProcess], options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean, textureType: scala.Double) = this()
  def this(name: java.lang.String, originalFromInput: PostProcess, circleOfConfusion: PostProcess, blurSteps: js.Array[PostProcess], options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean, textureType: scala.Double, blockCompilation: scala.Boolean) = this()
  def this(name: java.lang.String, originalFromInput: PostProcess, circleOfConfusion: PostProcess, blurSteps: js.Array[PostProcess], options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean, textureType: scala.Double, blockCompilation: scala.Boolean) = this()
  var blurSteps: js.Any = js.native
}

