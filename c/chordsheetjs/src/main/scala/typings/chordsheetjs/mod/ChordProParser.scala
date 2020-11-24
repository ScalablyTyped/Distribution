package typings.chordsheetjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chordsheetjs", "ChordProParser")
@js.native
class ChordProParser () extends js.Object {
  
  def addWarning(message: String): Unit = js.native
  
  def applyTag(tag: Tag): Unit = js.native
  
  def checkCurrentSectionType(sectionType: String, tag: Tag): Unit = js.native
  
  def endSection(sectionType: String, tag: Tag): Unit = js.native
  
  def finishTag(): Unit = js.native
  
  var lineNumber: Double = js.native
  
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
  
  var sectionType: String = js.native
  
  var song: Song = js.native
  
  def startSection(sectionType: String, tag: Tag): Unit = js.native
  
  var warnings: js.Array[ParserWarning] = js.native
}
