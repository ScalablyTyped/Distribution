package typings.chayns.global.chayns

import typings.chayns.IntercomConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
