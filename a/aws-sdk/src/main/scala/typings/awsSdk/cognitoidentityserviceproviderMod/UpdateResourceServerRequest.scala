package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateResourceServerRequest extends StObject {
  
  /**
    * The identifier for the resource server.
    */
  var Identifier: ResourceServerIdentifierType = js.native
  
  /**
    * The name of the resource server.
    */
  var Name: ResourceServerNameType = js.native
  
  /**
    * The scope values to be set for the resource server.
    */
  var Scopes: js.UndefOr[ResourceServerScopeListType] = js.native
  
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType = js.native
}
object UpdateResourceServerRequest {
  
  @scala.inline
  def apply(Identifier: ResourceServerIdentifierType, Name: ResourceServerNameType, UserPoolId: UserPoolIdType): UpdateResourceServerRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceServerRequest]
  }
  
  @scala.inline
  implicit class UpdateResourceServerRequestMutableBuilder[Self <: UpdateResourceServerRequest] (val x: Self) extends AnyVal {
    
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
