package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLoggingOptionsResponse extends StObject {
  
  /**
    * The logging level.
    */
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: js.UndefOr[AwsArn] = js.undefined
}
object GetLoggingOptionsResponse {
  
  inline def apply(): GetLoggingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLoggingOptionsResponse]
  }
  
  extension [Self <: GetLoggingOptionsResponse](x: Self) {
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
