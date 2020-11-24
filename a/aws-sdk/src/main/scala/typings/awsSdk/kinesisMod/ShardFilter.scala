package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShardFilter extends js.Object {
  
  var ShardId: js.UndefOr[typings.awsSdk.kinesisMod.ShardId] = js.native
  
  var Timestamp: js.UndefOr[typings.awsSdk.kinesisMod.Timestamp] = js.native
  
  var Type: ShardFilterType = js.native
}
object ShardFilter {
  
  @scala.inline
  def apply(Type: ShardFilterType): ShardFilter = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShardFilter]
  }
  
  @scala.inline
  implicit class ShardFilterOps[Self <: ShardFilter] (val x: Self) extends AnyVal {
    
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
    def setType(value: ShardFilterType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardId(value: ShardId): Self = this.set("ShardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShardId: Self = this.set("ShardId", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
}
