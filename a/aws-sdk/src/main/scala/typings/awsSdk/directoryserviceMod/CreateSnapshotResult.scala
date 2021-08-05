package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotResult extends StObject {
  
  /**
    * The identifier of the snapshot that was created.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.directoryserviceMod.SnapshotId] = js.undefined
}
object CreateSnapshotResult {
  
  inline def apply(): CreateSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotResult]
  }
  
  extension [Self <: CreateSnapshotResult](x: Self) {
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
  }
}
