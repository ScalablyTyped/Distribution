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
  
  @scala.inline
  def apply(Identifiers: DeleteClusterSnapshotMessageList): BatchDeleteClusterSnapshotsRequest = {
    val __obj = js.Dynamic.literal(Identifiers = Identifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteClusterSnapshotsRequest]
  }
  
  @scala.inline
  implicit class BatchDeleteClusterSnapshotsRequestMutableBuilder[Self <: BatchDeleteClusterSnapshotsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifiers(value: DeleteClusterSnapshotMessageList): Self = StObject.set(x, "Identifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifiersVarargs(value: DeleteClusterSnapshotMessage*): Self = StObject.set(x, "Identifiers", js.Array(value :_*))
  }
}
