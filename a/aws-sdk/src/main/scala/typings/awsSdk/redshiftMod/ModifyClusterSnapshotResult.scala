package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyClusterSnapshotResult extends StObject {
  
  var Snapshot: js.UndefOr[typings.awsSdk.redshiftMod.Snapshot] = js.undefined
}
object ModifyClusterSnapshotResult {
  
  inline def apply(): ModifyClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyClusterSnapshotResult]
  }
  
  extension [Self <: ModifyClusterSnapshotResult](x: Self) {
    
    inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "Snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "Snapshot", js.undefined)
  }
}
