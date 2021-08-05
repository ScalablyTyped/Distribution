package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutLoggingConfigurationRequest extends StObject {
  
  /**
    * The Amazon Kinesis Data Firehose that contains the inspected traffic information, the redacted fields details, and the Amazon Resource Name (ARN) of the web ACL to monitor.  When specifying Type in RedactedFields, you must use one of the following values: URI, QUERY_STRING, HEADER, or METHOD. 
    */
  var LoggingConfiguration: typings.awsSdk.wafMod.LoggingConfiguration
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
