package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeSnapshotAccessMessage extends StObject {
  
  /**
    * The identifier of the AWS customer account that can no longer restore the specified snapshot.
    */
  var AccountWithRestoreAccess: String
  
  /**
    * The identifier of the cluster the snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name.
    */
  var SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the snapshot that the account can no longer access.
    */
  var SnapshotIdentifier: String
}
object RevokeSnapshotAccessMessage {
  
  inline def apply(AccountWithRestoreAccess: String, SnapshotIdentifier: String): RevokeSnapshotAccessMessage = {
    val __obj = js.Dynamic.literal(AccountWithRestoreAccess = AccountWithRestoreAccess.asInstanceOf[js.Any], SnapshotIdentifier = SnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeSnapshotAccessMessage]
  }
  
  extension [Self <: RevokeSnapshotAccessMessage](x: Self) {
    
    inline def setAccountWithRestoreAccess(value: String): Self = StObject.set(x, "AccountWithRestoreAccess", value.asInstanceOf[js.Any])
    
    inline def setSnapshotClusterIdentifier(value: String): Self = StObject.set(x, "SnapshotClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSnapshotClusterIdentifierUndefined: Self = StObject.set(x, "SnapshotClusterIdentifier", js.undefined)
    
    inline def setSnapshotIdentifier(value: String): Self = StObject.set(x, "SnapshotIdentifier", value.asInstanceOf[js.Any])
  }
}
