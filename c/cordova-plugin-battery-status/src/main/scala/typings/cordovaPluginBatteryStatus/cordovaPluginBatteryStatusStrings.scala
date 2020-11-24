package typings.cordovaPluginBatteryStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cordovaPluginBatteryStatusStrings {
  
  @scala.inline
  def batterycritical: batterycritical = "batterycritical".asInstanceOf[batterycritical]
  
  @scala.inline
  def batterylow: batterylow = "batterylow".asInstanceOf[batterylow]
  
  @scala.inline
  def batterystatus: batterystatus = "batterystatus".asInstanceOf[batterystatus]
  
  @js.native
  sealed trait batterycritical extends batteryEvent
  
  @js.native
  sealed trait batterylow extends batteryEvent
  
  @js.native
  sealed trait batterystatus extends batteryEvent
}
