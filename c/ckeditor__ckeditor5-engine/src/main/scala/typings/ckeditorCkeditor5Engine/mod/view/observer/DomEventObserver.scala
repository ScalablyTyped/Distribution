package typings.ckeditorCkeditor5Engine.mod.view.observer

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/view/observer/domeventobserver
@JSImport("@ckeditor/ckeditor5-engine", "view.observer.DomEventObserver")
@js.native
class DomEventObserver () extends Observer {
  
  val domEventType: String | js.Array[String] = js.native
  
  def fire(eventType: String, domEvent: Event): Unit = js.native
  def fire(eventType: String, domEvent: Event, additionalData: js.Object): Unit = js.native
  
  def onDomEvent(): Unit = js.native
  
  var useCapture: Boolean = js.native
}
