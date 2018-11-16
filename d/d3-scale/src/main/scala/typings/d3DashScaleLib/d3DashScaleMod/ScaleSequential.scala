package typings
package d3DashScaleLib.d3DashScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleSequential[Output] extends js.Object {
  /**
       * Given a value from the domain, returns the corresponding value from the output range, subject to interpolation.
       *
       * If the given value is outside the domain, and clamping is not enabled, the mapping may be extrapolated such that the returned value is outside the range.
       *
       * @param value A numeric value from the domain.
       */
  def apply(value: d3DashScaleLib.Anon_ValueOf): Output = js.native
  /**
       * Given a value from the domain, returns the corresponding value from the output range, subject to interpolation.
       *
       * If the given value is outside the domain, and clamping is not enabled, the mapping may be extrapolated such that the returned value is outside the range.
       *
       * @param value A numeric value from the domain.
       */
  def apply(value: scala.Double): Output = js.native
  /**
       * Returns whether or not the scale currently clamps values to within the range.
       */
  def clamp(): scala.Boolean = js.native
  /**
       * Enables or disables clamping, respectively. If clamping is disabled and the scale is passed a value outside the domain,
       * the scale may return a value outside the range through extrapolation.
       *
       * If clamping is enabled, the return value of the scale is always within the scale’s range. Clamping similarly applies to the "invert" method.
       *
       * @param clamp A flag to enable (true) or disable (false) clamping.
       */
  def clamp(clamp: scala.Boolean): this.type = js.native
  /**
       * Returns an exact copy of this scale. Changes to this scale will not affect the returned scale, and vice versa.
       */
  def copy(): ScaleSequential[Output] = js.native
  /**
       * Returns a copy of the scale’s current domain.
       */
  def domain(): js.Tuple2[scala.Double, scala.Double] = js.native
  /**
       * Sets the scale’s domain to the specified array of numbers. The array must contain exactly two elements.
       * If the elements in the given array are not numbers, they will be coerced to numbers
       *
       * @param domain A two-element array of numeric domain values.
       */
  def domain(
    domain: js.Tuple2[
      scala.Double | d3DashScaleLib.Anon_ValueOf, 
      scala.Double | d3DashScaleLib.Anon_ValueOf
    ]
  ): this.type = js.native
  /**
       * Returns the current interpolator underlying the scale.
       */
  def interpolator(): js.Function1[/* t */ scala.Double, Output] = js.native
  /**
       * Sets the scale’s interpolator to the specified function.
       *
       * @param interpolator An interpolator function mapping a value from the [0, 1] interval to an output value.
       */
  def interpolator(interpolator: js.Function1[/* t */ scala.Double, Output]): this.type = js.native
  /**
       * Sets the scale’s interpolator to the specified function.
       *
       * The generic corresponds to a the new output type of the scale. The output type of the scale is determined by the output type of the interpolator function.
       *
       * @param interpolator An interpolator function mapping a value from the [0, 1] interval to an output value.
       */
  @JSName("interpolator")
  def interpolator_NewOutputScaleSequential[NewOutput](interpolator: js.Function1[/* t */ scala.Double, NewOutput]): ScaleSequential[NewOutput] = js.native
}

