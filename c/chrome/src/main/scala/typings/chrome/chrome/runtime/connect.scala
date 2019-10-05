package typings.chrome.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.connect")
@js.native
object connect extends js.Object {
  def apply(): Port = js.native
  def apply(connectInfo: ConnectInfo): Port = js.native
  def apply(extensionId: String): Port = js.native
  def apply(extensionId: String, connectInfo: ConnectInfo): Port = js.native
}

