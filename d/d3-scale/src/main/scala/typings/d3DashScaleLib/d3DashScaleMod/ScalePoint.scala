package typings
package d3DashScaleLib.d3DashScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalePoint[Domain /* <: d3DashScaleLib.Anon_ToString */] extends js.Object {
  /**
    * Given a value in the input domain, returns the corresponding point derived from the output range.
    * If the given value is not in the scale’s domain, returns undefined.
    *
    * @param x  A value from the domain.
    */
  def apply(x: Domain): js.UndefOr[scala.Double] = js.native
  /**
    * Returns the current alignment which defaults to 0.5.
    */
  def align(): scala.Double = js.native
  /**
    * Sets the alignment to the specified value which must be in the range [0, 1].
    *
    * The alignment determines how any leftover unused space in the range is distributed.
    * A value of 0.5 indicates that the leftover space should be equally distributed before the first point and after the last point;
    * i.e., the points should be centered within the range. A value of 0 or 1 may be used to shift the points to one side, say to position them adjacent to an axis.
    *
    * The default value is 0.5.
    *
    * @param align Value for alignment setting in [0, 1] interval.
    */
  def align(align: scala.Double): this.type = js.native
  /**
    * Return 0.
    */
  def bandwidth(): scala.Double = js.native
  /**
    * Returns an exact copy of this scale. Changes to this scale will not affect the returned scale, and vice versa.
    */
  def copy(): this.type = js.native
  /**
    * Returns the scale's current domain.
    */
  def domain(): js.Array[Domain] = js.native
  /**
    * Sets the domain to the specified array of values. The first element in domain will be mapped to the first point, the second domain value to the second point, and so on.
    * Domain values are stored internally in a map from stringified value to index; the resulting index is then used to determine the point.
    * Thus, a point scale’s values must be coercible to a string, and the stringified version of the domain value uniquely identifies the corresponding point.
    *
    * @param domain Array of domain values.
    */
  def domain(domain: js.Array[Domain]): this.type = js.native
  /**
    * Returns the current outer padding which defaults to 0.
    * The outer padding determines the ratio of the range that is reserved for blank space
    * before the first point and after the last point.
    *
    */
  def padding(): scala.Double = js.native
  /**
    * Sets the outer padding to the specified value which must be in the range [0, 1].
    * The outer padding determines the ratio of the range that is reserved for blank space
    * before the first point and after the last point.
    *
    * The default is 0.
    *
    * @param padding Value for outer padding in [0, 1] interval.
    */
  def padding(padding: scala.Double): this.type = js.native
  /**
    * Returns the scale’s current range, which defaults to [0, 1].
    */
  def range(): js.Tuple2[scala.Double, scala.Double] = js.native
  /**
    * Sets the scale’s range to the specified two-element array of numbers.
    * If the elements in the given array are not numbers, they will be coerced to numbers.
    * The default range is [0, 1].
    *
    * @param range A two-element array of numeric values.
    */
  def range(
    range: js.Tuple2[
      scala.Double | d3DashScaleLib.Anon_ValueOf, 
      scala.Double | d3DashScaleLib.Anon_ValueOf
    ]
  ): this.type = js.native
  /**
    * Sets the scale’s range to the specified two-element array of numbers while also enabling rounding.
    * If the elements in the given array are not numbers, they will be coerced to numbers.
    *
    * Rounding is sometimes useful for avoiding antialiasing artifacts, though also consider the shape-rendering “crispEdges” styles.
    *
    * @param range A two-element array of numeric values.
    */
  def rangeRound(
    range: js.Tuple2[
      scala.Double | d3DashScaleLib.Anon_ValueOf, 
      scala.Double | d3DashScaleLib.Anon_ValueOf
    ]
  ): this.type = js.native
  /**
    * Returns the current rounding status for the scale: enabled (= true) or disabled (= false).
    */
  def round(): scala.Boolean = js.native
  /**
    * Enables or disables rounding accordingly. If rounding is enabled, the position of each point will be integers.
    * Rounding is sometimes useful for avoiding antialiasing artifacts, though also consider the shape-rendering “crispEdges” styles.
    * Note that if the width of the domain is not a multiple of the cardinality of the range, there may be leftover unused space, even without padding!
    * Use point.align to specify how the leftover space is distributed.
    *
    * @param round Enable rounding (= true), disable rounding (= false).
    */
  def round(round: scala.Boolean): this.type = js.native
  /**
    * Returns the distance between the starts of adjacent points.
    */
  def step(): scala.Double = js.native
}

