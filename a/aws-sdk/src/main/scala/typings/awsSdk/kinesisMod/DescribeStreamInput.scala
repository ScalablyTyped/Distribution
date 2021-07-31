package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStreamInput extends StObject {
  
  /**
    * The shard ID of the shard to start with.
    */
  var ExclusiveStartShardId: js.UndefOr[ShardId] = js.undefined
  
  /**
    * The maximum number of shards to return in a single call. The default value is 100. If you specify a value greater than 100, at most 100 shards are returned.
    */
  var Limit: js.UndefOr[DescribeStreamInputLimit] = js.undefined
  
  /**
    * The name of the stream to describe.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName
}
object DescribeStreamInput {
  
  @scala.inline
  def apply(StreamName: StreamName): DescribeStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamInput]
  }
  
  @scala.inline
  implicit class DescribeStreamInputMutableBuilder[Self <: DescribeStreamInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusiveStartShardId(value: ShardId): Self = StObject.set(x, "ExclusiveStartShardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveStartShardIdUndefined: Self = StObject.set(x, "ExclusiveStartShardId", js.undefined)
    
    @scala.inline
    def setLimit(value: DescribeStreamInputLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
