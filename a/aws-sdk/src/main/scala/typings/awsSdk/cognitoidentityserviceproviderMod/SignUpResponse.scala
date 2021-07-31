package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignUpResponse extends StObject {
  
  /**
    * The code delivery details returned by the server response to the user registration request.
    */
  var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined
  
  /**
    * A response from the server indicating that a user registration has been confirmed.
    */
  var UserConfirmed: BooleanType
  
  /**
    * The UUID of the authenticated user. This is not the same as username.
    */
  var UserSub: StringType
}
object SignUpResponse {
  
  @scala.inline
  def apply(UserConfirmed: BooleanType, UserSub: StringType): SignUpResponse = {
    val __obj = js.Dynamic.literal(UserConfirmed = UserConfirmed.asInstanceOf[js.Any], UserSub = UserSub.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignUpResponse]
  }
  
  @scala.inline
  implicit class SignUpResponseMutableBuilder[Self <: SignUpResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeDeliveryDetails(value: CodeDeliveryDetailsType): Self = StObject.set(x, "CodeDeliveryDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeDeliveryDetailsUndefined: Self = StObject.set(x, "CodeDeliveryDetails", js.undefined)
    
    @scala.inline
    def setUserConfirmed(value: BooleanType): Self = StObject.set(x, "UserConfirmed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSub(value: StringType): Self = StObject.set(x, "UserSub", value.asInstanceOf[js.Any])
  }
}
