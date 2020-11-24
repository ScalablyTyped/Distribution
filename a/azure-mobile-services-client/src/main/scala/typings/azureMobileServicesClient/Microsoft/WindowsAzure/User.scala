package typings.azureMobileServicesClient.Microsoft.WindowsAzure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// User object based on Microsoft Azure documentation: http://msdn.microsoft.com/en-us/library/windowsazure/jj554220.aspx
@js.native
trait User extends js.Object {
  
  // { [providerName: string]: { userId: string, accessToken: string, accessTokenSecret?: string }; };
  var accessTokens: js.Any = js.native
  
  def getIdentities(): js.Any = js.native
  
     // { [providerName: string]: string; }
  var level: String = js.native
  
  var mobileServiceAuthenticationToken: String = js.native
  
   //for level:string use one of LevelEnum: 'admin','anonymous','authenticated'
  var userId: String = js.native
}
object User {
  
  @scala.inline
  def apply(
    accessTokens: js.Any,
    getIdentities: () => js.Any,
    level: String,
    mobileServiceAuthenticationToken: String,
    userId: String
  ): User = {
    val __obj = js.Dynamic.literal(accessTokens = accessTokens.asInstanceOf[js.Any], getIdentities = js.Any.fromFunction0(getIdentities), level = level.asInstanceOf[js.Any], mobileServiceAuthenticationToken = mobileServiceAuthenticationToken.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    
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
    def setAccessTokens(value: js.Any): Self = this.set("accessTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetIdentities(value: () => js.Any): Self = this.set("getIdentities", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileServiceAuthenticationToken(value: String): Self = this.set("mobileServiceAuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
}
