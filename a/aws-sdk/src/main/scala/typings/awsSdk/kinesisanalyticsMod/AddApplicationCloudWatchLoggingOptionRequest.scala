package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddApplicationCloudWatchLoggingOptionRequest extends StObject {
  
  /**
    * The Kinesis Analytics application name.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsMod.ApplicationName
  
  /**
    * Provides the CloudWatch log stream Amazon Resource Name (ARN) and the IAM role ARN. Note: To write application messages to CloudWatch, the IAM role that is used must have the PutLogEvents policy action enabled.
    */
  var CloudWatchLoggingOption: typings.awsSdk.kinesisanalyticsMod.CloudWatchLoggingOption
  
  /**
    * The version ID of the Kinesis Analytics application.
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
