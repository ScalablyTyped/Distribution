package typings
package chordsheetjsLib.chordsheetjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chordsheetjs", "Song")
@js.native
class Song protected () extends js.Object {
  def this(metadata: js.Object) = this()
  /**
       * Returns the song lines, skipping the leading empty lines (empty as in not rendering any content). This is useful
       * if you want to skip the "header lines": the lines that only contain meta data.
       */
  var bodyLines: js.Array[Line] = js.native
  var currentLine: Line = js.native
  var currentParagraph: Paragraph = js.native
  /**
       * The Line items of which the song consists
       */
  var lines: js.Array[Line] = js.native
  var metaData: js.Object = js.native
  var optimizedMetaData: js.Object = js.native
  /**
       * The Paragraph items of which the song consists
       */
  var paragraphs: js.Array[Paragraph] = js.native
  def addChordLyricsPair(): ChordLyricsPair = js.native
  def addLine(): Line = js.native
  def addParagraph(): Paragraph = js.native
  def addTag(tagContents: java.lang.String): Tag = js.native
  def assignMetaData(metadata: js.Object): scala.Unit = js.native
  def chords(chr: java.lang.String): scala.Unit = js.native
  def ensureLine(): scala.Unit = js.native
  def ensureParagraph(): scala.Unit = js.native
  def finish(): scala.Unit = js.native
  def flushLine(): scala.Unit = js.native
  def getMetaData(name: java.lang.String): java.lang.String | scala.Null = js.native
  def getOptimizedMetaData(): js.Object = js.native
  def lyrics(chr: java.lang.String): scala.Unit = js.native
  def optimizeMetaDataValue(): java.lang.String | js.Array[java.lang.String] | scala.Null = js.native
  def optimizeMetaDataValue(valueSet: js.Array[java.lang.String]): java.lang.String | js.Array[java.lang.String] | scala.Null = js.native
  def setCurrentLineType(`type`: java.lang.String): scala.Unit = js.native
  def setMetaData(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

