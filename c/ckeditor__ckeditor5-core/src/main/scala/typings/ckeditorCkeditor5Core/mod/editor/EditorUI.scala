package typings.ckeditorCkeditor5Core.mod.editor

import typings.ckeditorCkeditor5Core.AnonPriority
import typings.ckeditorCkeditor5Core.AnonPriorityNumber
import typings.ckeditorCkeditor5Core.mod.ComponentFactory
import typings.ckeditorCkeditor5Core.mod.EditorUIView
import typings.ckeditorCkeditor5Utils.mod.Emitter
import typings.ckeditorCkeditor5Utils.mod.FocusTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// core/editor/editorui
@JSImport("@ckeditor/ckeditor5-core", "editor.EditorUI")
@js.native
class EditorUI protected () extends Emitter {
  def this(editor: Editor, view: EditorUIView) = this()
  val componentFactory: ComponentFactory = js.native
  val editor: Editor = js.native
  val focusTracker: FocusTracker = js.native
  val view: EditorUIView = js.native
  def destroy(): Unit = js.native
  def listenTo(emitter: Emitter, event: String, callback: js.Function, options: AnonPriority): Unit = js.native
  def on(event: String, callback: js.Function, options: AnonPriorityNumber): Unit = js.native
  def once(event: String, callback: js.Function, options: AnonPriorityNumber): Unit = js.native
  def update(): Unit = js.native
}

