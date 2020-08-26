package typings.cordovaPluginsDiagnostic.anon

import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.battery_saving
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.device_only
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.high_accuracy
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.location_off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BATTERYSAVING extends js.Object {
  var BATTERY_SAVING: battery_saving = js.native
  var DEVICE_ONLY: device_only = js.native
  var HIGH_ACCURACY: high_accuracy = js.native
  var LOCATION_OFF: location_off = js.native
}

object BATTERYSAVING {
  @scala.inline
  def apply(
    BATTERY_SAVING: battery_saving,
    DEVICE_ONLY: device_only,
    HIGH_ACCURACY: high_accuracy,
    LOCATION_OFF: location_off
  ): BATTERYSAVING = {
    val __obj = js.Dynamic.literal(BATTERY_SAVING = BATTERY_SAVING.asInstanceOf[js.Any], DEVICE_ONLY = DEVICE_ONLY.asInstanceOf[js.Any], HIGH_ACCURACY = HIGH_ACCURACY.asInstanceOf[js.Any], LOCATION_OFF = LOCATION_OFF.asInstanceOf[js.Any])
    __obj.asInstanceOf[BATTERYSAVING]
  }
  @scala.inline
  implicit class BATTERYSAVINGOps[Self <: BATTERYSAVING] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBATTERY_SAVING(value: battery_saving): Self = this.set("BATTERY_SAVING", value.asInstanceOf[js.Any])
    @scala.inline
    def setDEVICE_ONLY(value: device_only): Self = this.set("DEVICE_ONLY", value.asInstanceOf[js.Any])
    @scala.inline
    def setHIGH_ACCURACY(value: high_accuracy): Self = this.set("HIGH_ACCURACY", value.asInstanceOf[js.Any])
    @scala.inline
    def setLOCATION_OFF(value: location_off): Self = this.set("LOCATION_OFF", value.asInstanceOf[js.Any])
  }
  
}

