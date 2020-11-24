package typings.chordsheetjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChordSheetParserProps extends js.Object {
  
  var preserveWhitespace: Boolean = js.native
}
object ChordSheetParserProps {
  
  @scala.inline
  def apply(preserveWhitespace: Boolean): ChordSheetParserProps = {
    val __obj = js.Dynamic.literal(preserveWhitespace = preserveWhitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChordSheetParserProps]
  }
  
  @scala.inline
  implicit class ChordSheetParserPropsOps[Self <: ChordSheetParserProps] (val x: Self) extends AnyVal {
    
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
    def setPreserveWhitespace(value: Boolean): Self = this.set("preserveWhitespace", value.asInstanceOf[js.Any])
  }
}
