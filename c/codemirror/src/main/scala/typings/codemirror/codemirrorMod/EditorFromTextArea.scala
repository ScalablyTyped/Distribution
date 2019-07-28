package typings.codemirror.codemirrorMod

import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorFromTextArea extends Editor {
  /** Returns the textarea that the instance was based on. */
  def getTextArea(): HTMLTextAreaElement = js.native
  /** Copy the content of the editor into the textarea. */
  def save(): Unit = js.native
  /** Remove the editor, and restore the original textarea (with the editor's current content). */
  def toTextArea(): Unit = js.native
}

