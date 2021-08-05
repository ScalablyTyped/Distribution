package typings.cordovaPluginBatteryStatus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cordovaPluginBatteryStatusStrings {
  
  @js.native
  sealed trait batterycritical
    extends StObject
       with batteryEvent
  inline def batterycritical: batterycritical = "batterycritical".asInstanceOf[batterycritical]
  
  @js.native
  sealed trait batterylow
    extends StObject
       with batteryEvent
  inline def batterylow: batterylow = "batterylow".asInstanceOf[batterylow]
  
  @js.native
  sealed trait batterystatus
    extends StObject
       with batteryEvent
  inline def batterystatus: batterystatus = "batterystatus".asInstanceOf[batterystatus]
}
