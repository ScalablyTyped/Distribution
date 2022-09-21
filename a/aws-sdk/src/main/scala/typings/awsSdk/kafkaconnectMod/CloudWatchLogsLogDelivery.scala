package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLogsLogDelivery extends StObject {
  
  /**
    * Whether log delivery to Amazon CloudWatch Logs is enabled.
    */
  var enabled: boolean
  
  /**
    * The name of the CloudWatch log group that is the destination for log delivery.
    */
  var logGroup: js.UndefOr[string] = js.undefined
}
object CloudWatchLogsLogDelivery {
  
  inline def apply(enabled: boolean): CloudWatchLogsLogDelivery = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogsLogDelivery]
  }
  
  extension [Self <: CloudWatchLogsLogDelivery](x: Self) {
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setLogGroup(value: string): Self = StObject.set(x, "logGroup", value.asInstanceOf[js.Any])
    
    inline def setLogGroupUndefined: Self = StObject.set(x, "logGroup", js.undefined)
  }
}
