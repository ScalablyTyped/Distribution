package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromoteReadReplicaDBClusterResult extends StObject {
  
  var DBCluster: js.UndefOr[typings.awsSdk.neptuneMod.DBCluster] = js.undefined
}
object PromoteReadReplicaDBClusterResult {
  
  @scala.inline
  def apply(): PromoteReadReplicaDBClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromoteReadReplicaDBClusterResult]
  }
  
  @scala.inline
  implicit class PromoteReadReplicaDBClusterResultMutableBuilder[Self <: PromoteReadReplicaDBClusterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBCluster(value: DBCluster): Self = StObject.set(x, "DBCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterUndefined: Self = StObject.set(x, "DBCluster", js.undefined)
  }
}
