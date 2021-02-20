package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildShard extends StObject {
  
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
  implicit class ChildShardMutableBuilder[Self <: ChildShard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashKeyRange(value: HashKeyRange): Self = StObject.set(x, "HashKeyRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentShards(value: ShardIdList): Self = StObject.set(x, "ParentShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentShardsVarargs(value: ShardId*): Self = StObject.set(x, "ParentShards", js.Array(value :_*))
    
    @scala.inline
    def setShardId(value: ShardId): Self = StObject.set(x, "ShardId", value.asInstanceOf[js.Any])
  }
}
