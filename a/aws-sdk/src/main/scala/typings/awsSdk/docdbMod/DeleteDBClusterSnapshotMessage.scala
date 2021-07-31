package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBClusterSnapshotMessage extends StObject {
  
  /**
    * The identifier of the cluster snapshot to delete. Constraints: Must be the name of an existing cluster snapshot in the available state.
    */
  var DBClusterSnapshotIdentifier: String
}
object DeleteDBClusterSnapshotMessage {
  
  @scala.inline
  def apply(DBClusterSnapshotIdentifier: String): DeleteDBClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(DBClusterSnapshotIdentifier = DBClusterSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBClusterSnapshotMessage]
  }
  
  @scala.inline
  implicit class DeleteDBClusterSnapshotMessageMutableBuilder[Self <: DeleteDBClusterSnapshotMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterSnapshotIdentifier(value: String): Self = StObject.set(x, "DBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
  }
}
