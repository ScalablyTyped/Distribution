package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDBClusterSnapshotMessage extends StObject {
  
  /**
    * The identifier of the DB cluster snapshot to delete. Constraints: Must be the name of an existing DB cluster snapshot in the available state.
    */
  var DBClusterSnapshotIdentifier: String = js.native
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
