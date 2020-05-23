package typings.cassandraDriver.authMod.auth

import typings.cassandraDriver.anon.AuthorizationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/auth", "auth.DseGssapiAuthProvider")
@js.native
class DseGssapiAuthProvider () extends AuthProvider {
  def this(gssOptions: AuthorizationId) = this()
  /* CompleteClass */
  override def newAuthenticator(endpoint: String, name: String): Authenticator = js.native
}

