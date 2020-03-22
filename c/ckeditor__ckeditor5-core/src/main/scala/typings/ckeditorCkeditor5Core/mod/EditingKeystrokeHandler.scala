package typings.ckeditorCkeditor5Core.mod

import typings.ckeditorCkeditor5Core.Anon0
import typings.ckeditorCkeditor5Core.mod.editor.Editor
import typings.ckeditorCkeditor5Engine.mod.view.observer.KeyEventData
import typings.ckeditorCkeditor5Utils.mod.KeystrokeHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-core", "EditingKeystrokeHandler")
@js.native
class EditingKeystrokeHandler protected () extends KeystrokeHandler {
  def this(editor: Editor) = this()
  val editor: Editor = js.native
  def set(keystroke: String, callback: String): Unit = js.native
  def set(keystroke: String, callback: String, options: Anon0): Unit = js.native
  def set(
    keystroke: String,
    callback: js.Function2[/* keyEvtData */ KeyEventData, /* cancel */ js.Function0[Unit], Unit],
    options: Anon0
  ): Unit = js.native
  def set(keystroke: js.Array[String | Double], callback: String): Unit = js.native
  def set(keystroke: js.Array[String | Double], callback: String, options: Anon0): Unit = js.native
  def set(
    keystroke: js.Array[String | Double],
    callback: js.Function2[/* keyEvtData */ KeyEventData, /* cancel */ js.Function0[Unit], Unit],
    options: Anon0
  ): Unit = js.native
}

