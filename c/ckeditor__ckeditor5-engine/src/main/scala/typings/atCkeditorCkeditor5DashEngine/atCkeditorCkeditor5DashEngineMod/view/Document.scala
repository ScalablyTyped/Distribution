package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view

import typings.atCkeditorCkeditor5DashEngine.Anon_Priority
import typings.atCkeditorCkeditor5DashEngine.Anon_PriorityNumber
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Collection
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Emitter
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/view/document
@JSImport("@ckeditor/ckeditor5-engine", "view.Document")
@js.native
class Document () extends Observable {
  val isComposing: Boolean = js.native
  val isFocused: Boolean = js.native
  var isReadOnly: Boolean = js.native
  val roots: Collection[RootEditableElement] = js.native
  val selection: DocumentSelection = js.native
  /* protected */ def _callPostFixers(writer: DowncastWriter): Unit = js.native
  def getRoot(): RootEditableElement | Null = js.native
  def getRoot(name: String): RootEditableElement | Null = js.native
  def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Anon_Priority): Unit = js.native
  def on(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
  def once(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
  def registerPostFixer(postFixer: js.Function1[/* downcastWriter */ DowncastWriter, Boolean]): Unit = js.native
}

