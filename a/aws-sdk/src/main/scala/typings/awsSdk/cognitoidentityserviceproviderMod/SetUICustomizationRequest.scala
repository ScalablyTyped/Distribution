package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetUICustomizationRequest extends StObject {
  
  /**
    * The CSS values in the UI customization.
    */
  var CSS: js.UndefOr[CSSType] = js.undefined
  
  /**
    * The client ID for the client app.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.undefined
  
  /**
    * The uploaded logo image for the UI customization.
    */
  var ImageFile: js.UndefOr[ImageFileType] = js.undefined
  
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType
}
object SetUICustomizationRequest {
  
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): SetUICustomizationRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUICustomizationRequest]
  }
  
  @scala.inline
  implicit class SetUICustomizationRequestMutableBuilder[Self <: SetUICustomizationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCSS(value: CSSType): Self = StObject.set(x, "CSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSUndefined: Self = StObject.set(x, "CSS", js.undefined)
    
    @scala.inline
    def setClientId(value: ClientIdType): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
    
    @scala.inline
    def setImageFile(value: ImageFileType): Self = StObject.set(x, "ImageFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageFileUndefined: Self = StObject.set(x, "ImageFile", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
