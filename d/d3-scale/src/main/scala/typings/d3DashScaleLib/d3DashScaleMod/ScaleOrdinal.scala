package typings
package d3DashScaleLib.d3DashScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleOrdinal[Domain /* <: d3DashScaleLib.Anon_ToString */, Range] extends js.Object {
  /**
    * Given a value in the input domain, returns the corresponding value in the output range.
    * If the given value is not in the scale’s domain, returns the unknown; or, if the unknown value is implicit (the default),
    * then the value is implicitly added to the domain and the next-available value in the range is assigned to value,
    * such that this and subsequent invocations of the scale given the same input value return the same output value.
    *
    * @param x A value from the domain.
    */
  def apply(x: Domain): Range = js.native
  /**
    * Returns an exact copy of this ordinal scale. Changes to this scale will not affect the returned scale, and vice versa.
    */
  def copy(): this.type = js.native
  /**
    * Returns the scale's current domain.
    */
  def domain(): js.Array[Domain] = js.native
  /**
    * Sets the domain to the specified array of values.
    *
    * The first element in domain will be mapped to the first element in the range,
    * the second domain value to the second range value, and so on.
    *
    * Domain values are stored internally in a map from stringified value to index; the resulting index is then used to retrieve a value from the range.
    * Thus, an ordinal scale’s values must be coercible to a string, and the stringified version of the domain value uniquely identifies the corresponding range value.
    *
    * Setting the domain on an ordinal scale is optional if the unknown value is implicit (the default).
    * In this case, the domain will be inferred implicitly from usage by assigning each unique value passed to the scale a new value from the range.
    * Note that an explicit domain is recommended to ensure deterministic behavior, as inferring the domain from usage will be dependent on ordering.
    *
    * @param domain Array of domain values.
    */
  def domain(domain: js.Array[Domain]): this.type = js.native
  /**
    * Returns the scale's current range.
    */
  def range(): js.Array[Range] = js.native
  /**
    * Sets the range of the ordinal scale to the specified array of values.
    *
    * The first element in the domain will be mapped to the first element in range, the second domain value to the second range value, and so on.
    *
    * If there are fewer elements in the range than in the domain, the scale will reuse values from the start of the range.
    *
    * @param range Array of range values.
    */
  def range(range: js.Array[Range]): this.type = js.native
  /**
    * Returns the current unknown value, which defaults to "implicit".
    */
  def unknown(): Range | d3DashScaleLib.Anon_Implicit = js.native
  /**
    * Sets the output value of the scale for unknown input values and returns this scale.
    * The implicit value enables implicit domain construction. scaleImplicit can be used as a convenience to set the implicit value.
    *
    * @param value Unknown value to be used or scaleImplicit to set implicit scale generation.
    */
  def unknown(value: Range): this.type = js.native
  def unknown(value: d3DashScaleLib.Anon_Implicit): this.type = js.native
}

