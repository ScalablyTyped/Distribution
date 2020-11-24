package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeSnapshotAccessMessage extends js.Object {
  
  /**
    * The identifier of the AWS customer account that can no longer restore the specified snapshot.
    */
  var AccountWithRestoreAccess: String = js.native
  
  /**
    * The identifier of the cluster the snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name.
    */
  var SnapshotClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The identifier of the snapshot that the account can no longer access.
    */
  var SnapshotIdentifier: String = js.native
}
object RevokeSnapshotAccessMessage {
  
  @scala.inline
  def apply(AccountWithRestoreAccess: String, SnapshotIdentifier: String): RevokeSnapshotAccessMessage = {
    val __obj = js.Dynamic.literal(AccountWithRestoreAccess = AccountWithRestoreAccess.asInstanceOf[js.Any], SnapshotIdentifier = SnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeSnapshotAccessMessage]
  }
  
  @scala.inline
  implicit class RevokeSnapshotAccessMessageOps[Self <: RevokeSnapshotAccessMessage] (val x: Self) extends AnyVal {
    
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
    def setAccountWithRestoreAccess(value: String): Self = this.set("AccountWithRestoreAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdentifier(value: String): Self = this.set("SnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotClusterIdentifier(value: String): Self = this.set("SnapshotClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotClusterIdentifier: Self = this.set("SnapshotClusterIdentifier", js.undefined)
  }
}
