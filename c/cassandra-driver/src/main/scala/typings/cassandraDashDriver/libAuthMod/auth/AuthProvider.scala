package typings.cassandraDashDriver.libAuthMod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthProvider extends js.Object {
  def newAuthenticator(endpoint: String, name: String): Authenticator
}

object AuthProvider {
  @scala.inline
  def apply(newAuthenticator: (String, String) => Authenticator): AuthProvider = {
    val __obj = js.Dynamic.literal(newAuthenticator = js.Any.fromFunction2(newAuthenticator))
  
    __obj.asInstanceOf[AuthProvider]
  }
}

