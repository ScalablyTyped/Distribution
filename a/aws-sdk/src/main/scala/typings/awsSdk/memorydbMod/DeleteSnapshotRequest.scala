package typings.awsSdk.memorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSnapshotRequest extends StObject {
  
  /**
    * The name of the snapshot to delete
    */
  var SnapshotName: String
}
object DeleteSnapshotRequest {
  
  inline def apply(SnapshotName: String): DeleteSnapshotRequest = {
    val __obj = js.Dynamic.literal(SnapshotName = SnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSnapshotRequest]
  }
  
  extension [Self <: DeleteSnapshotRequest](x: Self) {
    
    inline def setSnapshotName(value: String): Self = StObject.set(x, "SnapshotName", value.asInstanceOf[js.Any])
  }
}
