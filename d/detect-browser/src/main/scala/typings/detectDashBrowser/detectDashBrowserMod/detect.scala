package typings.detectDashBrowser.detectDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("detect-browser", "detect")
@js.native
object detect extends js.Object {
  def apply(): BrowserInfo | BotInfo | NodeInfo | Null = js.native
  def apply(userAgent: String): BrowserInfo | BotInfo | NodeInfo | Null = js.native
}

