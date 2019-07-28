package typings.cassandraDashDriver.cassandraDashDriverMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.cassandraDashDriver.cassandraDashDriverMod.authNs.AuthProvider
import typings.cassandraDashDriver.cassandraDashDriverMod.authNs.Authenticator
import typings.cassandraDashDriver.cassandraDashDriverMod.authNs.AuthenticatorStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.authNs.PlainTextAuthProvider
import typings.cassandraDashDriver.cassandraDashDriverMod.authNs.PlainTextAuthProviderStatic
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "auth")
@js.native
object authNs extends js.Object {
  trait AuthProvider extends js.Object {
    def newAuthenticator(endpoint: String, name: String): Unit
  }
  
  @js.native
  trait Authenticator extends js.Object {
    def evaluateChallenge(challenge: Buffer, callback: Callback): Unit = js.native
    def initialResponse(callback: Callback): Unit = js.native
    def onAuthenticationSuccess(): Unit = js.native
    def onAuthenticationSuccess(token: Buffer): Unit = js.native
  }
  
  @js.native
  class AuthenticatorCls () extends Authenticator
  
  @js.native
  trait AuthenticatorStatic extends Instantiable0[Authenticator]
  
  trait PlainTextAuthProvider extends AuthProvider
  
  @js.native
  class PlainTextAuthProviderCls protected () extends PlainTextAuthProvider {
    def this(username: String, password: String) = this()
    /* CompleteClass */
    override def newAuthenticator(endpoint: String, name: String): Unit = js.native
  }
  
  @js.native
  trait PlainTextAuthProviderStatic extends Instantiable2[/* username */ String, /* password */ String, PlainTextAuthProvider]
  
  var Authenticator: AuthenticatorStatic = js.native
  var PlainTextAuthProvider: PlainTextAuthProviderStatic = js.native
}

