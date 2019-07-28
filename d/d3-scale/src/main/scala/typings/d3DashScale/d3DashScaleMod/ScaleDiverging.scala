package typings.d3DashScale.d3DashScaleMod

import typings.d3DashScale.Anon_ValueOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleDiverging[Output] extends js.Object {
  /**
    * Given a value from the domain, returns the corresponding value subject to interpolation.
    *
    * If the given value is outside the domain, and clamping is not enabled, the mapping may be extrapolated such that the returned value is outside the range.
    *
    * @param value A numeric value from the domain.
    */
  def apply(value: Double): Output = js.native
  def apply(value: Anon_ValueOf): Output = js.native
  /**
    * Returns whether or not the scale currently clamps values to within the range.
    */
  def clamp(): Boolean = js.native
  /**
    * Enables or disables clamping, respectively. If clamping is disabled and the scale is passed a value outside the domain,
    * the scale may return a value outside the range through extrapolation.
    *
    * If clamping is enabled, the return value of the scale is always within the interpolator scale’s range.
    *
    * @param clamp A flag to enable (true) or disable (false) clamping.
    */
  def clamp(clamp: Boolean): this.type = js.native
  /**
    * Returns an exact copy of this scale. Changes to this scale will not affect the returned scale, and vice versa.
    */
  def copy(): this.type = js.native
  /**
    * Returns a copy of the scale’s current domain.
    */
  def domain(): js.Tuple3[Double, Double, Double] = js.native
  /**
    * Sets the scale’s domain to the specified array of numbers.
    * The domain must be numeric and must contain exactly three values. The default domain is [0, 0.5, 1].
    * If the elements in the given array are not numbers, they will be coerced to numbers
    *
    * @param domain Array of three numeric domain values.
    */
  def domain(domain: js.Tuple3[Double | Anon_ValueOf, Double | Anon_ValueOf, Double | Anon_ValueOf]): this.type = js.native
  /**
    * Sets the scale’s interpolator to the specified function.
    *
    * @param interpolator The scale’s interpolator.
    */
  def interpolator(): this.type = js.native
  def interpolator(interpolator: js.Function1[/* t */ Double, Output]): this.type = js.native
  /**
    * Returns the scale’s current interpolator.
    */
  @JSName("interpolator")
  def interpolator_Function1(): js.Function1[/* t */ Double, Output] = js.native
}

