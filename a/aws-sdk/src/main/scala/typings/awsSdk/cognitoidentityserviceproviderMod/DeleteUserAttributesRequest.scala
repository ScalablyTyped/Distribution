package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserAttributesRequest extends js.Object {
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
  implicit class DeleteUserAttributesRequestOps[Self <: DeleteUserAttributesRequest] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: TokenModelType): Self = this.set("AccessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserAttributeNamesVarargs(value: AttributeNameType*): Self = this.set("UserAttributeNames", js.Array(value :_*))
    @scala.inline
    def setUserAttributeNames(value: AttributeNameListType): Self = this.set("UserAttributeNames", value.asInstanceOf[js.Any])
  }
  
}

