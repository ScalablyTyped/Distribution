package typings.chordsheetjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chordsheetjs", "TextFormatter")
@js.native
class TextFormatter () extends js.Object {
  
  def chordLyricsPairLength(chordLyricsPair: ChordLyricsPair): Double = js.native
  
  /**
    * Formats a song into a plain text chord sheet
    * @param song The song to be formatted
    */
  def format(song: Song): String = js.native
  
  def formatHeader(header: SongHeader): String = js.native
  
  def formatItemBottom(item: ChordLyricsPair): String = js.native
  def formatItemBottom(item: Line): String = js.native
  def formatItemBottom(item: Tag): String = js.native
  
  def formatItemTop(item: ChordLyricsPair): String = js.native
  def formatItemTop(item: Line): String = js.native
  def formatItemTop(item: Tag): String = js.native
  
  def formatLine(line: Line): String = js.native
  
  def formatLineBottom(line: Line): String = js.native
  
  def formatLineWithFormatter(line: Line, formatter: js.Function1[/* x */ String, String]): String = js.native
  
  def formatParagraph(paragraph: Paragraph): String = js.native
  
  def formatParagraphs(song: Song): String = js.native
  
  def formatSubtitle(subtitle: String): String = js.native
  
  def formatTitle(title: String): String = js.native
  
  def formatTopLine(line: Line): String | Null = js.native
}
