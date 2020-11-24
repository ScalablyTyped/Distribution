package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateThingRuntimeConfigurationRequest extends js.Object {
  
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
  implicit class UpdateThingRuntimeConfigurationRequestOps[Self <: UpdateThingRuntimeConfigurationRequest] (val x: Self) extends AnyVal {
    
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
    def setThingName(value: string): Self = this.set("ThingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelemetryConfiguration(value: TelemetryConfigurationUpdate): Self = this.set("TelemetryConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelemetryConfiguration: Self = this.set("TelemetryConfiguration", js.undefined)
  }
}
