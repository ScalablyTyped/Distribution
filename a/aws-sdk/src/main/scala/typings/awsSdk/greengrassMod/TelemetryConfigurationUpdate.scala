package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TelemetryConfigurationUpdate extends StObject {
  
  /**
    * Configure telemetry to be on or off.
    */
  var Telemetry: typings.awsSdk.greengrassMod.Telemetry = js.native
}
object TelemetryConfigurationUpdate {
  
  @scala.inline
  def apply(Telemetry: Telemetry): TelemetryConfigurationUpdate = {
    val __obj = js.Dynamic.literal(Telemetry = Telemetry.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryConfigurationUpdate]
  }
  
  @scala.inline
  implicit class TelemetryConfigurationUpdateMutableBuilder[Self <: TelemetryConfigurationUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTelemetry(value: Telemetry): Self = StObject.set(x, "Telemetry", value.asInstanceOf[js.Any])
  }
}
