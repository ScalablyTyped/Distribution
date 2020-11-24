package typings.cassandraDriver.authMod.auth

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authenticator extends js.Object {
  
  def evaluateChallenge(challenge: Buffer, callback: js.Function): Unit = js.native
  
  def initialResponse(callback: js.Function): Unit = js.native
  
  def onAuthenticationSuccess(): Unit = js.native
  def onAuthenticationSuccess(token: Buffer): Unit = js.native
}
