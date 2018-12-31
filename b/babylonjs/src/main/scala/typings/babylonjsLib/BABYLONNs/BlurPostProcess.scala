package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Blur Post Process which blurs an image based on a kernel and direction.
  * Can be used twice in x and y directions to perform a guassian blur in two passes.
  */
@JSGlobal("BABYLON.BlurPostProcess")
@js.native
class BlurPostProcess protected () extends PostProcess {
  def this(name: java.lang.String, /** The direction in which to blur the image. */
  direction: Vector2, kernel: scala.Double, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: js.UndefOr[scala.Double], engine: js.UndefOr[Engine], reusable: js.UndefOr[scala.Boolean], textureType: js.UndefOr[scala.Double], defines: js.UndefOr[java.lang.String], blockCompilation: js.UndefOr[scala.Boolean]) = this()
  /**
    * Creates a new instance BlurPostProcess
    * @param name The name of the effect.
    * @param direction The direction in which to blur the image.
    * @param kernel The size of the kernel to be used when computing the blur. eg. Size of 3 will blur the center pixel by 2 pixels surrounding it.
    * @param options The required width/height ratio to downsize to before computing the render pass. (Use 1.0 for full size)
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType Type of textures used when performing the post process. (default: 0)
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(name: java.lang.String, /** The direction in which to blur the image. */
  direction: Vector2, kernel: scala.Double, options: scala.Double, camera: Nullable[Camera], samplingMode: js.UndefOr[scala.Double], engine: js.UndefOr[Engine], reusable: js.UndefOr[scala.Boolean], textureType: js.UndefOr[scala.Double], defines: js.UndefOr[java.lang.String], blockCompilation: js.UndefOr[scala.Boolean]) = this()
  var _idealKernel: scala.Double = js.native
  var _kernel: scala.Double = js.native
  var _packedFloat: scala.Boolean = js.native
  var _staticDefines: js.Any = js.native
  var blockCompilation: js.Any = js.native
  /** The direction in which to blur the image. */
  var direction: Vector2 = js.native
  /**
    * Sets the length in pixels of the blur sample region
    */
  /**
    * Gets the length in pixels of the blur sample region
    */
  var kernel: scala.Double = js.native
  /**
    * Sets wether or not the blur needs to unpack/repack floats
    */
  /**
    * Gets wether or not the blur is unpacking/repacking floats
    */
  var packedFloat: scala.Boolean = js.native
  /**
    * Calculates the value of a Gaussian distribution with sigma 3 at a given point.
    * @param x The point on the Gaussian distribution to sample.
    * @return the value of the Gaussian function at x.
    */
  /* protected */ def _gaussianWeight(x: scala.Double): scala.Double = js.native
  /**
    * Generates a string that can be used as a floating point number in GLSL.
    * @param x Value to print.
    * @param decimalFigures Number of decimal places to print the number to (excluding trailing 0s).
    * @return GLSL float string.
    */
  /* protected */ def _glslFloat(x: scala.Double): java.lang.String = js.native
  /* protected */ def _glslFloat(x: scala.Double, decimalFigures: scala.Double): java.lang.String = js.native
  /**
    * Best kernels are odd numbers that when divided by 2, their integer part is even, so 5, 9 or 13.
    * Other odd kernels optimize correctly but require proportionally more samples, even kernels are
    * possible but will produce minor visual artifacts. Since each new kernel requires a new shader we
    * want to minimize kernel changes, having gaps between physical kernels is helpful in that regard.
    * The gaps between physical kernels are compensated for in the weighting of the samples
    * @param idealKernel Ideal blur kernel.
    * @return Nearest best kernel.
    */
  /* protected */ def _nearestBestKernel(idealKernel: scala.Double): scala.Double = js.native
  /* protected */ def _updateParameters(): scala.Unit = js.native
  /* protected */ def _updateParameters(onCompiled: js.Function1[/* effect */ Effect, scala.Unit]): scala.Unit = js.native
  /* protected */ def _updateParameters(
    onCompiled: js.Function1[/* effect */ Effect, scala.Unit],
    onError: js.Function2[/* effect */ Effect, /* errors */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

