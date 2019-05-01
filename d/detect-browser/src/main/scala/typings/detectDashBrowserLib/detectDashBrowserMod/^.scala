package typings
package detectDashBrowserLib.detectDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("detect-browser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def detect(): BrowserInfo | BotInfo | NodeInfo | scala.Null = js.native
  def detectOS(ua: java.lang.String): OperatingSystem | scala.Null = js.native
  def getNodeVersion(): NodeInfo | scala.Null = js.native
  def parseUserAgent(ua: java.lang.String): BrowserInfo | BotInfo | scala.Null = js.native
}

