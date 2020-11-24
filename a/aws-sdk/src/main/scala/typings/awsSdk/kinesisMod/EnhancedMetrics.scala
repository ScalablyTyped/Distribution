package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnhancedMetrics extends js.Object {
  
  /**
    * List of shard-level metrics. The following are the valid shard-level metrics. The value "ALL" enhances every metric.    IncomingBytes     IncomingRecords     OutgoingBytes     OutgoingRecords     WriteProvisionedThroughputExceeded     ReadProvisionedThroughputExceeded     IteratorAgeMilliseconds     ALL    For more information, see Monitoring the Amazon Kinesis Data Streams Service with Amazon CloudWatch in the Amazon Kinesis Data Streams Developer Guide.
    */
  var ShardLevelMetrics: js.UndefOr[MetricsNameList] = js.native
}
object EnhancedMetrics {
  
  @scala.inline
  def apply(): EnhancedMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnhancedMetrics]
  }
  
  @scala.inline
  implicit class EnhancedMetricsOps[Self <: EnhancedMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setShardLevelMetricsVarargs(value: MetricsName*): Self = this.set("ShardLevelMetrics", js.Array(value :_*))
    
    @scala.inline
    def setShardLevelMetrics(value: MetricsNameList): Self = this.set("ShardLevelMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShardLevelMetrics: Self = this.set("ShardLevelMetrics", js.undefined)
  }
}
