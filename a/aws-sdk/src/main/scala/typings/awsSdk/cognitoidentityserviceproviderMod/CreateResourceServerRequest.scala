package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResourceServerRequest extends StObject {
  
  /**
    * A unique resource server identifier for the resource server. This could be an HTTPS endpoint where the resource server is located. For example, https://my-weather-api.example.com.
    */
  var Identifier: ResourceServerIdentifierType
  
  /**
    * A friendly name for the resource server.
    */
  var Name: ResourceServerNameType
  
  /**
    * A list of scopes. Each scope is map, where the keys are name and description.
    */
  var Scopes: js.UndefOr[ResourceServerScopeListType] = js.undefined
  
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType
}
object CreateResourceServerRequest {
  
  @scala.inline
  def apply(Identifier: ResourceServerIdentifierType, Name: ResourceServerNameType, UserPoolId: UserPoolIdType): CreateResourceServerRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceServerRequest]
  }
  
  @scala.inline
  implicit class CreateResourceServerRequestMutableBuilder[Self <: CreateResourceServerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: ResourceServerIdentifierType): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ResourceServerNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopes(value: ResourceServerScopeListType): Self = StObject.set(x, "Scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesUndefined: Self = StObject.set(x, "Scopes", js.undefined)
    
    @scala.inline
    def setScopesVarargs(value: ResourceServerScopeType*): Self = StObject.set(x, "Scopes", js.Array(value :_*))
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
