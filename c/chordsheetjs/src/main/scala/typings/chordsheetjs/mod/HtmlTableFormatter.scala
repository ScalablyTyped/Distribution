package typings.chordsheetjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chordsheetjs", "HtmlTableFormatter")
@js.native
class HtmlTableFormatter () extends js.Object {
  /**
    * Formats a song into HTML.
    * @param song The song to be formatted
    */
  def format(song: Song): String = js.native
}

