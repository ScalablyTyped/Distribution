package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorFromTextArea extends Editor {
  /** Returns the textarea that the instance was based on. */
  def getTextArea(): stdLib.HTMLTextAreaElement = js.native
  /** Copy the content of the editor into the textarea. */
  def save(): scala.Unit = js.native
  /** Remove the editor, and restore the original textarea (with the editor's current content). */
  def toTextArea(): scala.Unit = js.native
}

