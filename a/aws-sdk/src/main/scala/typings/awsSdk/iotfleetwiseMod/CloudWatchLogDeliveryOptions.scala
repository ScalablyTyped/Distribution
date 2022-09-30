package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLogDeliveryOptions extends StObject {
  
  /**
    * The Amazon CloudWatch Logs group the operation sends data to.
    */
  var logGroupName: js.UndefOr[CloudWatchLogGroupName] = js.undefined
  
  /**
    * The type of log to send data to Amazon CloudWatch Logs.
    */
  var logType: LogType
}
object CloudWatchLogDeliveryOptions {
  
  inline def apply(logType: LogType): CloudWatchLogDeliveryOptions = {
    val __obj = js.Dynamic.literal(logType = logType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogDeliveryOptions]
  }
  
  extension [Self <: CloudWatchLogDeliveryOptions](x: Self) {
    
    inline def setLogGroupName(value: CloudWatchLogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
    
    inline def setLogType(value: LogType): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
  }
}
