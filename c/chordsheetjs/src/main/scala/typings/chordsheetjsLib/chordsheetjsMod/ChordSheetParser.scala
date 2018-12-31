package typings
package chordsheetjsLib.chordsheetjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chordsheetjs", "ChordSheetParser")
@js.native
class ChordSheetParser protected () extends js.Object {
  def this(props: ChordSheetParserProps) = this()
  var chordLyricsPair: ChordLyricsPair = js.native
  var currentLine: scala.Double = js.native
  var lineCount: scala.Double = js.native
  var lines: js.Array[Line] = js.native
  var preserveWhitespace: scala.Boolean = js.native
  var processingText: java.lang.String = js.native
  var song: Song = js.native
  var songLine: Line = js.native
  def addCharacter(chr: java.lang.String, nextChar: java.lang.String): scala.Unit = js.native
  def ensureChordLyricsPairInitialized(): scala.Unit = js.native
  def hasNextLine(): scala.Boolean = js.native
  def initialize(document: java.lang.String): scala.Unit = js.native
  /**
    * Parses a chord sheet into a song
    * @param chordSheet The ChordPro chord sheet
    */
  def parse(chordSheet: java.lang.String): Song = js.native
  def parseLine(line: java.lang.String): scala.Unit = js.native
  def parseLyricsWithChords(chordsLine: java.lang.String, lyricsLine: java.lang.String): scala.Unit = js.native
  def parseNonEmptyLine(line: java.lang.String): scala.Unit = js.native
  def processCharacters(chordsLine: java.lang.String, lyricsLine: java.lang.String): scala.Unit = js.native
  def readLine(): Line = js.native
  def shouldAddCharacterToChords(nextChar: java.lang.String): scala.Boolean = js.native
}

