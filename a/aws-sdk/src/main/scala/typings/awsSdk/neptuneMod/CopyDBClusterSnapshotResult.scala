package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyDBClusterSnapshotResult extends StObject {
  
  var DBClusterSnapshot: js.UndefOr[typings.awsSdk.neptuneMod.DBClusterSnapshot] = js.undefined
}
object CopyDBClusterSnapshotResult {
  
  @scala.inline
  def apply(): CopyDBClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyDBClusterSnapshotResult]
  }
  
  @scala.inline
  implicit class CopyDBClusterSnapshotResultMutableBuilder[Self <: CopyDBClusterSnapshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterSnapshot(value: DBClusterSnapshot): Self = StObject.set(x, "DBClusterSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterSnapshotUndefined: Self = StObject.set(x, "DBClusterSnapshot", js.undefined)
  }
}
