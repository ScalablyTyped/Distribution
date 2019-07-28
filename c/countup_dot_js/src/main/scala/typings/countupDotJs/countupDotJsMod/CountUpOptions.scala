package typings.countupDotJs.countupDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountUpOptions extends js.Object {
  /**
    * Character to use as a decimal
    */
  var decimal: js.UndefOr[String] = js.undefined
  /**
    * Optional custom easing function, default is Robert Penner's easeOutExpo
    * @param t current time
    * @param b start value
    * @param c change in value
    * @param d duration
    * @return calculated value
    */
  var easingFn: js.UndefOr[
    js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Double]
  ] = js.undefined
  /**
    * Optional custom formatting function
    * @param num
    * @return
    */
  var formattingFn: js.UndefOr[js.Function1[/* num */ Double, String]] = js.undefined
  /**
    * Optionally pass an array of custom numerals for 0-9
    */
  var numerals: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Optional text before the result
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * Character to use as a separator
    */
  var separator: js.UndefOr[String] = js.undefined
  /**
    * Optional text after the result
    */
  var suffix: js.UndefOr[String] = js.undefined
  /**
    * Toggle easing
    */
  var useEasing: js.UndefOr[Boolean] = js.undefined
  /**
    * 1,000,000 vs 1000000
    */
  var useGrouping: js.UndefOr[Boolean] = js.undefined
}

object CountUpOptions {
  @scala.inline
  def apply(
    decimal: String = null,
    easingFn: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double = null,
    formattingFn: /* num */ Double => String = null,
    numerals: js.Array[_] = null,
    prefix: String = null,
    separator: String = null,
    suffix: String = null,
    useEasing: js.UndefOr[Boolean] = js.undefined,
    useGrouping: js.UndefOr[Boolean] = js.undefined
  ): CountUpOptions = {
    val __obj = js.Dynamic.literal()
    if (decimal != null) __obj.updateDynamic("decimal")(decimal)
    if (easingFn != null) __obj.updateDynamic("easingFn")(js.Any.fromFunction4(easingFn))
    if (formattingFn != null) __obj.updateDynamic("formattingFn")(js.Any.fromFunction1(formattingFn))
    if (numerals != null) __obj.updateDynamic("numerals")(numerals)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (!js.isUndefined(useEasing)) __obj.updateDynamic("useEasing")(useEasing)
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping)
    __obj.asInstanceOf[CountUpOptions]
  }
}

