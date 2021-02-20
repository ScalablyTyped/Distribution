package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingOptions extends StObject {
  
  /**
    * Information that identifies those detector models and their detectors (instances) for which the logging level is given.
    */
  var detectorDebugOptions: js.UndefOr[DetectorDebugOptions] = js.native
  
  /**
    * If TRUE, logging is enabled for AWS IoT Events.
    */
  var enabled: LoggingEnabled = js.native
  
  /**
    * The logging level.
    */
  var level: LoggingLevel = js.native
  
  /**
    * The ARN of the role that grants permission to AWS IoT Events to perform logging.
    */
  var roleArn: AmazonResourceName = js.native
}
object LoggingOptions {
  
  @scala.inline
  def apply(enabled: LoggingEnabled, level: LoggingLevel, roleArn: AmazonResourceName): LoggingOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingOptions]
  }
  
  @scala.inline
  implicit class LoggingOptionsMutableBuilder[Self <: LoggingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorDebugOptions(value: DetectorDebugOptions): Self = StObject.set(x, "detectorDebugOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorDebugOptionsUndefined: Self = StObject.set(x, "detectorDebugOptions", js.undefined)
    
    @scala.inline
    def setDetectorDebugOptionsVarargs(value: DetectorDebugOption*): Self = StObject.set(x, "detectorDebugOptions", js.Array(value :_*))
    
    @scala.inline
    def setEnabled(value: LoggingEnabled): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: LoggingLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: AmazonResourceName): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
