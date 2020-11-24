package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeConfiguration extends js.Object {
  
  /**
    * Configuration for telemetry service.
    */
  var TelemetryConfiguration: js.UndefOr[typings.awsSdk.greengrassMod.TelemetryConfiguration] = js.native
}
object RuntimeConfiguration {
  
  @scala.inline
  def apply(): RuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeConfiguration]
  }
  
  @scala.inline
  implicit class RuntimeConfigurationOps[Self <: RuntimeConfiguration] (val x: Self) extends AnyVal {
    
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
    def setTelemetryConfiguration(value: TelemetryConfiguration): Self = this.set("TelemetryConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelemetryConfiguration: Self = this.set("TelemetryConfiguration", js.undefined)
  }
}
