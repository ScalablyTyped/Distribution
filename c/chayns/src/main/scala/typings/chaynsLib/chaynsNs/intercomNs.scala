package typings
package chaynsLib.chaynsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic Functions
  * chayns.intercom
  */
@JSGlobal("chayns.intercom")
@js.native
object intercomNs extends js.Object {
  def sendMessageToGroup(groupId: scala.Double, config: chaynsLib.IntercomConfig): js.Promise[_] = js.native
  def sendMessageToPage(config: chaynsLib.IntercomConfig): js.Promise[_] = js.native
  def sendMessageToUser(userId: scala.Double, config: chaynsLib.IntercomConfig): js.Promise[_] = js.native
}

