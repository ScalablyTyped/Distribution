package typings.cassandraDriver.authMod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthProvider extends js.Object {
  def newAuthenticator(endpoint: String, name: String): Authenticator = js.native
}

object AuthProvider {
  @scala.inline
  def apply(newAuthenticator: (String, String) => Authenticator): AuthProvider = {
    val __obj = js.Dynamic.literal(newAuthenticator = js.Any.fromFunction2(newAuthenticator))
    __obj.asInstanceOf[AuthProvider]
  }
  @scala.inline
  implicit class AuthProviderOps[Self <: AuthProvider] (val x: Self) extends AnyVal {
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
    def setNewAuthenticator(value: (String, String) => Authenticator): Self = this.set("newAuthenticator", js.Any.fromFunction2(value))
  }
  
}

