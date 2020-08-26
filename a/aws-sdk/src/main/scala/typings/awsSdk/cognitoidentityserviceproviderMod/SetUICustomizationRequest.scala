package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetUICustomizationRequest extends js.Object {
  /**
    * The CSS values in the UI customization.
    */
  var CSS: js.UndefOr[CSSType] = js.native
  /**
    * The client ID for the client app.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.native
  /**
    * The uploaded logo image for the UI customization.
    */
  var ImageFile: js.UndefOr[ImageFileType] = js.native
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object SetUICustomizationRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): SetUICustomizationRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUICustomizationRequest]
  }
  @scala.inline
  implicit class SetUICustomizationRequestOps[Self <: SetUICustomizationRequest] (val x: Self) extends AnyVal {
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
    def setCSS(value: CSSType): Self = this.set("CSS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCSS: Self = this.set("CSS", js.undefined)
    @scala.inline
    def setClientId(value: ClientIdType): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("ClientId", js.undefined)
    @scala.inline
    def setImageFile(value: ImageFileType): Self = this.set("ImageFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageFile: Self = this.set("ImageFile", js.undefined)
  }
  
}

