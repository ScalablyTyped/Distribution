package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRecordsOutput extends StObject {
  
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
  implicit class GetRecordsOutputMutableBuilder[Self <: GetRecordsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildShards(value: ChildShardList): Self = StObject.set(x, "ChildShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildShardsUndefined: Self = StObject.set(x, "ChildShards", js.undefined)
    
    @scala.inline
    def setChildShardsVarargs(value: ChildShard*): Self = StObject.set(x, "ChildShards", js.Array(value :_*))
    
    @scala.inline
    def setMillisBehindLatest(value: MillisBehindLatest): Self = StObject.set(x, "MillisBehindLatest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMillisBehindLatestUndefined: Self = StObject.set(x, "MillisBehindLatest", js.undefined)
    
    @scala.inline
    def setNextShardIterator(value: ShardIterator): Self = StObject.set(x, "NextShardIterator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextShardIteratorUndefined: Self = StObject.set(x, "NextShardIterator", js.undefined)
    
    @scala.inline
    def setRecords(value: RecordList): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsVarargs(value: Record*): Self = StObject.set(x, "Records", js.Array(value :_*))
  }
}
