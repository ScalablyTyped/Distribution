package typings
package blockingDashProxyLib.blockingDashProxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blocking-proxy", "BlockingProxy")
@js.native
class BlockingProxy protected ()
  extends blockingDashProxyLib.builtLibBlockingproxyMod.BlockingProxy {
  def this(seleniumAddress: java.lang.String) = this()
  def this(seleniumAddress: java.lang.String, highlightDelay: scala.Double) = this()
}

@JSImport("blocking-proxy", "BlockingProxy")
@js.native
object BlockingProxy extends js.Object {
  /**
    * This command is for the proxy server, not to be forwarded to Selenium.
    */
  def isProxyCommand(commandPath: java.lang.String): scala.Boolean = js.native
}

