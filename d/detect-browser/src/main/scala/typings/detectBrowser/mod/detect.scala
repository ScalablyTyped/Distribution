package typings.detectBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("detect-browser", "detect")
@js.native
object detect extends js.Object {
  def apply(): BrowserInfo | SearchBotDeviceInfo | BotInfo | NodeInfo | ReactNativeInfo | Null = js.native
  def apply(userAgent: String): BrowserInfo | SearchBotDeviceInfo | BotInfo | NodeInfo | ReactNativeInfo | Null = js.native
}

