package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebalanceSlotsInGlobalReplicationGroupMessage extends StObject {
  
  /**
    * If True, redistribution is applied immediately.
    */
  var ApplyImmediately: Boolean
  
  /**
    * The name of the Global datastore
    */
  var GlobalReplicationGroupId: String
}
object RebalanceSlotsInGlobalReplicationGroupMessage {
  
  inline def apply(ApplyImmediately: Boolean, GlobalReplicationGroupId: String): RebalanceSlotsInGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebalanceSlotsInGlobalReplicationGroupMessage]
  }
  
  extension [Self <: RebalanceSlotsInGlobalReplicationGroupMessage](x: Self) {
    
    inline def setApplyImmediately(value: Boolean): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    inline def setGlobalReplicationGroupId(value: String): Self = StObject.set(x, "GlobalReplicationGroupId", value.asInstanceOf[js.Any])
  }
}
