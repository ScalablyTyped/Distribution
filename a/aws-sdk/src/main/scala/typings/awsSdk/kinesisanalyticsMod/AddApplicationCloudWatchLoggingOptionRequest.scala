package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddApplicationCloudWatchLoggingOptionRequest extends js.Object {
  /**
    * The Kinesis Analytics application name.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsMod.ApplicationName = js.native
  /**
    * Provides the CloudWatch log stream Amazon Resource Name (ARN) and the IAM role ARN. Note: To write application messages to CloudWatch, the IAM role that is used must have the PutLogEvents policy action enabled.
    */
  var CloudWatchLoggingOption: typings.awsSdk.kinesisanalyticsMod.CloudWatchLoggingOption = js.native
  /**
    * The version ID of the Kinesis Analytics application.
    */
  var CurrentApplicationVersionId: ApplicationVersionId = js.native
}

object AddApplicationCloudWatchLoggingOptionRequest {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    CloudWatchLoggingOption: CloudWatchLoggingOption,
    CurrentApplicationVersionId: ApplicationVersionId
  ): AddApplicationCloudWatchLoggingOptionRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CloudWatchLoggingOption = CloudWatchLoggingOption.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddApplicationCloudWatchLoggingOptionRequest]
  }
  @scala.inline
  implicit class AddApplicationCloudWatchLoggingOptionRequestOps[Self <: AddApplicationCloudWatchLoggingOptionRequest] (val x: Self) extends AnyVal {
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
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloudWatchLoggingOption(value: CloudWatchLoggingOption): Self = this.set("CloudWatchLoggingOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = this.set("CurrentApplicationVersionId", value.asInstanceOf[js.Any])
  }
  
}

