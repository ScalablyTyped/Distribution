package typings.awsSdk.codestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connection extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the connection. The ARN is used as the connection reference when the connection is shared between AWS services.  The ARN is never reused if the connection is deleted. 
    */
  var ConnectionArn: js.UndefOr[typings.awsSdk.codestarconnectionsMod.ConnectionArn] = js.undefined
  
  /**
    * The name of the connection. Connection names must be unique in an AWS user account.
    */
  var ConnectionName: js.UndefOr[typings.awsSdk.codestarconnectionsMod.ConnectionName] = js.undefined
  
  /**
    * The current status of the connection. 
    */
  var ConnectionStatus: js.UndefOr[typings.awsSdk.codestarconnectionsMod.ConnectionStatus] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the host associated with the connection.
    */
  var HostArn: js.UndefOr[typings.awsSdk.codestarconnectionsMod.HostArn] = js.undefined
  
  /**
    * The identifier of the external provider where your third-party code repository is configured. For Bitbucket, this is the account ID of the owner of the Bitbucket repository.
    */
  var OwnerAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The name of the external provider where your third-party code repository is configured. The valid provider type is Bitbucket.
    */
  var ProviderType: js.UndefOr[typings.awsSdk.codestarconnectionsMod.ProviderType] = js.undefined
}
object Connection {
  
  @scala.inline
  def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionArn(value: ConnectionArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionArnUndefined: Self = StObject.set(x, "ConnectionArn", js.undefined)
    
    @scala.inline
    def setConnectionName(value: ConnectionName): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionNameUndefined: Self = StObject.set(x, "ConnectionName", js.undefined)
    
    @scala.inline
    def setConnectionStatus(value: ConnectionStatus): Self = StObject.set(x, "ConnectionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionStatusUndefined: Self = StObject.set(x, "ConnectionStatus", js.undefined)
    
    @scala.inline
    def setHostArn(value: HostArn): Self = StObject.set(x, "HostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostArnUndefined: Self = StObject.set(x, "HostArn", js.undefined)
    
    @scala.inline
    def setOwnerAccountId(value: AccountId): Self = StObject.set(x, "OwnerAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAccountIdUndefined: Self = StObject.set(x, "OwnerAccountId", js.undefined)
    
    @scala.inline
    def setProviderType(value: ProviderType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderTypeUndefined: Self = StObject.set(x, "ProviderType", js.undefined)
  }
}
