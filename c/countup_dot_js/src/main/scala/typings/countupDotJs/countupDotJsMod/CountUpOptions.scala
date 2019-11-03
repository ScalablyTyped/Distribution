package typings.countupDotJs.countupDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountUpOptions extends js.Object {
  var decimal: js.UndefOr[String] = js.undefined
  var decimalPlaces: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easingFn: js.UndefOr[
    js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Double]
  ] = js.undefined
  var formattingFn: js.UndefOr[js.Function1[/* n */ Double, String]] = js.undefined
  var numerals: js.UndefOr[js.Array[String]] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var smartEasingAmount: js.UndefOr[Double] = js.undefined
  var smartEasingThreshold: js.UndefOr[Double] = js.undefined
  var startVal: js.UndefOr[Double] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
  var useEasing: js.UndefOr[Boolean] = js.undefined
  var useGrouping: js.UndefOr[Boolean] = js.undefined
}

object CountUpOptions {
  @scala.inline
  def apply(
    decimal: String = null,
    decimalPlaces: Int | Double = null,
    duration: Int | Double = null,
    easingFn: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double = null,
    formattingFn: /* n */ Double => String = null,
    numerals: js.Array[String] = null,
    prefix: String = null,
    separator: String = null,
    smartEasingAmount: Int | Double = null,
    smartEasingThreshold: Int | Double = null,
    startVal: Int | Double = null,
    suffix: String = null,
    useEasing: js.UndefOr[Boolean] = js.undefined,
    useGrouping: js.UndefOr[Boolean] = js.undefined
  ): CountUpOptions = {
    val __obj = js.Dynamic.literal()
    if (decimal != null) __obj.updateDynamic("decimal")(decimal)
    if (decimalPlaces != null) __obj.updateDynamic("decimalPlaces")(decimalPlaces.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easingFn != null) __obj.updateDynamic("easingFn")(js.Any.fromFunction4(easingFn))
    if (formattingFn != null) __obj.updateDynamic("formattingFn")(js.Any.fromFunction1(formattingFn))
    if (numerals != null) __obj.updateDynamic("numerals")(numerals)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (smartEasingAmount != null) __obj.updateDynamic("smartEasingAmount")(smartEasingAmount.asInstanceOf[js.Any])
    if (smartEasingThreshold != null) __obj.updateDynamic("smartEasingThreshold")(smartEasingThreshold.asInstanceOf[js.Any])
    if (startVal != null) __obj.updateDynamic("startVal")(startVal.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (!js.isUndefined(useEasing)) __obj.updateDynamic("useEasing")(useEasing)
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping)
    __obj.asInstanceOf[CountUpOptions]
  }
}

