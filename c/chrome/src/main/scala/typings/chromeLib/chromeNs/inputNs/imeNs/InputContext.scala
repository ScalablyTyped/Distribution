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

