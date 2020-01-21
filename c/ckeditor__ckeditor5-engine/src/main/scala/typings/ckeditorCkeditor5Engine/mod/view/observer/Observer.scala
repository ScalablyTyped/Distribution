package typings.ckeditorCkeditor5Engine.mod.view.observer

import typings.ckeditorCkeditor5Engine.mod.view.Document
import typings.ckeditorCkeditor5Engine.mod.view.View
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/view/observer/observer
@JSImport("@ckeditor/ckeditor5-engine", "view.observer.Observer")
@js.native
class Observer protected () extends js.Object {
  def this(view: View) = this()
  val document: Document = js.native
  val isEnabled: Boolean = js.native
  val view: View = js.native
  def destroy(): Unit = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def observe(domElement: HTMLElement, name: String): Unit = js.native
}

