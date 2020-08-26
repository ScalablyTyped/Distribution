package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUICustomizationRequest extends js.Object {
  /**
    * The client ID for the client app.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.native
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object GetUICustomizationRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): GetUICustomizationRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUICustomizationRequest]
  }
  @scala.inline
  implicit class GetUICustomizationRequestOps[Self <: GetUICustomizationRequest] (val x: Self) extends AnyVal {
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
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: ClientIdType): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("ClientId", js.undefined)
  }
  
}

