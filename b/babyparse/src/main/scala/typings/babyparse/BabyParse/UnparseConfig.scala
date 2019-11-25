package typings.babyparse.BabyParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnparseConfig extends js.Object {
      // default: false
  var delimiter: js.UndefOr[String] = js.undefined
    // default: ","
  var newline: js.UndefOr[String] = js.undefined
  var quotes: js.UndefOr[Boolean | js.Array[Boolean]] = js.undefined
}

object UnparseConfig {
  @scala.inline
  def apply(delimiter: String = null, newline: String = null, quotes: Boolean | js.Array[Boolean] = null): UnparseConfig = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (newline != null) __obj.updateDynamic("newline")(newline.asInstanceOf[js.Any])
    if (quotes != null) __obj.updateDynamic("quotes")(quotes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnparseConfig]
  }
}

