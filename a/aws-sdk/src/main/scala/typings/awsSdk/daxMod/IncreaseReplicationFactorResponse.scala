package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncreaseReplicationFactorResponse extends StObject {
  
  /**
    * A description of the DAX cluster. with its new replication factor.
    */
  var Cluster: js.UndefOr[typings.awsSdk.daxMod.Cluster] = js.undefined
}
object IncreaseReplicationFactorResponse {
  
  inline def apply(): IncreaseReplicationFactorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncreaseReplicationFactorResponse]
  }
  
  extension [Self <: IncreaseReplicationFactorResponse](x: Self) {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
