package typings
package chordsheetjsLib.chordsheetjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chordsheetjs", "TextFormatter")
@js.native
class TextFormatter () extends js.Object {
  def chordLyricsPairLength(chordLyricsPair: ChordLyricsPair): scala.Double = js.native
  /**
       * Formats a song into a plain text chord sheet
       * @param song The song to be formatted
       */
  def format(song: Song): java.lang.String = js.native
  def formatHeader(header: SongHeader): java.lang.String = js.native
  def formatItemBottom(item: ChordLyricsPair): java.lang.String = js.native
  def formatItemBottom(item: Line): java.lang.String = js.native
  def formatItemBottom(item: Tag): java.lang.String = js.native
  def formatItemTop(item: ChordLyricsPair): java.lang.String = js.native
  def formatItemTop(item: Line): java.lang.String = js.native
  def formatItemTop(item: Tag): java.lang.String = js.native
  def formatLine(line: Line): java.lang.String = js.native
  def formatLineBottom(line: Line): java.lang.String = js.native
  def formatLineWithFormatter(line: Line, formatter: js.Function1[/* x */ java.lang.String, java.lang.String]): java.lang.String = js.native
  def formatParagraph(paragraph: Paragraph): java.lang.String = js.native
  def formatParagraphs(song: Song): java.lang.String = js.native
  def formatSubtitle(subtitle: java.lang.String): java.lang.String = js.native
  def formatTitle(title: java.lang.String): java.lang.String = js.native
  def formatTopLine(line: Line): java.lang.String | scala.Null = js.native
}

