package typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod

import typings.atCkeditorCkeditor5DashCore.Anon_Priority
import typings.atCkeditorCkeditor5DashCore.Anon_PriorityNumber
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.editorNs.Editor
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Emitter
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Observable
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
  def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Anon_Priority): Unit = js.native
  def on(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
  def once(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
  def refresh(): Unit = js.native
}

