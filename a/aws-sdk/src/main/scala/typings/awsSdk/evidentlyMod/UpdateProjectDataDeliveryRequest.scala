package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProjectDataDeliveryRequest extends StObject {
  
  /**
    * A structure containing the CloudWatch Logs log group where you want to store evaluation events.
    */
  var cloudWatchLogs: js.UndefOr[CloudWatchLogsDestinationConfig] = js.undefined
  
  /**
    * The name or ARN of the project that you want to modify the data storage options for.
    */
  var project: ProjectRef
  
  /**
    * A structure containing the S3 bucket name and bucket prefix where you want to store evaluation events.
    */
  var s3Destination: js.UndefOr[S3DestinationConfig] = js.undefined
}
object UpdateProjectDataDeliveryRequest {
  
  inline def apply(project: ProjectRef): UpdateProjectDataDeliveryRequest = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectDataDeliveryRequest]
  }
  
  extension [Self <: UpdateProjectDataDeliveryRequest](x: Self) {
    
    inline def setCloudWatchLogs(value: CloudWatchLogsDestinationConfig): Self = StObject.set(x, "cloudWatchLogs", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsUndefined: Self = StObject.set(x, "cloudWatchLogs", js.undefined)
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setS3Destination(value: S3DestinationConfig): Self = StObject.set(x, "s3Destination", value.asInstanceOf[js.Any])
    
    inline def setS3DestinationUndefined: Self = StObject.set(x, "s3Destination", js.undefined)
  }
}
