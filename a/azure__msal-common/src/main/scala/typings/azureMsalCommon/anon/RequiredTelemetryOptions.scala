package typings.azureMsalCommon.anon

import typings.azureMsalCommon.clientConfigurationMod.ApplicationTelemetry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@azure/msal-common.@azure/msal-common/dist/config/ClientConfiguration.TelemetryOptions> */
trait RequiredTelemetryOptions extends StObject {
  
  var application: ApplicationTelemetry
}
object RequiredTelemetryOptions {
  
  inline def apply(application: ApplicationTelemetry): RequiredTelemetryOptions = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredTelemetryOptions]
  }
  
  extension [Self <: RequiredTelemetryOptions](x: Self) {
    
    inline def setApplication(value: ApplicationTelemetry): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
  }
}
