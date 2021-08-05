package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingOptions extends StObject {
  
  /**
    * If true, logging is enabled for AWS IoT Analytics.
    */
  var enabled: LoggingEnabled
  
  /**
    * The logging level. Currently, only ERROR is supported.
    */
  var level: LoggingLevel
  
  /**
    * The ARN of the role that grants permission to AWS IoT Analytics to perform logging.
    */
  var roleArn: RoleArn
}
object LoggingOptions {
  
  inline def apply(enabled: LoggingEnabled, level: LoggingLevel, roleArn: RoleArn): LoggingOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingOptions]
  }
  
  extension [Self <: LoggingOptions](x: Self) {
    
    inline def setEnabled(value: LoggingEnabled): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: LoggingLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
