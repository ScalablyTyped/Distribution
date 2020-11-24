package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shard extends js.Object {
  
  /**
    * The shard ID of the shard adjacent to the shard's parent.
    */
  var AdjacentParentShardId: js.UndefOr[ShardId] = js.native
  
  /**
    * The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.
    */
  var HashKeyRange: typings.awsSdk.kinesisMod.HashKeyRange = js.native
  
  /**
    * The shard ID of the shard's parent.
    */
  var ParentShardId: js.UndefOr[ShardId] = js.native
  
  /**
    * The range of possible sequence numbers for the shard.
    */
  var SequenceNumberRange: typings.awsSdk.kinesisMod.SequenceNumberRange = js.native
  
  /**
    * The unique identifier of the shard within the stream.
    */
  var ShardId: typings.awsSdk.kinesisMod.ShardId = js.native
}
object Shard {
  
  @scala.inline
  def apply(HashKeyRange: HashKeyRange, SequenceNumberRange: SequenceNumberRange, ShardId: ShardId): Shard = {
    val __obj = js.Dynamic.literal(HashKeyRange = HashKeyRange.asInstanceOf[js.Any], SequenceNumberRange = SequenceNumberRange.asInstanceOf[js.Any], ShardId = ShardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shard]
  }
  
  @scala.inline
  implicit class ShardOps[Self <: Shard] (val x: Self) extends AnyVal {
    
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
    def setHashKeyRange(value: HashKeyRange): Self = this.set("HashKeyRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceNumberRange(value: SequenceNumberRange): Self = this.set("SequenceNumberRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardId(value: ShardId): Self = this.set("ShardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjacentParentShardId(value: ShardId): Self = this.set("AdjacentParentShardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjacentParentShardId: Self = this.set("AdjacentParentShardId", js.undefined)
    
    @scala.inline
    def setParentShardId(value: ShardId): Self = this.set("ParentShardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentShardId: Self = this.set("ParentShardId", js.undefined)
  }
}
