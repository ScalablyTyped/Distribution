package typings.cassandraDashDriver.cassandraDashDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "auth")
@js.native
object auth extends js.Object {
  @js.native
  class PlainTextAuthProvider protected ()
    extends typings.cassandraDashDriver.libAuthMod.auth.PlainTextAuthProvider {
    def this(username: String, password: String) = this()
  }
  
}

