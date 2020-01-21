package typings.blockingProxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blocking-proxy", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BPClient protected ()
    extends typings.blockingProxy.clientMod.BPClient {
    def this(bpUrlValue: String) = this()
  }
  
  @js.native
  class BlockingProxy protected ()
    extends typings.blockingProxy.blockingproxyMod.BlockingProxy {
    def this(seleniumAddress: String) = this()
    def this(seleniumAddress: String, highlightDelay: Double) = this()
  }
  
  /* static members */
  @js.native
  object BlockingProxy extends js.Object {
    /**
      * This command is for the proxy server, not to be forwarded to Selenium.
      */
    def isProxyCommand(commandPath: String): Boolean = js.native
  }
  
}

