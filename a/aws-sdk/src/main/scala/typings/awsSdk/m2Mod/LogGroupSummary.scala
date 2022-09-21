package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogGroupSummary extends StObject {
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupIdentifier
  
  /**
    * The type of log.
    */
  var logType: String20
}
object LogGroupSummary {
  
  inline def apply(logGroupName: LogGroupIdentifier, logType: String20): LogGroupSummary = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any], logType = logType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogGroupSummary]
  }
  
  extension [Self <: LogGroupSummary](x: Self) {
    
    inline def setLogGroupName(value: LogGroupIdentifier): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogType(value: String20): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
  }
}
