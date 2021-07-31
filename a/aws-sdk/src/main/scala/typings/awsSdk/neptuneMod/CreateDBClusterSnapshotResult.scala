package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBClusterSnapshotResult extends StObject {
  
  var DBClusterSnapshot: js.UndefOr[typings.awsSdk.neptuneMod.DBClusterSnapshot] = js.undefined
}
object CreateDBClusterSnapshotResult {
  
  @scala.inline
  def apply(): CreateDBClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBClusterSnapshotResult]
  }
  
  @scala.inline
  implicit class CreateDBClusterSnapshotResultMutableBuilder[Self <: CreateDBClusterSnapshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterSnapshot(value: DBClusterSnapshot): Self = StObject.set(x, "DBClusterSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterSnapshotUndefined: Self = StObject.set(x, "DBClusterSnapshot", js.undefined)
  }
}
