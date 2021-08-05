package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddApplicationCloudWatchLoggingOptionRequest extends StObject {
  
  /**
    * The Kinesis Data Analytics application name.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName
  
  /**
    * Provides the Amazon CloudWatch log stream Amazon Resource Name (ARN). 
    */
  var CloudWatchLoggingOption: typings.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOption
  
  /**
    * The version ID of the Kinesis Data Analytics application. You can retrieve the application version ID using DescribeApplication.
    */
  var CurrentApplicationVersionId: ApplicationVersionId
}
object AddApplicationCloudWatchLoggingOptionRequest {
  
  inline def apply(
    ApplicationName: ApplicationName,
    CloudWatchLoggingOption: CloudWatchLoggingOption,
    CurrentApplicationVersionId: ApplicationVersionId
  ): AddApplicationCloudWatchLoggingOptionRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CloudWatchLoggingOption = CloudWatchLoggingOption.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddApplicationCloudWatchLoggingOptionRequest]
  }
  
  extension [Self <: AddApplicationCloudWatchLoggingOptionRequest](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLoggingOption(value: CloudWatchLoggingOption): Self = StObject.set(x, "CloudWatchLoggingOption", value.asInstanceOf[js.Any])
    
    inline def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "CurrentApplicationVersionId", value.asInstanceOf[js.Any])
  }
}
