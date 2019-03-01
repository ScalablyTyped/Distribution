package typings
package braceLib.braceMod.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tokenizer extends js.Object {
  /**
    * Returns an object containing two properties: `tokens`, which contains all the tokens; and `state`, the current state.
    **/
  def getLineTokens(): js.Any
}

object Tokenizer {
  @scala.inline
  def apply(getLineTokens: js.Function0[js.Any]): Tokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLineTokens")(getLineTokens)
    __obj.asInstanceOf[Tokenizer]
  }
}

