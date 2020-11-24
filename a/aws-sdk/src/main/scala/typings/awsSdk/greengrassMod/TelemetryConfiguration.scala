package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TelemetryConfiguration extends js.Object {
  
  /**
    * Synchronization status of the device reported configuration with the desired configuration.
    */
  var ConfigurationSyncStatus: js.UndefOr[typings.awsSdk.greengrassMod.ConfigurationSyncStatus] = js.native
  
  /**
    * Configure telemetry to be on or off.
    */
  var Telemetry: typings.awsSdk.greengrassMod.Telemetry = js.native
}
object TelemetryConfiguration {
  
  @scala.inline
  def apply(Telemetry: Telemetry): TelemetryConfiguration = {
    val __obj = js.Dynamic.literal(Telemetry = Telemetry.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryConfiguration]
  }
  
  @scala.inline
  implicit class TelemetryConfigurationOps[Self <: TelemetryConfiguration] (val x: Self) extends AnyVal {
    
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
    def setTelemetry(value: Telemetry): Self = this.set("Telemetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationSyncStatus(value: ConfigurationSyncStatus): Self = this.set("ConfigurationSyncStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationSyncStatus: Self = this.set("ConfigurationSyncStatus", js.undefined)
  }
}
