package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutLoggingConfigurationResponse extends StObject {
  
  /**
    * The LoggingConfiguration that you submitted in the request.
    */
  var LoggingConfiguration: js.UndefOr[typings.awsSdk.wafMod.LoggingConfiguration] = js.undefined
}
object PutLoggingConfigurationResponse {
  
  inline def apply(): PutLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutLoggingConfigurationResponse]
  }
  
  extension [Self <: PutLoggingConfigurationResponse](x: Self) {
    
    inline def setLoggingConfiguration(value: LoggingConfiguration): Self = StObject.set(x, "LoggingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigurationUndefined: Self = StObject.set(x, "LoggingConfiguration", js.undefined)
  }
}
