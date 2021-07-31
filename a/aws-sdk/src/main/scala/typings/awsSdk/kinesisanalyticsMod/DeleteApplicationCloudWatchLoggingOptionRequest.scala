package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApplicationCloudWatchLoggingOptionRequest extends StObject {
  
  /**
    * The Kinesis Analytics application name.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsMod.ApplicationName
  
  /**
    * The CloudWatchLoggingOptionId of the CloudWatch logging option to delete. You can get the CloudWatchLoggingOptionId by using the DescribeApplication operation. 
    */
  var CloudWatchLoggingOptionId: Id
  
  /**
    * The version ID of the Kinesis Analytics application.
    */
  var CurrentApplicationVersionId: ApplicationVersionId
}
object DeleteApplicationCloudWatchLoggingOptionRequest {
  
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    CloudWatchLoggingOptionId: Id,
    CurrentApplicationVersionId: ApplicationVersionId
  ): DeleteApplicationCloudWatchLoggingOptionRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CloudWatchLoggingOptionId = CloudWatchLoggingOptionId.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationCloudWatchLoggingOptionRequest]
  }
  
  @scala.inline
  implicit class DeleteApplicationCloudWatchLoggingOptionRequestMutableBuilder[Self <: DeleteApplicationCloudWatchLoggingOptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLoggingOptionId(value: Id): Self = StObject.set(x, "CloudWatchLoggingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "CurrentApplicationVersionId", value.asInstanceOf[js.Any])
  }
}
