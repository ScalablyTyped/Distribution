package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the connection. The ARN is used as the connection reference when the connection is shared between AWS services.  The ARN is never reused if the connection is deleted. 
    */
  var ConnectionArn: js.UndefOr[typings.awsSdk.codestarconnectionsMod.ConnectionArn] = js.native
  
  /**
    * The name of the connection. Connection names must be unique in an AWS user account.
    */
  var ConnectionName: js.UndefOr[typings.awsSdk.codestarconnectionsMod.ConnectionName] = js.native
  
  /**
    * The current status of the connection. 
    */
  var ConnectionStatus: js.UndefOr[typings.awsSdk.codestarconnectionsMod.ConnectionStatus] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the host associated with the connection.
    */
  var HostArn: js.UndefOr[typings.awsSdk.codestarconnectionsMod.HostArn] = js.native
  
  /**
    * The identifier of the external provider where your third-party code repository is configured. For Bitbucket, this is the account ID of the owner of the Bitbucket repository.
    */
  var OwnerAccountId: js.UndefOr[AccountId] = js.native
  
  /**
    * The name of the external provider where your third-party code repository is configured. The valid provider type is Bitbucket.
    */
  var ProviderType: js.UndefOr[typings.awsSdk.codestarconnectionsMod.ProviderType] = js.native
}
object Connection {
  
  @scala.inline
  def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
    
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
    def setConnectionArn(value: ConnectionArn): Self = this.set("ConnectionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionArn: Self = this.set("ConnectionArn", js.undefined)
    
    @scala.inline
    def setConnectionName(value: ConnectionName): Self = this.set("ConnectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionName: Self = this.set("ConnectionName", js.undefined)
    
    @scala.inline
    def setConnectionStatus(value: ConnectionStatus): Self = this.set("ConnectionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionStatus: Self = this.set("ConnectionStatus", js.undefined)
    
    @scala.inline
    def setHostArn(value: HostArn): Self = this.set("HostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostArn: Self = this.set("HostArn", js.undefined)
    
    @scala.inline
    def setOwnerAccountId(value: AccountId): Self = this.set("OwnerAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerAccountId: Self = this.set("OwnerAccountId", js.undefined)
    
    @scala.inline
    def setProviderType(value: ProviderType): Self = this.set("ProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderType: Self = this.set("ProviderType", js.undefined)
  }
}
