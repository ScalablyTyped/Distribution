package typings
package bignumberDotJsLib.bignumberDotJsMod.BigNumberNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** See `FORMAT` and `toFormat`. */
trait Format extends js.Object {
  /** The decimal separator. */
  var decimalSeparator: js.UndefOr[java.lang.String] = js.undefined
  /** The grouping separator of the fraction part. */
  var fractionGroupSeparator: js.UndefOr[java.lang.String] = js.undefined
  /** The grouping size of the fraction part. */
  var fractionGroupSize: js.UndefOr[scala.Double] = js.undefined
  /** The grouping separator of the integer part. */
  var groupSeparator: js.UndefOr[java.lang.String] = js.undefined
  /** The primary grouping size of the integer part. */
  var groupSize: js.UndefOr[scala.Double] = js.undefined
  /** The string to prepend. */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /** The secondary grouping size of the integer part. */
  var secondaryGroupSize: js.UndefOr[scala.Double] = js.undefined
  /** The string to append. */
  var suffix: js.UndefOr[java.lang.String] = js.undefined
}

object Format {
  @scala.inline
  def apply(
    decimalSeparator: java.lang.String = null,
    fractionGroupSeparator: java.lang.String = null,
    fractionGroupSize: scala.Int | scala.Double = null,
    groupSeparator: java.lang.String = null,
    groupSize: scala.Int | scala.Double = null,
    prefix: java.lang.String = null,
    secondaryGroupSize: scala.Int | scala.Double = null,
    suffix: java.lang.String = null
  ): Format = {
    val __obj = js.Dynamic.literal()
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator)
    if (fractionGroupSeparator != null) __obj.updateDynamic("fractionGroupSeparator")(fractionGroupSeparator)
    if (fractionGroupSize != null) __obj.updateDynamic("fractionGroupSize")(fractionGroupSize.asInstanceOf[js.Any])
    if (groupSeparator != null) __obj.updateDynamic("groupSeparator")(groupSeparator)
    if (groupSize != null) __obj.updateDynamic("groupSize")(groupSize.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (secondaryGroupSize != null) __obj.updateDynamic("secondaryGroupSize")(secondaryGroupSize.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[Format]
  }
}

