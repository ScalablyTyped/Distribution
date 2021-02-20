package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CognitoMemberDefinition extends StObject {
  
  /**
    * An identifier for an application client. You must create the app client ID using Amazon Cognito.
    */
  var ClientId: typings.awsSdk.sagemakerMod.ClientId = js.native
  
  /**
    * An identifier for a user group.
    */
  var UserGroup: CognitoUserGroup = js.native
  
  /**
    * An identifier for a user pool. The user pool must be in the same region as the service that you are calling.
    */
  var UserPool: CognitoUserPool = js.native
}
object CognitoMemberDefinition {
  
  @scala.inline
  def apply(ClientId: ClientId, UserGroup: CognitoUserGroup, UserPool: CognitoUserPool): CognitoMemberDefinition = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], UserGroup = UserGroup.asInstanceOf[js.Any], UserPool = UserPool.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoMemberDefinition]
  }
  
  @scala.inline
  implicit class CognitoMemberDefinitionMutableBuilder[Self <: CognitoMemberDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: ClientId): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserGroup(value: CognitoUserGroup): Self = StObject.set(x, "UserGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPool(value: CognitoUserPool): Self = StObject.set(x, "UserPool", value.asInstanceOf[js.Any])
  }
}
