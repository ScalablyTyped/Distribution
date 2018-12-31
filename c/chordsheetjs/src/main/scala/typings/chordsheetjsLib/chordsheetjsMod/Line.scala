package typings
package chordsheetjsLib.chordsheetjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chordsheetjs", "Line")
@js.native
class Line () extends js.Object {
  /**
    * The items (ChordLyricsPair or Tag) of which the line consists
    */
  var items: js.Array[ChordLyricsPair | Tag] = js.native
  /**
    * The line type, This is set by the ChordProParser when it read tags like {start_of_chorus} or {start_of_verse}
    * Values can be 'verse', 'chorus' or 'none'
    */
  var `type`: chordsheetjsLib.chordsheetjsLibStrings.verse | chordsheetjsLib.chordsheetjsLibStrings.chorus | chordsheetjsLib.chordsheetjsLibStrings.none = js.native
  def addChordLyricsPair(chords: ChordLyricsPair, lyrics: java.lang.String): ChordLyricsPair = js.native
  def addChordLyricsPair(chords: java.lang.String, lyrics: java.lang.String): ChordLyricsPair = js.native
  /**
    * Adds an item to the line
    * @param item The item to be added
    */
  def addItem(item: ChordLyricsPair): scala.Unit = js.native
  def addItem(item: Tag): scala.Unit = js.native
  def addTag(name: Tag): Tag = js.native
  def addTag(name: Tag, value: java.lang.String): Tag = js.native
  def addTag(name: java.lang.String): Tag = js.native
  def addTag(name: java.lang.String, value: java.lang.String): Tag = js.native
  def chords(chr: java.lang.String): scala.Unit = js.native
  def ensureChordLyricsPair(): scala.Unit = js.native
  /**
    * Indicates whether the line contains items that are renderable. Please use hasRenderableItems
    * @deprecated
    */
  def hasContent(): scala.Boolean = js.native
  /**
    * Indicates whether the line contains items that are renderable
    */
  def hasRenderableItems(): scala.Boolean = js.native
  /**
    * Indicates whether the line type is 'chorus'
    */
  def isChorus(): scala.Boolean = js.native
  /**
    * Indicates whether the line contains any items
    */
  def isEmpty(): scala.Boolean = js.native
  /**
    * Indicates whether the line type is 'verse'
    */
  def isVerse(): scala.Boolean = js.native
  def lyrics(chr: java.lang.String): scala.Unit = js.native
}

