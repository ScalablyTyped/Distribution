package typings
package braceLib.braceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("brace", "EditSession")
@js.native
class EditSession protected ()
  extends braceLib.braceMod.AceAjaxNs.IEditSession {
  /**
    * Sets up a new `EditSession` and associates it with the given `Document` and `TextMode`.
    * @param text [If `text` is a `Document`, it associates the `EditSession` with it. Otherwise, a new `Document` is created, with the initial text]{: #textParam}
    * @param mode [The inital language mode to use for the document]{: #modeParam}
    **/
  def this(text: java.lang.String) = this()
  def this(text: js.Array[java.lang.String]) = this()
  def this(content: java.lang.String, mode: java.lang.String) = this()
  def this(text: java.lang.String, mode: braceLib.braceMod.AceAjaxNs.TextMode) = this()
  def this(text: js.Array[java.lang.String], mode: java.lang.String) = this()
}

