package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetV2LoggingOptionsResponse extends js.Object {
  /**
    * The default log level.
    */
  var defaultLogLevel: js.UndefOr[LogLevel] = js.native
  /**
    * Disables all logs.
    */
  var disableAllLogs: js.UndefOr[DisableAllLogs] = js.native
  /**
    * The IAM role ARN AWS IoT uses to write to your CloudWatch logs.
    */
  var roleArn: js.UndefOr[AwsArn] = js.native
}

object GetV2LoggingOptionsResponse {
  @scala.inline
  def apply(): GetV2LoggingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetV2LoggingOptionsResponse]
  }
  @scala.inline
  implicit class GetV2LoggingOptionsResponseOps[Self <: GetV2LoggingOptionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultLogLevel(value: LogLevel): Self = this.set("defaultLogLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLogLevel: Self = this.set("defaultLogLevel", js.undefined)
    @scala.inline
    def setDisableAllLogs(value: DisableAllLogs): Self = this.set("disableAllLogs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAllLogs: Self = this.set("disableAllLogs", js.undefined)
    @scala.inline
    def setRoleArn(value: AwsArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
  
}

