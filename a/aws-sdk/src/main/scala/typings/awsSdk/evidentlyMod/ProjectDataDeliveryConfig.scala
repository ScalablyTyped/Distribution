package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectDataDeliveryConfig extends StObject {
  
  /**
    * If the project stores evaluation events in CloudWatch Logs, this structure stores the log group name.
    */
  var cloudWatchLogs: js.UndefOr[CloudWatchLogsDestinationConfig] = js.undefined
  
  /**
    * If the project stores evaluation events in an Amazon S3 bucket, this structure stores the bucket name and bucket prefix.
    */
  var s3Destination: js.UndefOr[S3DestinationConfig] = js.undefined
}
object ProjectDataDeliveryConfig {
  
  inline def apply(): ProjectDataDeliveryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectDataDeliveryConfig]
  }
  
  extension [Self <: ProjectDataDeliveryConfig](x: Self) {
    
    inline def setCloudWatchLogs(value: CloudWatchLogsDestinationConfig): Self = StObject.set(x, "cloudWatchLogs", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsUndefined: Self = StObject.set(x, "cloudWatchLogs", js.undefined)
    
    inline def setS3Destination(value: S3DestinationConfig): Self = StObject.set(x, "s3Destination", value.asInstanceOf[js.Any])
    
    inline def setS3DestinationUndefined: Self = StObject.set(x, "s3Destination", js.undefined)
  }
}
