package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotResponse extends StObject {
  
  /**
    * A description of the snapshot.
    */
  var Snapshot: js.UndefOr[typings.awsSdk.fsxMod.Snapshot] = js.undefined
}
object CreateSnapshotResponse {
  
  inline def apply(): CreateSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotResponse]
  }
  
  extension [Self <: CreateSnapshotResponse](x: Self) {
    
    inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "Snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "Snapshot", js.undefined)
  }
}
