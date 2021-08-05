package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShardFilter extends StObject {
  
  var ShardId: js.UndefOr[typings.awsSdk.kinesisMod.ShardId] = js.undefined
  
  var Timestamp: js.UndefOr[typings.awsSdk.kinesisMod.Timestamp] = js.undefined
  
  var Type: ShardFilterType
}
object ShardFilter {
  
  inline def apply(Type: ShardFilterType): ShardFilter = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShardFilter]
  }
  
  extension [Self <: ShardFilter](x: Self) {
    
    inline def setShardId(value: ShardId): Self = StObject.set(x, "ShardId", value.asInstanceOf[js.Any])
    
    inline def setShardIdUndefined: Self = StObject.set(x, "ShardId", js.undefined)
    
    inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    
    inline def setType(value: ShardFilterType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
