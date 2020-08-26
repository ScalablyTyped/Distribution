package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApplicationCloudWatchLoggingOptionResponse extends js.Object {
  /**
    * The application's Amazon Resource Name (ARN).
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The version ID of the application. Kinesis Data Analytics updates the ApplicationVersionId each time you change the CloudWatch logging options.
    */
  var ApplicationVersionId: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId] = js.native
  /**
    * The descriptions of the remaining CloudWatch logging options for the application.
    */
  var CloudWatchLoggingOptionDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOptionDescriptions] = js.native
}

object DeleteApplicationCloudWatchLoggingOptionResponse {
  @scala.inline
  def apply(): DeleteApplicationCloudWatchLoggingOptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteApplicationCloudWatchLoggingOptionResponse]
  }
  @scala.inline
  implicit class DeleteApplicationCloudWatchLoggingOptionResponseOps[Self <: DeleteApplicationCloudWatchLoggingOptionResponse] (val x: Self) extends AnyVal {
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
    def setApplicationARN(value: ResourceARN): Self = this.set("ApplicationARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationARN: Self = this.set("ApplicationARN", js.undefined)
    @scala.inline
    def setApplicationVersionId(value: ApplicationVersionId): Self = this.set("ApplicationVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationVersionId: Self = this.set("ApplicationVersionId", js.undefined)
    @scala.inline
    def setCloudWatchLoggingOptionDescriptionsVarargs(value: CloudWatchLoggingOptionDescription*): Self = this.set("CloudWatchLoggingOptionDescriptions", js.Array(value :_*))
    @scala.inline
    def setCloudWatchLoggingOptionDescriptions(value: CloudWatchLoggingOptionDescriptions): Self = this.set("CloudWatchLoggingOptionDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudWatchLoggingOptionDescriptions: Self = this.set("CloudWatchLoggingOptionDescriptions", js.undefined)
  }
  
}

