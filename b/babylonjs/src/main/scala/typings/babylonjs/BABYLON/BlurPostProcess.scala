package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlurPostProcess extends PostProcess {
  var _idealKernel: Double = js.native
  var _kernel: Double = js.native
  var _packedFloat: Boolean = js.native
  var _staticDefines: js.Any = js.native
  var blockCompilation: js.Any = js.native
  /** The direction in which to blur the image. */
  var direction: Vector2 = js.native
  /**
    * Calculates the value of a Gaussian distribution with sigma 3 at a given point.
    * @param x The point on the Gaussian distribution to sample.
    * @return the value of the Gaussian function at x.
    */
  /* protected */ def _gaussianWeight(x: Double): Double = js.native
  /**
    * Generates a string that can be used as a floating point number in GLSL.
    * @param x Value to print.
    * @param decimalFigures Number of decimal places to print the number to (excluding trailing 0s).
    * @return GLSL float string.
    */
  /* protected */ def _glslFloat(x: Double): String = js.native
  /* protected */ def _glslFloat(x: Double, decimalFigures: Double): String = js.native
  /**
    * Best kernels are odd numbers that when divided by 2, their integer part is even, so 5, 9 or 13.
    * Other odd kernels optimize correctly but require proportionally more samples, even kernels are
    * possible but will produce minor visual artifacts. Since each new kernel requires a new shader we
    * want to minimize kernel changes, having gaps between physical kernels is helpful in that regard.
    * The gaps between physical kernels are compensated for in the weighting of the samples
    * @param idealKernel Ideal blur kernel.
    * @return Nearest best kernel.
    */
  /* protected */ def _nearestBestKernel(idealKernel: Double): Double = js.native
  /* protected */ def _updateParameters(): Unit = js.native
  /* protected */ def _updateParameters(onCompiled: js.Function1[/* effect */ Effect, Unit]): Unit = js.native
  /* protected */ def _updateParameters(
    onCompiled: js.Function1[/* effect */ Effect, Unit],
    onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
  ): Unit = js.native
  /**
    * Gets the length in pixels of the blur sample region
    */
  def kernel: Double = js.native
  /**
    * Sets the length in pixels of the blur sample region
    */
  def kernel(v: Double): js.Any = js.native
  /**
    * Gets wether or not the blur is unpacking/repacking floats
    */
  def packedFloat: Boolean = js.native
  /**
    * Sets wether or not the blur needs to unpack/repack floats
    */
  def packedFloat(v: Boolean): js.Any = js.native
}

