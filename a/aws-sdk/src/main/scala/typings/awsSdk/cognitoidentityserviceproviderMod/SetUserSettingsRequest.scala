package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetUserSettingsRequest extends StObject {
  
  /**
    * The access token for the set user settings request.
    */
  var AccessToken: TokenModelType = js.native
  
  /**
    * You can use this parameter only to set an SMS configuration that uses SMS for delivery.
    */
  var MFAOptions: MFAOptionListType = js.native
}
object SetUserSettingsRequest {
  
  @scala.inline
  def apply(AccessToken: TokenModelType, MFAOptions: MFAOptionListType): SetUserSettingsRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], MFAOptions = MFAOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUserSettingsRequest]
  }
  
  @scala.inline
  implicit class SetUserSettingsRequestMutableBuilder[Self <: SetUserSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMFAOptions(value: MFAOptionListType): Self = StObject.set(x, "MFAOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMFAOptionsVarargs(value: MFAOptionType*): Self = StObject.set(x, "MFAOptions", js.Array(value :_*))
  }
}
