package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourceServerRequest extends StObject {
  
  /**
    * The identifier for the resource server.
    */
  var Identifier: ResourceServerIdentifierType
  
  /**
    * The user pool ID for the user pool that hosts the resource server.
    */
  var UserPoolId: UserPoolIdType
}
object DeleteResourceServerRequest {
  
  @scala.inline
  def apply(Identifier: ResourceServerIdentifierType, UserPoolId: UserPoolIdType): DeleteResourceServerRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourceServerRequest]
  }
  
  @scala.inline
  implicit class DeleteResourceServerRequestMutableBuilder[Self <: DeleteResourceServerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: ResourceServerIdentifierType): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
