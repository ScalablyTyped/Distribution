package typings.chrome.chrome.identity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.identity.getAuthToken")
@js.native
object getAuthToken extends js.Object {
  def apply(details: TokenDetails): Unit = js.native
  def apply(details: TokenDetails, callback: js.Function1[/* token */ String, Unit]): Unit = js.native
}

