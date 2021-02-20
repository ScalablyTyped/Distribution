package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TelemetryConfiguration extends StObject {
  
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
  implicit class TelemetryConfigurationMutableBuilder[Self <: TelemetryConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSyncStatus(value: ConfigurationSyncStatus): Self = StObject.set(x, "ConfigurationSyncStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationSyncStatusUndefined: Self = StObject.set(x, "ConfigurationSyncStatus", js.undefined)
    
    @scala.inline
    def setTelemetry(value: Telemetry): Self = StObject.set(x, "Telemetry", value.asInstanceOf[js.Any])
  }
}
