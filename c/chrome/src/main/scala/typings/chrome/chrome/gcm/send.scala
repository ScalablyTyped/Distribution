package typings.chrome.chrome.gcm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.gcm.send")
@js.native
object send extends js.Object {
  def apply(message: OutgoingMessage, callback: js.Function1[/* messageId */ String, Unit]): Unit = js.native
}

