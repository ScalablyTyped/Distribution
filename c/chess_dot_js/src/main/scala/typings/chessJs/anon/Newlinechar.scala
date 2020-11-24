package typings.chessJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var newline_char: js.UndefOr[String] = js.native
  
  /**
    * The sloppy flag is a boolean that permits chess.js to parse moves in
    * non-standard notations.
    * See .move documentation for more information about non-SAN
    * notations.
    */
  var sloppy: js.UndefOr[Boolean] = js.native
}
object Newlinechar {
  
  @scala.inline
  def apply(): Newlinechar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Newlinechar]
  }
  
  @scala.inline
  implicit class NewlinecharOps[Self <: Newlinechar] (val x: Self) extends AnyVal {
    
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
    def setNewline_char(value: String): Self = this.set("newline_char", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewline_char: Self = this.set("newline_char", js.undefined)
    
    @scala.inline
    def setSloppy(value: Boolean): Self = this.set("sloppy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSloppy: Self = this.set("sloppy", js.undefined)
  }
}
