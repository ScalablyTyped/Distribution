package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreTableFromClusterSnapshotResult extends StObject {
  
  var TableRestoreStatus: js.UndefOr[typings.awsSdk.redshiftMod.TableRestoreStatus] = js.undefined
}
object RestoreTableFromClusterSnapshotResult {
  
  @scala.inline
  def apply(): RestoreTableFromClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreTableFromClusterSnapshotResult]
  }
  
  @scala.inline
  implicit class RestoreTableFromClusterSnapshotResultMutableBuilder[Self <: RestoreTableFromClusterSnapshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableRestoreStatus(value: TableRestoreStatus): Self = StObject.set(x, "TableRestoreStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableRestoreStatusUndefined: Self = StObject.set(x, "TableRestoreStatus", js.undefined)
  }
}
