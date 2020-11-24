package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateResourceServerRequest extends js.Object {
  
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
  implicit class UpdateResourceServerRequestOps[Self <: UpdateResourceServerRequest] (val x: Self) extends AnyVal {
    
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
    def setIdentifier(value: ResourceServerIdentifierType): Self = this.set("Identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ResourceServerNameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesVarargs(value: ResourceServerScopeType*): Self = this.set("Scopes", js.Array(value :_*))
    
    @scala.inline
    def setScopes(value: ResourceServerScopeListType): Self = this.set("Scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopes: Self = this.set("Scopes", js.undefined)
  }
}
