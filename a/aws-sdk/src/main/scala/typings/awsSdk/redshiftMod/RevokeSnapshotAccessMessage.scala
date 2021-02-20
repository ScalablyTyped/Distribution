package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeSnapshotAccessMessage extends StObject {
  
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
  implicit class RevokeSnapshotAccessMessageMutableBuilder[Self <: RevokeSnapshotAccessMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountWithRestoreAccess(value: String): Self = StObject.set(x, "AccountWithRestoreAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotClusterIdentifier(value: String): Self = StObject.set(x, "SnapshotClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotClusterIdentifierUndefined: Self = StObject.set(x, "SnapshotClusterIdentifier", js.undefined)
    
    @scala.inline
    def setSnapshotIdentifier(value: String): Self = StObject.set(x, "SnapshotIdentifier", value.asInstanceOf[js.Any])
  }
}
