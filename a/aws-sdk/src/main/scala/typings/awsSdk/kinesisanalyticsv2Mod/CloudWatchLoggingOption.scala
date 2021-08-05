package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLoggingOption extends StObject {
  
  /**
    * The ARN of the CloudWatch log to receive application messages.
    */
  var LogStreamARN: typings.awsSdk.kinesisanalyticsv2Mod.LogStreamARN
}
object CloudWatchLoggingOption {
  
  inline def apply(LogStreamARN: LogStreamARN): CloudWatchLoggingOption = {
    val __obj = js.Dynamic.literal(LogStreamARN = LogStreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLoggingOption]
  }
  
  extension [Self <: CloudWatchLoggingOption](x: Self) {
    
    inline def setLogStreamARN(value: LogStreamARN): Self = StObject.set(x, "LogStreamARN", value.asInstanceOf[js.Any])
  }
}
