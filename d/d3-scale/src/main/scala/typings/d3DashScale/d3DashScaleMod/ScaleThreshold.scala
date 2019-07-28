package typings.d3DashScale.d3DashScaleMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleThreshold[Domain /* <: Double | String | Date */, Range] extends js.Object {
  /**
    * Given a value in the input domain, returns the corresponding value in the output range.
    *
    * @param value A domain value.
    */
  def apply(value: Domain): Range = js.native
  /**
    * Returns an exact copy of this scale. Changes to this scale will not affect the returned scale, and vice versa.
    */
  def copy(): this.type = js.native
  /**
    * Returns the scale’s current domain.
    */
  def domain(): js.Array[Domain] = js.native
  /**
    * Sets the scale’s domain to the specified array of values. The values must be in sorted ascending order, or the behavior of the scale is undefined.
    * The values are typically numbers, but any naturally ordered values (such as strings) will work; a threshold scale can be used to encode any type that is ordered.
    * If the number of values in the scale’s range is N+1, the number of values in the scale’s domain must be N.
    * If there are fewer than N elements in the domain, the additional values in the range are ignored.
    * If there are more than N elements in the domain, the scale may return undefined for some inputs.
    *
    * @param domain Array of domain values.
    */
  def domain(domain: js.Array[Domain]): this.type = js.native
  /**
    * Returns the extent of values in the domain [x0, x1] for the corresponding value in the range, representing the inverse mapping from range to domain.
    * This method is useful for interaction, say to determine the value in the domain that corresponds to the pixel location under the mouse.
    *
    * @param value A range value.
    */
  def invertExtent(value: Range): js.Tuple2[js.UndefOr[Domain], js.UndefOr[Domain]] = js.native
  /**
    * Returns the scale’s current range.
    */
  def range(): js.Array[Range] = js.native
  /**
    * Sets the scale’s range to the specified array of values. If the number of values in the scale’s domain is N, the number of values in the scale’s range must be N+1.
    * If there are fewer than N+1 elements in the range, the scale may return undefined for some inputs.
    * If there are more than N+1 elements in the range, the additional values are ignored.
    *
    * @param range Array of range values.
    */
  def range(range: js.Array[Range]): this.type = js.native
}

