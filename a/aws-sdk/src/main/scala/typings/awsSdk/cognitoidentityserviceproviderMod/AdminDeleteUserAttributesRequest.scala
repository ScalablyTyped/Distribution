package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminDeleteUserAttributesRequest extends js.Object {
  
  /**
    * An array of strings representing the user attribute names you wish to delete. For custom attributes, you must prepend the custom: prefix to the attribute name.
    */
  var UserAttributeNames: AttributeNameListType = js.native
  
  /**
    * The user pool ID for the user pool where you want to delete user attributes.
    */
  var UserPoolId: UserPoolIdType = js.native
  
  /**
    * The user name of the user from which you would like to delete attributes.
    */
  var Username: UsernameType = js.native
}
object AdminDeleteUserAttributesRequest {
  
  @scala.inline
  def apply(UserAttributeNames: AttributeNameListType, UserPoolId: UserPoolIdType, Username: UsernameType): AdminDeleteUserAttributesRequest = {
    val __obj = js.Dynamic.literal(UserAttributeNames = UserAttributeNames.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminDeleteUserAttributesRequest]
  }
  
  @scala.inline
  implicit class AdminDeleteUserAttributesRequestOps[Self <: AdminDeleteUserAttributesRequest] (val x: Self) extends AnyVal {
    
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
    def setUserAttributeNamesVarargs(value: AttributeNameType*): Self = this.set("UserAttributeNames", js.Array(value :_*))
    
    @scala.inline
    def setUserAttributeNames(value: AttributeNameListType): Self = this.set("UserAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: UsernameType): Self = this.set("Username", value.asInstanceOf[js.Any])
  }
}
