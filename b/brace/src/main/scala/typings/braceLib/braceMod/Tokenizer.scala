package typings
package braceLib.braceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("brace", "Tokenizer")
@js.native
class TokenizerCls protected ()
  extends braceLib.braceMod.AceAjaxNs.Tokenizer {
  /**
    * Constructs a new tokenizer based on the given rules and flags.
    * @param rules The highlighting rules
    * @param flag Any additional regular expression flags to pass (like "i" for case insensitive)
    **/
  def this(rules: js.Any, flag: java.lang.String) = this()
  /**
    * Returns an object containing two properties: `tokens`, which contains all the tokens; and `state`, the current state.
    **/
  /* CompleteClass */
  override def getLineTokens(): js.Any = js.native
}

