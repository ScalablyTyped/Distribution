package typings.cordovaPluginsDiagnostic

import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.battery_saving
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.device_only
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.high_accuracy
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.location_off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBATTERYSAVING extends js.Object {
  var BATTERY_SAVING: battery_saving
  var DEVICE_ONLY: device_only
  var HIGH_ACCURACY: high_accuracy
  var LOCATION_OFF: location_off
}

object AnonBATTERYSAVING {
  @scala.inline
  def apply(
    BATTERY_SAVING: battery_saving,
    DEVICE_ONLY: device_only,
    HIGH_ACCURACY: high_accuracy,
    LOCATION_OFF: location_off
  ): AnonBATTERYSAVING = {
    val __obj = js.Dynamic.literal(BATTERY_SAVING = BATTERY_SAVING.asInstanceOf[js.Any], DEVICE_ONLY = DEVICE_ONLY.asInstanceOf[js.Any], HIGH_ACCURACY = HIGH_ACCURACY.asInstanceOf[js.Any], LOCATION_OFF = LOCATION_OFF.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBATTERYSAVING]
  }
}

