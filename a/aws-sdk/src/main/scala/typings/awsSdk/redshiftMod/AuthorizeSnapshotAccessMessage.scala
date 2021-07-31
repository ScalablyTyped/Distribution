package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeSnapshotAccessMessage extends StObject {
  
  /**
    * The identifier of the AWS customer account authorized to restore the specified snapshot. To share a snapshot with AWS support, specify amazon-redshift-support.
    */
  var AccountWithRestoreAccess: String
  
  /**
    * The identifier of the cluster the snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name.
    */
  var SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the snapshot the account is authorized to restore.
    */
  var SnapshotIdentifier: String
}
object AuthorizeSnapshotAccessMessage {
  
  @scala.inline
  def apply(AccountWithRestoreAccess: String, SnapshotIdentifier: String): AuthorizeSnapshotAccessMessage = {
    val __obj = js.Dynamic.literal(AccountWithRestoreAccess = AccountWithRestoreAccess.asInstanceOf[js.Any], SnapshotIdentifier = SnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeSnapshotAccessMessage]
  }
  
  @scala.inline
  implicit class AuthorizeSnapshotAccessMessageMutableBuilder[Self <: AuthorizeSnapshotAccessMessage] (val x: Self) extends AnyVal {
    
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
