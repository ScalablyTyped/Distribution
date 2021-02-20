package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingOptionsPayload extends StObject {
  
  /**
    * The log level.
    */
  var logLevel: js.UndefOr[LogLevel] = js.native
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: AwsArn = js.native
}
object LoggingOptionsPayload {
  
  @scala.inline
  def apply(roleArn: AwsArn): LoggingOptionsPayload = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingOptionsPayload]
  }
  
  @scala.inline
  implicit class LoggingOptionsPayloadMutableBuilder[Self <: LoggingOptionsPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
