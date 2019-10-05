package typings.chrome.chrome.enterprise.platformKeys

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.enterprise.platformKeys.getCertificates")
@js.native
object getCertificates extends js.Object {
  def apply(tokenId: String, callback: js.Function1[/* certificates */ ArrayBuffer, Unit]): Unit = js.native
}

