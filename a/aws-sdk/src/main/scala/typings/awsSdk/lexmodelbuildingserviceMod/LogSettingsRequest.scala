package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogSettingsRequest extends js.Object {
  /**
    * Where the logs will be delivered. Text logs are delivered to a CloudWatch Logs log group. Audio logs are delivered to an S3 bucket.
    */
  var destination: Destination = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS KMS customer managed key for encrypting audio logs delivered to an S3 bucket. The key does not apply to CloudWatch Logs and is optional for S3 buckets.
    */
  var kmsKeyArn: js.UndefOr[KmsKeyArn] = js.native
  /**
    * The type of logging to enable. Text logs are delivered to a CloudWatch Logs log group. Audio logs are delivered to an S3 bucket.
    */
  var logType: LogType = js.native
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs should be delivered.
    */
  var resourceArn: ResourceArn = js.native
}

object LogSettingsRequest {
  @scala.inline
  def apply(destination: Destination, logType: LogType, resourceArn: ResourceArn): LogSettingsRequest = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], logType = logType.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogSettingsRequest]
  }
  @scala.inline
  implicit class LogSettingsRequestOps[Self <: LogSettingsRequest] (val x: Self) extends AnyVal {
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
    def setDestination(value: Destination): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogType(value: LogType): Self = this.set("logType", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setKmsKeyArn(value: KmsKeyArn): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("kmsKeyArn", js.undefined)
  }
  
}

