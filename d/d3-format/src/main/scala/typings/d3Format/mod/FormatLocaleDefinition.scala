package typings.d3Format.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatLocaleDefinition extends js.Object {
  /**
    * The currency prefix and suffix (e.g., ["$", ""]).
    */
  var currency: js.Tuple2[String, String] = js.native
  /**
    * The decimal point (e.g., ".")
    */
  var decimal: String = js.native
  /**
    * The array of group sizes (e.g., [3]), cycled as needed.
    */
  var grouping: js.Array[Double] = js.native
  /**
    * An optional array of ten strings to replace the numerals 0-9.
    */
  var numerals: js.UndefOr[js.Array[String]] = js.native
  /**
    * An optional symbol to replace the `percent` suffix; the percent suffix (defaults to "%").
    */
  var percent: js.UndefOr[String] = js.native
  /**
    * The group separator (e.g., ","). Note that the thousands property is a misnomer, as\
    * the grouping definition allows groups other than thousands.
    */
  var thousands: String = js.native
}

object FormatLocaleDefinition {
  @scala.inline
  def apply(
    currency: js.Tuple2[String, String],
    decimal: String,
    grouping: js.Array[Double],
    thousands: String
  ): FormatLocaleDefinition = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], grouping = grouping.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatLocaleDefinition]
  }
  @scala.inline
  implicit class FormatLocaleDefinitionOps[Self <: FormatLocaleDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrency(value: js.Tuple2[String, String]): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecimal(value: String): Self = this.set("decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupingVarargs(value: Double*): Self = this.set("grouping", js.Array(value :_*))
    @scala.inline
    def setGrouping(value: js.Array[Double]): Self = this.set("grouping", value.asInstanceOf[js.Any])
    @scala.inline
    def setThousands(value: String): Self = this.set("thousands", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumeralsVarargs(value: String*): Self = this.set("numerals", js.Array(value :_*))
    @scala.inline
    def setNumerals(value: js.Array[String]): Self = this.set("numerals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumerals: Self = this.set("numerals", js.undefined)
    @scala.inline
    def setPercent(value: String): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
  }
  
}

