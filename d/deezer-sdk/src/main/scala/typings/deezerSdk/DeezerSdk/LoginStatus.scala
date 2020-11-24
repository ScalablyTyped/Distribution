package typings.deezerSdk.DeezerSdk

import typings.deezerSdk.anon.Expire
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/getloginstatus | DZ.getLoginStatus}
  */
@js.native
trait LoginStatus extends js.Object {
  
  var authResponse: Expire = js.native
  
  var status: ConnectionStatus = js.native
}
object LoginStatus {
  
  @scala.inline
  def apply(authResponse: Expire, status: ConnectionStatus): LoginStatus = {
    val __obj = js.Dynamic.literal(authResponse = authResponse.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginStatus]
  }
  
  @scala.inline
  implicit class LoginStatusOps[Self <: LoginStatus] (val x: Self) extends AnyVal {
    
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
    def setAuthResponse(value: Expire): Self = this.set("authResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ConnectionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
