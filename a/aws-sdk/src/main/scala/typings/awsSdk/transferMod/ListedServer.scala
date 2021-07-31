package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListedServer extends StObject {
  
  /**
    * Specifies the unique Amazon Resource Name (ARN) for a server to be listed.
    */
  var Arn: typings.awsSdk.transferMod.Arn
  
  /**
    * Specifies the type of VPC endpoint that your server is connected to. If your server is connected to a VPC endpoint, your server isn't accessible over the public internet.
    */
  var EndpointType: js.UndefOr[typings.awsSdk.transferMod.EndpointType] = js.undefined
  
  /**
    * Specifies the authentication method used to validate a user for a server that was specified. This can include Secure Shell (SSH), user name and password combinations, or your own custom authentication method. Valid values include SERVICE_MANAGED or API_GATEWAY.
    */
  var IdentityProviderType: js.UndefOr[typings.awsSdk.transferMod.IdentityProviderType] = js.undefined
  
  /**
    * Specifies the AWS Identity and Access Management (IAM) role that allows a server to turn on Amazon CloudWatch logging.
    */
  var LoggingRole: js.UndefOr[Role] = js.undefined
  
  /**
    * Specifies the unique system assigned identifier for the servers that were listed.
    */
  var ServerId: js.UndefOr[typings.awsSdk.transferMod.ServerId] = js.undefined
  
  /**
    * Specifies the condition of a server for the server that was described. A value of ONLINE indicates that the server can accept jobs and transfer files. A State value of OFFLINE means that the server cannot perform file transfer operations. The states of STARTING and STOPPING indicate that the server is in an intermediate state, either not fully able to respond, or not fully offline. The values of START_FAILED or STOP_FAILED can indicate an error condition.
    */
  var State: js.UndefOr[typings.awsSdk.transferMod.State] = js.undefined
  
  /**
    * Specifies the number of users that are assigned to a server you specified with the ServerId.
    */
  var UserCount: js.UndefOr[typings.awsSdk.transferMod.UserCount] = js.undefined
}
object ListedServer {
  
  @scala.inline
  def apply(Arn: Arn): ListedServer = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListedServer]
  }
  
  @scala.inline
  implicit class ListedServerMutableBuilder[Self <: ListedServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointType(value: EndpointType): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointTypeUndefined: Self = StObject.set(x, "EndpointType", js.undefined)
    
    @scala.inline
    def setIdentityProviderType(value: IdentityProviderType): Self = StObject.set(x, "IdentityProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityProviderTypeUndefined: Self = StObject.set(x, "IdentityProviderType", js.undefined)
    
    @scala.inline
    def setLoggingRole(value: Role): Self = StObject.set(x, "LoggingRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingRoleUndefined: Self = StObject.set(x, "LoggingRole", js.undefined)
    
    @scala.inline
    def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerIdUndefined: Self = StObject.set(x, "ServerId", js.undefined)
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setUserCount(value: UserCount): Self = StObject.set(x, "UserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserCountUndefined: Self = StObject.set(x, "UserCount", js.undefined)
  }
}
