package typings.cordovaPluginBatteryStatus

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatteryStatusEvent
  extends StObject
     with Event {
  
  /* A boolean that indicates whether the device is plugged in. */
  var isPlugged: Boolean = js.native
  
  /* The percentage of battery charge (0-100). */
  var level: Double = js.native
}
