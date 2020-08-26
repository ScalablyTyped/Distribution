package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdentityProviderByIdentifierRequest extends js.Object {
  /**
    * The identity provider ID.
    */
  var IdpIdentifier: IdpIdentifierType = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object GetIdentityProviderByIdentifierRequest {
  @scala.inline
  def apply(IdpIdentifier: IdpIdentifierType, UserPoolId: UserPoolIdType): GetIdentityProviderByIdentifierRequest = {
    val __obj = js.Dynamic.literal(IdpIdentifier = IdpIdentifier.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityProviderByIdentifierRequest]
  }
  @scala.inline
  implicit class GetIdentityProviderByIdentifierRequestOps[Self <: GetIdentityProviderByIdentifierRequest] (val x: Self) extends AnyVal {
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
    def setIdpIdentifier(value: IdpIdentifierType): Self = this.set("IdpIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
  }
  
}

