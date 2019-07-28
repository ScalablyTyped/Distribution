package typings.d3DashScale.d3DashScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalePower[Range, Output] extends ScaleContinuousNumeric[Range, Output] {
  /**
    * If exponent is not specified, returns the current exponent, which defaults to 1.
    * (Note that this is effectively a linear scale until you set a different exponent.)
    */
  def exponent(): Double = js.native
  /**
    * Sets the current exponent to the given numeric value.
    * (Note that this is effectively a linear scale until you set a different exponent.)
    */
  def exponent(exponent: Double): this.type = js.native
  /**
    * Returns the scale’s current interpolator factory, which defaults to interpolate.
    */
  def interpolate(): InterpolatorFactory[_, _] = js.native
  /**
    * Sets the scale’s range interpolator factory. This interpolator factory is used to create interpolators for each adjacent pair of values from the range;
    * these interpolators then map a normalized domain parameter t in [0, 1] to the corresponding value in the range.
    *
    * Note: the default interpolator may reuse return values. For example, if the range values are objects, then the value interpolator always returns the same object, modifying it in-place.
    * If the scale is used to set an attribute or style, this is typically acceptable (and desirable for performance);
    * however, if you need to store the scale’s return value, you must specify your own interpolator or make a copy as appropriate.
    *
    * As part of the interpolation process the interpolated value from the range may be converted to a corresponding output value.
    *
    * @param interpolate An interpolation factory. The generics for Range and Output of the scale must correspond to the interpolation factory applied to the scale.
    */
  def interpolate(interpolate: InterpolatorFactory[Range, Output]): this.type = js.native
  /**
    * Sets the scale’s range interpolator factory. This interpolator factory is used to create interpolators for each adjacent pair of values from the range;
    * these interpolators then map a normalized domain parameter t in [0, 1] to the corresponding value in the range.
    *
    * Note: the default interpolator may reuse return values. For example, if the range values are objects, then the value interpolator always returns the same object, modifying it in-place.
    * If the scale is used to set an attribute or style, this is typically acceptable (and desirable for performance);
    * however, if you need to store the scale’s return value, you must specify your own interpolator or make a copy as appropriate.
    *
    * As part of the interpolation process the interpolated value from the range may be converted to a corresponding output value.
    *
    * The generic "NewOutput" can be used to change the scale to have a different output element type corresponding to the new interpolation factory.
    *
    * @param interpolate An interpolation factory. The generics for Range and Output of the scale must correspond to the interpolation factory applied to the scale.
    */
  @JSName("interpolate")
  def interpolate_NewOutput_ScalePower[NewOutput](interpolate: InterpolatorFactory[Range, NewOutput]): ScalePower[Range, NewOutput] = js.native
}

