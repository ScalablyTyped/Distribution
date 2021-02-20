package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddApplicationCloudWatchLoggingOptionRequest extends StObject {
  
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
  
  @scala.inline
  implicit class AddApplicationCloudWatchLoggingOptionRequestMutableBuilder[Self <: AddApplicationCloudWatchLoggingOptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLoggingOption(value: CloudWatchLoggingOption): Self = StObject.set(x, "CloudWatchLoggingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "CurrentApplicationVersionId", value.asInstanceOf[js.Any])
  }
}
