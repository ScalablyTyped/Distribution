package typings.cassandraDashDriver.cassandraDashDriverMod

import typings.cassandraDashDriver.Anon_AuthorizationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "auth")
@js.native
object auth extends js.Object {
  @js.native
  class DseGssapiAuthProvider ()
    extends typings.cassandraDashDriver.libAuthMod.auth.DseGssapiAuthProvider {
    def this(gssOptions: Anon_AuthorizationId) = this()
  }
  
  @js.native
  class DsePlainTextAuthProvider protected ()
    extends typings.cassandraDashDriver.libAuthMod.auth.DsePlainTextAuthProvider {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, authorizationId: String) = this()
  }
  
  @js.native
  class PlainTextAuthProvider protected ()
    extends typings.cassandraDashDriver.libAuthMod.auth.PlainTextAuthProvider {
    def this(username: String, password: String) = this()
  }
  
}

