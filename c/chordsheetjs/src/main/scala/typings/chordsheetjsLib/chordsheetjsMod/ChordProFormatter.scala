package typings
package chordsheetjsLib.chordsheetjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chordsheetjs", "ChordProFormatter")
@js.native
class ChordProFormatter () extends js.Object {
  /**
       * Formats a song into a ChordPro chord sheet.
       * @param song The song to be formatted
       */
  def format(song: Song): java.lang.String = js.native
  def formatChordLyricsPair(chordLyricsPair: ChordLyricsPair): java.lang.String = js.native
  def formatChordLyricsPairChords(chordLyricsPair: ChordLyricsPair): java.lang.String = js.native
  def formatChordLyricsPairLyrics(chordLyricsPair: ChordLyricsPair): java.lang.String = js.native
  def formatItem(item: ChordLyricsPair): java.lang.String = js.native
  def formatItem(item: Line): java.lang.String = js.native
  def formatItem(item: Tag): java.lang.String = js.native
  def formatLine(line: Line): java.lang.String = js.native
  def formatTag(tag: Tag): java.lang.String = js.native
}

