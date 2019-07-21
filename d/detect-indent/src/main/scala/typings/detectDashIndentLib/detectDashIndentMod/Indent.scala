package typings
package detectDashIndentLib.detectDashIndentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indent extends js.Object {
  /**
  		Amount of indentation, for example `2`.
  		*/
  var amount: scala.Double
  /**
  		Actual indentation.
  		*/
  var indent: java.lang.String
  /**
  		Type of indentation. Is `undefined` if no indentation is detected.
  		*/
  var `type`: js.UndefOr[
    detectDashIndentLib.detectDashIndentLibStrings.tab | detectDashIndentLib.detectDashIndentLibStrings.space
  ] = js.undefined
}

object Indent {
  @scala.inline
  def apply(
    amount: scala.Double,
    indent: java.lang.String,
    `type`: detectDashIndentLib.detectDashIndentLibStrings.tab | detectDashIndentLib.detectDashIndentLibStrings.space = null
  ): Indent = {
    val __obj = js.Dynamic.literal(amount = amount, indent = indent)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indent]
  }
}

