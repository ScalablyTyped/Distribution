package typings.cordovaPluginBatteryStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cordovaPluginBatteryStatus.cordovaPluginBatteryStatusStrings.batterystatus
  - typings.cordovaPluginBatteryStatus.cordovaPluginBatteryStatusStrings.batterycritical
  - typings.cordovaPluginBatteryStatus.cordovaPluginBatteryStatusStrings.batterylow
*/
trait batteryEvent extends js.Object

object batteryEvent {
  @scala.inline
  def batterycritical: typings.cordovaPluginBatteryStatus.cordovaPluginBatteryStatusStrings.batterycritical = this.cast("batterycritical")
  @scala.inline
  def batterylow: typings.cordovaPluginBatteryStatus.cordovaPluginBatteryStatusStrings.batterylow = this.cast("batterylow")
  @scala.inline
  def batterystatus: typings.cordovaPluginBatteryStatus.cordovaPluginBatteryStatusStrings.batterystatus = this.cast("batterystatus")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

