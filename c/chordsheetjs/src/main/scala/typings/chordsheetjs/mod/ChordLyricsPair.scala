package typings.chordsheetjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chordsheetjs", "ChordLyricsPair")
@js.native
class ChordLyricsPair protected () extends js.Object {
  /**
    * Initialises a ChordLyricsPair
    * @param chords The chords
    * @param lyrics The lyrics
    */
  def this(chords: String, lyrics: String) = this()
  var chords: String = js.native
  var lyrics: String = js.native
  /**
    * Indicates whether a ChordLyricsPair should be visible in a formatted chord sheet (except for ChordPro sheets)
    */
  def isRenderable(): Boolean = js.native
}

