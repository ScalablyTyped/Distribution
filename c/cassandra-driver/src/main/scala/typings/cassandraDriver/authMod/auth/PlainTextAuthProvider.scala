package typings.cassandraDriver.authMod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/auth", "auth.PlainTextAuthProvider")
@js.native
class PlainTextAuthProvider protected () extends AuthProvider {
  def this(username: String, password: String) = this()
}
