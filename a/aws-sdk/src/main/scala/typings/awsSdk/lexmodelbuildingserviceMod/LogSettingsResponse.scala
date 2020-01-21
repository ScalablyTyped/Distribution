package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogSettingsResponse extends js.Object {
  /**
    * The destination where logs are delivered.
    */
  var destination: js.UndefOr[Destination] = js.native
  /**
    * The Amazon Resource Name (ARN) of the key used to encrypt audio logs in an S3 bucket.
    */
  var kmsKeyArn: js.UndefOr[KmsKeyArn] = js.native
  /**
    * The type of logging that is enabled.
    */
  var logType: js.UndefOr[LogType] = js.native
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs are delivered.
    */
  var resourceArn: js.UndefOr[ResourceArn] = js.native
  /**
    * The resource prefix is the first part of the S3 object key within the S3 bucket that you specified to contain audio logs. For CloudWatch Logs it is the prefix of the log stream name within the log group that you specified. 
    */
  var resourcePrefix: js.UndefOr[ResourcePrefix] = js.native
}

object LogSettingsResponse {
  @scala.inline
  def apply(
    destination: Destination = null,
    kmsKeyArn: KmsKeyArn = null,
    logType: LogType = null,
    resourceArn: ResourceArn = null,
    resourcePrefix: ResourcePrefix = null
  ): LogSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (logType != null) __obj.updateDynamic("logType")(logType.asInstanceOf[js.Any])
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn.asInstanceOf[js.Any])
    if (resourcePrefix != null) __obj.updateDynamic("resourcePrefix")(resourcePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogSettingsResponse]
  }
}

