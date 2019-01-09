package typings
package atCkeditorCkeditor5DashCoreLib.ckeditor5DashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-core", "EditingKeystrokeHandler")
@js.native
class EditingKeystrokeHandler protected ()
  extends atCkeditorCkeditor5DashUtilsLib.ckeditor5DashUtilsMod.KeystrokeHandler {
  def this(editor: atCkeditorCkeditor5DashCoreLib.ckeditor5DashCoreMod.editorNs.Editor) = this()
  val editor: atCkeditorCkeditor5DashCoreLib.ckeditor5DashCoreMod.editorNs.Editor = js.native
  def set(keystroke: java.lang.String, callback: java.lang.String): scala.Unit = js.native
  def set(
    keystroke: java.lang.String,
    callback: java.lang.String,
    options: atCkeditorCkeditor5DashCoreLib.Anon_PriorityNumber
  ): scala.Unit = js.native
  def set(
    keystroke: java.lang.String,
    callback: js.Function2[
      /* keyEvtData */ atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.viewNs.observerNs.KeyEventData, 
      /* cancel */ js.Function0[scala.Unit], 
      scala.Unit
    ],
    options: atCkeditorCkeditor5DashCoreLib.Anon_PriorityNumber
  ): scala.Unit = js.native
  def set(keystroke: js.Array[java.lang.String | scala.Double], callback: java.lang.String): scala.Unit = js.native
  def set(
    keystroke: js.Array[java.lang.String | scala.Double],
    callback: java.lang.String,
    options: atCkeditorCkeditor5DashCoreLib.Anon_PriorityNumber
  ): scala.Unit = js.native
  def set(
    keystroke: js.Array[java.lang.String | scala.Double],
    callback: js.Function2[
      /* keyEvtData */ atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.viewNs.observerNs.KeyEventData, 
      /* cancel */ js.Function0[scala.Unit], 
      scala.Unit
    ],
    options: atCkeditorCkeditor5DashCoreLib.Anon_PriorityNumber
  ): scala.Unit = js.native
}

