package typings.awsSdk.gamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotResult extends StObject {
  
  /**
    * Properties that provide details of the created snapshot.
    */
  var Snapshot: js.UndefOr[SnapshotDetails] = js.undefined
}
object CreateSnapshotResult {
  
  inline def apply(): CreateSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotResult]
  }
  
  extension [Self <: CreateSnapshotResult](x: Self) {
    
    inline def setSnapshot(value: SnapshotDetails): Self = StObject.set(x, "Snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "Snapshot", js.undefined)
  }
}
