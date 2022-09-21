package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotsResult extends StObject {
  
  /**
    * List of snapshots.
    */
  var Snapshots: js.UndefOr[SnapshotSet] = js.undefined
}
object CreateSnapshotsResult {
  
  inline def apply(): CreateSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotsResult]
  }
  
  extension [Self <: CreateSnapshotsResult](x: Self) {
    
    inline def setSnapshots(value: SnapshotSet): Self = StObject.set(x, "Snapshots", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsUndefined: Self = StObject.set(x, "Snapshots", js.undefined)
    
    inline def setSnapshotsVarargs(value: SnapshotInfo*): Self = StObject.set(x, "Snapshots", js.Array(value*))
  }
}
