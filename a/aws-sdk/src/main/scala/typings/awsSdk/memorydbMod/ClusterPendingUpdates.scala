package typings.awsSdk.memorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterPendingUpdates extends StObject {
  
  /**
    * A list of ACLs associated with the cluster that are being updated
    */
  var ACLs: js.UndefOr[ACLsUpdateStatus] = js.undefined
  
  /**
    * The status of an online resharding operation.
    */
  var Resharding: js.UndefOr[ReshardingStatus] = js.undefined
  
  /**
    * A list of service updates being applied to the cluster
    */
  var ServiceUpdates: js.UndefOr[PendingModifiedServiceUpdateList] = js.undefined
}
object ClusterPendingUpdates {
  
  inline def apply(): ClusterPendingUpdates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterPendingUpdates]
  }
  
  extension [Self <: ClusterPendingUpdates](x: Self) {
    
    inline def setACLs(value: ACLsUpdateStatus): Self = StObject.set(x, "ACLs", value.asInstanceOf[js.Any])
    
    inline def setACLsUndefined: Self = StObject.set(x, "ACLs", js.undefined)
    
    inline def setResharding(value: ReshardingStatus): Self = StObject.set(x, "Resharding", value.asInstanceOf[js.Any])
    
    inline def setReshardingUndefined: Self = StObject.set(x, "Resharding", js.undefined)
    
    inline def setServiceUpdates(value: PendingModifiedServiceUpdateList): Self = StObject.set(x, "ServiceUpdates", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdatesUndefined: Self = StObject.set(x, "ServiceUpdates", js.undefined)
    
    inline def setServiceUpdatesVarargs(value: PendingModifiedServiceUpdate*): Self = StObject.set(x, "ServiceUpdates", js.Array(value*))
  }
}
