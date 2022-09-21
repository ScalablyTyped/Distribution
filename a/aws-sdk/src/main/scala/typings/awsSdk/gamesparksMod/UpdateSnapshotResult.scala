package typings.awsSdk.gamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSnapshotResult extends StObject {
  
  /**
    * Properties that provide details of the updated snapshot.
    */
  var Snapshot: js.UndefOr[SnapshotDetails] = js.undefined
}
object UpdateSnapshotResult {
  
  inline def apply(): UpdateSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSnapshotResult]
  }
  
  extension [Self <: UpdateSnapshotResult](x: Self) {
    
    inline def setSnapshot(value: SnapshotDetails): Self = StObject.set(x, "Snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "Snapshot", js.undefined)
  }
}
