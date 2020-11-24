package typings.chordsheetjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chordsheetjs", "ChordProFormatter")
@js.native
class ChordProFormatter () extends js.Object {
  
  /**
    * Formats a song into a ChordPro chord sheet.
    * @param song The song to be formatted
    */
  def format(song: Song): String = js.native
  
  def formatChordLyricsPair(chordLyricsPair: ChordLyricsPair): String = js.native
  
  def formatChordLyricsPairChords(chordLyricsPair: ChordLyricsPair): String = js.native
  
  def formatChordLyricsPairLyrics(chordLyricsPair: ChordLyricsPair): String = js.native
  
  def formatItem(item: ChordLyricsPair): String = js.native
  def formatItem(item: Line): String = js.native
  def formatItem(item: Tag): String = js.native
  
  def formatLine(line: Line): String = js.native
  
  def formatTag(tag: Tag): String = js.native
}
