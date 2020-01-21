package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddApplicationCloudWatchLoggingOptionResponse extends js.Object {
  /**
    * The application's ARN.
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The new version ID of the Kinesis Data Analytics application. Kinesis Data Analytics updates the ApplicationVersionId each time you change the CloudWatch logging options. 
    */
  var ApplicationVersionId: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId] = js.native
  /**
    * The descriptions of the current CloudWatch logging options for the Kinesis Data Analytics application.
    */
  var CloudWatchLoggingOptionDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOptionDescriptions] = js.native
}

object AddApplicationCloudWatchLoggingOptionResponse {
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN = null,
    ApplicationVersionId: Int | Double = null,
    CloudWatchLoggingOptionDescriptions: CloudWatchLoggingOptionDescriptions = null
  ): AddApplicationCloudWatchLoggingOptionResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationARN != null) __obj.updateDynamic("ApplicationARN")(ApplicationARN.asInstanceOf[js.Any])
    if (ApplicationVersionId != null) __obj.updateDynamic("ApplicationVersionId")(ApplicationVersionId.asInstanceOf[js.Any])
    if (CloudWatchLoggingOptionDescriptions != null) __obj.updateDynamic("CloudWatchLoggingOptionDescriptions")(CloudWatchLoggingOptionDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddApplicationCloudWatchLoggingOptionResponse]
  }
}

