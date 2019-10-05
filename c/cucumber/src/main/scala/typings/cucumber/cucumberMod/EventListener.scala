package typings.cucumber.cucumberMod

import typings.cucumber.cucumberMod.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cucumber", "EventListener")
@js.native
class EventListener () extends js.Object {
  def buildHandlerName(shortName: String): String = js.native
  def buildHandlerNameForEvent(event: Event): String = js.native
  def getHandlerForEvent(event: Event): EventHook = js.native
  def hasHandlerForEvent(event: Event): Boolean = js.native
  def hear(event: Event, callback: js.Function0[Unit]): Unit = js.native
  def setHandlerForEvent(shortName: String, handler: EventListener): Unit = js.native
}

