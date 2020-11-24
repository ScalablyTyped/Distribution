package typings.cordovaPluginMsAdal.Microsoft.ADAL

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserInfo extends js.Object {
  
  var displayableId: String = js.native
  
  var familyName: String = js.native
  
  var givenName: String = js.native
  
  var identityProvider: String = js.native
  
  var passwordChangeUrl: String = js.native
  
  var passwordExpiresOn: Date = js.native
  
  var uniqueId: String = js.native
  
  var userId: String = js.native
}
object UserInfo {
  
  @scala.inline
  def apply(
    displayableId: String,
    familyName: String,
    givenName: String,
    identityProvider: String,
    passwordChangeUrl: String,
    passwordExpiresOn: Date,
    uniqueId: String,
    userId: String
  ): UserInfo = {
    val __obj = js.Dynamic.literal(displayableId = displayableId.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], identityProvider = identityProvider.asInstanceOf[js.Any], passwordChangeUrl = passwordChangeUrl.asInstanceOf[js.Any], passwordExpiresOn = passwordExpiresOn.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
  
  @scala.inline
  implicit class UserInfoOps[Self <: UserInfo] (val x: Self) extends AnyVal {
    
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
    def setDisplayableId(value: String): Self = this.set("displayableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityProvider(value: String): Self = this.set("identityProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordChangeUrl(value: String): Self = this.set("passwordChangeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordExpiresOn(value: Date): Self = this.set("passwordExpiresOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueId(value: String): Self = this.set("uniqueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
}
