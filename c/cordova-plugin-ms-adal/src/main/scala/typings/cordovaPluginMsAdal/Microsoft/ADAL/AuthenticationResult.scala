package typings.cordovaPluginMsAdal.Microsoft.ADAL

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationResult extends js.Object {
  
  var accessToken: String = js.native
  
  var accessTokenType: String = js.native
  
  /**
    * Creates authorization header for web requests.
    *
    * @returns {String} The authorization header.
    */
  def createAuthorizationHeader(): String = js.native
  
  var expiresOn: Date = js.native
  
  var idToken: String = js.native
  
  var isMultipleResourceRefreshToken: Boolean = js.native
  
  var status: String = js.native
  
  var statusCode: String = js.native
  
  var tenantId: String = js.native
  
  var userInfo: UserInfo = js.native
}
object AuthenticationResult {
  
  @scala.inline
  def apply(
    accessToken: String,
    accessTokenType: String,
    createAuthorizationHeader: () => String,
    expiresOn: Date,
    idToken: String,
    isMultipleResourceRefreshToken: Boolean,
    status: String,
    statusCode: String,
    tenantId: String,
    userInfo: UserInfo
  ): AuthenticationResult = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], accessTokenType = accessTokenType.asInstanceOf[js.Any], createAuthorizationHeader = js.Any.fromFunction0(createAuthorizationHeader), expiresOn = expiresOn.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any], isMultipleResourceRefreshToken = isMultipleResourceRefreshToken.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationResult]
  }
  
  @scala.inline
  implicit class AuthenticationResultOps[Self <: AuthenticationResult] (val x: Self) extends AnyVal {
    
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenType(value: String): Self = this.set("accessTokenType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateAuthorizationHeader(value: () => String): Self = this.set("createAuthorizationHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExpiresOn(value: Date): Self = this.set("expiresOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMultipleResourceRefreshToken(value: Boolean): Self = this.set("isMultipleResourceRefreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: String): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantId(value: String): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfo(value: UserInfo): Self = this.set("userInfo", value.asInstanceOf[js.Any])
  }
}
