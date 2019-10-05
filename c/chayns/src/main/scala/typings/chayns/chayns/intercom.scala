package typings.chayns.chayns

import typings.chayns.IntercomConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic Functions
  * chayns.intercom
  */
@JSGlobal("chayns.intercom")
@js.native
object intercom extends js.Object {
  def sendMessageToGroup(groupId: Double, config: IntercomConfig): js.Promise[_] = js.native
  def sendMessageToPage(config: IntercomConfig): js.Promise[_] = js.native
  def sendMessageToUser(userId: Double, config: IntercomConfig): js.Promise[_] = js.native
}

