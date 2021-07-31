package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetV2LoggingLevelRequest extends StObject {
  
  /**
    * The log level.
    */
  var logLevel: LogLevel
  
  /**
    * The log target.
    */
  var logTarget: LogTarget
}
object SetV2LoggingLevelRequest {
  
  @scala.inline
  def apply(logLevel: LogLevel, logTarget: LogTarget): SetV2LoggingLevelRequest = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any], logTarget = logTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetV2LoggingLevelRequest]
  }
  
  @scala.inline
  implicit class SetV2LoggingLevelRequestMutableBuilder[Self <: SetV2LoggingLevelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogTarget(value: LogTarget): Self = StObject.set(x, "logTarget", value.asInstanceOf[js.Any])
  }
}
