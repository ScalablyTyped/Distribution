package typings.bugsnagJs.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISessionDelegate extends js.Object {
  def startSession(client: Client): Client
}

object ISessionDelegate {
  @scala.inline
  def apply(startSession: Client => Client): ISessionDelegate = {
    val __obj = js.Dynamic.literal(startSession = js.Any.fromFunction1(startSession))
  
    __obj.asInstanceOf[ISessionDelegate]
  }
}

