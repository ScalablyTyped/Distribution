package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model

import typings.atCkeditorCkeditor5DashEngine.Anon_Priority
import typings.atCkeditorCkeditor5DashEngine.Anon_PriorityNumber
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Emitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/model/selection
@JSImport("@ckeditor/ckeditor5-engine", "model.Selection")
@js.native
class Selection () extends Emitter {
  def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Anon_Priority): Unit = js.native
  def on(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
  def once(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
}

