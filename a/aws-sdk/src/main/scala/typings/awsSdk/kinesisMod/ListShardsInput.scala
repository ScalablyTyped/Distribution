package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListShardsInput extends StObject {
  
  /**
    * Specify this parameter to indicate that you want to list the shards starting with the shard whose ID immediately follows ExclusiveStartShardId. If you don't specify this parameter, the default behavior is for ListShards to list the shards starting with the first one in the stream. You cannot specify this parameter if you specify NextToken.
    */
  var ExclusiveStartShardId: js.UndefOr[ShardId] = js.undefined
  
  /**
    * The maximum number of shards to return in a single call to ListShards. The minimum value you can specify for this parameter is 1, and the maximum is 10,000, which is also the default. When the number of shards to be listed is greater than the value of MaxResults, the response contains a NextToken value that you can use in a subsequent call to ListShards to list the next set of shards.
    */
  var MaxResults: js.UndefOr[ListShardsInputLimit] = js.undefined
  
  /**
    * When the number of shards in the data stream is greater than the default value for the MaxResults parameter, or if you explicitly specify a value for MaxResults that is less than the number of shards in the data stream, the response includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call to ListShards to list the next set of shards. Don't specify StreamName or StreamCreationTimestamp if you specify NextToken because the latter unambiguously identifies the stream. You can optionally specify a value for the MaxResults parameter when you specify NextToken. If you specify a MaxResults value that is less than the number of shards that the operation returns if you don't specify MaxResults, the response will contain a new NextToken value. You can use the new NextToken value in a subsequent call to the ListShards operation.  Tokens expire after 300 seconds. When you obtain a value for NextToken in the response to a call to ListShards, you have 300 seconds to use that value. If you specify an expired token in a call to ListShards, you get ExpiredNextTokenException. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisMod.NextToken] = js.undefined
  
  var ShardFilter: js.UndefOr[typings.awsSdk.kinesisMod.ShardFilter] = js.undefined
  
  /**
    * Specify this input parameter to distinguish data streams that have the same name. For example, if you create a data stream and then delete it, and you later create another data stream with the same name, you can use this input parameter to specify which of the two streams you want to list the shards for. You cannot specify this parameter if you specify the NextToken parameter.
    */
  var StreamCreationTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the data stream whose shards you want to list.  You cannot specify this parameter if you specify the NextToken parameter.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisMod.StreamName] = js.undefined
}
object ListShardsInput {
  
  @scala.inline
  def apply(): ListShardsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListShardsInput]
  }
  
  @scala.inline
  implicit class ListShardsInputMutableBuilder[Self <: ListShardsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusiveStartShardId(value: ShardId): Self = StObject.set(x, "ExclusiveStartShardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveStartShardIdUndefined: Self = StObject.set(x, "ExclusiveStartShardId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: ListShardsInputLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setShardFilter(value: ShardFilter): Self = StObject.set(x, "ShardFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardFilterUndefined: Self = StObject.set(x, "ShardFilter", js.undefined)
    
    @scala.inline
    def setStreamCreationTimestamp(value: Timestamp): Self = StObject.set(x, "StreamCreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamCreationTimestampUndefined: Self = StObject.set(x, "StreamCreationTimestamp", js.undefined)
    
    @scala.inline
    def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
