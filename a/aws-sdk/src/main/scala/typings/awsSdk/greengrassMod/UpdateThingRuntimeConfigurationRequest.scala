package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateThingRuntimeConfigurationRequest extends StObject {
  
  /**
    * Configuration for telemetry service.
    */
  var TelemetryConfiguration: js.UndefOr[TelemetryConfigurationUpdate] = js.native
  
  /**
    * The thing name.
    */
  var ThingName: string = js.native
}
object UpdateThingRuntimeConfigurationRequest {
  
  @scala.inline
  def apply(ThingName: string): UpdateThingRuntimeConfigurationRequest = {
    val __obj = js.Dynamic.literal(ThingName = ThingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThingRuntimeConfigurationRequest]
  }
  
  @scala.inline
  implicit class UpdateThingRuntimeConfigurationRequestMutableBuilder[Self <: UpdateThingRuntimeConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTelemetryConfiguration(value: TelemetryConfigurationUpdate): Self = StObject.set(x, "TelemetryConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelemetryConfigurationUndefined: Self = StObject.set(x, "TelemetryConfiguration", js.undefined)
    
    @scala.inline
    def setThingName(value: string): Self = StObject.set(x, "ThingName", value.asInstanceOf[js.Any])
  }
}
