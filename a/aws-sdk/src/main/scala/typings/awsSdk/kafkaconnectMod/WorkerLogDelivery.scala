package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerLogDelivery extends StObject {
  
  /**
    * Details about delivering logs to Amazon CloudWatch Logs.
    */
  var cloudWatchLogs: js.UndefOr[CloudWatchLogsLogDelivery] = js.undefined
  
  /**
    * Details about delivering logs to Amazon Kinesis Data Firehose.
    */
  var firehose: js.UndefOr[FirehoseLogDelivery] = js.undefined
  
  /**
    * Details about delivering logs to Amazon S3.
    */
  var s3: js.UndefOr[S3LogDelivery] = js.undefined
}
object WorkerLogDelivery {
  
  inline def apply(): WorkerLogDelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerLogDelivery]
  }
  
  extension [Self <: WorkerLogDelivery](x: Self) {
    
    inline def setCloudWatchLogs(value: CloudWatchLogsLogDelivery): Self = StObject.set(x, "cloudWatchLogs", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsUndefined: Self = StObject.set(x, "cloudWatchLogs", js.undefined)
    
    inline def setFirehose(value: FirehoseLogDelivery): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
    
    inline def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
    
    inline def setS3(value: S3LogDelivery): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
  }
}
