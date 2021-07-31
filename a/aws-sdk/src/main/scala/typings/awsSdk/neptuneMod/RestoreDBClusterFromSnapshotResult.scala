package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreDBClusterFromSnapshotResult extends StObject {
  
  var DBCluster: js.UndefOr[typings.awsSdk.neptuneMod.DBCluster] = js.undefined
}
object RestoreDBClusterFromSnapshotResult {
  
  @scala.inline
  def apply(): RestoreDBClusterFromSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreDBClusterFromSnapshotResult]
  }
  
  @scala.inline
  implicit class RestoreDBClusterFromSnapshotResultMutableBuilder[Self <: RestoreDBClusterFromSnapshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBCluster(value: DBCluster): Self = StObject.set(x, "DBCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterUndefined: Self = StObject.set(x, "DBCluster", js.undefined)
  }
}
