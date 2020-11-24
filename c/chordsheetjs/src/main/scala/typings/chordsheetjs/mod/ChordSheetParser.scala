package typings.chordsheetjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chordsheetjs", "ChordSheetParser")
@js.native
class ChordSheetParser protected () extends js.Object {
  def this(props: ChordSheetParserProps) = this()
  
  def addCharacter(chr: String, nextChar: String): Unit = js.native
  
  var chordLyricsPair: ChordLyricsPair = js.native
  
  var currentLine: Double = js.native
  
  def ensureChordLyricsPairInitialized(): Unit = js.native
  
  def hasNextLine(): Boolean = js.native
  
  def initialize(document: String): Unit = js.native
  
  var lineCount: Double = js.native
  
  var lines: js.Array[Line] = js.native
  
  /**
    * Parses a chord sheet into a song
    * @param chordSheet The ChordPro chord sheet
    */
  def parse(chordSheet: String): Song = js.native
  
  def parseLine(line: String): Unit = js.native
  
  def parseLyricsWithChords(chordsLine: String, lyricsLine: String): Unit = js.native
  
  def parseNonEmptyLine(line: String): Unit = js.native
  
  var preserveWhitespace: Boolean = js.native
  
  def processCharacters(chordsLine: String, lyricsLine: String): Unit = js.native
  
  var processingText: String = js.native
  
  def readLine(): Line = js.native
  
  def shouldAddCharacterToChords(nextChar: String): Boolean = js.native
  
  var song: Song = js.native
  
  var songLine: Line = js.native
}
