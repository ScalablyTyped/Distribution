package typings.cassandraDashDriver.cassandraDashDriverMod.auth

import org.scalablytyped.runtime.TopLevel
import typings.cassandraDashDriver.cassandraDashDriverMod.Callback
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authenticator extends js.Object {
  def evaluateChallenge(challenge: Buffer, callback: Callback): Unit = js.native
  def initialResponse(callback: Callback): Unit = js.native
  def onAuthenticationSuccess(): Unit = js.native
  def onAuthenticationSuccess(token: Buffer): Unit = js.native
}

@JSImport("cassandra-driver", "auth.Authenticator")
@js.native
object Authenticator extends TopLevel[AuthenticatorStatic]

