package typings
package babyparseLib.BabyParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnparseConfig extends js.Object {
      // default: false
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
    // default: ","
  var newline: js.UndefOr[java.lang.String] = js.undefined
  var quotes: js.UndefOr[scala.Boolean | js.Array[scala.Boolean]] = js.undefined
}

object UnparseConfig {
  @scala.inline
  def apply(
    delimiter: java.lang.String = null,
    newline: java.lang.String = null,
    quotes: scala.Boolean | js.Array[scala.Boolean] = null
  ): UnparseConfig = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (newline != null) __obj.updateDynamic("newline")(newline)
    if (quotes != null) __obj.updateDynamic("quotes")(quotes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnparseConfig]
  }
}

