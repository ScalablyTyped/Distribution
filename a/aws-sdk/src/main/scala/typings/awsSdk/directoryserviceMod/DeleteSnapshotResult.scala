package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSnapshotResult extends StObject {
  
  /**
    * The identifier of the directory snapshot that was deleted.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.directoryserviceMod.SnapshotId] = js.undefined
}
object DeleteSnapshotResult {
  
  inline def apply(): DeleteSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSnapshotResult]
  }
  
  extension [Self <: DeleteSnapshotResult](x: Self) {
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
  }
}
