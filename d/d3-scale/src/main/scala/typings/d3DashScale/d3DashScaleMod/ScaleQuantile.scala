package typings.d3DashScale.d3DashScaleMod

import typings.d3DashScale.Anon_ValueOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleQuantile[Range] extends js.Object {
  /**
    * Given a value in the input domain, returns the corresponding value in the output range.
    *
    * @param value A numeric value in the input domain.
    */
  def apply(value: Double): Range = js.native
  def apply(value: Anon_ValueOf): Range = js.native
  /**
    * Returns an exact copy of this scale. Changes to this scale will not affect the returned scale, and vice versa.
    */
  def copy(): this.type = js.native
  /**
    * Returns the scale’s current domain.
    */
  def domain(): js.Array[Double] = js.native
  /**
    * Sets the domain of the quantile scale to the specified set of discrete numeric values.
    * The array must not be empty, and must contain at least one numeric value; NaN, null and undefined values are ignored and not considered part of the sample population.
    *
    * If the elements in the given array are not numbers, they will be coerced to numbers. A copy of the input array is sorted and stored internally.
    *
    * @param domain Array of domain values.
    */
  def domain(domain: js.Array[js.UndefOr[Double | Anon_ValueOf | Null]]): this.type = js.native
  /**
    * Returns the extent of values in the domain [x0, x1] for the corresponding value in the range: the inverse of quantile.
    * This method is useful for interaction, say to determine the value in the domain that corresponds to the pixel location under the mouse.
    *
    * @param value A value from the range.
    */
  def invertExtent(value: Range): js.Tuple2[Double, Double] = js.native
  /**
    * Returns the quantile thresholds. If the range contains n discrete values, the returned array will contain n - 1 thresholds.
    * Values less than the first threshold are considered in the first quantile;
    * values greater than or equal to the first threshold but less than the second threshold are in the second quantile, and so on.
    * Internally, the thresholds array is used with bisect to find the output quantile associated with the given input value.
    */
  def quantiles(): js.Array[Double] = js.native
  /**
    * Returns the current range.
    */
  def range(): js.Array[Range] = js.native
  /**
    * Sets the discrete values in the range. The array must not be empty.
    * The number of values in (the cardinality, or length, of) the range array determines the number of quantiles that are computed.
    *
    * For example, to compute quartiles, range must be an array of four elements such as [0, 1, 2, 3].
    *
    * @param range Array of range values.
    */
  def range(range: js.Array[Range]): this.type = js.native
}

