package typings.awsSdk.dynamodbstreamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecordsOutput extends StObject {
  
  /**
    * The next position in the shard from which to start sequentially reading stream records. If set to null, the shard has been closed and the requested iterator will not return any more data.
    */
  var NextShardIterator: js.UndefOr[ShardIterator] = js.undefined
  
  /**
    * The stream records from the shard, which were retrieved using the shard iterator.
    */
  var Records: js.UndefOr[RecordList] = js.undefined
}
object GetRecordsOutput {
  
  @scala.inline
  def apply(): GetRecordsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRecordsOutput]
  }
  
  @scala.inline
  implicit class GetRecordsOutputMutableBuilder[Self <: GetRecordsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextShardIterator(value: ShardIterator): Self = StObject.set(x, "NextShardIterator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextShardIteratorUndefined: Self = StObject.set(x, "NextShardIterator", js.undefined)
    
    @scala.inline
    def setRecords(value: RecordList): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsUndefined: Self = StObject.set(x, "Records", js.undefined)
    
    @scala.inline
    def setRecordsVarargs(value: Record*): Self = StObject.set(x, "Records", js.Array(value :_*))
  }
}
