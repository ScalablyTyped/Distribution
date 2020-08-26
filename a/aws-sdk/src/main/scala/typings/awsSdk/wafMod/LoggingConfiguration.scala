package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingConfiguration extends js.Object {
  /**
    * An array of Amazon Kinesis Data Firehose ARNs.
    */
  var LogDestinationConfigs: typings.awsSdk.wafMod.LogDestinationConfigs = js.native
  /**
    * The parts of the request that you want redacted from the logs. For example, if you redact the cookie field, the cookie field in the firehose will be xxx. 
    */
  var RedactedFields: js.UndefOr[typings.awsSdk.wafMod.RedactedFields] = js.native
  /**
    * The Amazon Resource Name (ARN) of the web ACL that you want to associate with LogDestinationConfigs.
    */
  var ResourceArn: typings.awsSdk.wafMod.ResourceArn = js.native
}

object LoggingConfiguration {
  @scala.inline
  def apply(LogDestinationConfigs: LogDestinationConfigs, ResourceArn: ResourceArn): LoggingConfiguration = {
    val __obj = js.Dynamic.literal(LogDestinationConfigs = LogDestinationConfigs.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfiguration]
  }
  @scala.inline
  implicit class LoggingConfigurationOps[Self <: LoggingConfiguration] (val x: Self) extends AnyVal {
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
    def setLogDestinationConfigsVarargs(value: ResourceArn*): Self = this.set("LogDestinationConfigs", js.Array(value :_*))
    @scala.inline
    def setLogDestinationConfigs(value: LogDestinationConfigs): Self = this.set("LogDestinationConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedactedFieldsVarargs(value: FieldToMatch*): Self = this.set("RedactedFields", js.Array(value :_*))
    @scala.inline
    def setRedactedFields(value: RedactedFields): Self = this.set("RedactedFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedactedFields: Self = this.set("RedactedFields", js.undefined)
  }
  
}

