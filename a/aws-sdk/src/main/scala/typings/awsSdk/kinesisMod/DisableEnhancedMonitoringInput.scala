package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableEnhancedMonitoringInput extends StObject {
  
  /**
    * List of shard-level metrics to disable. The following are the valid shard-level metrics. The value "ALL" disables every metric.    IncomingBytes     IncomingRecords     OutgoingBytes     OutgoingRecords     WriteProvisionedThroughputExceeded     ReadProvisionedThroughputExceeded     IteratorAgeMilliseconds     ALL    For more information, see Monitoring the Amazon Kinesis Data Streams Service with Amazon CloudWatch in the Amazon Kinesis Data Streams Developer Guide.
    */
  var ShardLevelMetrics: MetricsNameList
  
  /**
    * The name of the Kinesis data stream for which to disable enhanced monitoring.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName
}
object DisableEnhancedMonitoringInput {
  
  inline def apply(ShardLevelMetrics: MetricsNameList, StreamName: StreamName): DisableEnhancedMonitoringInput = {
    val __obj = js.Dynamic.literal(ShardLevelMetrics = ShardLevelMetrics.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableEnhancedMonitoringInput]
  }
  
  extension [Self <: DisableEnhancedMonitoringInput](x: Self) {
    
    inline def setShardLevelMetrics(value: MetricsNameList): Self = StObject.set(x, "ShardLevelMetrics", value.asInstanceOf[js.Any])
    
    inline def setShardLevelMetricsVarargs(value: MetricsName*): Self = StObject.set(x, "ShardLevelMetrics", js.Array(value*))
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
