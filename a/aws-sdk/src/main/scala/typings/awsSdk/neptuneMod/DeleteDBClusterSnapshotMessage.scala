package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDBClusterSnapshotMessage extends js.Object {
  
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
  implicit class DeleteDBClusterSnapshotMessageOps[Self <: DeleteDBClusterSnapshotMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDBClusterSnapshotIdentifier(value: String): Self = this.set("DBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
  }
}
