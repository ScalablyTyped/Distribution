package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Token extends js.Object {
  /** The character at which the token ends. */
  var end: Double = js.native
  /** The character(on the given line) at which the token starts. */
  var start: Double = js.native
  /** The mode's state at the end of this token. */
  var state: js.Any = js.native
  /** The token's string. */
  var string: String = js.native
  /** The token type the mode assigned to the token, such as "keyword" or "comment" (may also be null). */
  var `type`: String | Null = js.native
}

object Token {
  @scala.inline
  def apply(end: Double, start: Double, state: js.Any, string: String): Token = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
  
}

