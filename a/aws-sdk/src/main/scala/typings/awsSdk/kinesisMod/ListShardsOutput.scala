package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListShardsOutput extends StObject {
  
  /**
    * When the number of shards in the data stream is greater than the default value for the MaxResults parameter, or if you explicitly specify a value for MaxResults that is less than the number of shards in the data stream, the response includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call to ListShards to list the next set of shards. For more information about the use of this pagination token when calling the ListShards operation, see ListShardsInput$NextToken.  Tokens expire after 300 seconds. When you obtain a value for NextToken in the response to a call to ListShards, you have 300 seconds to use that value. If you specify an expired token in a call to ListShards, you get ExpiredNextTokenException. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisMod.NextToken] = js.native
  
  /**
    * An array of JSON objects. Each object represents one shard and specifies the IDs of the shard, the shard's parent, and the shard that's adjacent to the shard's parent. Each object also contains the starting and ending hash keys and the starting and ending sequence numbers for the shard.
    */
  var Shards: js.UndefOr[ShardList] = js.native
}
object ListShardsOutput {
  
  @scala.inline
  def apply(): ListShardsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListShardsOutput]
  }
  
  @scala.inline
  implicit class ListShardsOutputMutableBuilder[Self <: ListShardsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setShards(value: ShardList): Self = StObject.set(x, "Shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardsUndefined: Self = StObject.set(x, "Shards", js.undefined)
    
    @scala.inline
    def setShardsVarargs(value: Shard*): Self = StObject.set(x, "Shards", js.Array(value :_*))
  }
}
