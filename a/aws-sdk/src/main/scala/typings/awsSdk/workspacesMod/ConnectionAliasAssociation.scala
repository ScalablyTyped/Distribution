package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionAliasAssociation extends js.Object {
  
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
  implicit class ConnectionAliasAssociationOps[Self <: ConnectionAliasAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssociatedAccountId(value: AwsAccount): Self = this.set("AssociatedAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedAccountId: Self = this.set("AssociatedAccountId", js.undefined)
    
    @scala.inline
    def setAssociationStatus(value: AssociationStatus): Self = this.set("AssociationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationStatus: Self = this.set("AssociationStatus", js.undefined)
    
    @scala.inline
    def setConnectionIdentifier(value: ConnectionIdentifier): Self = this.set("ConnectionIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionIdentifier: Self = this.set("ConnectionIdentifier", js.undefined)
    
    @scala.inline
    def setResourceId(value: NonEmptyString): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
  }
}
