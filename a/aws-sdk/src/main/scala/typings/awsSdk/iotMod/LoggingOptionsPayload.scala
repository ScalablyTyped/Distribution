package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingOptionsPayload extends StObject {
  
  /**
    * The log level.
    */
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: AwsArn
}
object LoggingOptionsPayload {
  
  inline def apply(roleArn: AwsArn): LoggingOptionsPayload = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingOptionsPayload]
  }
  
  extension [Self <: LoggingOptionsPayload](x: Self) {
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
