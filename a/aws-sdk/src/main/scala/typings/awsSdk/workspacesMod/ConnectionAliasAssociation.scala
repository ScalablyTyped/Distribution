package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionAliasAssociation extends StObject {
  
  /**
    * The identifier of the AWS account that associated the connection alias with a directory.
    */
  var AssociatedAccountId: js.UndefOr[AwsAccount] = js.native
  
  /**
    * The association status of the connection alias.
    */
  var AssociationStatus: js.UndefOr[typings.awsSdk.workspacesMod.AssociationStatus] = js.native
  
  /**
    * The identifier of the connection alias association. You use the connection identifier in the DNS TXT record when you're configuring your DNS routing policies.
    */
  var ConnectionIdentifier: js.UndefOr[typings.awsSdk.workspacesMod.ConnectionIdentifier] = js.native
  
  /**
    * The identifier of the directory associated with a connection alias.
    */
  var ResourceId: js.UndefOr[NonEmptyString] = js.native
}
object ConnectionAliasAssociation {
  
  @scala.inline
  def apply(): ConnectionAliasAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionAliasAssociation]
  }
  
  @scala.inline
  implicit class ConnectionAliasAssociationMutableBuilder[Self <: ConnectionAliasAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatedAccountId(value: AwsAccount): Self = StObject.set(x, "AssociatedAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedAccountIdUndefined: Self = StObject.set(x, "AssociatedAccountId", js.undefined)
    
    @scala.inline
    def setAssociationStatus(value: AssociationStatus): Self = StObject.set(x, "AssociationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationStatusUndefined: Self = StObject.set(x, "AssociationStatus", js.undefined)
    
    @scala.inline
    def setConnectionIdentifier(value: ConnectionIdentifier): Self = StObject.set(x, "ConnectionIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionIdentifierUndefined: Self = StObject.set(x, "ConnectionIdentifier", js.undefined)
    
    @scala.inline
    def setResourceId(value: NonEmptyString): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
  }
}
