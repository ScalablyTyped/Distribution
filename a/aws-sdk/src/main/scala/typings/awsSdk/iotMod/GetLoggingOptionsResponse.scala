package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLoggingOptionsResponse extends StObject {
  
  /**
    * The logging level.
    */
  var logLevel: js.UndefOr[LogLevel] = js.native
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: js.UndefOr[AwsArn] = js.native
}
object GetLoggingOptionsResponse {
  
  @scala.inline
  def apply(): GetLoggingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLoggingOptionsResponse]
  }
  
  @scala.inline
  implicit class GetLoggingOptionsResponseMutableBuilder[Self <: GetLoggingOptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
