package typings.chrome.chrome.enterprise.platformKeys

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.enterprise.platformKeys.challengeUserKey")
@js.native
object challengeUserKey extends js.Object {
  def apply(
    challenge: ArrayBuffer,
    registerKey: Boolean,
    callback: js.Function1[/* response */ ArrayBuffer, Unit]
  ): Unit = js.native
}

