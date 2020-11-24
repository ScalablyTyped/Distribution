package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionAlias extends js.Object {
  
  /**
    * The identifier of the connection alias.
    */
  var AliasId: js.UndefOr[ConnectionAliasId] = js.native
  
  /**
    * The association status of the connection alias.
    */
  var Associations: js.UndefOr[ConnectionAliasAssociationList] = js.native
  
  /**
    * The connection string specified for the connection alias. The connection string must be in the form of a fully qualified domain name (FQDN), such as www.example.com.
    */
  var ConnectionString: js.UndefOr[typings.awsSdk.workspacesMod.ConnectionString] = js.native
  
  /**
    * The identifier of the AWS account that owns the connection alias.
    */
  var OwnerAccountId: js.UndefOr[AwsAccount] = js.native
  
  /**
    * The current state of the connection alias.
    */
  var State: js.UndefOr[ConnectionAliasState] = js.native
}
object ConnectionAlias {
  
  @scala.inline
  def apply(): ConnectionAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionAlias]
  }
  
  @scala.inline
  implicit class ConnectionAliasOps[Self <: ConnectionAlias] (val x: Self) extends AnyVal {
    
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
    def setAliasId(value: ConnectionAliasId): Self = this.set("AliasId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasId: Self = this.set("AliasId", js.undefined)
    
    @scala.inline
    def setAssociationsVarargs(value: ConnectionAliasAssociation*): Self = this.set("Associations", js.Array(value :_*))
    
    @scala.inline
    def setAssociations(value: ConnectionAliasAssociationList): Self = this.set("Associations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociations: Self = this.set("Associations", js.undefined)
    
    @scala.inline
    def setConnectionString(value: ConnectionString): Self = this.set("ConnectionString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionString: Self = this.set("ConnectionString", js.undefined)
    
    @scala.inline
    def setOwnerAccountId(value: AwsAccount): Self = this.set("OwnerAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerAccountId: Self = this.set("OwnerAccountId", js.undefined)
    
    @scala.inline
    def setState(value: ConnectionAliasState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
