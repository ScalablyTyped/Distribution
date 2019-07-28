package typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod

import typings.atCkeditorCkeditor5DashCore.Anon_PriorityNumber
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.editorNs.Editor
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.observerNs.KeyEventData
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.KeystrokeHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-core", "EditingKeystrokeHandler")
@js.native
class EditingKeystrokeHandler protected () extends KeystrokeHandler {
  def this(editor: Editor) = this()
  val editor: Editor = js.native
  def set(keystroke: String, callback: String): Unit = js.native
  def set(keystroke: String, callback: String, options: Anon_PriorityNumber): Unit = js.native
  def set(
    keystroke: String,
    callback: js.Function2[/* keyEvtData */ KeyEventData, /* cancel */ js.Function0[Unit], Unit],
    options: Anon_PriorityNumber
  ): Unit = js.native
  def set(keystroke: js.Array[String | Double], callback: String): Unit = js.native
  def set(keystroke: js.Array[String | Double], callback: String, options: Anon_PriorityNumber): Unit = js.native
  def set(
    keystroke: js.Array[String | Double],
    callback: js.Function2[/* keyEvtData */ KeyEventData, /* cancel */ js.Function0[Unit], Unit],
    options: Anon_PriorityNumber
  ): Unit = js.native
}

