package typings.ckeditorCkeditor5Engine.mod.view

import typings.ckeditorCkeditor5Engine.Anon0
import typings.ckeditorCkeditor5Engine.AnonPriority
import typings.ckeditorCkeditor5Utils.mod.Emitter
import typings.ckeditorCkeditor5Utils.mod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/view/view
@JSImport("@ckeditor/ckeditor5-engine", "view.View")
@js.native
class View () extends Observable {
  def listenTo(emitter: Emitter, event: String, callback: js.Function, options: AnonPriority): Unit = js.native
  def on(event: String, callback: js.Function, options: Anon0): Unit = js.native
  def once(event: String, callback: js.Function, options: Anon0): Unit = js.native
}

