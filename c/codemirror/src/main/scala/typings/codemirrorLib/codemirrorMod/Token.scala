package typings
package codemirrorLib.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  /** The character at which the token ends. */
  var end: scala.Double
  /** The character(on the given line) at which the token starts. */
  var start: scala.Double
  /** The mode's state at the end of this token. */
  var state: js.Any
  /** The token's string. */
  var string: java.lang.String
  /** The token type the mode assigned to the token, such as "keyword" or "comment" (may also be null). */
  var `type`: java.lang.String | scala.Null
}

object Token {
  @scala.inline
  def apply(
    end: scala.Double,
    start: scala.Double,
    state: js.Any,
    string: java.lang.String,
    `type`: java.lang.String = null
  ): Token = {
    val __obj = js.Dynamic.literal(end = end, start = start, state = state, string = string)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Token]
  }
}

