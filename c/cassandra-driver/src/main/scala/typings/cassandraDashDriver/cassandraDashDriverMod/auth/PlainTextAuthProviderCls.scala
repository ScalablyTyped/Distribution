package typings.cassandraDashDriver.cassandraDashDriverMod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "auth.PlainTextAuthProvider")
@js.native
class PlainTextAuthProviderCls protected () extends PlainTextAuthProvider {
  def this(username: String, password: String) = this()
  /* CompleteClass */
  override def newAuthenticator(endpoint: String, name: String): Unit = js.native
}

