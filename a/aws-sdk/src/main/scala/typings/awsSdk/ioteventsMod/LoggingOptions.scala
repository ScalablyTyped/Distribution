package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingOptions extends js.Object {
  
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
  implicit class LoggingOptionsOps[Self <: LoggingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnabled(value: LoggingEnabled): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: LoggingLevel): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: AmazonResourceName): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorDebugOptionsVarargs(value: DetectorDebugOption*): Self = this.set("detectorDebugOptions", js.Array(value :_*))
    
    @scala.inline
    def setDetectorDebugOptions(value: DetectorDebugOptions): Self = this.set("detectorDebugOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectorDebugOptions: Self = this.set("detectorDebugOptions", js.undefined)
  }
}
