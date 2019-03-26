package typings
package cassandraDashDriverLib.cassandraDashDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "auth")
@js.native
object authNs extends js.Object {
  trait AuthProvider extends js.Object {
    def newAuthenticator(endpoint: java.lang.String, name: java.lang.String): scala.Unit
  }
  
  @js.native
  trait Authenticator extends js.Object {
    def evaluateChallenge(challenge: nodeLib.Buffer, callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback): scala.Unit = js.native
    def initialResponse(callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback): scala.Unit = js.native
    def onAuthenticationSuccess(): scala.Unit = js.native
    def onAuthenticationSuccess(token: nodeLib.Buffer): scala.Unit = js.native
  }
  
  @js.native
  class AuthenticatorCls () extends Authenticator
  
  @js.native
  trait AuthenticatorStatic
    extends org.scalablytyped.runtime.Instantiable0[Authenticator]
  
  trait PlainTextAuthProvider extends AuthProvider
  
  @js.native
  class PlainTextAuthProviderCls protected () extends PlainTextAuthProvider {
    def this(username: java.lang.String, password: java.lang.String) = this()
    /* CompleteClass */
    override def newAuthenticator(endpoint: java.lang.String, name: java.lang.String): scala.Unit = js.native
  }
  
  @js.native
  trait PlainTextAuthProviderStatic
    extends org.scalablytyped.runtime.Instantiable2[
          /* username */ java.lang.String, 
          /* password */ java.lang.String, 
          PlainTextAuthProvider
        ]
  
  var Authenticator: AuthenticatorStatic = js.native
  var PlainTextAuthProvider: PlainTextAuthProviderStatic = js.native
}

