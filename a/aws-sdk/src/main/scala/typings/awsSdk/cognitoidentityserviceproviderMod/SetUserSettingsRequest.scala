package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetUserSettingsRequest extends js.Object {
  
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
  implicit class SetUserSettingsRequestOps[Self <: SetUserSettingsRequest] (val x: Self) extends AnyVal {
    
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
    def setMFAOptionsVarargs(value: MFAOptionType*): Self = this.set("MFAOptions", js.Array(value :_*))
    
    @scala.inline
    def setMFAOptions(value: MFAOptionListType): Self = this.set("MFAOptions", value.asInstanceOf[js.Any])
  }
}
