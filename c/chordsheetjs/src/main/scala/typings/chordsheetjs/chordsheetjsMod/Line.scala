package typings.chordsheetjs.chordsheetjsMod

import typings.chordsheetjs.chordsheetjsStrings.chorus
import typings.chordsheetjs.chordsheetjsStrings.none
import typings.chordsheetjs.chordsheetjsStrings.verse
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
  var `type`: verse | chorus | none = js.native
  def addChordLyricsPair(chords: String, lyrics: String): ChordLyricsPair = js.native
  def addChordLyricsPair(chords: ChordLyricsPair, lyrics: String): ChordLyricsPair = js.native
  /**
    * Adds an item to the line
    * @param item The item to be added
    */
  def addItem(item: ChordLyricsPair): Unit = js.native
  def addItem(item: Tag): Unit = js.native
  def addTag(name: String): Tag = js.native
  def addTag(name: String, value: String): Tag = js.native
  def addTag(name: Tag): Tag = js.native
  def addTag(name: Tag, value: String): Tag = js.native
  def chords(chr: String): Unit = js.native
  def ensureChordLyricsPair(): Unit = js.native
  /**
    * Indicates whether the line contains items that are renderable. Please use hasRenderableItems
    * @deprecated
    */
  def hasContent(): Boolean = js.native
  /**
    * Indicates whether the line contains items that are renderable
    */
  def hasRenderableItems(): Boolean = js.native
  /**
    * Indicates whether the line type is 'chorus'
    */
  def isChorus(): Boolean = js.native
  /**
    * Indicates whether the line contains any items
    */
  def isEmpty(): Boolean = js.native
  /**
    * Indicates whether the line type is 'verse'
    */
  def isVerse(): Boolean = js.native
  def lyrics(chr: String): Unit = js.native
}

