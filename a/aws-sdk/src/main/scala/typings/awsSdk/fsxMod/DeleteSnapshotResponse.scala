package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSnapshotResponse extends StObject {
  
  /**
    * The lifecycle status of the snapshot. If the DeleteSnapshot operation is successful, this status is DELETING.
    */
  var Lifecycle: js.UndefOr[SnapshotLifecycle] = js.undefined
  
  /**
    * The ID of the deleted snapshot.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.fsxMod.SnapshotId] = js.undefined
}
object DeleteSnapshotResponse {
  
  inline def apply(): DeleteSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSnapshotResponse]
  }
  
  extension [Self <: DeleteSnapshotResponse](x: Self) {
    
    inline def setLifecycle(value: SnapshotLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
  }
}
