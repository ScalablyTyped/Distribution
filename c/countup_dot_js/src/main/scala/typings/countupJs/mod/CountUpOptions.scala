package typings.countupJs.mod

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
    decimalPlaces: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    easingFn: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double = null,
    formattingFn: /* n */ Double => String = null,
    numerals: js.Array[String] = null,
    prefix: String = null,
    separator: String = null,
    smartEasingAmount: js.UndefOr[Double] = js.undefined,
    smartEasingThreshold: js.UndefOr[Double] = js.undefined,
    startVal: js.UndefOr[Double] = js.undefined,
    suffix: String = null,
    useEasing: js.UndefOr[Boolean] = js.undefined,
    useGrouping: js.UndefOr[Boolean] = js.undefined
  ): CountUpOptions = {
    val __obj = js.Dynamic.literal()
    if (decimal != null) __obj.updateDynamic("decimal")(decimal.asInstanceOf[js.Any])
    if (!js.isUndefined(decimalPlaces)) __obj.updateDynamic("decimalPlaces")(decimalPlaces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easingFn != null) __obj.updateDynamic("easingFn")(js.Any.fromFunction4(easingFn))
    if (formattingFn != null) __obj.updateDynamic("formattingFn")(js.Any.fromFunction1(formattingFn))
    if (numerals != null) __obj.updateDynamic("numerals")(numerals.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(smartEasingAmount)) __obj.updateDynamic("smartEasingAmount")(smartEasingAmount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smartEasingThreshold)) __obj.updateDynamic("smartEasingThreshold")(smartEasingThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startVal)) __obj.updateDynamic("startVal")(startVal.get.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (!js.isUndefined(useEasing)) __obj.updateDynamic("useEasing")(useEasing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountUpOptions]
  }
}

