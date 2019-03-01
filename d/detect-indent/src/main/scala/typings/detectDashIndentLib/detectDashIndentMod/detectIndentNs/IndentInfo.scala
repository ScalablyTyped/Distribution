package typings
package detectDashIndentLib.detectDashIndentMod.detectIndentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndentInfo extends js.Object {
  var amount: scala.Double
  var indent: java.lang.String
  var `type`: detectDashIndentLib.detectDashIndentLibStrings.tab | detectDashIndentLib.detectDashIndentLibStrings.space | scala.Null
}

object IndentInfo {
  @scala.inline
  def apply(
    amount: scala.Double,
    indent: java.lang.String,
    `type`: detectDashIndentLib.detectDashIndentLibStrings.tab | detectDashIndentLib.detectDashIndentLibStrings.space = null
  ): IndentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("indent")(indent)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndentInfo]
  }
}

