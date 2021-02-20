package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDBClusterSnapshotResult extends StObject {
  
  var DBClusterSnapshot: js.UndefOr[typings.awsSdk.rdsMod.DBClusterSnapshot] = js.native
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
