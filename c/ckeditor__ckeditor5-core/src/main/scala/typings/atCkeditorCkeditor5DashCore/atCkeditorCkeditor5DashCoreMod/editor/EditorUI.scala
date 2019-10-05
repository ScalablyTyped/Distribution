package typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.editor

import typings.atCkeditorCkeditor5DashCore.Anon_Priority
import typings.atCkeditorCkeditor5DashCore.Anon_PriorityNumber
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.ComponentFactory
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.EditorUIView
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Emitter
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.FocusTracker
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
  def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Anon_Priority): Unit = js.native
  def on(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
  def once(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
  def update(): Unit = js.native
}

