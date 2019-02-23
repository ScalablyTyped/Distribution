package typings
package detectDashBrowserLib.detectDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("detect-browser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def detect(): detectDashBrowserLib.detectDashBrowserMod.BrowserInfo | detectDashBrowserLib.detectDashBrowserMod.BotInfo | detectDashBrowserLib.detectDashBrowserMod.NodeInfo | scala.Null = js.native
  def detectOS(ua: java.lang.String): detectDashBrowserLib.OperatingSystem | scala.Null = js.native
  def getNodeVersion(): detectDashBrowserLib.detectDashBrowserMod.NodeInfo | scala.Null = js.native
  def parseUserAgent(ua: java.lang.String): detectDashBrowserLib.detectDashBrowserMod.BrowserInfo | detectDashBrowserLib.detectDashBrowserMod.BotInfo | scala.Null = js.native
}

