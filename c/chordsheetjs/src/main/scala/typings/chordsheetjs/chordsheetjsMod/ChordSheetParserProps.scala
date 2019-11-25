package typings.chordsheetjs.chordsheetjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChordSheetParserProps extends js.Object {
  var preserveWhitespace: Boolean
}

object ChordSheetParserProps {
  @scala.inline
  def apply(preserveWhitespace: Boolean): ChordSheetParserProps = {
    val __obj = js.Dynamic.literal(preserveWhitespace = preserveWhitespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChordSheetParserProps]
  }
}

