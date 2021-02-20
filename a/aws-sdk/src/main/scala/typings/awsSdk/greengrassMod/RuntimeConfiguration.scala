package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeConfiguration extends StObject {
  
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
  implicit class RuntimeConfigurationMutableBuilder[Self <: RuntimeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTelemetryConfiguration(value: TelemetryConfiguration): Self = StObject.set(x, "TelemetryConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelemetryConfigurationUndefined: Self = StObject.set(x, "TelemetryConfiguration", js.undefined)
  }
}
