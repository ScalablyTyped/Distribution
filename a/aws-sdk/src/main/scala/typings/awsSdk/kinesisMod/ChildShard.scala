package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildShard extends js.Object {
  
  var HashKeyRange: typings.awsSdk.kinesisMod.HashKeyRange = js.native
  
  var ParentShards: ShardIdList = js.native
  
  var ShardId: typings.awsSdk.kinesisMod.ShardId = js.native
}
object ChildShard {
  
  @scala.inline
  def apply(HashKeyRange: HashKeyRange, ParentShards: ShardIdList, ShardId: ShardId): ChildShard = {
    val __obj = js.Dynamic.literal(HashKeyRange = HashKeyRange.asInstanceOf[js.Any], ParentShards = ParentShards.asInstanceOf[js.Any], ShardId = ShardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildShard]
  }
  
  @scala.inline
  implicit class ChildShardOps[Self <: ChildShard] (val x: Self) extends AnyVal {
    
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
    def setParentShardsVarargs(value: ShardId*): Self = this.set("ParentShards", js.Array(value :_*))
    
    @scala.inline
    def setParentShards(value: ShardIdList): Self = this.set("ParentShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardId(value: ShardId): Self = this.set("ShardId", value.asInstanceOf[js.Any])
  }
}
