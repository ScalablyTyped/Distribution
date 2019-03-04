package typings
package bugsnagDashJsLib.typesClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISessionDelegate extends js.Object {
  def startSession(client: Client): Client
}

object ISessionDelegate {
  @scala.inline
  def apply(startSession: js.Function1[Client, Client]): ISessionDelegate = {
    val __obj = js.Dynamic.literal(startSession = startSession)
  
    __obj.asInstanceOf[ISessionDelegate]
  }
}

