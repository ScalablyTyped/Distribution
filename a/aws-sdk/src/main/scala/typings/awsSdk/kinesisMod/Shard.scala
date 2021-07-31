package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shard extends StObject {
  
  /**
    * The shard ID of the shard adjacent to the shard's parent.
    */
  var AdjacentParentShardId: js.UndefOr[ShardId] = js.undefined
  
  /**
    * The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.
    */
  var HashKeyRange: typings.awsSdk.kinesisMod.HashKeyRange
  
  /**
    * The shard ID of the shard's parent.
    */
  var ParentShardId: js.UndefOr[ShardId] = js.undefined
  
  /**
    * The range of possible sequence numbers for the shard.
    */
  var SequenceNumberRange: typings.awsSdk.kinesisMod.SequenceNumberRange
  
  /**
    * The unique identifier of the shard within the stream.
    */
  var ShardId: typings.awsSdk.kinesisMod.ShardId
}
object Shard {
  
  @scala.inline
  def apply(HashKeyRange: HashKeyRange, SequenceNumberRange: SequenceNumberRange, ShardId: ShardId): Shard = {
    val __obj = js.Dynamic.literal(HashKeyRange = HashKeyRange.asInstanceOf[js.Any], SequenceNumberRange = SequenceNumberRange.asInstanceOf[js.Any], ShardId = ShardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shard]
  }
  
  @scala.inline
  implicit class ShardMutableBuilder[Self <: Shard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjacentParentShardId(value: ShardId): Self = StObject.set(x, "AdjacentParentShardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjacentParentShardIdUndefined: Self = StObject.set(x, "AdjacentParentShardId", js.undefined)
    
    @scala.inline
    def setHashKeyRange(value: HashKeyRange): Self = StObject.set(x, "HashKeyRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentShardId(value: ShardId): Self = StObject.set(x, "ParentShardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentShardIdUndefined: Self = StObject.set(x, "ParentShardId", js.undefined)
    
    @scala.inline
    def setSequenceNumberRange(value: SequenceNumberRange): Self = StObject.set(x, "SequenceNumberRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardId(value: ShardId): Self = StObject.set(x, "ShardId", value.asInstanceOf[js.Any])
  }
}
