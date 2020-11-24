package typings.chrome.global.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.addReceiverActionListener")
@js.native
object addReceiverActionListener extends js.Object {
  
  def apply(
    listener: js.Function2[
      /* receiver */ typings.chrome.chrome.cast.Receiver, 
      /* receiverAction */ typings.chrome.chrome.cast.ReceiverAction, 
      Unit
    ]
  ): Unit = js.native
}
