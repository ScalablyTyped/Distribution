package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyUserAttributeRequest extends StObject {
  
  /**
    * Represents the access token of the request to verify user attributes.
    */
  var AccessToken: TokenModelType
  
  /**
    * The attribute name in the request to verify user attributes.
    */
  var AttributeName: AttributeNameType
  
  /**
    * The verification code in the request to verify user attributes.
    */
  var Code: ConfirmationCodeType
}
object VerifyUserAttributeRequest {
  
  @scala.inline
  def apply(AccessToken: TokenModelType, AttributeName: AttributeNameType, Code: ConfirmationCodeType): VerifyUserAttributeRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], AttributeName = AttributeName.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyUserAttributeRequest]
  }
  
  @scala.inline
  implicit class VerifyUserAttributeRequestMutableBuilder[Self <: VerifyUserAttributeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeName(value: AttributeNameType): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: ConfirmationCodeType): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
  }
}
