package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLoggingConfigurationResponse extends StObject {
  
  /**
    * The LoggingConfiguration for the specified web ACL.
    */
  var LoggingConfiguration: js.UndefOr[typings.awsSdk.clientsWafv2Mod.LoggingConfiguration] = js.undefined
}
object GetLoggingConfigurationResponse {
  
  inline def apply(): GetLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLoggingConfigurationResponse]
  }
  
  extension [Self <: GetLoggingConfigurationResponse](x: Self) {
    
    inline def setLoggingConfiguration(value: LoggingConfiguration): Self = StObject.set(x, "LoggingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigurationUndefined: Self = StObject.set(x, "LoggingConfiguration", js.undefined)
  }
}
