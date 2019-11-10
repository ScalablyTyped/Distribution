package typings.cassandraDashDriver.libAuthMod.auth

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authenticator extends js.Object {
  def evaluateChallenge(challenge: Buffer, callback: js.Function): Unit = js.native
  def initialResponse(callback: js.Function): Unit = js.native
  def onAuthenticationSuccess(): Unit = js.native
  def onAuthenticationSuccess(token: Buffer): Unit = js.native
}

