package typings.cassandraDriver.mod

import typings.cassandraDriver.anon.AuthorizationId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auth {
  
  @JSImport("cassandra-driver", "auth.DseGssapiAuthProvider")
  @js.native
  class DseGssapiAuthProvider ()
    extends typings.cassandraDriver.authMod.auth.DseGssapiAuthProvider {
    def this(gssOptions: AuthorizationId) = this()
  }
  
  @JSImport("cassandra-driver", "auth.DsePlainTextAuthProvider")
  @js.native
  class DsePlainTextAuthProvider protected ()
    extends typings.cassandraDriver.authMod.auth.DsePlainTextAuthProvider {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, authorizationId: String) = this()
  }
  
  @JSImport("cassandra-driver", "auth.PlainTextAuthProvider")
  @js.native
  class PlainTextAuthProvider protected ()
    extends typings.cassandraDriver.authMod.auth.PlainTextAuthProvider {
    def this(username: String, password: String) = this()
  }
}
