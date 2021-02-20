package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShardFilter extends StObject {
  
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
  implicit class ShardFilterMutableBuilder[Self <: ShardFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShardId(value: ShardId): Self = StObject.set(x, "ShardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardIdUndefined: Self = StObject.set(x, "ShardId", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    
    @scala.inline
    def setType(value: ShardFilterType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
