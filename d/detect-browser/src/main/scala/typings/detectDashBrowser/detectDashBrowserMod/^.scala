package typings.detectDashBrowser.detectDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("detect-browser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def detect(): BrowserInfo | BotInfo | NodeInfo | Null = js.native
  def detect(userAgent: String): BrowserInfo | BotInfo | NodeInfo | Null = js.native
  def detectOS(ua: String): OperatingSystem | Null = js.native
  def getNodeVersion(): NodeInfo | Null = js.native
  def parseUserAgent(ua: String): BrowserInfo | BotInfo | Null = js.native
}

