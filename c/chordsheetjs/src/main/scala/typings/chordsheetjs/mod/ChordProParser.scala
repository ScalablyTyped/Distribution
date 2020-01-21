package typings.chordsheetjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chordsheetjs", "ChordProParser")
@js.native
class ChordProParser () extends js.Object {
  var lineNumber: Double = js.native
  var sectionType: String = js.native
  var song: Song = js.native
  var warnings: js.Array[ParserWarning] = js.native
  def addWarning(message: String): Unit = js.native
  def applyTag(tag: Tag): Unit = js.native
  def checkCurrentSectionType(sectionType: String, tag: Tag): Unit = js.native
  def endSection(sectionType: String, tag: Tag): Unit = js.native
  def finishTag(): Unit = js.native
  /**
    * Parses a ChordPro chord sheet into a song
    * @param chordProChordSheet The ChordPro chord sheet
    */
  def parse(chordProChordSheet: String): Song = js.native
  def parseDocument(document: String): Unit = js.native
  def readChords(chr: String): Unit = js.native
  def readComment(chr: String): Unit = js.native
  def readLyrics(chr: String): Unit = js.native
  def readTag(chr: String): Unit = js.native
  def resetTag(): Unit = js.native
  def startSection(sectionType: String, tag: Tag): Unit = js.native
}

