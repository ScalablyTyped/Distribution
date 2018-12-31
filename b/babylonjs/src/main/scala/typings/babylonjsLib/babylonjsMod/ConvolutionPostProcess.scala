package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ConvolutionPostProcess applies a 3x3 kernel to every pixel of the
  * input texture to perform effects such as edge detection or sharpening
  * See http://en.wikipedia.org/wiki/Kernel_(image_processing)
  */
@JSImport("babylonjs", "ConvolutionPostProcess")
@js.native
class ConvolutionPostProcess protected ()
  extends babylonjsLib.BABYLONNs.ConvolutionPostProcess {
  def this(name: java.lang.String, /** Array of 9 values corrisponding to the 3x3 kernel to be applied */
  kernel: js.Array[scala.Double], options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera]) = this()
  /**
    * Creates a new instance ConvolutionPostProcess
    * @param name The name of the effect.
    * @param kernel Array of 9 values corrisponding to the 3x3 kernel to be applied
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType Type of textures used when performing the post process. (default: 0)
    */
  def this(name: java.lang.String, /** Array of 9 values corrisponding to the 3x3 kernel to be applied */
  kernel: js.Array[scala.Double], options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera]) = this()
  def this(name: java.lang.String, /** Array of 9 values corrisponding to the 3x3 kernel to be applied */
  kernel: js.Array[scala.Double], options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double) = this()
  def this(name: java.lang.String, /** Array of 9 values corrisponding to the 3x3 kernel to be applied */
  kernel: js.Array[scala.Double], options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double) = this()
  def this(name: java.lang.String, /** Array of 9 values corrisponding to the 3x3 kernel to be applied */
  kernel: js.Array[scala.Double], options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine) = this()
  def this(name: java.lang.String, /** Array of 9 values corrisponding to the 3x3 kernel to be applied */
  kernel: js.Array[scala.Double], options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine) = this()
  def this(name: java.lang.String, /** Array of 9 values corrisponding to the 3x3 kernel to be applied */
  kernel: js.Array[scala.Double], options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean) = this()
  def this(name: java.lang.String, /** Array of 9 values corrisponding to the 3x3 kernel to be applied */
  kernel: js.Array[scala.Double], options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean) = this()
  def this(name: java.lang.String, /** Array of 9 values corrisponding to the 3x3 kernel to be applied */
  kernel: js.Array[scala.Double], options: babylonjsLib.BABYLONNs.PostProcessOptions, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean, textureType: scala.Double) = this()
  def this(name: java.lang.String, /** Array of 9 values corrisponding to the 3x3 kernel to be applied */
  kernel: js.Array[scala.Double], options: scala.Double, camera: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Camera], samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean, textureType: scala.Double) = this()
}

/**
  * The ConvolutionPostProcess applies a 3x3 kernel to every pixel of the
  * input texture to perform effects such as edge detection or sharpening
  * See http://en.wikipedia.org/wiki/Kernel_(image_processing)
  */
@JSImport("babylonjs", "ConvolutionPostProcess")
@js.native
object ConvolutionPostProcess extends js.Object {
  /**
    * Edge detection 0 see https://en.wikipedia.org/wiki/Kernel_(image_processing)
    */
  var EdgeDetect0Kernel: js.Array[scala.Double] = js.native
  /**
    * Edge detection 1 see https://en.wikipedia.org/wiki/Kernel_(image_processing)
    */
  var EdgeDetect1Kernel: js.Array[scala.Double] = js.native
  /**
    * Edge detection 2 see https://en.wikipedia.org/wiki/Kernel_(image_processing)
    */
  var EdgeDetect2Kernel: js.Array[scala.Double] = js.native
  /**
    * Kernel to emboss an image see https://en.wikipedia.org/wiki/Kernel_(image_processing)
    */
  var EmbossKernel: js.Array[scala.Double] = js.native
  /**
    * Kernel to blur an image see https://en.wikipedia.org/wiki/Kernel_(image_processing)
    */
  var GaussianKernel: js.Array[scala.Double] = js.native
  /**
    * Kernel to sharpen an image see https://en.wikipedia.org/wiki/Kernel_(image_processing)
    */
  var SharpenKernel: js.Array[scala.Double] = js.native
}

