package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cucumber", "EventListener")
@js.native
class EventListener () extends js.Object {
  def buildHandlerName(shortName: java.lang.String): java.lang.String = js.native
  def buildHandlerNameForEvent(event: cucumberLib.cucumberMod.eventsNs.Event): java.lang.String = js.native
  def getHandlerForEvent(event: cucumberLib.cucumberMod.eventsNs.Event): EventHook = js.native
  def hasHandlerForEvent(event: cucumberLib.cucumberMod.eventsNs.Event): scala.Boolean = js.native
  def hear(event: cucumberLib.cucumberMod.eventsNs.Event, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setHandlerForEvent(shortName: java.lang.String, handler: EventListener): scala.Unit = js.native
}

