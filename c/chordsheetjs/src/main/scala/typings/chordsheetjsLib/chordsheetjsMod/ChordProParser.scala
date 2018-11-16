package typings
package chordsheetjsLib.chordsheetjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chordsheetjs", "ChordProParser")
@js.native
class ChordProParser () extends js.Object {
  var lineNumber: scala.Double = js.native
  var sectionType: java.lang.String = js.native
  var song: Song = js.native
  var warnings: js.Array[ParserWarning] = js.native
  def addWarning(message: java.lang.String): scala.Unit = js.native
  def applyTag(tag: Tag): scala.Unit = js.native
  def checkCurrentSectionType(sectionType: java.lang.String, tag: Tag): scala.Unit = js.native
  def endSection(sectionType: java.lang.String, tag: Tag): scala.Unit = js.native
  def finishTag(): scala.Unit = js.native
  /**
       * Parses a ChordPro chord sheet into a song
       * @param chordProChordSheet The ChordPro chord sheet
       */
  def parse(chordProChordSheet: java.lang.String): Song = js.native
  def parseDocument(document: java.lang.String): scala.Unit = js.native
  def readChords(chr: java.lang.String): scala.Unit = js.native
  def readComment(chr: java.lang.String): scala.Unit = js.native
  def readLyrics(chr: java.lang.String): scala.Unit = js.native
  def readTag(chr: java.lang.String): scala.Unit = js.native
  def resetTag(): scala.Unit = js.native
  def startSection(sectionType: java.lang.String, tag: Tag): scala.Unit = js.native
}

