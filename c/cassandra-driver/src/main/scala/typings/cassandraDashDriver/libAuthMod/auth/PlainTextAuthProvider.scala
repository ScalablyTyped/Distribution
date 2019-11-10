package typings.cassandraDashDriver.libAuthMod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/auth", "auth.PlainTextAuthProvider")
@js.native
class PlainTextAuthProvider protected () extends AuthProvider {
  def this(username: String, password: String) = this()
  /* CompleteClass */
  override def newAuthenticator(endpoint: String, name: String): Authenticator = js.native
}

