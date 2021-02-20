package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableIoTLoggingParams extends StObject {
  
  /**
    * Specifies the types of information to be logged.
    */
  var logLevel: LogLevel = js.native
  
  /**
    * The ARN of the IAM role used for logging.
    */
  var roleArnForLogging: RoleArn = js.native
}
object EnableIoTLoggingParams {
  
  @scala.inline
  def apply(logLevel: LogLevel, roleArnForLogging: RoleArn): EnableIoTLoggingParams = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any], roleArnForLogging = roleArnForLogging.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableIoTLoggingParams]
  }
  
  @scala.inline
  implicit class EnableIoTLoggingParamsMutableBuilder[Self <: EnableIoTLoggingParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnForLogging(value: RoleArn): Self = StObject.set(x, "roleArnForLogging", value.asInstanceOf[js.Any])
  }
}
