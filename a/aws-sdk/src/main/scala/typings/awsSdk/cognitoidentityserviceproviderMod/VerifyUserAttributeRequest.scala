package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyUserAttributeRequest extends StObject {
  
  /**
    * A valid access token that Amazon Cognito issued to the user whose user attributes you want to verify.
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
  
  inline def apply(AccessToken: TokenModelType, AttributeName: AttributeNameType, Code: ConfirmationCodeType): VerifyUserAttributeRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], AttributeName = AttributeName.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyUserAttributeRequest]
  }
  
  extension [Self <: VerifyUserAttributeRequest](x: Self) {
    
    inline def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    inline def setAttributeName(value: AttributeNameType): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setCode(value: ConfirmationCodeType): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
  }
}
