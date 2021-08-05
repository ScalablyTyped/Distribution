package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteClusterSnapshotsRequest extends StObject {
  
  /**
    * A list of identifiers for the snapshots that you want to delete.
    */
  var Identifiers: DeleteClusterSnapshotMessageList
}
object BatchDeleteClusterSnapshotsRequest {
  
  inline def apply(Identifiers: DeleteClusterSnapshotMessageList): BatchDeleteClusterSnapshotsRequest = {
    val __obj = js.Dynamic.literal(Identifiers = Identifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteClusterSnapshotsRequest]
  }
  
  extension [Self <: BatchDeleteClusterSnapshotsRequest](x: Self) {
    
    inline def setIdentifiers(value: DeleteClusterSnapshotMessageList): Self = StObject.set(x, "Identifiers", value.asInstanceOf[js.Any])
    
    inline def setIdentifiersVarargs(value: DeleteClusterSnapshotMessage*): Self = StObject.set(x, "Identifiers", js.Array(value :_*))
  }
}
