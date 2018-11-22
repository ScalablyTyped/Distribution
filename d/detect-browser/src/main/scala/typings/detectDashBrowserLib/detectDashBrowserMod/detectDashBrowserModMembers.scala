package typings
package detectDashBrowserLib.detectDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("detect-browser", JSImport.Namespace)
@js.native
object detectDashBrowserModMembers extends js.Object {
  def detect(): scala.Null | detectDashBrowserLib.detectDashBrowserLibNumbers.`false` | BrowserInfo = js.native
  def detectOS(userAgentString: java.lang.String): scala.Null | java.lang.String = js.native
  def getNodeVersion(): detectDashBrowserLib.detectDashBrowserLibNumbers.`false` | BrowserInfo = js.native
  def parseUserAgent(userAgentString: java.lang.String): scala.Null | BrowserInfo = js.native
}

