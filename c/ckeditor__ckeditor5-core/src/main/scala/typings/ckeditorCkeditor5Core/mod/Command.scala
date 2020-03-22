package typings.ckeditorCkeditor5Core.mod

import typings.ckeditorCkeditor5Core.Anon0
import typings.ckeditorCkeditor5Core.AnonPriority
import typings.ckeditorCkeditor5Core.mod.editor.Editor
import typings.ckeditorCkeditor5Utils.mod.Emitter
import typings.ckeditorCkeditor5Utils.mod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-core", "Command")
@js.native
class Command[T] protected () extends Observable {
  def this(editor: Editor) = this()
  val editor: Editor = js.native
  val isEnabled: Boolean = js.native
  val value: js.UndefOr[T] = js.native
  def destroy(): Unit = js.native
  def execute(): Unit = js.native
  def listenTo(emitter: Emitter, event: String, callback: js.Function, options: AnonPriority): Unit = js.native
  def on(event: String, callback: js.Function, options: Anon0): Unit = js.native
  def once(event: String, callback: js.Function, options: Anon0): Unit = js.native
  def refresh(): Unit = js.native
}

