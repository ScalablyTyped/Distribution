package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutLoggingConfigurationRequest extends StObject {
  
  /**
    * 
    */
  var LoggingConfiguration: typings.awsSdk.clientsWafv2Mod.LoggingConfiguration
}
object PutLoggingConfigurationRequest {
  
  inline def apply(LoggingConfiguration: LoggingConfiguration): PutLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(LoggingConfiguration = LoggingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLoggingConfigurationRequest]
  }
  
  extension [Self <: PutLoggingConfigurationRequest](x: Self) {
    
    inline def setLoggingConfiguration(value: LoggingConfiguration): Self = StObject.set(x, "LoggingConfiguration", value.asInstanceOf[js.Any])
  }
}
