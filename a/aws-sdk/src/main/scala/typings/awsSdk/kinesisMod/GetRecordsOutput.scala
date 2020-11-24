package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRecordsOutput extends js.Object {
  
  var ChildShards: js.UndefOr[ChildShardList] = js.native
  
  /**
    * The number of milliseconds the GetRecords response is from the tip of the stream, indicating how far behind current time the consumer is. A value of zero indicates that record processing is caught up, and there are no new records to process at this moment.
    */
  var MillisBehindLatest: js.UndefOr[typings.awsSdk.kinesisMod.MillisBehindLatest] = js.native
  
  /**
    * The next position in the shard from which to start sequentially reading data records. If set to null, the shard has been closed and the requested iterator does not return any more data. 
    */
  var NextShardIterator: js.UndefOr[ShardIterator] = js.native
  
  /**
    * The data records retrieved from the shard.
    */
  var Records: RecordList = js.native
}
object GetRecordsOutput {
  
  @scala.inline
  def apply(Records: RecordList): GetRecordsOutput = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecordsOutput]
  }
  
  @scala.inline
  implicit class GetRecordsOutputOps[Self <: GetRecordsOutput] (val x: Self) extends AnyVal {
    
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
    def setRecordsVarargs(value: Record*): Self = this.set("Records", js.Array(value :_*))
    
    @scala.inline
    def setRecords(value: RecordList): Self = this.set("Records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildShardsVarargs(value: ChildShard*): Self = this.set("ChildShards", js.Array(value :_*))
    
    @scala.inline
    def setChildShards(value: ChildShardList): Self = this.set("ChildShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildShards: Self = this.set("ChildShards", js.undefined)
    
    @scala.inline
    def setMillisBehindLatest(value: MillisBehindLatest): Self = this.set("MillisBehindLatest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMillisBehindLatest: Self = this.set("MillisBehindLatest", js.undefined)
    
    @scala.inline
    def setNextShardIterator(value: ShardIterator): Self = this.set("NextShardIterator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextShardIterator: Self = this.set("NextShardIterator", js.undefined)
  }
}
