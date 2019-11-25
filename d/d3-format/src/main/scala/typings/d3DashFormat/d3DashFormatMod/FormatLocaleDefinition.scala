package typings.d3DashFormat.d3DashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatLocaleDefinition extends js.Object {
  /**
    * The currency prefix and suffix (e.g., ["$", ""]).
    */
  var currency: js.Tuple2[String, String]
  /**
    * The decimal point (e.g., ".")
    */
  var decimal: String
  /**
    * The array of group sizes (e.g., [3]), cycled as needed.
    */
  var grouping: js.Array[Double]
  /**
    * An optional array of ten strings to replace the numerals 0-9.
    */
  var numerals: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An optional symbol to replace the `percent` suffix; the percent suffix (defaults to "%").
    */
  var percent: js.UndefOr[String] = js.undefined
  /**
    * The group separator (e.g., ","). Note that the thousands property is a misnomer, as\
    * the grouping definition allows groups other than thousands.
    */
  var thousands: String
}

object FormatLocaleDefinition {
  @scala.inline
  def apply(
    currency: js.Tuple2[String, String],
    decimal: String,
    grouping: js.Array[Double],
    thousands: String,
    numerals: js.Array[String] = null,
    percent: String = null
  ): FormatLocaleDefinition = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], grouping = grouping.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
    if (numerals != null) __obj.updateDynamic("numerals")(numerals.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatLocaleDefinition]
  }
}

