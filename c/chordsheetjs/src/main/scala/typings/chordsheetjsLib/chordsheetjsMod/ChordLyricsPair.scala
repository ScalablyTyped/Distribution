package typings
package chordsheetjsLib.chordsheetjsMod

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
  def this(chords: java.lang.String, lyrics: java.lang.String) = this()
  var chords: java.lang.String = js.native
  var lyrics: java.lang.String = js.native
  /**
       * Indicates whether a ChordLyricsPair should be visible in a formatted chord sheet (except for ChordPro sheets)
       */
  def isRenderable(): scala.Boolean = js.native
}

