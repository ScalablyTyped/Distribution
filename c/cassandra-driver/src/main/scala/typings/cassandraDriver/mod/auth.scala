package typings.cassandraDriver.mod

import typings.cassandraDriver.anon.AuthorizationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "auth")
@js.native
object auth extends js.Object {
  @js.native
  class DseGssapiAuthProvider ()
    extends typings.cassandraDriver.authMod.auth.DseGssapiAuthProvider {
    def this(gssOptions: AuthorizationId) = this()
  }
  
  @js.native
  class DsePlainTextAuthProvider protected ()
    extends typings.cassandraDriver.authMod.auth.DsePlainTextAuthProvider {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, authorizationId: String) = this()
  }
  
  @js.native
  class PlainTextAuthProvider protected ()
    extends typings.cassandraDriver.authMod.auth.PlainTextAuthProvider {
    def this(username: String, password: String) = this()
  }
  
}

