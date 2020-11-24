package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingOptions extends js.Object {
  
  /**
    * If true, logging is enabled for AWS IoT Analytics.
    */
  var enabled: LoggingEnabled = js.native
  
  /**
    * The logging level. Currently, only ERROR is supported.
    */
  var level: LoggingLevel = js.native
  
  /**
    * The ARN of the role that grants permission to AWS IoT Analytics to perform logging.
    */
  var roleArn: RoleArn = js.native
}
object LoggingOptions {
  
  @scala.inline
  def apply(enabled: LoggingEnabled, level: LoggingLevel, roleArn: RoleArn): LoggingOptions = {
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
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
  }
}
