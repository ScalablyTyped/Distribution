package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableFastSnapshotRestoreErrorItem extends StObject {
  
  /**
    * The errors.
    */
  var FastSnapshotRestoreStateErrors: js.UndefOr[EnableFastSnapshotRestoreStateErrorSet] = js.undefined
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
}
object EnableFastSnapshotRestoreErrorItem {
  
  inline def apply(): EnableFastSnapshotRestoreErrorItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableFastSnapshotRestoreErrorItem]
  }
  
  extension [Self <: EnableFastSnapshotRestoreErrorItem](x: Self) {
    
    inline def setFastSnapshotRestoreStateErrors(value: EnableFastSnapshotRestoreStateErrorSet): Self = StObject.set(x, "FastSnapshotRestoreStateErrors", value.asInstanceOf[js.Any])
    
    inline def setFastSnapshotRestoreStateErrorsUndefined: Self = StObject.set(x, "FastSnapshotRestoreStateErrors", js.undefined)
    
    inline def setFastSnapshotRestoreStateErrorsVarargs(value: EnableFastSnapshotRestoreStateErrorItem*): Self = StObject.set(x, "FastSnapshotRestoreStateErrors", js.Array(value*))
    
    inline def setSnapshotId(value: String): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
  }
}
