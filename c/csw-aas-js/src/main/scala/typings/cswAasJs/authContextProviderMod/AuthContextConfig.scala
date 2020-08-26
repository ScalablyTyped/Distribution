package typings.cswAasJs.authContextProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthContextConfig extends js.Object {
  var clientId: String = js.native
  var realm: String = js.native
}

object AuthContextConfig {
  @scala.inline
  def apply(clientId: String, realm: String): AuthContextConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthContextConfig]
  }
  @scala.inline
  implicit class AuthContextConfigOps[Self <: AuthContextConfig] (val x: Self) extends AnyVal {
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRealm(value: String): Self = this.set("realm", value.asInstanceOf[js.Any])
  }
  
}

