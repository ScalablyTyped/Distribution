package typings
package atCkeditorCkeditor5DashUtilsLib.ckeditor5DashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-utils", "KeystrokeHandler")
@js.native
class KeystrokeHandler () extends js.Object {
  def destroy(): scala.Unit = js.native
  def listenTo(emitter: Emitter): scala.Unit = js.native
  def press(keyEvtData: KeystrokeInfo): scala.Boolean = js.native
  def set(keystroke: java.lang.String, callback: js.Function): scala.Unit = js.native
  def set(
    keystroke: java.lang.String,
    callback: js.Function,
    options: atCkeditorCkeditor5DashUtilsLib.Anon_PriorityPriorityString
  ): scala.Unit = js.native
  def set(keystroke: js.Array[java.lang.String | scala.Double], callback: js.Function): scala.Unit = js.native
  def set(
    keystroke: js.Array[java.lang.String | scala.Double],
    callback: js.Function,
    options: atCkeditorCkeditor5DashUtilsLib.Anon_PriorityPriorityString
  ): scala.Unit = js.native
}

