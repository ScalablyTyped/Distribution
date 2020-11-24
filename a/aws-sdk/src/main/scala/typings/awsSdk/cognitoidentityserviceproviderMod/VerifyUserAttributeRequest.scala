package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class VerifyUserAttributeRequestOps[Self <: VerifyUserAttributeRequest] (val x: Self) extends AnyVal {
    
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
    def setAttributeName(value: AttributeNameType): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: ConfirmationCodeType): Self = this.set("Code", value.asInstanceOf[js.Any])
  }
}
