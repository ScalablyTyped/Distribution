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
  def apply(
    UserPoolId: UserPoolIdType,
    CSS: CSSType = null,
    ClientId: ClientIdType = null,
    ImageFile: ImageFileType = null
  ): SetUICustomizationRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    if (CSS != null) __obj.updateDynamic("CSS")(CSS.asInstanceOf[js.Any])
    if (ClientId != null) __obj.updateDynamic("ClientId")(ClientId.asInstanceOf[js.Any])
    if (ImageFile != null) __obj.updateDynamic("ImageFile")(ImageFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUICustomizationRequest]
  }
}

