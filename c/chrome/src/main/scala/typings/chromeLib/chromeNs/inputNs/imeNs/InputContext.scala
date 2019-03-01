package typings
package chromeLib.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputContext extends js.Object {
  /**
    * Whether the text field wants auto-complete.
    * @since Chrome 40.
    */
  var autoComplete: scala.Boolean
  /**
    * Whether the text field wants auto-correct.
    * @since Chrome 40.
    */
  var autoCorrect: scala.Boolean
  /** This is used to specify targets of text field operations. This ID becomes invalid as soon as onBlur is called. */
  var contextID: scala.Double
  /**
    * Whether the text field wants spell-check.
    * @since Chrome 40.
    */
  var spellCheck: scala.Boolean
  /** Type of value this text field edits, (Text, Number, URL, etc) */
  var `type`: java.lang.String
}

object InputContext {
  @scala.inline
  def apply(
    autoComplete: scala.Boolean,
    autoCorrect: scala.Boolean,
    contextID: scala.Double,
    spellCheck: scala.Boolean,
    `type`: java.lang.String
  ): InputContext = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("autoComplete")(autoComplete)
    __obj.updateDynamic("autoCorrect")(autoCorrect)
    __obj.updateDynamic("contextID")(contextID)
    __obj.updateDynamic("spellCheck")(spellCheck)
    __obj.asInstanceOf[InputContext]
  }
}

