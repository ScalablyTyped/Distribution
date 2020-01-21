package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyUserAttributeRequest extends js.Object {
  /**
    * Represents the access token of the request to verify user attributes.
    */
  var AccessToken: TokenModelType = js.native
  /**
    * The attribute name in the request to verify user attributes.
    */
  var AttributeName: AttributeNameType = js.native
  /**
    * The verification code in the request to verify user attributes.
    */
  var Code: ConfirmationCodeType = js.native
}

object VerifyUserAttributeRequest {
  @scala.inline
  def apply(AccessToken: TokenModelType, AttributeName: AttributeNameType, Code: ConfirmationCodeType): VerifyUserAttributeRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], AttributeName = AttributeName.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VerifyUserAttributeRequest]
  }
}

