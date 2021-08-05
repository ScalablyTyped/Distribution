package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyDBClusterSnapshotResult extends StObject {
  
  var DBClusterSnapshot: js.UndefOr[typings.awsSdk.docdbMod.DBClusterSnapshot] = js.undefined
}
object CopyDBClusterSnapshotResult {
  
  inline def apply(): CopyDBClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyDBClusterSnapshotResult]
  }
  
  extension [Self <: CopyDBClusterSnapshotResult](x: Self) {
    
    inline def setDBClusterSnapshot(value: DBClusterSnapshot): Self = StObject.set(x, "DBClusterSnapshot", value.asInstanceOf[js.Any])
    
    inline def setDBClusterSnapshotUndefined: Self = StObject.set(x, "DBClusterSnapshot", js.undefined)
  }
}
