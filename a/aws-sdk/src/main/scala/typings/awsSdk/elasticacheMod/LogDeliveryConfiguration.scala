package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogDeliveryConfiguration extends StObject {
  
  /**
    * Configuration details of either a CloudWatch Logs destination or Kinesis Data Firehose destination.
    */
  var DestinationDetails: js.UndefOr[typings.awsSdk.elasticacheMod.DestinationDetails] = js.undefined
  
  /**
    * Returns the destination type, either cloudwatch-logs or kinesis-firehose.
    */
  var DestinationType: js.UndefOr[typings.awsSdk.elasticacheMod.DestinationType] = js.undefined
  
  /**
    * Returns the log format, either JSON or TEXT.
    */
  var LogFormat: js.UndefOr[typings.awsSdk.elasticacheMod.LogFormat] = js.undefined
  
  /**
    * Refers to slow-log or engine-log.
    */
  var LogType: js.UndefOr[typings.awsSdk.elasticacheMod.LogType] = js.undefined
  
  /**
    * Returns an error message for the log delivery configuration.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * Returns the log delivery configuration status. Values are one of enabling | disabling | modifying | active | error 
    */
  var Status: js.UndefOr[LogDeliveryConfigurationStatus] = js.undefined
}
object LogDeliveryConfiguration {
  
  inline def apply(): LogDeliveryConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogDeliveryConfiguration]
  }
  
  extension [Self <: LogDeliveryConfiguration](x: Self) {
    
    inline def setDestinationDetails(value: DestinationDetails): Self = StObject.set(x, "DestinationDetails", value.asInstanceOf[js.Any])
    
    inline def setDestinationDetailsUndefined: Self = StObject.set(x, "DestinationDetails", js.undefined)
    
    inline def setDestinationType(value: DestinationType): Self = StObject.set(x, "DestinationType", value.asInstanceOf[js.Any])
    
    inline def setDestinationTypeUndefined: Self = StObject.set(x, "DestinationType", js.undefined)
    
    inline def setLogFormat(value: LogFormat): Self = StObject.set(x, "LogFormat", value.asInstanceOf[js.Any])
    
    inline def setLogFormatUndefined: Self = StObject.set(x, "LogFormat", js.undefined)
    
    inline def setLogType(value: LogType): Self = StObject.set(x, "LogType", value.asInstanceOf[js.Any])
    
    inline def setLogTypeUndefined: Self = StObject.set(x, "LogType", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setStatus(value: LogDeliveryConfigurationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
