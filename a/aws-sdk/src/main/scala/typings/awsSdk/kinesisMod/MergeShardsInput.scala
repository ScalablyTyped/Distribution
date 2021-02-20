package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeShardsInput extends StObject {
  
  /**
    * The shard ID of the adjacent shard for the merge.
    */
  var AdjacentShardToMerge: ShardId = js.native
  
  /**
    * The shard ID of the shard to combine with the adjacent shard for the merge.
    */
  var ShardToMerge: ShardId = js.native
  
  /**
    * The name of the stream for the merge.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName = js.native
}
object MergeShardsInput {
  
  @scala.inline
  def apply(AdjacentShardToMerge: ShardId, ShardToMerge: ShardId, StreamName: StreamName): MergeShardsInput = {
    val __obj = js.Dynamic.literal(AdjacentShardToMerge = AdjacentShardToMerge.asInstanceOf[js.Any], ShardToMerge = ShardToMerge.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeShardsInput]
  }
  
  @scala.inline
  implicit class MergeShardsInputMutableBuilder[Self <: MergeShardsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjacentShardToMerge(value: ShardId): Self = StObject.set(x, "AdjacentShardToMerge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardToMerge(value: ShardId): Self = StObject.set(x, "ShardToMerge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
