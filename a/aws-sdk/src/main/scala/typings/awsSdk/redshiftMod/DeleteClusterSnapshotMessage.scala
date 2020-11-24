package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteClusterSnapshotMessage extends js.Object {
  
  /**
    * The unique identifier of the cluster the snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name. Constraints: Must be the name of valid cluster.
    */
  var SnapshotClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The unique identifier of the manual snapshot to be deleted. Constraints: Must be the name of an existing snapshot that is in the available, failed, or cancelled state.
    */
  var SnapshotIdentifier: String = js.native
}
object DeleteClusterSnapshotMessage {
  
  @scala.inline
  def apply(SnapshotIdentifier: String): DeleteClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(SnapshotIdentifier = SnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterSnapshotMessage]
  }
  
  @scala.inline
  implicit class DeleteClusterSnapshotMessageOps[Self <: DeleteClusterSnapshotMessage] (val x: Self) extends AnyVal {
    
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
    def setSnapshotIdentifier(value: String): Self = this.set("SnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotClusterIdentifier(value: String): Self = this.set("SnapshotClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotClusterIdentifier: Self = this.set("SnapshotClusterIdentifier", js.undefined)
  }
}
