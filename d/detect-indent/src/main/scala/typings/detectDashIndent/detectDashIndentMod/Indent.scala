package typings.detectDashIndent.detectDashIndentMod

import typings.detectDashIndent.detectDashIndentStrings.space
import typings.detectDashIndent.detectDashIndentStrings.tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indent extends js.Object {
  /**
  		Amount of indentation, for example `2`.
  		*/
  var amount: Double
  /**
  		Actual indentation.
  		*/
  var indent: String
  /**
  		Type of indentation. Is `undefined` if no indentation is detected.
  		*/
  var `type`: js.UndefOr[tab | space] = js.undefined
}

object Indent {
  @scala.inline
  def apply(amount: Double, indent: String, `type`: tab | space = null): Indent = {
    val __obj = js.Dynamic.literal(amount = amount, indent = indent)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indent]
  }
}

