package typings.chessJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Newlinechar extends js.Object {
  /**
    * The newline_char is a string representation of a valid RegExp
    * fragment and is used to process the PGN.
    * It defaults to \r?\n.
    * Special characters should not be pre-escaped, but any literal
    * special characters should be escaped as is normal for a RegExp.
    * Keep in mind that backslashes in JavaScript strings must
    * themselves be escaped.
    * Avoid using a newline_char that may occur elsewhere in a PGN,
    * such as . or x, as this will result in unexpected behavior.
    */
  var newline_char: js.UndefOr[String] = js.undefined
  /**
    * The sloppy flag is a boolean that permits chess.js to parse moves in
    * non-standard notations.
    * See .move documentation for more information about non-SAN
    * notations.
    */
  var sloppy: js.UndefOr[Boolean] = js.undefined
}

object Newlinechar {
  @scala.inline
  def apply(newline_char: String = null, sloppy: js.UndefOr[Boolean] = js.undefined): Newlinechar = {
    val __obj = js.Dynamic.literal()
    if (newline_char != null) __obj.updateDynamic("newline_char")(newline_char.asInstanceOf[js.Any])
    if (!js.isUndefined(sloppy)) __obj.updateDynamic("sloppy")(sloppy.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Newlinechar]
  }
}

