package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDBClusterSnapshotResult extends StObject {
  
  var DBClusterSnapshot: js.UndefOr[typings.awsSdk.neptuneMod.DBClusterSnapshot] = js.native
}
object DeleteDBClusterSnapshotResult {
  
  @scala.inline
  def apply(): DeleteDBClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDBClusterSnapshotResult]
  }
  
  @scala.inline
  implicit class DeleteDBClusterSnapshotResultMutableBuilder[Self <: DeleteDBClusterSnapshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterSnapshot(value: DBClusterSnapshot): Self = StObject.set(x, "DBClusterSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterSnapshotUndefined: Self = StObject.set(x, "DBClusterSnapshot", js.undefined)
  }
}
