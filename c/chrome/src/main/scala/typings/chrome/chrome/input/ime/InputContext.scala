package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputContext extends js.Object {
  /**
    * Whether the text field wants auto-complete.
    * @since Chrome 40.
    */
  var autoComplete: Boolean
  /**
    * Whether the text field wants auto-correct.
    * @since Chrome 40.
    */
  var autoCorrect: Boolean
  /** This is used to specify targets of text field operations. This ID becomes invalid as soon as onBlur is called. */
  var contextID: Double
  /**
    * Whether the text field wants spell-check.
    * @since Chrome 40.
    */
  var spellCheck: Boolean
  /** Type of value this text field edits, (Text, Number, URL, etc) */
  var `type`: String
}

object InputContext {
  @scala.inline
  def apply(
    autoComplete: Boolean,
    autoCorrect: Boolean,
    contextID: Double,
    spellCheck: Boolean,
    `type`: String
  ): InputContext = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete, autoCorrect = autoCorrect, contextID = contextID, spellCheck = spellCheck)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InputContext]
  }
}

