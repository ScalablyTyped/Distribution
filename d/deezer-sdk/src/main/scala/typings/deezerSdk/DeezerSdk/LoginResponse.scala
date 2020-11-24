package typings.deezerSdk.DeezerSdk

import typings.deezerSdk.anon.AccessToken_
import typings.deezerSdk.deezerSdkStrings.connected
import typings.deezerSdk.deezerSdkStrings.not_authorized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/login | DZ.login}
  */
@js.native
trait LoginResponse extends js.Object {
  
  var authResponse: AccessToken_ = js.native
  
  var status: connected | not_authorized = js.native
  
  var userID: String = js.native
}
object LoginResponse {
  
  @scala.inline
  def apply(authResponse: AccessToken_, status: connected | not_authorized, userID: String): LoginResponse = {
    val __obj = js.Dynamic.literal(authResponse = authResponse.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginResponse]
  }
  
  @scala.inline
  implicit class LoginResponseOps[Self <: LoginResponse] (val x: Self) extends AnyVal {
    
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
    def setAuthResponse(value: AccessToken_): Self = this.set("authResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: connected | not_authorized): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserID(value: String): Self = this.set("userID", value.asInstanceOf[js.Any])
  }
}
