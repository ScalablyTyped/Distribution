package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  /** The character at which the token ends. */
  var end: Double
  /** The character(on the given line) at which the token starts. */
  var start: Double
  /** The mode's state at the end of this token. */
  var state: js.Any
  /** The token's string. */
  var string: String
  /** The token type the mode assigned to the token, such as "keyword" or "comment" (may also be null). */
  var `type`: String | Null
}

object Token {
  @scala.inline
  def apply(end: Double, start: Double, state: js.Any, string: String, `type`: String = null): Token = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

