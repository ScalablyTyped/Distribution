package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddApplicationCloudWatchLoggingOptionRequest extends js.Object {
  /**
    * The Kinesis Data Analytics application name.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * Provides the Amazon CloudWatch log stream Amazon Resource Name (ARN). 
    */
  var CloudWatchLoggingOption: typings.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOption = js.native
  /**
    * The version ID of the Kinesis Data Analytics application. You can retrieve the application version ID using DescribeApplication.
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
}

