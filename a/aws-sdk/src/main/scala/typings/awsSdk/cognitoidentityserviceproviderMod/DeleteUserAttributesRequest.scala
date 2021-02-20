package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteUserAttributesRequest extends StObject {
  
  /**
    * The access token used in the request to delete user attributes.
    */
  var AccessToken: TokenModelType = js.native
  
  /**
    * An array of strings representing the user attribute names you wish to delete. For custom attributes, you must prepend the custom: prefix to the attribute name.
    */
  var UserAttributeNames: AttributeNameListType = js.native
}
object DeleteUserAttributesRequest {
  
  @scala.inline
  def apply(AccessToken: TokenModelType, UserAttributeNames: AttributeNameListType): DeleteUserAttributesRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], UserAttributeNames = UserAttributeNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserAttributesRequest]
  }
  
  @scala.inline
  implicit class DeleteUserAttributesRequestMutableBuilder[Self <: DeleteUserAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAttributeNames(value: AttributeNameListType): Self = StObject.set(x, "UserAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAttributeNamesVarargs(value: AttributeNameType*): Self = StObject.set(x, "UserAttributeNames", js.Array(value :_*))
  }
}
