package typings
package cordovaDashPluginDashBatteryDashStatusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cordovaDashPluginDashBatteryDashStatusLibStrings {
  @js.native
  sealed trait batterycritical extends batteryEvent
  
  @js.native
  sealed trait batterylow extends batteryEvent
  
  @js.native
  sealed trait batterystatus extends batteryEvent
  
  @scala.inline
  def batterycritical: batterycritical = "batterycritical".asInstanceOf[batterycritical]
  @scala.inline
  def batterylow: batterylow = "batterylow".asInstanceOf[batterylow]
  @scala.inline
  def batterystatus: batterystatus = "batterystatus".asInstanceOf[batterystatus]
}

