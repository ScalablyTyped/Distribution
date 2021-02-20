package typings.cucumber.mod

import typings.cucumber.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cucumber", "EventListener")
@js.native
class EventListener () extends StObject {
  
  def buildHandlerName(shortName: String): String = js.native
  
  def buildHandlerNameForEvent(event: Event): String = js.native
  
  def getHandlerForEvent(event: Event): EventHook = js.native
  
  def hasHandlerForEvent(event: Event): Boolean = js.native
  
  def hear(event: Event, callback: js.Function0[Unit]): Unit = js.native
  
  def setHandlerForEvent(shortName: String, handler: EventListener): Unit = js.native
}
