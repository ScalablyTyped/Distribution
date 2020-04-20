package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableEnhancedMonitoringInput extends js.Object {
  /**
    * List of shard-level metrics to enable. The following are the valid shard-level metrics. The value "ALL" enables every metric.    IncomingBytes     IncomingRecords     OutgoingBytes     OutgoingRecords     WriteProvisionedThroughputExceeded     ReadProvisionedThroughputExceeded     IteratorAgeMilliseconds     ALL    For more information, see Monitoring the Amazon Kinesis Data Streams Service with Amazon CloudWatch in the Amazon Kinesis Data Streams Developer Guide.
    */
  var ShardLevelMetrics: MetricsNameList = js.native
  /**
    * The name of the stream for which to enable enhanced monitoring.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName = js.native
}

object EnableEnhancedMonitoringInput {
  @scala.inline
  def apply(ShardLevelMetrics: MetricsNameList, StreamName: StreamName): EnableEnhancedMonitoringInput = {
    val __obj = js.Dynamic.literal(ShardLevelMetrics = ShardLevelMetrics.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableEnhancedMonitoringInput]
  }
}

