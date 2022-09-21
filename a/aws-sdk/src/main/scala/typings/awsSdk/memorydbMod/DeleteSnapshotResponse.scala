package typings.awsSdk.memorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSnapshotResponse extends StObject {
  
  /**
    * The snapshot object that has been deleted.
    */
  var Snapshot: js.UndefOr[typings.awsSdk.memorydbMod.Snapshot] = js.undefined
}
object DeleteSnapshotResponse {
  
  inline def apply(): DeleteSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSnapshotResponse]
  }
  
  extension [Self <: DeleteSnapshotResponse](x: Self) {
    
    inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "Snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "Snapshot", js.undefined)
  }
}
